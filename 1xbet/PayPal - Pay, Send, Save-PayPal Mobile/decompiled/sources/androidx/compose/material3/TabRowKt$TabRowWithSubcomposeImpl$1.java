package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabRowKt$TabRowWithSubcomposeImpl$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material3.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1815327065, intValue, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:768)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed = composer2.changed(this.getHighSpeedVideoFpsRanges);
            boolean changed2 = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changed3 = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material3.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function2.this, function22, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue, composer2, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.ui.unit.Constraints constraints, int i, final kotlin.jvm.functions.Function3 function3, final java.util.List list2, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i3), i3 * intRef.element, 0, 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.getHighSpeedVideoFpsRangesFor, function2);
        int size2 = subcompose.size();
        for (int i4 = 0; i4 < size2; i4++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = subcompose.get(i4).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, 0, 0, 11, null));
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, mo7353measureBRTryo0, 0, i - mo7353measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.getHighSpeedVideoSizes, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1918742627, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1$3
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer2 = composer;
                int intValue = num.intValue();
                if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1918742627, intValue, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:814)");
                    }
                    function3.invoke(list2, composer2, 0);
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
        for (int i5 = 0; i5 < size3; i5++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i5).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i2, i)), 0, 0, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final kotlin.jvm.functions.Function3 function3, final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, final androidx.compose.ui.unit.Constraints constraints) {
        final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material3.TabSlots.Camera2StreamConfigurationMap, function2);
        int size = subcompose.size();
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        if (size > 0) {
            intRef.element = m8554getMaxWidthimpl / size;
        }
        int i = 0;
        java.util.List<androidx.compose.ui.layout.Measurable> list = subcompose;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            i = java.lang.Integer.valueOf(java.lang.Math.max(subcompose.get(i2).maxIntrinsicHeight(intRef.element), i.intValue()));
        }
        final int intValue = i.intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(subcompose.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList.add(subcompose.get(i3).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(constraints.getGetHighSpeedVideoFpsRangesFor(), intRef.element, intRef.element, intValue, intValue)));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(new androidx.compose.material3.TabPosition(androidx.compose.ui.unit.Dp.m8601constructorimpl(subcomposeMeasureScope.mo1415toDpu2uoSUM(intRef.element) * i4), subcomposeMeasureScope.mo1415toDpu2uoSUM(intRef.element), ((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(subcomposeMeasureScope.mo1415toDpu2uoSUM(java.lang.Math.min(subcompose.get(i4).maxIntrinsicWidth(intValue), intRef.element)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.TabKt.getHorizontalTextPadding() * 2.0f))), androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)))).m8615unboximpl(), null));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, m8554getMaxWidthimpl, intValue, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1.Camera2StreamConfigurationMap(arrayList2, subcomposeMeasureScope, function22, intRef, constraints, intValue, function3, arrayList4, m8554getMaxWidthimpl, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    TabRowKt$TabRowWithSubcomposeImpl$1(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = function22;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
