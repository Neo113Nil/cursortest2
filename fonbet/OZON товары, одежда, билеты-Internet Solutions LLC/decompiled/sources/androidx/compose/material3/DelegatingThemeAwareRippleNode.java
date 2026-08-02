package androidx.compose.material3;

import D1.AbstractC2813m;
import D1.InterfaceC2803h;
import D1.r0;
import D1.s0;
import O0.s;
import O0.v;
import androidx.compose.material.ripple.RippleNode;
import kotlin.Metadata;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import t0.o;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "LD1/m;", "LD1/h;", "LD1/r0;", "Ll1/c0;", "color", "Ll1/c0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DelegatingThemeAwareRippleNode extends AbstractC2813m implements InterfaceC2803h, r0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f40158c;

    @NotNull
    private final InterfaceC7813c0 color;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40159d;

    /* renamed from: e, reason: collision with root package name */
    private final float f40160e;

    /* renamed from: f, reason: collision with root package name */
    private RippleNode f40161f;

    public DelegatingThemeAwareRippleNode(o oVar, boolean z11, float f7, InterfaceC7813c0 interfaceC7813c0) {
        this.f40158c = oVar;
        this.f40159d = z11;
        this.f40160e = f7;
        this.color = interfaceC7813c0;
    }

    public static final void N1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        delegatingThemeAwareRippleNode.getClass();
        a aVar = new a(delegatingThemeAwareRippleNode);
        b bVar = new b(delegatingThemeAwareRippleNode);
        int i11 = s.f19807b;
        RippleNode c11 = v.c(delegatingThemeAwareRippleNode.f40158c, delegatingThemeAwareRippleNode.f40159d, delegatingThemeAwareRippleNode.f40160e, aVar, bVar);
        delegatingThemeAwareRippleNode.I1(c11);
        delegatingThemeAwareRippleNode.f40161f = c11;
    }

    public static final void Q1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        RippleNode rippleNode = delegatingThemeAwareRippleNode.f40161f;
        if (rippleNode != null) {
            delegatingThemeAwareRippleNode.L1(rippleNode);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        s0.a(this, new c(this));
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        s0.a(this, new c(this));
    }
}
