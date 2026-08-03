package androidx.compose.foundation.layout;

/* compiled from: FlowLayout.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0016\u0010\"\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\u000bHÂ\u0003J\t\u0010&\u001a\u00020\rHÂ\u0003J\u0016\u0010'\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\t\u0010)\u001a\u00020\u0010HÂ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J,\u00102\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010J$\u00108\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010J,\u0010;\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010<\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010J\t\u0010=\u001a\u00020>HÖ\u0001J\"\u0010?\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010A\u001a\u00020\u0010H\u0016J\"\u0010B\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u0010H\u0016J,\u0010C\u001a\u00020D*\u00020E2\f\u00103\u001a\b\u0012\u0004\u0012\u00020F042\u0006\u0010G\u001a\u00020HH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\"\u0010K\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010A\u001a\u00020\u0010H\u0016J\"\u0010L\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u0010H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012R.\u0010\u0013\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0019\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R.\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R.\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisArrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "maxCrossAxisIntrinsicItemSize", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Lkotlin/ExtensionFunctionType;", "getMaxCrossAxisIntrinsicItemSize", "()Lkotlin/jvm/functions/Function3;", "maxMainAxisIntrinsicItemSize", "getMaxMainAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "getMinMainAxisIntrinsicItemSize", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component7", "component7-D9Ej5fM", "component8", "copy", "copy-cBR-a5Y", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FI)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "equals", "", "other", "", "hashCode", "intrinsicCrossAxisSize", "measurables", "", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "maxIntrinsicMainAxisSize", "height", "arrangementSpacing", "minIntrinsicMainAxisSize", "crossAxisAvailable", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final androidx.compose.foundation.layout.SizeMode crossAxisSize;
    private final androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement;
    private final float mainAxisArrangementSpacing;
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> maxCrossAxisIntrinsicItemSize;
    private final int maxItemsInMainAxis;
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> maxMainAxisIntrinsicItemSize;
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> minCrossAxisIntrinsicItemSize;
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> minMainAxisIntrinsicItemSize;
    private final androidx.compose.foundation.layout.LayoutOrientation orientation;
    private final androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.SizeMode sizeMode, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, f2, i);
    }

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.foundation.layout.LayoutOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.foundation.layout.Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.foundation.layout.Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    private final float getMainAxisArrangementSpacing() {
        return this.mainAxisArrangementSpacing;
    }

    /* renamed from: component5, reason: from getter */
    private final androidx.compose.foundation.layout.SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: component6, reason: from getter */
    private final androidx.compose.foundation.layout.CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    private final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-cBR-a5Y, reason: not valid java name */
    public final androidx.compose.foundation.layout.FlowMeasurePolicy m517copycBRa5Y(androidx.compose.foundation.layout.LayoutOrientation orientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement, androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement, float mainAxisArrangementSpacing, androidx.compose.foundation.layout.SizeMode crossAxisSize, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis) {
        return new androidx.compose.foundation.layout.FlowMeasurePolicy(orientation, horizontalArrangement, verticalArrangement, mainAxisArrangementSpacing, crossAxisSize, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.FlowMeasurePolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = (androidx.compose.foundation.layout.FlowMeasurePolicy) other;
        return this.orientation == flowMeasurePolicy.orientation && kotlin.jvm.internal.Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && kotlin.jvm.internal.Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.mainAxisArrangementSpacing, flowMeasurePolicy.mainAxisArrangementSpacing) && this.crossAxisSize == flowMeasurePolicy.crossAxisSize && kotlin.jvm.internal.Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis;
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = (hashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((((((hashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + androidx.compose.ui.unit.Dp.m4484hashCodeimpl(this.mainAxisArrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m4484hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + this.maxItemsInMainAxis;
    }

    public java.lang.String toString() {
        return "FlowMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisArrangementSpacing=" + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(this.mainAxisArrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ')';
    }

    private FlowMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.SizeMode sizeMode, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisArrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        this.maxMainAxisIntrinsicItemSize = layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        } : new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        };
        this.maxCrossAxisIntrinsicItemSize = layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        } : new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        };
        this.minCrossAxisIntrinsicItemSize = layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
            }
        } : new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
            }
        };
        this.minMainAxisIntrinsicItemSize = layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
            }
        } : new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
            }
        };
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int mainAxisTotalSize;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }, 4, null);
        }
        final androidx.compose.foundation.layout.RowColumnMeasurementHelper rowColumnMeasurementHelper = new androidx.compose.foundation.layout.RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.mainAxisArrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new androidx.compose.ui.layout.Placeable[list.size()], null);
        final androidx.compose.foundation.layout.FlowResult m512breakDownItemsw1Onq5I = androidx.compose.foundation.layout.FlowLayoutKt.m512breakDownItemsw1Onq5I(measureScope, rowColumnMeasurementHelper, this.orientation, androidx.compose.foundation.layout.OrientationIndependentConstraints.m537constructorimpl(j, this.orientation), this.maxItemsInMainAxis);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.layout.RowColumnMeasureHelperResult> items = m512breakDownItemsw1Onq5I.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = items.getContent()[i].getCrossAxisSize();
        }
        final int[] iArr2 = new int[size];
        int crossAxisTotalSize = m512breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing) * (items.getSize() - 1));
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new java.lang.IllegalArgumentException("null verticalArrangement".toString());
            }
            vertical.arrange(measureScope, crossAxisTotalSize, iArr, iArr2);
        } else {
            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new java.lang.IllegalArgumentException("null horizontalArrangement".toString());
            }
            horizontal.arrange(measureScope, crossAxisTotalSize, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            crossAxisTotalSize = m512breakDownItemsw1Onq5I.getMainAxisTotalSize();
            mainAxisTotalSize = crossAxisTotalSize;
        } else {
            mainAxisTotalSize = m512breakDownItemsw1Onq5I.getMainAxisTotalSize();
        }
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, crossAxisTotalSize), androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, mainAxisTotalSize), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.layout.RowColumnMeasureHelperResult> items2 = androidx.compose.foundation.layout.FlowResult.this.getItems();
                androidx.compose.foundation.layout.RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                int[] iArr3 = iArr2;
                androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                int size2 = items2.getSize();
                if (size2 > 0) {
                    androidx.compose.foundation.layout.RowColumnMeasureHelperResult[] content = items2.getContent();
                    int i2 = 0;
                    do {
                        rowColumnMeasurementHelper2.placeHelper(placementScope, content[i2], iArr3[i2], measureScope2.getLayoutDirection());
                        i2++;
                    } while (i2 < size2);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo309roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo309roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        int minIntrinsicMainAxisSize;
        minIntrinsicMainAxisSize = androidx.compose.foundation.layout.FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
        return minIntrinsicMainAxisSize;
    }

    public final int maxIntrinsicMainAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
        int maxIntrinsicMainAxisSize;
        maxIntrinsicMainAxisSize = androidx.compose.foundation.layout.FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.maxItemsInMainAxis);
        return maxIntrinsicMainAxisSize;
    }

    public final int intrinsicCrossAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        int intrinsicCrossAxisSize;
        intrinsicCrossAxisSize = androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize((java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>) measurables, (kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer>) this.minMainAxisIntrinsicItemSize, (kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer>) this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
        return intrinsicCrossAxisSize;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }
}
