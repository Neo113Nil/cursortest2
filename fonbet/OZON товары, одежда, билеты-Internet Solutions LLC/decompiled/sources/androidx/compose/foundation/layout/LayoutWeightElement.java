package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import u0.C9911u;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "LD1/c0;", "Lu0/u;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC2794c0<C9911u> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39359a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39360b;

    public LayoutWeightElement(float f7, boolean z11) {
        this.f39359a = f7;
        this.f39360b = z11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C9911u getF41119a() {
        return new C9911u(this.f39359a, this.f39360b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f39359a == layoutWeightElement.f39359a && this.f39360b == layoutWeightElement.f39360b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39360b) + (Float.hashCode(this.f39359a) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(C9911u c9911u) {
        C9911u c9911u2 = c9911u;
        c9911u2.J1(this.f39359a);
        c9911u2.I1(this.f39360b);
    }
}
