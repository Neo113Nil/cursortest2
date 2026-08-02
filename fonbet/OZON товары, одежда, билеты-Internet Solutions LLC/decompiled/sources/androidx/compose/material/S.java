package androidx.compose.material;

import D1.InterfaceC2807j;
import Sc.C;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class S implements InterfaceC8369J {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39943a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39944b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39945c;

    /* loaded from: classes8.dex */
    static final class a implements InterfaceC7813c0 {
        a() {
        }

        @Override // l1.InterfaceC7813c0
        /* renamed from: invoke-0d7_KjU */
        public final long mo7invoke0d7_KjU() {
            return S.this.f39945c;
        }
    }

    public S(boolean z11, float f7, long j11) {
        this.f39943a = z11;
        this.f39944b = f7;
        this.f39945c = j11;
    }

    @Override // n0.InterfaceC8369J
    @NotNull
    public final InterfaceC2807j b(@NotNull t0.o oVar) {
        a aVar = new a();
        return new DelegatingThemeAwareRippleNode(oVar, this.f39943a, this.f39944b, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s11 = (S) obj;
        if (this.f39943a == s11.f39943a && Z1.h.b(this.f39944b, s11.f39944b)) {
            return C7807Z.p(this.f39945c, s11.f39945c);
        }
        return false;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f39944b, Boolean.hashCode(this.f39943a) * 31, 961);
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f39945c) + a11;
    }
}
