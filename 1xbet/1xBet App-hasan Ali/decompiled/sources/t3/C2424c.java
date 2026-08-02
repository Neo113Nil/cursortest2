package t3;

import A0.C0052p0;
import S2.j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.ads.C1586t;
import f2.m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l3.C2054a;
import m3.v;
import q3.AbstractC2309b;
import s3.BinderC2361b;
import s3.InterfaceC2360a;
import x3.AbstractC2644a;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2424c {

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f19572d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f19573e = null;
    public static boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f19574g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f19575h;

    /* renamed from: l, reason: collision with root package name */
    public static C2428g f19578l;

    /* renamed from: m, reason: collision with root package name */
    public static C2429h f19579m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19580a;
    public static final ThreadLocal i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final C0052p0 f19576j = new C0052p0(12);

    /* renamed from: k, reason: collision with root package name */
    public static final C2054a f19577k = new C2054a(6);

    /* renamed from: b, reason: collision with root package name */
    public static final C2054a f19570b = new C2054a(7);

    /* renamed from: c, reason: collision with root package name */
    public static final C2054a f19571c = new C2054a(8);

    public C2424c(Context context) {
        this.f19580a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (v.g(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    public static C2424c c(Context context, C2054a c2054a, String str) {
        long j5;
        C1586t l5;
        C2424c c2424c;
        Boolean bool;
        InterfaceC2360a t12;
        C2424c c2424c2;
        C2429h c2429h;
        boolean z3;
        InterfaceC2360a t13;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C2422a("null application Context");
        }
        ThreadLocal threadLocal = i;
        C2427f c2427f = (C2427f) threadLocal.get();
        C2427f c2427f2 = new C2427f();
        threadLocal.set(c2427f2);
        C0052p0 c0052p0 = f19576j;
        Long l6 = (Long) c0052p0.get();
        long longValue = l6.longValue();
        try {
            c0052p0.set(Long.valueOf(SystemClock.elapsedRealtime()));
            l5 = c2054a.l(context, str, f19577k);
            j5 = longValue;
        } catch (Throwable th) {
            th = th;
            j5 = longValue;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + str + ":" + l5.f15621a + " and remote module " + str + ":" + l5.f15622b);
            int i5 = l5.f15623c;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (l5.f15621a != 0) {
                        i5 = -1;
                    }
                }
                if (i5 != 1 || l5.f15622b != 0) {
                    if (i5 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        c2424c = new C2424c(applicationContext);
                    } else {
                        if (i5 != 1) {
                            throw new C2422a("VersionPolicy returned invalid code:" + i5);
                        }
                        try {
                            int i6 = l5.f15622b;
                            try {
                                synchronized (C2424c.class) {
                                    if (!g(context)) {
                                        throw new C2422a("Remote loading disabled");
                                    }
                                    bool = f19572d;
                                }
                                if (bool == null) {
                                    throw new C2422a("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i6);
                                    synchronized (C2424c.class) {
                                        c2429h = f19579m;
                                    }
                                    if (c2429h == null) {
                                        throw new C2422a("DynamiteLoaderV2 was not cached.");
                                    }
                                    C2427f c2427f3 = (C2427f) threadLocal.get();
                                    if (c2427f3 == null || c2427f3.f19589a == null) {
                                        throw new C2422a("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor = c2427f3.f19589a;
                                    new BinderC2361b(null);
                                    synchronized (C2424c.class) {
                                        z3 = f19574g >= 2;
                                    }
                                    if (z3) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        t13 = c2429h.Q1(new BinderC2361b(applicationContext2), str, i6, new BinderC2361b(cursor));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        t13 = c2429h.t1(new BinderC2361b(applicationContext2), str, i6, new BinderC2361b(cursor));
                                    }
                                    Context context2 = (Context) BinderC2361b.t1(t13);
                                    if (context2 == null) {
                                        throw new C2422a("Failed to get module context");
                                    }
                                    c2424c2 = new C2424c(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i6);
                                    C2428g h3 = h(context);
                                    if (h3 == null) {
                                        throw new C2422a("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel L5 = h3.L(h3.N(), 6);
                                    int readInt = L5.readInt();
                                    L5.recycle();
                                    if (readInt >= 3) {
                                        C2427f c2427f4 = (C2427f) threadLocal.get();
                                        if (c2427f4 == null) {
                                            throw new C2422a("No cached result cursor holder");
                                        }
                                        t12 = h3.Q1(new BinderC2361b(context), str, i6, new BinderC2361b(c2427f4.f19589a));
                                    } else if (readInt == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        t12 = h3.N2(new BinderC2361b(context), str, i6);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        t12 = h3.t1(new BinderC2361b(context), str, i6);
                                    }
                                    Object t14 = BinderC2361b.t1(t12);
                                    if (t14 == null) {
                                        throw new C2422a("Failed to load remote module.");
                                    }
                                    c2424c2 = new C2424c((Context) t14);
                                }
                                c2424c = c2424c2;
                            } catch (RemoteException e3) {
                                throw new C2422a("Failed to load remote module.", e3);
                            } catch (C2422a e5) {
                                throw e5;
                            } catch (Throwable th2) {
                                AbstractC2309b.a(context, th2);
                                throw new C2422a("Failed to load remote module.", th2);
                            }
                        } catch (C2422a e6) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e6.getMessage());
                            int i7 = l5.f15621a;
                            if (i7 == 0 || c2054a.l(context, str, new m(i7, 10)).f15623c != -1) {
                                throw new C2422a("Remote load failed. No local fallback found.", e6);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            c2424c = new C2424c(applicationContext);
                        }
                    }
                    if (j5 == 0) {
                        f19576j.remove();
                    } else {
                        f19576j.set(l6);
                    }
                    Cursor cursor2 = c2427f2.f19589a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    i.set(c2427f);
                    return c2424c;
                }
            }
            throw new C2422a("No acceptable module " + str + " found. Local version is " + l5.f15621a + " and remote version is " + l5.f15622b + ".");
        } catch (Throwable th3) {
            th = th3;
            if (j5 == 0) {
                f19576j.remove();
            } else {
                f19576j.set(l6);
            }
            Cursor cursor3 = c2427f2.f19589a;
            if (cursor3 != null) {
                cursor3.close();
            }
            i.set(c2427f);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x018b, code lost:
    
        if (r2 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z3) {
        Field declaredField;
        Throwable th;
        RemoteException e3;
        int readInt;
        Cursor cursor;
        try {
            synchronized (C2424c.class) {
                Boolean bool = f19572d;
                boolean z5 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e5.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (C2422a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e6 = e(context, str, z3, true);
                                        String str2 = f19573e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader O5 = AbstractC2425d.O();
                                            if (O5 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    j.b();
                                                    String str3 = f19573e;
                                                    v.e(str3);
                                                    O5 = j.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f19573e;
                                                    v.e(str4);
                                                    O5 = new C2426e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(O5);
                                            declaredField.set(null, O5);
                                            f19572d = bool2;
                                            return e6;
                                        }
                                        return e6;
                                    } catch (C2422a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f19572d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z3, false);
                    } catch (C2422a e7) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
                        return 0;
                    }
                }
                C2428g h3 = h(context);
                try {
                    if (h3 == null) {
                        return 0;
                    }
                    try {
                        Parcel L5 = h3.L(h3.N(), 6);
                        int readInt2 = L5.readInt();
                        L5.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = i;
                            C2427f c2427f = (C2427f) threadLocal.get();
                            if (c2427f != null && (cursor = c2427f.f19589a) != null) {
                                return cursor.getInt(0);
                            }
                            BinderC2361b binderC2361b = new BinderC2361b(context);
                            long longValue = ((Long) f19576j.get()).longValue();
                            Parcel N5 = h3.N();
                            AbstractC2644a.c(N5, binderC2361b);
                            N5.writeString(str);
                            N5.writeInt(z3 ? 1 : 0);
                            N5.writeLong(longValue);
                            Cursor cursor3 = (Cursor) BinderC2361b.t1(L1.a.q(h3.L(N5, 7)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            C2427f c2427f2 = (C2427f) threadLocal.get();
                                            if (c2427f2 == null || c2427f2.f19589a != null) {
                                                z5 = false;
                                            } else {
                                                c2427f2.f19589a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e8) {
                                    e3 = e8;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC2361b binderC2361b2 = new BinderC2361b(context);
                            Parcel N6 = h3.N();
                            AbstractC2644a.c(N6, binderC2361b2);
                            N6.writeString(str);
                            N6.writeInt(z3 ? 1 : 0);
                            Parcel L6 = h3.L(N6, 5);
                            readInt = L6.readInt();
                            L6.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC2361b binderC2361b3 = new BinderC2361b(context);
                            Parcel N7 = h3.N();
                            AbstractC2644a.c(N7, binderC2361b3);
                            N7.writeString(str);
                            N7.writeInt(z3 ? 1 : 0);
                            Parcel L7 = h3.L(N7, 3);
                            readInt = L7.readInt();
                            L7.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e9) {
                        e3 = e9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            AbstractC2309b.a(context, th4);
            throw th4;
        }
    }

    public static int e(Context context, String str, boolean z3, boolean z5) {
        Throwable th;
        Exception exc;
        boolean z6;
        try {
            try {
                boolean z7 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z3 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f19576j.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z8 = false;
                            int i5 = query.getInt(0);
                            if (i5 > 0) {
                                synchronized (C2424c.class) {
                                    try {
                                        f19573e = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f19574g = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z6 = query.getInt(columnIndex2) != 0;
                                            f = z6;
                                        } else {
                                            z6 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C2427f c2427f = (C2427f) i.get();
                                if (c2427f == null || c2427f.f19589a != null) {
                                    z7 = false;
                                } else {
                                    c2427f.f19589a = query;
                                }
                                r1 = z7 ? null : query;
                                z8 = z6;
                            } else {
                                r1 = query;
                            }
                            if (z5 && z8) {
                                throw new C2422a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (r1 != null) {
                                r1.close();
                            }
                            return i5;
                        }
                    } catch (Exception e3) {
                        exc = e3;
                        if (exc instanceof C2422a) {
                            throw exc;
                        }
                        throw new C2422a("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        r1 = query;
                        th = th3;
                        if (r1 == null) {
                            throw th;
                        }
                        r1.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C2422a("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e5) {
                exc = e5;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void f(ClassLoader classLoader) {
        try {
            C2429h c2429h = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C2429h) {
                    c2429h = (C2429h) queryLocalInterface;
                } else {
                    try {
                        c2429h = new C2429h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        throw new C2422a("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e5) {
                        e = e5;
                        throw new C2422a("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        throw new C2422a("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        throw new C2422a("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f19579m = c2429h;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            e = e8;
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f19575h)) {
            return true;
        }
        boolean z3 = false;
        if (f19575h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (j3.f.f17514b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            f19575h = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    public static C2428g h(Context context) {
        C2428g c2428g;
        synchronized (C2424c.class) {
            C2428g c2428g2 = f19578l;
            if (c2428g2 != null) {
                return c2428g2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c2428g = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c2428g = queryLocalInterface instanceof C2428g ? (C2428g) queryLocalInterface : new C2428g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (c2428g != null) {
                    f19578l = c2428g;
                    return c2428g;
                }
            } catch (Exception e3) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e3.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f19580a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new C2422a("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}
