package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateRangePickerKt$VerticalMonthsList$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.internal.CalendarMonth Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.DatePickerFormatter getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.Long getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.Long getInputFormats;
    final /* synthetic */ androidx.compose.material3.internal.CalendarDate getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SelectableDates getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> getOutputMinFrameDuration;
    final /* synthetic */ kotlin.ranges.IntRange getOutputStallDurationlomOqCM;

    public static /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI() {
        return 0.0f;
    }

    public static /* synthetic */ float getHighSpeedVideoFpsRanges() {
        return 0.0f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        final java.util.List listOf;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1090773432, intValue, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
            }
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2);
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_range_picker_scroll_to_previous_month), composer2, 0);
            androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo2 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_range_picker_scroll_to_next_month), composer2, 0);
            boolean changed = composer2.changed(this.getInputFormats);
            boolean changed2 = composer2.changed(this.getHighSpeedVideoSizesFor);
            boolean changed3 = composer2.changed(this.getOutputMinFrameDuration);
            final java.lang.Long l = this.getInputFormats;
            final java.lang.Long l2 = this.getHighSpeedVideoSizesFor;
            final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> function2 = this.getOutputMinFrameDuration;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.getHighSpeedVideoSizes(l, l2, function2, ((java.lang.Long) obj).longValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.semantics.CustomAccessibilityAction[]{new androidx.compose.ui.semantics.CustomAccessibilityAction(m4383getString2EP1pXo, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.material3.DateRangePickerKt.m3208$r8$lambda$B8GnVpXL3wThejePwkPeD10zSw(androidx.compose.foundation.lazy.LazyListState.this, coroutineScope));
                }
            }), new androidx.compose.ui.semantics.CustomAccessibilityAction(m4383getString2EP1pXo2, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.material3.DateRangePickerKt.$r8$lambda$QcPLdcAgpNfYfMv0qdITlGcij6o(androidx.compose.foundation.lazy.LazyListState.this, coroutineScope));
                }
            })});
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion3, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null);
            androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighSpeedVideoSizes;
            boolean changedInstance = composer2.changedInstance(this.getOutputStallDurationlomOqCM);
            boolean changedInstance2 = composer2.changedInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changed4 = composer2.changed(this.Camera2StreamConfigurationMap);
            boolean changedInstance3 = composer2.changedInstance(this.getHighSpeedVideoFpsRangesFor);
            boolean changedInstance4 = composer2.changedInstance(listOf);
            boolean changed5 = composer2.changed(this.getHighSpeedVideoFpsRanges);
            boolean changed6 = composer2.changed(this.getInputFormats);
            boolean changed7 = composer2.changed(this.getHighSpeedVideoSizesFor);
            boolean changed8 = composer2.changed(function1);
            boolean changed9 = composer2.changed(this.getInputSizeshNQ4ISI);
            boolean changed10 = composer2.changed(this.getOutputFormats);
            final kotlin.ranges.IntRange intRange = this.getOutputStallDurationlomOqCM;
            final androidx.compose.material3.internal.CalendarModel calendarModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.material3.internal.CalendarMonth calendarMonth = this.Camera2StreamConfigurationMap;
            final java.lang.Long l3 = this.getInputFormats;
            final java.lang.Long l4 = this.getHighSpeedVideoSizesFor;
            final androidx.compose.material3.internal.CalendarDate calendarDate = this.getInputSizeshNQ4ISI;
            final androidx.compose.material3.DatePickerFormatter datePickerFormatter = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.material3.SelectableDates selectableDates = this.getOutputFormats;
            final androidx.compose.material3.DatePickerColors datePickerColors = this.getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if ((changed10 | changedInstance | changedInstance2 | changed4 | changedInstance3 | changedInstance4 | changed5 | changed6 | changed7 | changed8 | changed9) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.getHighSpeedVideoFpsRangesFor(kotlin.ranges.IntRange.this, calendarModel, calendarMonth, l3, l4, function1, calendarDate, datePickerFormatter, selectableDates, datePickerColors, listOf, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(semantics$default, lazyListState, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue4, composer2, 0, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ScrollAxisRange(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.getHighResolutionOutputSizeshNQ4ISI());
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.getHighSpeedVideoFpsRanges());
            }
        }, false, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.Long l, java.lang.Long l2, kotlin.jvm.functions.Function2 function2, long j) {
        androidx.compose.material3.DateRangePickerKt.access$updateDateSelection(j, l, l2, function2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.ranges.IntRange intRange, final androidx.compose.material3.internal.CalendarModel calendarModel, final androidx.compose.material3.internal.CalendarMonth calendarMonth, final java.lang.Long l, final java.lang.Long l2, final kotlin.jvm.functions.Function1 function1, final androidx.compose.material3.internal.CalendarDate calendarDate, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, final java.util.List list, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, androidx.compose.material3.DatePickerKt.numberOfMonthsInRange(intRange), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(682334170, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                int i;
                androidx.compose.material3.SelectedRangeInfo selectedRangeInfo;
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
                        androidx.compose.runtime.ComposerKt.traceEventStart(682334170, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
                    }
                    androidx.compose.material3.internal.CalendarMonth plusMonths = androidx.compose.material3.internal.CalendarModel.this.plusMonths(calendarMonth, intValue);
                    androidx.compose.ui.Modifier fillParentMaxWidth$default = androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxWidth$default(lazyItemScope2, androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    java.lang.Long l3 = l;
                    java.lang.Long l4 = l2;
                    kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function12 = function1;
                    androidx.compose.material3.internal.CalendarDate calendarDate2 = calendarDate;
                    androidx.compose.material3.DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    androidx.compose.material3.SelectableDates selectableDates2 = selectableDates;
                    androidx.compose.material3.DatePickerColors datePickerColors2 = datePickerColors;
                    androidx.compose.material3.internal.CalendarModel calendarModel2 = androidx.compose.material3.internal.CalendarModel.this;
                    java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list2 = list;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.material3.TextKt.ProvideTextStyle(androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer2, 6), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-577031469, true, new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(datePickerFormatter2, plusMonths, calendarModel2, list2, datePickerColors2), composer2, 54), composer2, 48);
                    if (l3 != null && l4 != null) {
                        composer2.startReplaceGroup(185956701);
                        boolean changed = composer2.changed(l3);
                        boolean changed2 = composer2.changed(l4);
                        java.lang.Object rememberedValue = composer2.rememberedValue();
                        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.material3.SelectedRangeInfo.INSTANCE.calculateRangeInfo(plusMonths, calendarModel2.getCanonicalDate(l3.longValue()), calendarModel2.getCanonicalDate(l4.longValue()));
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceGroup();
                        selectedRangeInfo = (androidx.compose.material3.SelectedRangeInfo) rememberedValue;
                    } else {
                        composer2.startReplaceGroup(186488258);
                        composer2.endReplaceGroup();
                        selectedRangeInfo = null;
                    }
                    androidx.compose.material3.DatePickerKt.Month(plusMonths, function12, calendarDate2.getUtcTimeMillis(), l3, l4, selectedRangeInfo, datePickerFormatter2, selectableDates2, datePickerColors2, calendarModel2.getLocale(), composer2, 0);
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
    DateRangePickerKt$VerticalMonthsList$1(java.lang.Long l, java.lang.Long l2, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.internal.CalendarMonth calendarMonth, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.material3.internal.CalendarDate calendarDate, androidx.compose.material3.SelectableDates selectableDates) {
        this.getInputFormats = l;
        this.getHighSpeedVideoSizesFor = l2;
        this.getOutputMinFrameDuration = function2;
        this.getHighSpeedVideoSizes = lazyListState;
        this.getOutputStallDurationlomOqCM = intRange;
        this.getHighResolutionOutputSizeshNQ4ISI = calendarModel;
        this.Camera2StreamConfigurationMap = calendarMonth;
        this.getHighSpeedVideoFpsRangesFor = datePickerFormatter;
        this.getHighSpeedVideoFpsRanges = datePickerColors;
        this.getInputSizeshNQ4ISI = calendarDate;
        this.getOutputFormats = selectableDates;
    }
}
