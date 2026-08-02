package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.X0;

/* loaded from: classes.dex */
public final class H {
    @NotNull
    public static final D a(@NotNull AbstractC5434v abstractC5434v) {
        Intrinsics.checkNotNullParameter(abstractC5434v, "<this>");
        while (true) {
            D d11 = (D) abstractC5434v.d().get();
            if (d11 != null) {
                return d11;
            }
            xe.B0 b11 = X0.b();
            C10720e0 c10720e0 = C10720e0.f105451a;
            D d12 = new D(abstractC5434v, CoroutineContext.Element.a.d(De.s.f6650a.x(), (xe.H0) b11));
            AtomicReference<Object> d13 = abstractC5434v.d();
            while (!d13.compareAndSet(null, d12)) {
                if (d13.get() != null) {
                    break;
                }
            }
            C10720e0 c10720e02 = C10720e0.f105451a;
            C10727i.c(d12, De.s.f6650a.x(), null, new C(d12, null), 2);
            return d12;
        }
    }
}
