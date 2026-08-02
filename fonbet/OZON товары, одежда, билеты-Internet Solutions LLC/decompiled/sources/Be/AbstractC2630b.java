package Be;

import Ae.M0;
import Be.AbstractC2632d;
import Sc.r;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* renamed from: Be.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2630b<S extends AbstractC2632d<?>> {

    /* renamed from: a, reason: collision with root package name */
    private S[] f3567a;

    /* renamed from: b, reason: collision with root package name */
    private int f3568b;

    /* renamed from: c, reason: collision with root package name */
    private int f3569c;

    /* renamed from: d, reason: collision with root package name */
    private G f3570d;

    @NotNull
    protected final S e() {
        S s11;
        G g10;
        synchronized (this) {
            try {
                S[] sArr = this.f3567a;
                if (sArr == null) {
                    sArr = (S[]) g();
                    this.f3567a = sArr;
                } else if (this.f3568b >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f3567a = (S[]) ((AbstractC2632d[]) copyOf);
                    sArr = (S[]) ((AbstractC2632d[]) copyOf);
                }
                int i11 = this.f3569c;
                do {
                    s11 = sArr[i11];
                    if (s11 == null) {
                        s11 = f();
                        sArr[i11] = s11;
                    }
                    i11++;
                    if (i11 >= sArr.length) {
                        i11 = 0;
                    }
                } while (!s11.a(this));
                this.f3569c = i11;
                this.f3568b++;
                g10 = this.f3570d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g10 != null) {
            g10.A(1);
        }
        return s11;
    }

    @NotNull
    protected abstract S f();

    @NotNull
    protected abstract AbstractC2632d[] g();

    @NotNull
    public final M0<Integer> getSubscriptionCount() {
        G g10;
        synchronized (this) {
            g10 = this.f3570d;
            if (g10 == null) {
                int i11 = this.f3568b;
                g10 = new G(1, Integer.MAX_VALUE, EnumC11113a.DROP_OLDEST);
                g10.tryEmit(Integer.valueOf(i11));
                this.f3570d = g10;
            }
        }
        return g10;
    }

    protected final void h(@NotNull S s11) {
        G g10;
        int i11;
        kotlin.coroutines.d[] b11;
        synchronized (this) {
            try {
                int i12 = this.f3568b - 1;
                this.f3568b = i12;
                g10 = this.f3570d;
                if (i12 == 0) {
                    this.f3569c = 0;
                }
                Intrinsics.g(s11, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b11 = s11.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kotlin.coroutines.d dVar : b11) {
            if (dVar != null) {
                r.Companion companion = Sc.r.INSTANCE;
                dVar.resumeWith(Unit.f71690a);
            }
        }
        if (g10 != null) {
            g10.A(-1);
        }
    }

    protected final int i() {
        return this.f3568b;
    }

    protected final S[] j() {
        return this.f3567a;
    }
}
