package androidx.compose.foundation.layout;

/* compiled from: RowColumnImpl.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0016\u0010\u0013\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u000bHÂ\u0003J\t\u0010\u0017\u001a\u00020\rHÂ\u0003JS\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\"\u0010#\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020 H\u0016J\"\u0010)\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010*\u001a\u00020 H\u0016J,\u0010+\u001a\u00020,*\u00020-2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020.0&2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\"\u00103\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020 H\u0016J\"\u00104\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010*\u001a\u00020 H\u0016R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "copy", "copy-gwO9Abs", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "equals", "", "other", "", "hashCode", "", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RowColumnMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    public static final int $stable = 0;
    private final float arrangementSpacing;
    private final androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment;
    private final androidx.compose.foundation.layout.SizeMode crossAxisSize;
    private final androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement;
    private final androidx.compose.foundation.layout.LayoutOrientation orientation;
    private final androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.SizeMode sizeMode, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment);
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
    private final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    /* renamed from: component5, reason: from getter */
    private final androidx.compose.foundation.layout.SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: component6, reason: from getter */
    private final androidx.compose.foundation.layout.CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-gwO9Abs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.layout.RowColumnMeasurePolicy m594copygwO9Abs$default(androidx.compose.foundation.layout.RowColumnMeasurePolicy rowColumnMeasurePolicy, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.SizeMode sizeMode, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            layoutOrientation = rowColumnMeasurePolicy.orientation;
        }
        if ((i & 2) != 0) {
            horizontal = rowColumnMeasurePolicy.horizontalArrangement;
        }
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
        if ((i & 4) != 0) {
            vertical = rowColumnMeasurePolicy.verticalArrangement;
        }
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
        if ((i & 8) != 0) {
            f = rowColumnMeasurePolicy.arrangementSpacing;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            sizeMode = rowColumnMeasurePolicy.crossAxisSize;
        }
        androidx.compose.foundation.layout.SizeMode sizeMode2 = sizeMode;
        if ((i & 32) != 0) {
            crossAxisAlignment = rowColumnMeasurePolicy.crossAxisAlignment;
        }
        return rowColumnMeasurePolicy.m595copygwO9Abs(layoutOrientation, horizontal2, vertical2, f2, sizeMode2, crossAxisAlignment);
    }

    /* renamed from: copy-gwO9Abs, reason: not valid java name */
    public final androidx.compose.foundation.layout.RowColumnMeasurePolicy m595copygwO9Abs(androidx.compose.foundation.layout.LayoutOrientation orientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement, androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement, float arrangementSpacing, androidx.compose.foundation.layout.SizeMode crossAxisSize, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment) {
        return new androidx.compose.foundation.layout.RowColumnMeasurePolicy(orientation, horizontalArrangement, verticalArrangement, arrangementSpacing, crossAxisSize, crossAxisAlignment, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.RowColumnMeasurePolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.RowColumnMeasurePolicy rowColumnMeasurePolicy = (androidx.compose.foundation.layout.RowColumnMeasurePolicy) other;
        return this.orientation == rowColumnMeasurePolicy.orientation && kotlin.jvm.internal.Intrinsics.areEqual(this.horizontalArrangement, rowColumnMeasurePolicy.horizontalArrangement) && kotlin.jvm.internal.Intrinsics.areEqual(this.verticalArrangement, rowColumnMeasurePolicy.verticalArrangement) && androidx.compose.ui.unit.Dp.m4483equalsimpl0(this.arrangementSpacing, rowColumnMeasurePolicy.arrangementSpacing) && this.crossAxisSize == rowColumnMeasurePolicy.crossAxisSize && kotlin.jvm.internal.Intrinsics.areEqual(this.crossAxisAlignment, rowColumnMeasurePolicy.crossAxisAlignment);
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = (hashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((hashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + androidx.compose.ui.unit.Dp.m4484hashCodeimpl(this.arrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode();
    }

    public java.lang.String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", arrangementSpacing=" + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(this.arrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    private RowColumnMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.SizeMode sizeMode, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int crossAxisSize;
        int mainAxisSize;
        final androidx.compose.foundation.layout.RowColumnMeasurementHelper rowColumnMeasurementHelper = new androidx.compose.foundation.layout.RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.arrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new androidx.compose.ui.layout.Placeable[list.size()], null);
        final androidx.compose.foundation.layout.RowColumnMeasureHelperResult m597measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m597measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
        if (this.orientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            crossAxisSize = m597measureWithoutPlacing_EkL_Y.getMainAxisSize();
            mainAxisSize = m597measureWithoutPlacing_EkL_Y.getCrossAxisSize();
        } else {
            crossAxisSize = m597measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            mainAxisSize = m597measureWithoutPlacing_EkL_Y.getMainAxisSize();
        }
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, crossAxisSize, mainAxisSize, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.RowColumnMeasurePolicy$measure$1
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
                androidx.compose.foundation.layout.RowColumnMeasurementHelper.this.placeHelper(placementScope, m597measureWithoutPlacing_EkL_Y, 0, measureScope.getLayoutDirection());
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        kotlin.jvm.functions.Function3 MinIntrinsicWidthMeasureBlock;
        MinIntrinsicWidthMeasureBlock = androidx.compose.foundation.layout.RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.orientation);
        return ((java.lang.Number) MinIntrinsicWidthMeasureBlock.invoke(list, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        kotlin.jvm.functions.Function3 MinIntrinsicHeightMeasureBlock;
        MinIntrinsicHeightMeasureBlock = androidx.compose.foundation.layout.RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.orientation);
        return ((java.lang.Number) MinIntrinsicHeightMeasureBlock.invoke(list, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        kotlin.jvm.functions.Function3 MaxIntrinsicWidthMeasureBlock;
        MaxIntrinsicWidthMeasureBlock = androidx.compose.foundation.layout.RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.orientation);
        return ((java.lang.Number) MaxIntrinsicWidthMeasureBlock.invoke(list, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        kotlin.jvm.functions.Function3 MaxIntrinsicHeightMeasureBlock;
        MaxIntrinsicHeightMeasureBlock = androidx.compose.foundation.layout.RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.orientation);
        return ((java.lang.Number) MaxIntrinsicHeightMeasureBlock.invoke(list, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }
}
