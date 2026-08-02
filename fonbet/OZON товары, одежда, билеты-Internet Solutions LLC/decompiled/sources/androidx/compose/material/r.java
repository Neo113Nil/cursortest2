package androidx.compose.material;

import D1.C2805i;
import J0.O1;
import androidx.compose.material.ripple.RippleNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DelegatingThemeAwareRippleNode f40092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f40092b = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RippleNode rippleNode;
        S0.O d11 = Q.d();
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f40092b;
        if (((O1) C2805i.a(delegatingThemeAwareRippleNode, d11)) == null) {
            DelegatingThemeAwareRippleNode.Q1(delegatingThemeAwareRippleNode);
        } else {
            rippleNode = delegatingThemeAwareRippleNode.f39885f;
            if (rippleNode == null) {
                DelegatingThemeAwareRippleNode.N1(delegatingThemeAwareRippleNode);
            }
        }
        return Unit.f71690a;
    }
}
