package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qy0 {

    /* JADX INFO: renamed from: a */
    public static final i90 f6631a = i90.f3485b;

    /* JADX INFO: renamed from: b */
    public static final Object f6632b = new Object();

    /* JADX INFO: renamed from: c */
    public static Method f6633c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f6634d = false;

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d6, B:41:0x00e6, B:42:0x00eb, B:44:0x00ed, B:45:0x00f9), top: B:48:0x0054, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d6, B:41:0x00e6, B:42:0x00eb, B:44:0x00ed, B:45:0x00f9), top: B:48:0x0054, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m4206a(Context context) {
        boolean z;
        Context contextCreatePackageContext;
        Context context2;
        p80.m3864i(context, "Context must not be null");
        f6631a.getClass();
        int i = o90.f5673e;
        i90 i90Var = i90.f3485b;
        int iM2575b = i90Var.m2575b(context, 11925000);
        if (iM2575b != 0) {
            Intent intentM2574a = i90Var.m2574a(iM2575b, context, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iM2575b).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iM2575b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentM2574a != null) {
                throw new n90("Google Play Services not available");
            }
            throw new m90();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f6632b) {
            Context context3 = null;
            if (f6634d) {
                z = f6634d;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    f6634d = true;
                    if (!z) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        a81 a81Var = new a81(Context.class, context, 12, false);
                        Class cls = Long.TYPE;
                        t22.m4664r(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", a81Var, new ty1(cls, Long.valueOf(jUptimeMillis), 12, false), new ty1(cls, Long.valueOf(jUptimeMillis2), 12, false));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    m4207b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new m90();
                }
            }
            try {
                context2 = C0335iv.m2706c(context, C0335iv.f3670d, "com.google.android.gms.providerinstaller.dynamite").f3681a;
            } catch (C0188ev e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                m4207b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = f6634d;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                f6634d = true;
                if (!z) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        a81 a81Var2 = new a81(Context.class, context, 12, false);
                        Class cls2 = Long.TYPE;
                        t22.m4664r(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", a81Var2, new ty1(cls2, Long.valueOf(jUptimeMillis), 12, false), new ty1(cls2, Long.valueOf(jUptimeMillis3), 12, false));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                m4207b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new m90();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4207b(Context context, String str) throws m90 {
        try {
            if (f6633c == null) {
                f6633c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f6633c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new m90();
        }
    }
}
