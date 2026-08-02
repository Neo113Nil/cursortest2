package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5240e extends AbstractC5231b {

    /* renamed from: e, reason: collision with root package name */
    private static C5240e f40862e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final V1.g f40863f = V1.g.Rtl;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final V1.g f40864g = V1.g.Ltr;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f40865h = 0;

    /* renamed from: c, reason: collision with root package name */
    private K1.K f40866c;

    /* renamed from: d, reason: collision with root package name */
    private I1.r f40867d;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        @NotNull
        public static C5240e a() {
            if (C5240e.f40862e == null) {
                C5240e c5240e = new C5240e();
                new Rect();
                C5240e.f40862e = c5240e;
            }
            C5240e c5240e2 = C5240e.f40862e;
            Intrinsics.g(c5240e2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c5240e2;
        }
    }

    private final int h(int i11, V1.g gVar) {
        K1.K k11 = this.f40866c;
        if (k11 == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        int t2 = k11.t(i11);
        K1.K k12 = this.f40866c;
        if (k12 == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        if (gVar != k12.x(t2)) {
            K1.K k13 = this.f40866c;
            if (k13 != null) {
                return k13.t(i11);
            }
            Intrinsics.n("layoutResult");
            throw null;
        }
        if (this.f40866c != null) {
            return K1.K.o(r6, i11) - 1;
        }
        Intrinsics.n("layoutResult");
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] a(int i11) {
        int m11;
        if (c().length() > 0 && i11 < c().length()) {
            try {
                I1.r rVar = this.f40867d;
                if (rVar == null) {
                    Intrinsics.n("node");
                    throw null;
                }
                int round = Math.round(rVar.g().m());
                if (i11 <= 0) {
                    i11 = 0;
                }
                K1.K k11 = this.f40866c;
                if (k11 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int p11 = k11.p(i11);
                K1.K k12 = this.f40866c;
                if (k12 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                float u11 = k12.u(p11) + round;
                K1.K k13 = this.f40866c;
                if (k13 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                if (u11 < k13.u(k13.m() - 1)) {
                    K1.K k14 = this.f40866c;
                    if (k14 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    m11 = k14.q(u11);
                } else {
                    K1.K k15 = this.f40866c;
                    if (k15 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    m11 = k15.m();
                }
                return b(i11, h(m11 - 1, f40864g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] e(int i11) {
        int i12;
        if (c().length() > 0 && i11 > 0) {
            try {
                I1.r rVar = this.f40867d;
                if (rVar == null) {
                    Intrinsics.n("node");
                    throw null;
                }
                int round = Math.round(rVar.g().m());
                int length = c().length();
                if (length <= i11) {
                    i11 = length;
                }
                K1.K k11 = this.f40866c;
                if (k11 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int p11 = k11.p(i11);
                K1.K k12 = this.f40866c;
                if (k12 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                float u11 = k12.u(p11) - round;
                if (u11 > 0.0f) {
                    K1.K k13 = this.f40866c;
                    if (k13 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    i12 = k13.q(u11);
                } else {
                    i12 = 0;
                }
                if (i11 == c().length() && i12 < p11) {
                    i12++;
                }
                return b(h(i12, f40863f), i11);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final void i(@NotNull String str, @NotNull K1.K k11, @NotNull I1.r rVar) {
        this.f40816a = str;
        this.f40866c = k11;
        this.f40867d = rVar;
    }
}
