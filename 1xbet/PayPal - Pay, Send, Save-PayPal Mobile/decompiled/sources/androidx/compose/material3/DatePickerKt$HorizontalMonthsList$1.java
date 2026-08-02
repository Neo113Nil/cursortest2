package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$HorizontalMonthsList$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.DatePickerColors Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.DatePickerFormatter getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.internal.CalendarMonth getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.SelectableDates getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.ranges.IntRange getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Long getOutputFormats;
    final /* synthetic */ androidx.compose.material3.internal.CalendarDate getOutputMinFrameDuration;

    public static /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI() {
        return 0.0f;
    }

    public static /* synthetic */ float getHighSpeedVideoSizes() {
        return 0.0f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1504086906, intValue, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.Camera2StreamConfigurationMap((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.foundation.gestures.FlingBehavior rememberSnapFlingBehavior$material3 = androidx.compose.material3.DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3(this.getHighSpeedVideoFpsRangesFor, null, composer2, 384, 2);
            boolean changedInstance = composer2.changedInstance(this.getInputSizeshNQ4ISI);
            boolean changedInstance2 = composer2.changedInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changed = composer2.changed(this.getHighSpeedVideoSizes);
            boolean changed2 = composer2.changed(this.getInputFormats);
            boolean changed3 = composer2.changed(this.getOutputMinFrameDuration);
            boolean changed4 = composer2.changed(this.getOutputFormats);
            boolean changedInstance3 = composer2.changedInstance(this.getHighSpeedVideoFpsRanges);
            boolean changed5 = composer2.changed(this.getHighSpeedVideoSizesFor);
            boolean changed6 = composer2.changed(this.Camera2StreamConfigurationMap);
            final kotlin.ranges.IntRange intRange = this.getInputSizeshNQ4ISI;
            final androidx.compose.material3.internal.CalendarModel calendarModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.material3.internal.CalendarMonth calendarMonth = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function1 = this.getInputFormats;
            final androidx.compose.material3.internal.CalendarDate calendarDate = this.getOutputMinFrameDuration;
            final java.lang.Long l = this.getOutputFormats;
            final androidx.compose.material3.DatePickerFormatter datePickerFormatter = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.material3.SelectableDates selectableDates = this.getHighSpeedVideoSizesFor;
            final androidx.compose.material3.DatePickerColors datePickerColors = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changedInstance | changedInstance2 | changed | changed2 | changed3 | changed4 | changedInstance3 | changed5 | changed6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange.this, calendarModel, calendarMonth, function1, calendarDate, l, datePickerFormatter, selectableDates, datePickerColors, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0, 444);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ScrollAxisRange(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.getHighResolutionOutputSizeshNQ4ISI());
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.getHighSpeedVideoSizes());
            }
        }, false, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange intRange, final androidx.compose.material3.internal.CalendarModel calendarModel, final androidx.compose.material3.internal.CalendarMonth calendarMonth, final kotlin.jvm.functions.Function1 function1, final androidx.compose.material3.internal.CalendarDate calendarDate, final java.lang.Long l, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, androidx.compose.material3.DatePickerKt.numberOfMonthsInRange(intRange), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(72599078, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                int i;
                androidx.compose.foundation.lazy.LazyItemScope lazyItemScope2 = lazyItemScope;
                int intValue = num.intValue();
                androidx.compose.runtime.Composer composer2 = composer;
                int intValue2 = num2.intValue();
                if ((intValue2 & 6) == 0) {
                    i = (composer2.changed(lazyItemScope2) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= composer2.changed(intValue) ? 32 : 16;
                }
                if (!composer2.shouldExecute((i & 147) != 146, i & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(72599078, i, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
                    }
                    androidx.compose.material3.internal.CalendarMonth plusMonths = androidx.compose.material3.internal.CalendarModel.this.plusMonths(calendarMonth, intValue);
                    androidx.compose.ui.Modifier fillParentMaxWidth$default = androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxWidth$default(lazyItemScope2, androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function12 = function1;
                    androidx.compose.material3.internal.CalendarDate calendarDate2 = calendarDate;
                    java.lang.Long l2 = l;
                    androidx.compose.material3.DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    androidx.compose.material3.SelectableDates selectableDates2 = selectableDates;
                    androidx.compose.material3.DatePickerColors datePickerColors2 = datePickerColors;
                    androidx.compose.material3.internal.CalendarModel calendarModel2 = androidx.compose.material3.internal.CalendarModel.this;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillParentMaxWidth$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.material3.DatePickerKt.Month(plusMonths, function12, calendarDate2.getUtcTimeMillis(), l2, null, null, datePickerFormatter2, selectableDates2, datePickerColors2, calendarModel2.getLocale(), composer2, 221184);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DatePickerKt$HorizontalMonthsList$1(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.internal.CalendarMonth calendarMonth, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, androidx.compose.material3.internal.CalendarDate calendarDate, java.lang.Long l, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors) {
        this.getHighSpeedVideoFpsRangesFor = lazyListState;
        this.getInputSizeshNQ4ISI = intRange;
        this.getHighResolutionOutputSizeshNQ4ISI = calendarModel;
        this.getHighSpeedVideoSizes = calendarMonth;
        this.getInputFormats = function1;
        this.getOutputMinFrameDuration = calendarDate;
        this.getOutputFormats = l;
        this.getHighSpeedVideoFpsRanges = datePickerFormatter;
        this.getHighSpeedVideoSizesFor = selectableDates;
        this.Camera2StreamConfigurationMap = datePickerColors;
    }
}
