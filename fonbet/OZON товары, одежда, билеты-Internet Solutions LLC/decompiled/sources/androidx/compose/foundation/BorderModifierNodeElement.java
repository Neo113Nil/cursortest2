package androidx.compose.foundation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.J0;
import n0.C8390k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LD1/c0;", "Ln0/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends AbstractC2794c0<C8390k> {

    /* renamed from: a, reason: collision with root package name */
    private final float f38847a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7799Q f38848b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J0 f38849c;

    public BorderModifierNodeElement(float f7, AbstractC7799Q abstractC7799Q, J0 j02) {
        this.f38847a = f7;
        this.f38848b = abstractC7799Q;
        this.f38849c = j02;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C8390k getF41119a() {
        return new C8390k(this.f38847a, this.f38848b, this.f38849c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Z1.h.b(this.f38847a, borderModifierNodeElement.f38847a) && Intrinsics.d(this.f38848b, borderModifierNodeElement.f38848b) && Intrinsics.d(this.f38849c, borderModifierNodeElement.f38849c);
    }

    public final int hashCode() {
        return this.f38849c.hashCode() + ((this.f38848b.hashCode() + (Float.hashCode(this.f38847a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Z1.h.c(this.f38847a)) + ", brush=" + this.f38848b + ", shape=" + this.f38849c + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C8390k c8390k) {
        C8390k c8390k2 = c8390k;
        c8390k2.S1(this.f38847a);
        c8390k2.R1(this.f38848b);
        c8390k2.setShape(this.f38849c);
    }
}
