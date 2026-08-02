package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a}\u0010\u0013\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002&\u0010\u0006\u001a\"\u0012\u000b\u0012\t\u0018\u00010\u0000¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0000¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"", "selectedStartDateMillis", "selectedEndDateMillis", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "onDatesSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "DateRangeInputContent", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateRangeInputKt {
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);

    public static final void DateRangeInputContent(final java.lang.Long l, final java.lang.Long l2, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2, final androidx.compose.material3.internal.CalendarModel calendarModel, final kotlin.ranges.IntRange intRange, final androidx.compose.material3.DatePickerFormatter datePickerFormatter, final androidx.compose.material3.SelectableDates selectableDates, final androidx.compose.material3.DatePickerColors datePickerColors, final androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        androidx.compose.material3.internal.DateInputFormat dateInputFormat;
        boolean z;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1372713366);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1372713366, i2, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:44)");
            }
            boolean changed = startRestartGroup.changed(calendarModel.getLocale());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(calendarModel.getLocale());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.internal.DateInputFormat dateInputFormat2 = (androidx.compose.material3.internal.DateInputFormat) rememberedValue;
            androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo2 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo3 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            androidx.compose.material3.internal.Strings.Companion companion4 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo4 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_range_input_invalid_range_input), startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(dateInputFormat2);
            boolean z2 = (i2 & 458752) == 131072 || ((262144 & i2) != 0 && startRestartGroup.changed(datePickerFormatter));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed2 || z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i2;
                i4 = 256;
                dateInputFormat = dateInputFormat2;
                rememberedValue2 = new androidx.compose.material3.DateInputValidator(intRange, selectableDates, dateInputFormat2, datePickerFormatter, m4383getString2EP1pXo, m4383getString2EP1pXo2, m4383getString2EP1pXo3, m4383getString2EP1pXo4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                i4 = 256;
            }
            androidx.compose.material3.DateInputValidator dateInputValidator = (androidx.compose.material3.DateInputValidator) rememberedValue2;
            dateInputValidator.setCurrentStartDateMillis(l);
            dateInputValidator.setCurrentEndDateMillis(l2);
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.DateInputKt.getInputTextFieldPadding());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(getHighSpeedVideoFpsRangesFor), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, padding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            androidx.compose.material3.internal.Strings.Companion companion5 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo5 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_range_picker_start_headline), startRestartGroup, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
            int m3407getStartDateInputJ2x2o4M = androidx.compose.material3.InputIdentifier.INSTANCE.m3407getStartDateInputJ2x2o4M();
            java.util.Locale locale = calendarModel.getLocale();
            int i5 = i3 & 896;
            boolean z3 = i5 == i4;
            int i6 = i3 & 112;
            boolean z4 = i6 == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z3 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangeInputKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangeInputKt.$r8$lambda$WsOQgezMpFUIxb7Pv5qfyB1HAmw(kotlin.jvm.functions.Function2.this, l2, (java.lang.Long) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            int i7 = i3 & 7168;
            int i8 = i3 >> 21;
            boolean z5 = false;
            int i9 = i3;
            androidx.compose.material3.DateInputKt.m3140DateInputTextFieldxJ3Ic0Y(weight$default, l, (kotlin.jvm.functions.Function1) rememberedValue3, calendarModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1740538748, true, new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2(m4383getString2EP1pXo5, upperCase), startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1229526589, true, new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3(upperCase), startRestartGroup, 54), m3407getStartDateInputJ2x2o4M, dateInputValidator, dateInputFormat, locale, datePickerColors, focusRequester, startRestartGroup, ((i3 << 3) & 112) | 1794048 | i7, i8 & 126);
            androidx.compose.material3.internal.Strings.Companion companion6 = androidx.compose.material3.internal.Strings.INSTANCE;
            java.lang.String m4383getString2EP1pXo6 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_date_range_picker_end_headline), startRestartGroup, 0);
            androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
            int m3405getEndDateInputJ2x2o4M = androidx.compose.material3.InputIdentifier.INSTANCE.m3405getEndDateInputJ2x2o4M();
            java.util.Locale locale2 = calendarModel.getLocale();
            boolean z6 = i5 == 256;
            if ((i9 & 14) == 4) {
                z5 = true;
            }
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((z6 || z5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                z = true;
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateRangeInputKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateRangeInputKt.$r8$lambda$0FTtnHM0PQjazrZP8mFzn9zaSz8(kotlin.jvm.functions.Function2.this, l, (java.lang.Long) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                z = true;
            }
            androidx.compose.material3.internal.DateInputFormat dateInputFormat3 = dateInputFormat;
            composer2 = startRestartGroup;
            androidx.compose.material3.DateInputKt.m3140DateInputTextFieldxJ3Ic0Y(weight$default2, l2, (kotlin.jvm.functions.Function1) rememberedValue4, calendarModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-882370893, z, new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5(m4383getString2EP1pXo6, upperCase), startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1956183348, z, new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6(upperCase), startRestartGroup, 54), m3405getEndDateInputJ2x2o4M, dateInputValidator, dateInputFormat3, locale2, datePickerColors, null, startRestartGroup, i6 | 1794048 | i7, (i8 & 14) | 48);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DateRangeInputKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DateRangeInputKt.m3201$r8$lambda$1kSiQ46HamMsqkLXzEwMu9Jpo(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0FTtnHM0PQjazrZP8mFzn9zaSz8(kotlin.jvm.functions.Function2 function2, java.lang.Long l, java.lang.Long l2) {
        function2.invoke(l, l2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1kS-iQ46HamMsq-kLXzEwMu9Jpo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3201$r8$lambda$1kSiQ46HamMsqkLXzEwMu9Jpo(java.lang.Long l, java.lang.Long l2, kotlin.jvm.functions.Function2 function2, androidx.compose.material3.internal.CalendarModel calendarModel, kotlin.ranges.IntRange intRange, androidx.compose.material3.DatePickerFormatter datePickerFormatter, androidx.compose.material3.SelectableDates selectableDates, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.focus.FocusRequester focusRequester, int i, androidx.compose.runtime.Composer composer, int i2) {
        DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WsOQgezMpFUIxb7Pv5qfyB1HAmw(kotlin.jvm.functions.Function2 function2, java.lang.Long l, java.lang.Long l2) {
        function2.invoke(l2, l);
        return kotlin.Unit.INSTANCE;
    }
}
