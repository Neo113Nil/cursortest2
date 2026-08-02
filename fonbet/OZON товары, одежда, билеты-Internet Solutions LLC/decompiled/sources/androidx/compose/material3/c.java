package androidx.compose.material3;

import D1.C2805i;
import P0.C3722b1;
import S0.O;
import androidx.compose.material.ripple.RippleNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DelegatingThemeAwareRippleNode f40167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f40167b = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RippleNode rippleNode;
        O a11 = d.a();
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f40167b;
        if (((C3722b1) C2805i.a(delegatingThemeAwareRippleNode, a11)) == null) {
            DelegatingThemeAwareRippleNode.Q1(delegatingThemeAwareRippleNode);
        } else {
            rippleNode = delegatingThemeAwareRippleNode.f40161f;
            if (rippleNode == null) {
                DelegatingThemeAwareRippleNode.N1(delegatingThemeAwareRippleNode);
            }
        }
        return Unit.f71690a;
    }
}
