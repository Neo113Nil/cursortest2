package p3;

import B4.V;
import C0.C0091j;
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
import com.google.android.gms.common.internal.D;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import d1.n;
import e6.C1054c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;
import w1.C1718l0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f15680e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f15681f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15682g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f15683h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f15684i;

    /* renamed from: m, reason: collision with root package name */
    public static i f15687m;

    /* renamed from: n, reason: collision with root package name */
    public static j f15688n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15689a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final L3.b f15685k = new L3.b(7);

    /* renamed from: l, reason: collision with root package name */
    public static final V f15686l = new V(21);

    /* renamed from: b, reason: collision with root package name */
    public static final M4.e f15677b = new M4.e();

    /* renamed from: c, reason: collision with root package name */
    public static final C1054c f15678c = new C1054c(21);

    /* renamed from: d, reason: collision with root package name */
    public static final C1718l0 f15679d = new C1718l0(21);

    public d(Context context) {
        this.f15689a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (D.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r10 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d c(Context context, InterfaceC1537c interfaceC1537c, String str) {
        h hVar;
        h hVar2;
        d dVar;
        Boolean bool;
        InterfaceC1506a Z6;
        d dVar2;
        j jVar;
        boolean z4;
        InterfaceC1506a Z7;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C1535a("null application Context");
        }
        ThreadLocal threadLocal = j;
        h hVar3 = (h) threadLocal.get();
        h hVar4 = new h();
        threadLocal.set(hVar4);
        L3.b bVar = f15685k;
        Long l7 = (Long) bVar.get();
        long longValue = l7.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0091j e7 = interfaceC1537c.e(context2, str, f15686l);
            int i7 = e7.f1289a;
            try {
                int i8 = e7.f1290b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i7 + " and remote module " + str + ":" + i8);
                    int i9 = e7.f1291c;
                    try {
                        if (i9 != 0) {
                            if (i9 == -1) {
                                if (e7.f1289a != 0) {
                                    i9 = -1;
                                }
                            }
                            i8 = i8;
                            if (i9 == 1) {
                                int i10 = e7.f1290b;
                                i8 = i10;
                            }
                            if (i9 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dVar = new d(applicationContext);
                            } else {
                                if (i9 != 1) {
                                    throw new C1535a("VersionPolicy returned invalid code:" + i9);
                                }
                                try {
                                    int i11 = e7.f1290b;
                                    try {
                                        synchronized (d.class) {
                                            if (!g(context)) {
                                                throw new C1535a("Remote loading disabled");
                                            }
                                            bool = f15680e;
                                        }
                                        if (bool == null) {
                                            throw new C1535a("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            synchronized (d.class) {
                                                jVar = f15688n;
                                            }
                                            if (jVar == null) {
                                                throw new C1535a("DynamiteLoaderV2 was not cached.");
                                            }
                                            h hVar5 = (h) threadLocal.get();
                                            if (hVar5 == null || hVar5.f15693a == null) {
                                                throw new C1535a("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor = hVar5.f15693a;
                                            new BinderC1507b(null);
                                            synchronized (d.class) {
                                                z4 = f15683h >= 2;
                                            }
                                            if (z4) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                Z7 = jVar.t0(new BinderC1507b(applicationContext2), str, i11, new BinderC1507b(cursor));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                Z7 = jVar.Z(new BinderC1507b(applicationContext2), str, i11, new BinderC1507b(cursor));
                                            }
                                            Context context3 = (Context) BinderC1507b.t0(Z7);
                                            if (context3 == null) {
                                                throw new C1535a("Failed to get module context");
                                            }
                                            dVar2 = new d(context3);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            i h6 = h(context);
                                            if (h6 == null) {
                                                throw new C1535a("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel zzB = h6.zzB(6, h6.zza());
                                            int readInt = zzB.readInt();
                                            zzB.recycle();
                                            if (readInt >= 3) {
                                                h hVar6 = (h) threadLocal.get();
                                                if (hVar6 == null) {
                                                    throw new C1535a("No cached result cursor holder");
                                                }
                                                Z6 = h6.t0(new BinderC1507b(context2), str, i11, new BinderC1507b(hVar6.f15693a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                Z6 = h6.u0(new BinderC1507b(context2), str, i11);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                Z6 = h6.Z(new BinderC1507b(context2), str, i11);
                                            }
                                            Object t02 = BinderC1507b.t0(Z6);
                                            if (t02 == null) {
                                                throw new C1535a("Failed to load remote module.");
                                            }
                                            dVar2 = new d((Context) t02);
                                        }
                                        dVar = dVar2;
                                    } catch (RemoteException e8) {
                                        throw new C1535a("Failed to load remote module.", e8);
                                    } catch (C1535a e9) {
                                        throw e9;
                                    } catch (Throwable th) {
                                        m3.c.a(context2, th);
                                        throw new C1535a("Failed to load remote module.", th);
                                    }
                                } catch (C1535a e10) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                    int i12 = e7.f1289a;
                                    if (i12 == 0 || interfaceC1537c.e(context2, str, new n(i12)).f1291c != -1) {
                                        throw new C1535a("Remote load failed. No local fallback found.", e10);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    dVar = new d(applicationContext);
                                }
                            }
                            if (longValue == 0) {
                                f15685k.remove();
                            } else {
                                f15685k.set(l7);
                            }
                            Cursor cursor2 = hVar4.f15693a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            j.set(hVar3);
                            return dVar;
                        }
                        throw new C1535a("No acceptable module " + str + " found. Local version is " + e7.f1289a + " and remote version is " + e7.f1290b + ".");
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = context2;
                        hVar2 = i8;
                        if (longValue == 0) {
                            f15685k.remove();
                        } else {
                            f15685k.set(l7);
                        }
                        Cursor cursor3 = hVar.f15693a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        j.set(hVar2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hVar2 = hVar3;
                    hVar = hVar4;
                }
            } catch (Throwable th4) {
                th = th4;
                hVar = hVar4;
                hVar2 = hVar3;
            }
        } catch (Throwable th5) {
            th = th5;
            hVar = hVar4;
            hVar2 = hVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x018b, code lost:
    
        if (r2 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z4) {
        Field declaredField;
        Throwable th;
        RemoteException e7;
        int readInt;
        Cursor cursor;
        try {
            synchronized (d.class) {
                Boolean bool = f15680e;
                boolean z7 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (C1535a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f15682g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e9 = e(context, str, z4, true);
                                        String str2 = f15681f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader k02 = f.k0();
                                            if (k02 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    H2.i.d();
                                                    String str3 = f15681f;
                                                    D.i(str3);
                                                    k02 = H2.i.c(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f15681f;
                                                    D.i(str4);
                                                    k02 = new g(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(k02);
                                            declaredField.set(null, k02);
                                            f15680e = bool2;
                                            return e9;
                                        }
                                        return e9;
                                    } catch (C1535a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f15680e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z4, false);
                    } catch (C1535a e10) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                        return 0;
                    }
                }
                i h6 = h(context);
                try {
                    if (h6 == null) {
                        return 0;
                    }
                    try {
                        Parcel zzB = h6.zzB(6, h6.zza());
                        int readInt2 = zzB.readInt();
                        zzB.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = j;
                            h hVar = (h) threadLocal.get();
                            if (hVar != null && (cursor = hVar.f15693a) != null) {
                                return cursor.getInt(0);
                            }
                            BinderC1507b binderC1507b = new BinderC1507b(context);
                            long longValue = ((Long) f15685k.get()).longValue();
                            Parcel zza = h6.zza();
                            zzc.zze(zza, binderC1507b);
                            zza.writeString(str);
                            zza.writeInt(z4 ? 1 : 0);
                            zza.writeLong(longValue);
                            Cursor cursor3 = (Cursor) BinderC1507b.t0(AbstractC1663a.h(h6.zzB(7, zza)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            h hVar2 = (h) threadLocal.get();
                                            if (hVar2 == null || hVar2.f15693a != null) {
                                                z7 = false;
                                            } else {
                                                hVar2.f15693a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e11) {
                                    e7 = e11;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
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
                            BinderC1507b binderC1507b2 = new BinderC1507b(context);
                            Parcel zza2 = h6.zza();
                            zzc.zze(zza2, binderC1507b2);
                            zza2.writeString(str);
                            zza2.writeInt(z4 ? 1 : 0);
                            Parcel zzB2 = h6.zzB(5, zza2);
                            readInt = zzB2.readInt();
                            zzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC1507b binderC1507b3 = new BinderC1507b(context);
                            Parcel zza3 = h6.zza();
                            zzc.zze(zza3, binderC1507b3);
                            zza3.writeString(str);
                            zza3.writeInt(z4 ? 1 : 0);
                            Parcel zzB3 = h6.zzB(3, zza3);
                            readInt = zzB3.readInt();
                            zzB3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e12) {
                        e7 = e12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            m3.c.a(context, th4);
            throw th4;
        }
    }

    public static int e(Context context, String str, boolean z4, boolean z7) {
        boolean z8;
        try {
            try {
                boolean z9 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f15685k.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z10 = false;
                            int i7 = query.getInt(0);
                            if (i7 > 0) {
                                synchronized (d.class) {
                                    try {
                                        f15681f = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f15683h = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z8 = query.getInt(columnIndex2) != 0;
                                            f15682g = z8;
                                        } else {
                                            z8 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                h hVar = (h) j.get();
                                if (hVar == null || hVar.f15693a != null) {
                                    z9 = false;
                                } else {
                                    hVar.f15693a = query;
                                }
                                r0 = z9 ? null : query;
                                z10 = z8;
                            } else {
                                r0 = query;
                            }
                            if (z7 && z10) {
                                throw new C1535a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (r0 != null) {
                                r0.close();
                            }
                            return i7;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        if (e instanceof C1535a) {
                            throw e;
                        }
                        throw new C1535a("V2 version check failed: " + e.getMessage(), e);
                    } catch (Throwable th2) {
                        r0 = query;
                        th = th2;
                        if (r0 != null) {
                            r0.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C1535a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    public static void f(ClassLoader classLoader) {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f15688n = jVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new C1535a("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new C1535a("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new C1535a("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new C1535a("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new C1535a("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f15684i)) {
            return true;
        }
        boolean z4 = false;
        if (f15684i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.d.f11217b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            f15684i = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15682g = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    public static i h(Context context) {
        i iVar;
        synchronized (d.class) {
            i iVar2 = f15687m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (iVar != null) {
                    f15687m = iVar;
                    return iVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f15689a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new C1535a("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
