package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerKt$DatePickerContent$2$4$2 implements kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarMonth getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.DatePickerColors getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.SelectableDates getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputFormats;
    final /* synthetic */ kotlin.ranges.IntRange getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1193716082, intValue, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)");
        }
        androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
        final java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_picker_year_picker_pane_title), composer2, 0);
        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
        boolean changed = composer2.changed(m4383getString2EP1pXo);
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2.getHighSpeedVideoSizes(m4383getString2EP1pXo, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
        long j = this.getHighSpeedVideoFpsRanges;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getOutputFormats;
        final kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoFpsRangesFor;
        final androidx.compose.foundation.lazy.LazyListState lazyListState = this.getInputSizeshNQ4ISI;
        final kotlin.ranges.IntRange intRange = this.getOutputMinFrameDuration;
        final androidx.compose.material3.internal.CalendarMonth calendarMonth = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.material3.SelectableDates selectableDates = this.getHighSpeedVideoSizesFor;
        androidx.compose.material3.internal.CalendarModel calendarModel = this.Camera2StreamConfigurationMap;
        androidx.compose.material3.DatePickerColors datePickerColors = this.getHighSpeedVideoSizes;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1729requiredHeight3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility() * 7.0f) - androidx.compose.material3.DividerDefaults.INSTANCE.m3240getThicknessD9Ej5fM())), androidx.compose.material3.DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
        boolean changed2 = composer2.changed(mutableState);
        boolean changedInstance = composer2.changedInstance(coroutineScope);
        boolean changed3 = composer2.changed(lazyListState);
        boolean changedInstance2 = composer2.changedInstance(intRange);
        boolean changed4 = composer2.changed(calendarMonth);
        java.lang.Object rememberedValue2 = composer2.rememberedValue();
        if ((changed2 | changedInstance | changed3 | changedInstance2 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope.this, mutableState, lazyListState, intRange, calendarMonth, ((java.lang.Integer) obj).intValue());
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material3.DatePickerKt.getHighSpeedVideoSizes(m1708paddingVpY3zN4$default, j, (kotlin.jvm.functions.Function1) rememberedValue2, selectableDates, calendarModel, intRange, datePickerColors, composer2, 6);
        androidx.compose.material3.DividerKt.m3246HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors.getDividerColor(), composer2, 0, 3);
        composer2.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarMonth calendarMonth, int i) {
        boolean booleanValue;
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        mutableState.setValue(java.lang.Boolean.valueOf(!booleanValue));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(lazyListState, i, intRange, calendarMonth, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    DatePickerKt$DatePickerContent$2$4$2(long j, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.ranges.IntRange intRange, androidx.compose.material3.internal.CalendarMonth calendarMonth, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.DatePickerColors datePickerColors) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getOutputFormats = mutableState;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getInputSizeshNQ4ISI = lazyListState;
        this.getOutputMinFrameDuration = intRange;
        this.getHighResolutionOutputSizeshNQ4ISI = calendarMonth;
        this.getHighSpeedVideoSizesFor = selectableDates;
        this.Camera2StreamConfigurationMap = calendarModel;
        this.getHighSpeedVideoSizes = datePickerColors;
    }
}
