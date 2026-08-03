package androidx.compose.material.internal;

/* compiled from: ExposedDropdownMenuPopup.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1 INSTANCE = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size == 0) {
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(Layout, 0, 0, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }, 4, null);
        }
        int i3 = 0;
        if (size == 1) {
            final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurables.get(0).mo3402measureBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(Layout, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size2 = measurables.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(measurables.get(i4).mo3402measureBRTryo0(j));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
        if (lastIndex >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i3);
                i5 = java.lang.Math.max(i5, placeable.getWidth());
                i6 = java.lang.Math.max(i6, placeable.getHeight());
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
            i = i5;
            i2 = i6;
        } else {
            i = 0;
            i2 = 0;
        }
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(Layout, i, i2, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                if (lastIndex2 < 0) {
                    return;
                }
                int i7 = 0;
                while (true) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, arrayList2.get(i7), 0, 0, 0.0f, 4, null);
                    if (i7 == lastIndex2) {
                        return;
                    } else {
                        i7++;
                    }
                }
            }
        }, 4, null);
    }
}
