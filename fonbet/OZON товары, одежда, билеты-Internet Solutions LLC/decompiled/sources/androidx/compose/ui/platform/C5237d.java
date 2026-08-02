package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5237d extends AbstractC5231b {

    /* renamed from: d, reason: collision with root package name */
    private static C5237d f40831d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final V1.g f40832e = V1.g.Rtl;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final V1.g f40833f = V1.g.Ltr;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f40834g = 0;

    /* renamed from: c, reason: collision with root package name */
    private K1.K f40835c;

    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        @NotNull
        public static C5237d a() {
            if (C5237d.f40831d == null) {
                C5237d.f40831d = new C5237d();
            }
            C5237d c5237d = C5237d.f40831d;
            Intrinsics.g(c5237d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c5237d;
        }
    }

    private final int h(int i11, V1.g gVar) {
        K1.K k11 = this.f40835c;
        if (k11 == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        int t2 = k11.t(i11);
        K1.K k12 = this.f40835c;
        if (k12 == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        if (gVar != k12.x(t2)) {
            K1.K k13 = this.f40835c;
            if (k13 != null) {
                return k13.t(i11);
            }
            Intrinsics.n("layoutResult");
            throw null;
        }
        if (this.f40835c != null) {
            return K1.K.o(r6, i11) - 1;
        }
        Intrinsics.n("layoutResult");
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] a(int i11) {
        int i12;
        if (c().length() > 0 && i11 < c().length()) {
            V1.g gVar = f40832e;
            if (i11 < 0) {
                K1.K k11 = this.f40835c;
                if (k11 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                i12 = k11.p(0);
            } else {
                K1.K k12 = this.f40835c;
                if (k12 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int p11 = k12.p(i11);
                i12 = h(p11, gVar) == i11 ? p11 : p11 + 1;
            }
            K1.K k13 = this.f40835c;
            if (k13 == null) {
                Intrinsics.n("layoutResult");
                throw null;
            }
            if (i12 < k13.m()) {
                return b(h(i12, gVar), h(i12, f40833f) + 1);
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] e(int i11) {
        int i12;
        if (c().length() > 0 && i11 > 0) {
            int length = c().length();
            V1.g gVar = f40833f;
            if (i11 > length) {
                K1.K k11 = this.f40835c;
                if (k11 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                i12 = k11.p(c().length());
            } else {
                K1.K k12 = this.f40835c;
                if (k12 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int p11 = k12.p(i11);
                i12 = h(p11, gVar) + 1 == i11 ? p11 : p11 - 1;
            }
            if (i12 >= 0) {
                return b(h(i12, f40832e), h(i12, gVar) + 1);
            }
        }
        return null;
    }

    public final void i(@NotNull String str, @NotNull K1.K k11) {
        this.f40816a = str;
        this.f40835c = k11;
    }
}
