package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$FullScreenSearchBarLayout$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material3.SearchBarState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.internal.MutableWindowInsets getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, final long j) {
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        final float access$transform = androidx.compose.material3.SearchBarKt.access$transform(this.getHighResolutionOutputSizeshNQ4ISI.getValue());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(this.Camera2StreamConfigurationMap).getWidth());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarKt.getSearchBarMinWidth());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(this.Camera2StreamConfigurationMap).getHeight());
        java.lang.Integer num = valueOf2.intValue() != 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarDefaults.INSTANCE.m3660getInputFieldHeightD9Ej5fM());
        final int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) * 0.9f), intValue);
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) * 0.9f), intValue2);
        int lerp = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), coerceAtLeast, access$transform);
        int lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), coerceAtLeast2, access$transform);
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, androidx.compose.ui.util.MathHelpersKt.lerp(intValue, lerp, this.Camera2StreamConfigurationMap.getProgress()));
        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, androidx.compose.ui.util.MathHelpersKt.lerp(intValue2, lerp2, this.Camera2StreamConfigurationMap.getProgress()));
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list2;
        int size = list3.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.layout.Measurable measurable = list2.get(i);
            int i2 = size;
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "Surface")) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(m8571constrainWidthK40F9xA, m8570constrainHeightK40F9xA));
                int size2 = list3.size();
                int i3 = 0;
                while (i3 < size2) {
                    androidx.compose.ui.layout.Measurable measurable2 = list2.get(i3);
                    int i4 = size2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(m8571constrainWidthK40F9xA, intValue2));
                        final int top = this.getHighSpeedVideoFpsRangesFor.getTop(measureScope2) + measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarKt.getSearchBarVerticalPadding());
                        int i5 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.material3.SearchBarKt.getSearchBarVerticalPadding());
                        final int lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0, top, java.lang.Math.min(this.Camera2StreamConfigurationMap.getProgress(), 1.0f - access$transform));
                        final int lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0, i5, this.Camera2StreamConfigurationMap.getProgress());
                        int height = mo7353measureBRTryo02.getHeight() + lerp3 + lerp4;
                        int size3 = list3.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            androidx.compose.ui.layout.Measurable measurable3 = list2.get(i6);
                            int i7 = size3;
                            final int i8 = coerceAtLeast2;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), "Content")) {
                                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(m8571constrainWidthK40F9xA, m8571constrainWidthK40F9xA, 0, kotlin.ranges.RangesKt.coerceAtLeast(m8570constrainHeightK40F9xA - height, 0)));
                                int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                                int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                                final androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
                                final androidx.compose.material3.SearchBarState searchBarState = this.Camera2StreamConfigurationMap;
                                final androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> mutableState2 = this.getHighSpeedVideoFpsRanges;
                                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, access$transform, searchBarState, mo7353measureBRTryo0, mo7353measureBRTryo02, lerp3, mo7353measureBRTryo03, lerp4, j, measureScope, coerceAtLeast, mutableState2, i8, top, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                            i6++;
                            list2 = list;
                            size3 = i7;
                            coerceAtLeast2 = i8;
                        }
                        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i3++;
                    measureScope2 = measureScope;
                    list2 = list;
                    size2 = i4;
                    coerceAtLeast2 = coerceAtLeast2;
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
            list2 = list;
            size = i2;
            coerceAtLeast2 = coerceAtLeast2;
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, float f, final androidx.compose.material3.SearchBarState searchBarState, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, int i, androidx.compose.ui.layout.Placeable placeable3, int i2, long j, androidx.compose.ui.layout.MeasureScope measureScope, int i3, androidx.compose.runtime.MutableState mutableState2, int i4, int i5, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        int i8;
        float f5;
        androidx.compose.material3.internal.BackEventProgress.InProgress inProgress = (androidx.compose.material3.internal.BackEventProgress.InProgress) mutableState.getValue();
        if (inProgress != null) {
            if (inProgress.getSwipeEdge() != androidx.compose.material3.internal.SwipeEdge.Left) {
                f4 = androidx.compose.material3.SearchBarKt.getValidOutputFormatsForInputhNQ4ISI;
                i8 = measureScope.mo1412roundToPx0680j_4(f4);
            } else {
                int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                f5 = androidx.compose.material3.SearchBarKt.getValidOutputFormatsForInputhNQ4ISI;
                i8 = (m8554getMaxWidthimpl - measureScope.mo1412roundToPx0680j_4(f5)) - i3;
            }
            i6 = kotlin.ranges.RangesKt.coerceAtMost(kotlin.ranges.RangesKt.coerceAtLeast(i8, androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getRight() - i3), androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getLeft());
        } else {
            i6 = 0;
        }
        int lerp = androidx.compose.ui.util.MathHelpersKt.lerp(0, i6, f);
        androidx.compose.material3.internal.BackEventProgress.InProgress inProgress2 = (androidx.compose.material3.internal.BackEventProgress.InProgress) mutableState.getValue();
        if (inProgress2 != null) {
            float touchY = inProgress2.getTouchY();
            androidx.compose.material3.internal.BackEventProgress.InProgress inProgress3 = (androidx.compose.material3.internal.BackEventProgress.InProgress) mutableState2.getValue();
            if (inProgress3 != null) {
                float touchY2 = touchY - inProgress3.getTouchY();
                float abs = java.lang.Math.abs(touchY2) / androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                int m8553getMaxHeightimpl = (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - i4) / 2;
                f2 = androidx.compose.material3.SearchBarKt.getValidOutputFormatsForInputhNQ4ISI;
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(m8553getMaxHeightimpl - measureScope.mo1412roundToPx0680j_4(f2), 0);
                f3 = androidx.compose.material3.SearchBarKt.unwrapAs;
                i7 = kotlin.ranges.RangesKt.coerceAtMost((androidx.compose.ui.util.MathHelpersKt.lerp(0, java.lang.Math.min(coerceAtLeast, measureScope.mo1412roundToPx0680j_4(f3)), abs) * ((int) java.lang.Math.signum(touchY2))) + i5, androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getTop());
                int lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0, i7, f);
                int lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getLeft(), lerp, searchBarState.getProgress());
                int lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getTop(), lerp2, searchBarState.getProgress());
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, lerp3, lerp4, 0.0f, 4, null);
                int i9 = lerp4 + i;
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, lerp3, i9, 0.0f, 4, null);
                androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable3, lerp3, i9 + placeable2.getHeight() + i2, 0.0f, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SearchBarState.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                    }
                }, 4, (java.lang.Object) null);
                return kotlin.Unit.INSTANCE;
            }
        }
        i7 = 0;
        int lerp22 = androidx.compose.ui.util.MathHelpersKt.lerp(0, i7, f);
        int lerp32 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getLeft(), lerp, searchBarState.getProgress());
        int lerp42 = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(searchBarState).getTop(), lerp22, searchBarState.getProgress());
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, lerp32, lerp42, 0.0f, 4, null);
        int i92 = lerp42 + i;
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, lerp32, i92, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable3, lerp32, i92 + placeable2.getHeight() + i2, 0.0f, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SearchBarState.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        }, 4, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.SearchBarState searchBarState, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(searchBarState.getProgress());
        return kotlin.Unit.INSTANCE;
    }

    SearchBarKt$FullScreenSearchBarLayout$2$1(androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> mutableState, androidx.compose.material3.SearchBarState searchBarState, androidx.compose.material3.internal.MutableWindowInsets mutableWindowInsets, androidx.compose.runtime.MutableState<androidx.compose.material3.internal.BackEventProgress.InProgress> mutableState2) {
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = searchBarState;
        this.getHighSpeedVideoFpsRangesFor = mutableWindowInsets;
        this.getHighSpeedVideoFpsRanges = mutableState2;
    }
}
