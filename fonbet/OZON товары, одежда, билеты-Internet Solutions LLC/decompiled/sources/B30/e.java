package B30;

import B30.a;
import Sc.C4001c;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ComponentCallbacksC5392m;
import g30.InterfaceC6618a;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.o;

/* loaded from: classes3.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r.n f2388a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2389b;

    public e(@NotNull r.n biometricManager, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(biometricManager, "biometricManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f2388a = biometricManager;
        this.f2389b = fintechAnalyticInteractor;
    }

    public static void e(e eVar, r.o oVar, String str) {
        eVar.f2389b.D1();
        try {
            oVar.a(g(str));
        } catch (Throwable th2) {
            oVar.d();
            eVar.f2389b.m0(C4001c.b(th2));
            L80.a.b("BiometricAuthManagerImpl", "Biometric prompt error = " + th2);
        }
    }

    public static void f(e eVar, r.o oVar, String str) {
        eVar.f2389b.D1();
        try {
            oVar.a(g(str));
        } catch (Throwable th2) {
            eVar.f2389b.m0(C4001c.b(th2));
            oVar.d();
            L80.a.b("BiometricAuthManagerImpl", "Biometric prompt error = " + th2);
        }
    }

    private static o.d g(String str) {
        o.d.a aVar = new o.d.a();
        aVar.f(str);
        aVar.b(15);
        aVar.d("Cancel");
        aVar.c();
        o.d a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        return a11;
    }

    @Override // B30.a
    @NotNull
    public final a.b a() {
        int a11 = this.f2388a.a(15);
        return a11 != 0 ? a11 != 11 ? a.b.NOT_AVAILABLE : a.b.NOT_ENROLLED : a.b.AVAILABLE;
    }

    @Override // B30.a
    public final boolean b() {
        int a11 = this.f2388a.a(15);
        if (a11 == -2) {
            L80.a.a("BiometricAuthManagerImpl", "The user can't authenticate because the specified options are incompatible with the current Android version.");
            return false;
        }
        if (a11 == -1) {
            L80.a.a("BiometricAuthManagerImpl", "Unable to determine whether the user can authenticate.");
            return false;
        }
        if (a11 == 0) {
            return true;
        }
        if (a11 == 1) {
            L80.a.a("BiometricAuthManagerImpl", "Biometric features are currently unavailable.");
            return false;
        }
        if (a11 == 11) {
            L80.a.a("BiometricAuthManagerImpl", "User didn't create biometric credentials");
            return false;
        }
        if (a11 == 12) {
            L80.a.a("BiometricAuthManagerImpl", "No biometric features available on this device.");
            return false;
        }
        if (a11 != 15) {
            return false;
        }
        L80.a.a("BiometricAuthManagerImpl", "The user can't authenticate because a security vulnerability has been discovered with one or more hardware sensors.");
        return false;
    }

    @Override // B30.a
    public final void c(@NotNull androidx.fragment.app.r activity, @NotNull final String reason, Executor executor, @NotNull Function1<? super a.EnumC0054a, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final r.o oVar = executor == null ? new r.o(activity, new d(callback)) : new r.o(activity, executor, new d(callback));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: B30.b
            @Override // java.lang.Runnable
            public final void run() {
                e.e(e.this, oVar, reason);
            }
        });
    }

    @Override // B30.a
    public final void d(@NotNull ComponentCallbacksC5392m fragment, @NotNull final String reason, Executor executor, @NotNull Function1<? super a.EnumC0054a, Unit> callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final r.o oVar = executor == null ? new r.o(fragment, new d(callback)) : new r.o(fragment, executor, new d(callback));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: B30.c
            @Override // java.lang.Runnable
            public final void run() {
                e.f(e.this, oVar, reason);
            }
        });
    }
}
