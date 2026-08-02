package x3;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.D;
import java.lang.reflect.Method;
import p3.C1535a;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1788a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f18089a = d.f11217b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f18090b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f18091c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f18092d;

    public static void a(Context context) {
        Context context2;
        D.j(context, "Context must not be null");
        f18089a.getClass();
        g.ensurePlayServicesAvailable(context, 11925000);
        synchronized (f18090b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = p3.d.c(context, p3.d.f15679d, "com.google.android.gms.providerinstaller.dynamite").f15689a;
            } catch (C1535a e7) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e7.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context remoteContext = g.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (f18092d == null) {
                        Class cls = Long.TYPE;
                        f18092d = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f18092d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
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

    public static void b(Context context, String str) {
        try {
            if (f18091c == null) {
                f18091c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f18091c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e7.getMessage() : cause.getMessage())));
            }
            throw new e();
        }
    }
}
