package S0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class G0<T> extends AbstractC3992x<T> {
    public G0() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        if (r0 == r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.AbstractC3992x
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G1<T> b(@NotNull H0<T> h02, G1<T> g12) {
        P p11;
        P p12 = null;
        if (g12 instanceof P) {
            if (h02.h()) {
                p12 = (P) g12;
                p12.b().setValue(h02.d());
            }
        } else if (g12 instanceof C1) {
            if (h02.i()) {
                C1 c12 = (C1) g12;
                boolean d11 = Intrinsics.d(h02.d(), c12.b());
                p11 = c12;
            }
        } else if (g12 instanceof F) {
            Function1<InterfaceC3994y, T> c11 = h02.c();
            F f7 = (F) g12;
            Function1<InterfaceC3994y, T> b11 = f7.b();
            p11 = f7;
        }
        if (p12 != null) {
            return p12;
        }
        if (!h02.h()) {
            return h02.c() != null ? new F(h02.c()) : new C1(h02.d());
        }
        T f11 = h02.f();
        l1<T> e11 = h02.e();
        if (e11 == null) {
            e11 = D1.f25195a;
        }
        return new P(n1.f(f11, e11));
    }

    @NotNull
    public abstract H0<T> c(T t2);
}
