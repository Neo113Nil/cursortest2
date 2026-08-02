package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final androidx.compose.ui.layout.RootMeasurePolicy INSTANCE = new androidx.compose.ui.layout.RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int size = list.size();
        if (size == 0) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    getHighResolutionOutputSizeshNQ4ISI(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }, 4, null);
        }
        if (size == 1) {
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(0).mo7353measureBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, mo7353measureBRTryo0.getWidth()), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, mo7353measureBRTryo0.getHeight()), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    getHighSpeedVideoFpsRangesFor(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
                }

                {
                    super(1);
                }
            }, 4, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = list.get(i3).mo7353measureBRTryo0(j);
            i = java.lang.Math.max(mo7353measureBRTryo02.getWidth(), i);
            i2 = java.lang.Math.max(mo7353measureBRTryo02.getHeight(), i2);
            arrayList.add(mo7353measureBRTryo02);
        }
        final java.util.ArrayList arrayList2 = arrayList;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i2), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighResolutionOutputSizeshNQ4ISI(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                java.util.List<androidx.compose.ui.layout.Placeable> list2 = arrayList2;
                int size3 = list2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i4), 0, 0, 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 4, null);
    }
}
