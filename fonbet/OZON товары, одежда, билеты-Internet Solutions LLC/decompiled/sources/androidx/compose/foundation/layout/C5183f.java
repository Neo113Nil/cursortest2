package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5183f extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    private float f39478a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39479b;

    /* renamed from: androidx.compose.foundation.layout.f$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39480b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f39480b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public C5183f(float f7, boolean z11) {
        this.f39478a = f7;
        this.f39479b = z11;
    }

    private final long K1(long j11, boolean z11) {
        int round;
        int j12 = Z1.b.j(j11);
        if (j12 == Integer.MAX_VALUE || (round = Math.round(j12 * this.f39478a)) <= 0) {
            return 0L;
        }
        long a11 = Z1.r.a(round, j12);
        if (!z11 || Z1.c.j(j11, a11)) {
            return a11;
        }
        return 0L;
    }

    private final long L1(long j11, boolean z11) {
        int round;
        int k11 = Z1.b.k(j11);
        if (k11 == Integer.MAX_VALUE || (round = Math.round(k11 / this.f39478a)) <= 0) {
            return 0L;
        }
        long a11 = Z1.r.a(k11, round);
        if (!z11 || Z1.c.j(j11, a11)) {
            return a11;
        }
        return 0L;
    }

    private final long M1(long j11, boolean z11) {
        int l11 = Z1.b.l(j11);
        int round = Math.round(l11 * this.f39478a);
        if (round <= 0) {
            return 0L;
        }
        long a11 = Z1.r.a(round, l11);
        if (!z11 || Z1.c.j(j11, a11)) {
            return a11;
        }
        return 0L;
    }

    private final long N1(long j11, boolean z11) {
        int m11 = Z1.b.m(j11);
        int round = Math.round(m11 / this.f39478a);
        if (round <= 0) {
            return 0L;
        }
        long a11 = Z1.r.a(m11, round);
        if (!z11 || Z1.c.j(j11, a11)) {
            return a11;
        }
        return 0L;
    }

    @Override // D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.f39478a) : interfaceC2552v.T(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (Z1.q.c(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        if (Z1.q.c(r5, 0) == false) goto L53;
     */
    @Override // D1.E
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        long K12;
        B1.W z02;
        if (this.f39479b) {
            K12 = K1(j11, true);
            if (Z1.q.c(K12, 0L)) {
                K12 = L1(j11, true);
                if (Z1.q.c(K12, 0L)) {
                    K12 = M1(j11, true);
                    if (Z1.q.c(K12, 0L)) {
                        K12 = N1(j11, true);
                        if (Z1.q.c(K12, 0L)) {
                            K12 = K1(j11, false);
                            if (Z1.q.c(K12, 0L)) {
                                K12 = L1(j11, false);
                                if (Z1.q.c(K12, 0L)) {
                                    K12 = M1(j11, false);
                                    if (Z1.q.c(K12, 0L)) {
                                        K12 = N1(j11, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            K12 = L1(j11, true);
            if (Z1.q.c(K12, 0L)) {
                K12 = K1(j11, true);
                if (Z1.q.c(K12, 0L)) {
                    K12 = N1(j11, true);
                    if (Z1.q.c(K12, 0L)) {
                        K12 = M1(j11, true);
                        if (Z1.q.c(K12, 0L)) {
                            K12 = L1(j11, false);
                            if (Z1.q.c(K12, 0L)) {
                                K12 = K1(j11, false);
                                if (Z1.q.c(K12, 0L)) {
                                    K12 = N1(j11, false);
                                    if (Z1.q.c(K12, 0L)) {
                                        K12 = M1(j11, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Z1.q.c(K12, 0L)) {
            int i11 = (int) (K12 >> 32);
            int i12 = (int) (4294967295L & K12);
            if (i11 < 0 || i12 < 0) {
                Z1.l.a("width(" + i11 + ") and height(" + i12 + ") must be >= 0");
                throw null;
            }
            j11 = Z1.c.i(i11, i11, i12, i12);
        }
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.f39478a) : interfaceC2552v.D(i11);
    }

    public final void I1(float f7) {
        this.f39478a = f7;
    }

    public final void J1(boolean z11) {
        this.f39479b = z11;
    }

    @Override // D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.f39478a) : interfaceC2552v.O(i11);
    }

    @Override // D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.f39478a) : interfaceC2552v.Y(i11);
    }
}
