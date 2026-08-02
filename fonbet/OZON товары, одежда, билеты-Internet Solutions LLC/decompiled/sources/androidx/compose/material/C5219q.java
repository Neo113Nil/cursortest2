package androidx.compose.material;

import D1.C2805i;
import J0.C3339s;
import J0.C3343t;
import J0.C3363y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;

/* renamed from: androidx.compose.material.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5219q extends AbstractC7737t implements Function0<O0.i> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DelegatingThemeAwareRippleNode f40091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5219q(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f40091b = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final O0.i invoke() {
        O0.i iVar;
        O0.i iVar2;
        O0.i iVar3;
        S0.O d11 = Q.d();
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f40091b;
        long w11 = ((C7807Z) C2805i.a(delegatingThemeAwareRippleNode, C3363y.a())).w();
        if (!((C3339s) C2805i.a(delegatingThemeAwareRippleNode, C3343t.d())).m()) {
            iVar = Q.f39940g;
            return iVar;
        }
        if (C7811b0.h(w11) > 0.5d) {
            iVar3 = Q.f39938e;
            return iVar3;
        }
        iVar2 = Q.f39939f;
        return iVar2;
    }
}
