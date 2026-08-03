package androidx.compose.foundation.shape;

/* compiled from: CornerSize.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u0004HÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/shape/DpCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "size", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "valueOverride", "getValueOverride-D9Ej5fM", "()F", "component1", "component1-D9Ej5fM", "copy", "copy-0680j_4", "(F)Landroidx/compose/foundation/shape/DpCornerSize;", "equals", "", "other", "", "hashCode", "", "toPx", "", "shapeSize", "Landroidx/compose/ui/geometry/Size;", "density", "Landroidx/compose/ui/unit/Density;", "toPx-TmRCtEA", "(JLandroidx/compose/ui/unit/Density;)F", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DpCornerSize implements androidx.compose.foundation.shape.CornerSize, androidx.compose.ui.platform.InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    private final float getSize() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.shape.DpCornerSize m843copy0680j_4$default(androidx.compose.foundation.shape.DpCornerSize dpCornerSize, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = dpCornerSize.size;
        }
        return dpCornerSize.m844copy0680j_4(f);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final androidx.compose.foundation.shape.DpCornerSize m844copy0680j_4(float size) {
        return new androidx.compose.foundation.shape.DpCornerSize(size, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.shape.DpCornerSize) && androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.size, ((androidx.compose.foundation.shape.DpCornerSize) other).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ kotlin.sequences.Sequence getInspectableElements() {
        return androidx.compose.ui.platform.InspectableValue.CC.$default$getInspectableElements(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ java.lang.String getNameFallback() {
        return androidx.compose.ui.platform.InspectableValue.CC.$default$getNameFallback(this);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.Dp.m4484hashCodeimpl(this.size);
    }

    private DpCornerSize(float f) {
        this.size = f;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ java.lang.Object getValueOverride() {
        return androidx.compose.ui.unit.Dp.m4476boximpl(m845getValueOverrideD9Ej5fM());
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo837toPxTmRCtEA(long shapeSize, androidx.compose.ui.unit.Density density) {
        return density.mo315toPx0680j_4(this.size);
    }

    public java.lang.String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m845getValueOverrideD9Ej5fM() {
        return this.size;
    }
}
