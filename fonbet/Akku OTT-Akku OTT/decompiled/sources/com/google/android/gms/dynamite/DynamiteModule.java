package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.media3.common.C0338w;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.common.zzc;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class DynamiteModule {
    public static Boolean f = null;
    public static String g = null;
    public static boolean h = false;
    public static int i = -1;
    public static Boolean j;
    public static n n;
    public static o o;
    public final Context a;
    public static final ThreadLocal k = new ThreadLocal();
    public static final f l = new f();
    public static final g m = new g();

    @NonNull
    public static final h b = new h();

    @NonNull
    public static final i c = new i();

    @NonNull
    public static final j d = new j();

    @NonNull
    public static final k e = new k();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
    }

    public interface b {

        public interface a {
            int a(@NonNull Context context, @NonNull String str, boolean z) throws a;

            int b(@NonNull Context context, @NonNull String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0115b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        @NonNull
        C0115b a(@NonNull Context context, @NonNull String str, @NonNull a aVar) throws a;
    }

    public DynamiteModule(Context context) {
        this.a = context;
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C0874p.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    @NonNull
    public static DynamiteModule c(@NonNull Context context, @NonNull b bVar, @NonNull String str) throws a {
        long j2;
        long j3;
        b.C0115b a2;
        int i2;
        int i3;
        int i4;
        DynamiteModule dynamiteModule;
        long j4;
        com.google.android.gms.dynamic.a E;
        DynamiteModule dynamiteModule2;
        o oVar;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = k;
        l lVar = (l) threadLocal.get();
        l lVar2 = new l();
        threadLocal.set(lVar2);
        f fVar = l;
        Long l2 = (Long) fVar.get();
        long longValue = l2.longValue();
        try {
            fVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            a2 = bVar.a(context, str, m);
            i2 = a2.a;
            j3 = 0;
            try {
                i3 = a2.b;
                i4 = a2.c;
            } catch (Throwable th) {
                th = th;
                j2 = longValue;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = longValue;
            j3 = 0;
        }
        try {
            if (i4 != 0) {
                if (i4 == -1) {
                    if (i2 != 0) {
                        i4 = -1;
                    }
                }
                if (i4 != 1 || i3 != 0) {
                    if (i4 == -1) {
                        "Selected local version of ".concat(str);
                        dynamiteModule = new DynamiteModule(applicationContext);
                        j4 = longValue;
                    } else {
                        try {
                            if (i4 != 1) {
                                throw new a("VersionPolicy returned invalid code:" + i4);
                            }
                            try {
                                try {
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                if (!g(context)) {
                                                    throw new a("Remote loading disabled");
                                                }
                                                Boolean bool = f;
                                                if (bool == null) {
                                                    throw new a("Failed to determine which loading route to use.");
                                                }
                                                if (bool.booleanValue()) {
                                                    synchronized (DynamiteModule.class) {
                                                        try {
                                                            oVar = o;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            while (true) {
                                                                try {
                                                                    throw th;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (oVar == null) {
                                                        throw new a("DynamiteLoaderV2 was not cached.");
                                                    }
                                                    l lVar3 = (l) threadLocal.get();
                                                    if (lVar3 == null || lVar3.a == null) {
                                                        throw new a("No result cursor");
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = lVar3.a;
                                                    new com.google.android.gms.dynamic.b(null);
                                                    try {
                                                        synchronized (DynamiteModule.class) {
                                                            try {
                                                                j4 = longValue;
                                                                Context context2 = (Context) com.google.android.gms.dynamic.b.D(i >= 2 ? oVar.D(new com.google.android.gms.dynamic.b(applicationContext2), str, i3, new com.google.android.gms.dynamic.b(cursor)) : oVar.C(new com.google.android.gms.dynamic.b(applicationContext2), str, i3, new com.google.android.gms.dynamic.b(cursor)));
                                                                if (context2 == null) {
                                                                    throw new a("Failed to get module context");
                                                                }
                                                                dynamiteModule2 = new DynamiteModule(context2);
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } else {
                                                    j4 = longValue;
                                                    n h2 = h(context);
                                                    if (h2 == null) {
                                                        throw new a("Failed to create IDynamiteLoader.");
                                                    }
                                                    Parcel zzB = h2.zzB(6, h2.zza());
                                                    int readInt = zzB.readInt();
                                                    zzB.recycle();
                                                    if (readInt >= 3) {
                                                        l lVar4 = (l) threadLocal.get();
                                                        if (lVar4 == null) {
                                                            throw new a("No cached result cursor holder");
                                                        }
                                                        E = h2.D(new com.google.android.gms.dynamic.b(context), str, i3, new com.google.android.gms.dynamic.b(lVar4.a));
                                                    } else {
                                                        E = readInt == 2 ? h2.E(new com.google.android.gms.dynamic.b(context), str, i3) : h2.C(new com.google.android.gms.dynamic.b(context), str, i3);
                                                    }
                                                    Object D = com.google.android.gms.dynamic.b.D(E);
                                                    if (D == null) {
                                                        throw new a("Failed to load remote module.");
                                                    }
                                                    dynamiteModule2 = new DynamiteModule((Context) D);
                                                }
                                                dynamiteModule = dynamiteModule2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (RemoteException e2) {
                                    e = e2;
                                    throw new a("Failed to load remote module.", e);
                                } catch (a e3) {
                                    throw e3;
                                } catch (Throwable th9) {
                                    th = th9;
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new a("Failed to load remote module.", th);
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                                throw new a("Failed to load remote module.", e);
                            } catch (a e5) {
                                throw e5;
                            } catch (Throwable th10) {
                                th = th10;
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (a e6) {
                            e6.getMessage();
                            int i5 = a2.a;
                            if (i5 == 0 || bVar.a(context, str, new m(i5)).c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e6);
                            }
                            "Selected local version of ".concat(str);
                            dynamiteModule = new DynamiteModule(applicationContext);
                        }
                    }
                    if (j4 == 0) {
                        l.remove();
                    } else {
                        l.set(l2);
                    }
                    Cursor cursor2 = lVar2.a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    k.set(lVar);
                    return dynamiteModule;
                }
            }
            throw new a("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".");
        } catch (Throwable th11) {
            th = th11;
            if (j2 == j3) {
                l.remove();
            } else {
                l.set(l2);
            }
            Cursor cursor3 = lVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            k.set(lVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0160, code lost:
    
        if (r2 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8 A[Catch: all -> 0x00d4, TryCatch #10 {all -> 0x00d4, blocks: (B:3:0x0002, B:9:0x00c9, B:77:0x00cf, B:11:0x00dc, B:42:0x0166, B:26:0x0175, B:60:0x01c8, B:61:0x01cb, B:54:0x01c1, B:81:0x00d8, B:139:0x01cd, B:5:0x0003, B:84:0x000a, B:85:0x0026, B:92:0x00c6, B:97:0x004a, B:114:0x00a0, B:122:0x00a3, B:133:0x00bb, B:8:0x00c8, B:136:0x00c1), top: B:2:0x0002, inners: #7, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        e3.toString();
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!h) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e4 = e(context, str, z, true);
                                        String str2 = g;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = d.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    com.google.android.gms.dynamite.b.a();
                                                    String str3 = g;
                                                    C0875q.g(str3);
                                                    a2 = com.google.android.gms.dynamite.a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = g;
                                                    C0875q.g(str4);
                                                    a2 = new e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(a2);
                                            declaredField.set(null, a2);
                                            f = bool2;
                                            return e4;
                                        }
                                        return e4;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (a e5) {
                        e5.getMessage();
                        return 0;
                    }
                }
                n h2 = h(context);
                if (h2 == null) {
                    return 0;
                }
                try {
                    Parcel zzB = h2.zzB(6, h2.zza());
                    int readInt2 = zzB.readInt();
                    zzB.recycle();
                    if (readInt2 >= 3) {
                        ThreadLocal threadLocal = k;
                        l lVar = (l) threadLocal.get();
                        if (lVar != null && (cursor = lVar.a) != null) {
                            return cursor.getInt(0);
                        }
                        com.google.android.gms.dynamic.b bVar = new com.google.android.gms.dynamic.b(context);
                        long longValue = ((Long) l.get()).longValue();
                        Parcel zza = h2.zza();
                        zzc.zze(zza, bVar);
                        zza.writeString(str);
                        zza.writeInt(z ? 1 : 0);
                        zza.writeLong(longValue);
                        Cursor cursor3 = (Cursor) com.google.android.gms.dynamic.b.D(C0338w.a(h2.zzB(7, zza)));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    readInt = cursor3.getInt(0);
                                    if (readInt > 0) {
                                        l lVar2 = (l) threadLocal.get();
                                        if (lVar2 == null || lVar2.a != null) {
                                            z2 = false;
                                        } else {
                                            lVar2.a = cursor3;
                                        }
                                    }
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (RemoteException e6) {
                                e2 = e6;
                                cursor2 = cursor3;
                                try {
                                    e2.getMessage();
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    }
                    if (readInt2 == 2) {
                        com.google.android.gms.dynamic.b bVar2 = new com.google.android.gms.dynamic.b(context);
                        Parcel zza2 = h2.zza();
                        zzc.zze(zza2, bVar2);
                        zza2.writeString(str);
                        zza2.writeInt(z ? 1 : 0);
                        Parcel zzB2 = h2.zzB(5, zza2);
                        readInt = zzB2.readInt();
                        zzB2.recycle();
                    } else {
                        com.google.android.gms.dynamic.b bVar3 = new com.google.android.gms.dynamic.b(context);
                        Parcel zza3 = h2.zza();
                        zzc.zze(zza3, bVar3);
                        zza3.writeString(str);
                        zza3.writeInt(z ? 1 : 0);
                        Parcel zzB3 = h2.zzB(3, zza3);
                        readInt = zzB3.readInt();
                        zzB3.recycle();
                    }
                    return readInt;
                } catch (RemoteException e7) {
                    e2 = e7;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z, boolean z2) throws a {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    g = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        i = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        h = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            l lVar = (l) k.get();
                                            if (lVar == null || lVar.a != null) {
                                                z4 = false;
                                            } else {
                                                lVar.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof a) {
                                        throw exc;
                                    }
                                    throw new a("V2 version check failed: " + exc.getMessage(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            throw new a("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void f(ClassLoader classLoader) throws a {
        try {
            o oVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new o(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            o = oVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (C0856f.b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            j = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                h = true;
            }
        }
        return z;
    }

    public static n h(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = n;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (nVar != null) {
                    n = nVar;
                    return nVar;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            return null;
        }
    }

    @NonNull
    public final IBinder b(@NonNull String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
