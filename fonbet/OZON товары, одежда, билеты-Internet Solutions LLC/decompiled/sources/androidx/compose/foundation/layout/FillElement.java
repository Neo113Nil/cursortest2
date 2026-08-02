package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9900i;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/s;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FillElement extends AbstractC2794c0<C5195s> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC9900i f39331a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39332b;

    public FillElement(@NotNull EnumC9900i enumC9900i, float f7) {
        this.f39331a = enumC9900i;
        this.f39332b = f7;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C5195s getF41119a() {
        return new C5195s(this.f39331a, this.f39332b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f39331a == fillElement.f39331a && this.f39332b == fillElement.f39332b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39332b) + (this.f39331a.hashCode() * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(C5195s c5195s) {
        C5195s c5195s2 = c5195s;
        c5195s2.I1(this.f39331a);
        c5195s2.J1(this.f39332b);
    }
}
