package androidx.compose.material3;

import D1.C2805i;
import P0.C3722b1;
import P0.C3776u;
import l1.C7807Z;
import l1.InterfaceC7813c0;

/* loaded from: classes8.dex */
final class a implements InterfaceC7813c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DelegatingThemeAwareRippleNode f40165a;

    a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f40165a = delegatingThemeAwareRippleNode;
    }

    @Override // l1.InterfaceC7813c0
    /* renamed from: invoke-0d7_KjU */
    public final long mo7invoke0d7_KjU() {
        InterfaceC7813c0 interfaceC7813c0;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f40165a;
        interfaceC7813c0 = delegatingThemeAwareRippleNode.color;
        long mo7invoke0d7_KjU = interfaceC7813c0.mo7invoke0d7_KjU();
        if (mo7invoke0d7_KjU != 16) {
            return mo7invoke0d7_KjU;
        }
        C3722b1 c3722b1 = (C3722b1) C2805i.a(delegatingThemeAwareRippleNode, d.a());
        return (c3722b1 == null || c3722b1.a() == 16) ? ((C7807Z) C2805i.a(delegatingThemeAwareRippleNode, C3776u.a())).w() : c3722b1.a();
    }
}
