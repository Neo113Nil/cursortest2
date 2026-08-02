package Jd0;

import Sc.o;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd0.d;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static zd0.d f14619b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14618a = new a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f14620c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    private static String a(String str) {
        return G.g.c(f14620c.format(Calendar.getInstance().getTime()), " | ", str);
    }

    public static void b(@NotNull zd0.d logConfig) {
        Intrinsics.checkNotNullParameter(logConfig, "logConfig");
        f14619b = logConfig;
    }

    public static boolean c() {
        zd0.d dVar = f14619b;
        if (dVar != null) {
            return dVar instanceof d.a;
        }
        Intrinsics.n("configuration");
        throw null;
    }

    public final void d(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(a(message), null);
    }

    public final void e(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter("Error for in app push loading", "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        f(a("Error for in app push loading"), throwable);
    }

    public final void f(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        zd0.d dVar = f14619b;
        if (dVar == null) {
            Intrinsics.n("configuration");
            throw null;
        }
        if (!(dVar instanceof d.a)) {
            throw new o();
        }
        if (th2 == null) {
            Log.d("OzonInAppPushSdk", message);
        } else {
            Log.e("OzonInAppPushSdk", message, th2);
        }
    }
}
