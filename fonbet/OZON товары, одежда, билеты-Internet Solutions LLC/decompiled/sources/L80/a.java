package L80;

import G.g;
import N3.C3660k;
import android.app.Application;
import android.util.Log;
import io.sentry.K1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static c f16598a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f16599b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16600c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f16601d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f16602e;

    public static void a(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f16602e || f16600c) {
            Log.d(Nk.a.b("FintechLibLog/", tag), Thread.currentThread().getName() + " " + message);
        }
        if (f16599b && K1.i()) {
            K1.d().p(g.c(tag, " : ", message));
        }
        if (f16601d) {
            StringBuilder d11 = C3660k.d("FintechLibLog/", tag, " : ", Thread.currentThread().getName(), " ");
            d11.append(message);
            f(d11.toString());
        }
    }

    public static void b(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f16602e || f16600c) {
            Log.e(Nk.a.b("FintechLibLog/", tag), Thread.currentThread().getName() + " " + message);
        }
        if (f16599b && K1.i()) {
            K1.d().p(g.c(tag, " : ", message));
        }
        if (f16601d) {
            StringBuilder d11 = C3660k.d("FintechLibLog/", tag, " : ", Thread.currentThread().getName(), " ");
            d11.append(message);
            f(d11.toString());
        }
    }

    public static void c(@NotNull String tag, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String c11 = g.c(Thread.currentThread().getName(), ": ", str);
        if (f16602e || f16600c) {
            Log.e(Nk.a.b("FintechLibLog/", tag), c11 + " " + th2);
        }
        if (f16599b && K1.i()) {
            K1.d().p(tag + " : " + c11 + " : " + th2);
        }
        if (f16601d) {
            String message = th2 != null ? th2.getMessage() : null;
            StringBuilder d11 = C3660k.d("FintechLibLog/", tag, " : ", c11, " ");
            d11.append(message);
            f(d11.toString());
        }
        if (th2 != null) {
            th2.printStackTrace();
        }
    }

    public static c d() {
        return f16598a;
    }

    public static void e(@NotNull Application context, @NotNull M ioScope, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        f16602e = z11;
        f16601d = z12;
        if (z12) {
            f16598a = new c(context, ioScope);
        }
    }

    private static void f(String str) {
        c cVar;
        if (!f16601d || (cVar = f16598a) == null) {
            return;
        }
        cVar.g(str);
    }

    public static void g(@NotNull Exception e11) {
        String message;
        Intrinsics.checkNotNullParameter(e11, "e");
        if (f16602e || f16600c) {
            e11.printStackTrace();
        }
        if (!f16601d || (message = e11.getMessage()) == null) {
            return;
        }
        f(message);
    }

    public static void h(boolean z11) {
        f16600c = z11;
    }

    public static void i() {
        f16599b = true;
    }
}
