package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material3.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2077251399, intValue, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:836)");
            }
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2);
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, composer2, 6);
            boolean changed = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
            boolean changed2 = composer2.changed(coroutineScope);
            androidx.compose.foundation.ScrollState scrollState = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.material3.ScrollableTabData(scrollState, coroutineScope, value);
                composer2.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.material3.ScrollableTabData scrollableTabData = (androidx.compose.material3.ScrollableTabData) rememberedValue2;
            androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), this.getHighSpeedVideoFpsRangesFor, false, null, false, 14, null)));
            boolean changed3 = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changed4 = composer2.changed(this.getInputFormats);
            boolean changed5 = composer2.changed(this.getHighSpeedVideoFpsRanges);
            boolean changed6 = composer2.changed(this.Camera2StreamConfigurationMap);
            boolean changedInstance = composer2.changedInstance(scrollableTabData);
            boolean changed7 = composer2.changed(this.getHighSpeedVideoSizes);
            final float f = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getInputFormats;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getHighSpeedVideoFpsRanges;
            final int i = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material3.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if ((changed3 | changed4 | changed5 | changed6 | changedInstance | changed7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.getHighSpeedVideoFpsRangesFor(f, function2, function22, scrollableTabData, i, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List list, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, kotlin.jvm.functions.Function2 function2, androidx.compose.material3.ScrollableTabData scrollableTabData, int i2, java.util.List list2, androidx.compose.ui.unit.Constraints constraints, int i3, int i4, final kotlin.jvm.functions.Function3 function3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i5 = i;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i6);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, 0, 0.0f, 4, null);
            arrayList.add(new androidx.compose.material3.TabPosition(subcomposeMeasureScope.mo1415toDpu2uoSUM(i5), subcomposeMeasureScope.mo1415toDpu2uoSUM(placeable.getWidth()), ((androidx.compose.ui.unit.Dp) list2.get(i6)).m8615unboximpl(), null));
            i5 += placeable.getWidth();
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.getHighSpeedVideoFpsRangesFor, function2);
        int size2 = subcompose.size();
        for (int i7 = 0; i7 < size2; i7++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = subcompose.get(i7).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), i3, i3, 0, 0, 8, null));
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, mo7353measureBRTryo0, 0, i4 - mo7353measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.getHighSpeedVideoSizes, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2125766411, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1$2$3
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer2 = composer;
                int intValue = num.intValue();
                if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2125766411, intValue, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:920)");
                    }
                    function3.invoke(arrayList, composer2, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
        }));
        int size3 = subcompose2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i8).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i3, i4)), 0, 0, 0.0f, 4, null);
        }
        scrollableTabData.Camera2StreamConfigurationMap(subcomposeMeasureScope, i, arrayList, i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRangesFor(float f, kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final androidx.compose.material3.ScrollableTabData scrollableTabData, final int i, final kotlin.jvm.functions.Function3 function3, final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, final androidx.compose.ui.unit.Constraints constraints) {
        int i2 = subcomposeMeasureScope.mo1412roundToPx0680j_4(androidx.compose.material3.TabRowDefaults.INSTANCE.m3877getScrollableTabRowMinTabWidthD9Ej5fM());
        final int i3 = subcomposeMeasureScope.mo1412roundToPx0680j_4(f);
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.Camera2StreamConfigurationMap, function2);
        int i4 = 0;
        java.util.List<androidx.compose.ui.layout.Measurable> list = subcompose;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            i4 = java.lang.Integer.valueOf(java.lang.Math.max(i4.intValue(), subcompose.get(i5).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        final int intValue = i4.intValue();
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), i2, 0, intValue, intValue, 2, null);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.layout.Measurable measurable = subcompose.get(i6);
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(m8545copyZbe2FdA$default);
            float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(subcomposeMeasureScope.mo1415toDpu2uoSUM(java.lang.Math.min(measurable.maxIntrinsicWidth(mo7353measureBRTryo0.getHeight()), mo7353measureBRTryo0.getWidth())) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.TabKt.getHorizontalTextPadding() * 2.0f));
            arrayList.add(mo7353measureBRTryo0);
            arrayList2.add(androidx.compose.ui.unit.Dp.m8599boximpl(m8601constructorimpl));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i3 * 2);
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            valueOf = java.lang.Integer.valueOf(valueOf.intValue() + ((androidx.compose.ui.layout.Placeable) arrayList.get(i7)).getWidth());
        }
        final int intValue2 = valueOf.intValue();
        return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.getHighResolutionOutputSizeshNQ4ISI(i3, arrayList, subcomposeMeasureScope, function22, scrollableTabData, i, arrayList2, constraints, intValue2, intValue, function3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(androidx.compose.foundation.ScrollState scrollState, float f, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, int i) {
        this.getHighSpeedVideoFpsRangesFor = scrollState;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getInputFormats = function2;
        this.getHighSpeedVideoFpsRanges = function22;
        this.Camera2StreamConfigurationMap = function3;
        this.getHighSpeedVideoSizes = i;
    }
}
