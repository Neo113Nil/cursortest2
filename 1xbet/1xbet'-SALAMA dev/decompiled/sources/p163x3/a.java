package p163x3;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.D;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18095a = d.f11217b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18096b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f18097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f18098d;

    public static void a(Context context) {
        Context context2;
        D.j(context, "Context must not be null");
        f18095a.getClass();
        g.ensurePlayServicesAvailable(context, 11925000);
        synchronized (f18096b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = p113p3.d.c(context, p113p3.d.f15685d, "com.google.android.gms.providerinstaller.dynamite").f15695a;
            } catch (p113p3.a e7) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e7.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Context remoteContext = g.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (f18098d == null) {
                        Class cls = Long.TYPE;
                        f18098d = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f18098d.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e8) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e8.getMessage())));
                }
            }
            if (remoteContext != null) {
                b(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new e();
            }
        }
    }

    public static void b(Context context, String str) throws e {
        try {
            if (f18097c == null) {
                f18097c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f18097c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e7.getMessage() : cause.getMessage())));
            }
            throw new e();
        }
    }
}
