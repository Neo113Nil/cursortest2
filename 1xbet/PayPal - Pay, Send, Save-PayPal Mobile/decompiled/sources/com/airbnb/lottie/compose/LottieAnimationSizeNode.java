package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", com.visa.cbp.getEncExpo.warmup, "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieAnimationSizeNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;
    private int height;
    private int width;

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public LottieAnimationSizeNode(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        long Constraints;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurable, "");
        long m8568constrain4WqzIAM = androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(j, androidx.compose.ui.unit.IntSizeKt.IntSize(this.width, this.height));
        if (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) == Integer.MAX_VALUE && androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM), (androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM) * this.height) / this.width, (androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM) * this.height) / this.width);
        } else if (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) == Integer.MAX_VALUE && androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) != Integer.MAX_VALUE) {
            Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints((androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM) * this.width) / this.height, (androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM) * this.width) / this.height, androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM));
        } else {
            Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8568constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8568constrain4WqzIAM));
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(Constraints);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoSizes(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }

            {
                super(1);
            }
        }, 4, null);
    }
}
