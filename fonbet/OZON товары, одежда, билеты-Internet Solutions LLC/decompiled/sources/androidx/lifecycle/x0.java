package androidx.lifecycle;

import h3.C6788a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.X0;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final com.google.common.primitives.e f43404a = new com.google.common.primitives.e();

    @NotNull
    public static final C6788a a(@NotNull w0 w0Var) {
        C6788a c6788a;
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        synchronized (f43404a) {
            c6788a = (C6788a) w0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c6788a == null) {
                try {
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    coroutineContext = De.s.f6650a.x();
                } catch (Sc.p unused) {
                    coroutineContext = kotlin.coroutines.g.f71771a;
                } catch (IllegalStateException unused2) {
                    coroutineContext = kotlin.coroutines.g.f71771a;
                }
                C6788a c6788a2 = new C6788a(coroutineContext.plus(X0.b()));
                w0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c6788a2);
                c6788a = c6788a2;
            }
        }
        return c6788a;
    }
}
