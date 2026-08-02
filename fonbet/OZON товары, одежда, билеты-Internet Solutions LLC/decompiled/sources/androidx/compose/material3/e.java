package androidx.compose.material3;

import D1.InterfaceC2807j;
import Sc.C;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import t0.o;

/* loaded from: classes8.dex */
final class e implements InterfaceC8369J {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40174a;

    /* renamed from: b, reason: collision with root package name */
    private final float f40175b;

    /* renamed from: c, reason: collision with root package name */
    private final long f40176c;

    static final class a implements InterfaceC7813c0 {
        a() {
        }

        @Override // l1.InterfaceC7813c0
        /* renamed from: invoke-0d7_KjU */
        public final long mo7invoke0d7_KjU() {
            return e.this.f40176c;
        }
    }

    public e(boolean z11, float f7, long j11) {
        this.f40174a = z11;
        this.f40175b = f7;
        this.f40176c = j11;
    }

    @Override // n0.InterfaceC8369J
    @NotNull
    public final InterfaceC2807j b(@NotNull o oVar) {
        a aVar = new a();
        return new DelegatingThemeAwareRippleNode(oVar, this.f40174a, this.f40175b, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f40174a == eVar.f40174a && Z1.h.b(this.f40175b, eVar.f40175b)) {
            return C7807Z.p(this.f40176c, eVar.f40176c);
        }
        return false;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f40175b, Boolean.hashCode(this.f40174a) * 31, 961);
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f40176c) + a11;
    }
}
