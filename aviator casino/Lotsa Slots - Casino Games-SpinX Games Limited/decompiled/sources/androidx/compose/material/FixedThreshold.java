package androidx.compose.material;

/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u0003HÂ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "offset", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "component1", "component1-D9Ej5fM", "()F", "copy", "copy-0680j_4", "(F)Landroidx/compose/material/FixedThreshold;", "equals", "", "other", "", "hashCode", "", "toString", "", "computeThreshold", "", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public final /* data */ class FixedThreshold implements androidx.compose.material.ThresholdConfig {
    private final float offset;

    public /* synthetic */ FixedThreshold(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    private final float getOffset() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.FixedThreshold m1405copy0680j_4$default(androidx.compose.material.FixedThreshold fixedThreshold, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fixedThreshold.offset;
        }
        return fixedThreshold.m1406copy0680j_4(f);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final androidx.compose.material.FixedThreshold m1406copy0680j_4(float offset) {
        return new androidx.compose.material.FixedThreshold(offset, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.material.FixedThreshold) && androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.offset, ((androidx.compose.material.FixedThreshold) other).offset);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.Dp.m4484hashCodeimpl(this.offset);
    }

    public java.lang.String toString() {
        return "FixedThreshold(offset=" + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(this.offset)) + ')';
    }

    private FixedThreshold(float f) {
        this.offset = f;
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(androidx.compose.ui.unit.Density density, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "<this>");
        return f + (density.mo315toPx0680j_4(this.offset) * java.lang.Math.signum(f2 - f));
    }
}
