package androidx.compose.material;

import D1.C2805i;
import J0.C3339s;
import J0.C3343t;
import J0.C3363y;
import J0.O1;
import l1.C7807Z;
import l1.C7811b0;
import l1.InterfaceC7813c0;

/* renamed from: androidx.compose.material.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5218p implements InterfaceC7813c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DelegatingThemeAwareRippleNode f40090a;

    C5218p(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f40090a = delegatingThemeAwareRippleNode;
    }

    @Override // l1.InterfaceC7813c0
    /* renamed from: invoke-0d7_KjU */
    public final long mo7invoke0d7_KjU() {
        InterfaceC7813c0 interfaceC7813c0;
        long j11;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f40090a;
        interfaceC7813c0 = delegatingThemeAwareRippleNode.color;
        long mo7invoke0d7_KjU = interfaceC7813c0.mo7invoke0d7_KjU();
        if (mo7invoke0d7_KjU != 16) {
            return mo7invoke0d7_KjU;
        }
        O1 o12 = (O1) C2805i.a(delegatingThemeAwareRippleNode, Q.d());
        if (o12 != null && o12.a() != 16) {
            return o12.a();
        }
        long w11 = ((C7807Z) C2805i.a(delegatingThemeAwareRippleNode, C3363y.a())).w();
        boolean m11 = ((C3339s) C2805i.a(delegatingThemeAwareRippleNode, C3343t.d())).m();
        float h11 = C7811b0.h(w11);
        if (m11 || h11 >= 0.5d) {
            return w11;
        }
        j11 = C7807Z.f72251e;
        return j11;
    }
}
