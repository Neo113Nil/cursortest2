package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/c0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends AbstractC2794c0<c0> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39414a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39415b;

    public UnspecifiedConstraintsElement(float f7, float f11) {
        this.f39414a = f7;
        this.f39415b = f11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final c0 getF41119a() {
        return new c0(this.f39414a, this.f39415b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Z1.h.b(this.f39414a, unspecifiedConstraintsElement.f39414a) && Z1.h.b(this.f39415b, unspecifiedConstraintsElement.f39415b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f39415b) + (Float.hashCode(this.f39414a) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(c0 c0Var) {
        c0 c0Var2 = c0Var;
        c0Var2.J1(this.f39414a);
        c0Var2.I1(this.f39415b);
    }
}
