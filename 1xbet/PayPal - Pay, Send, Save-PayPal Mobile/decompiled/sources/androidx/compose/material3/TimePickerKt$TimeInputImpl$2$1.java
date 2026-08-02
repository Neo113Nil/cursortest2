package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerKt$TimeInputImpl$2$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.TimePickerState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.node.Ref<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.TimePickerColors getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        float f;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1306700887, intValue, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1032)");
            }
            final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState = this.getHighSpeedVideoSizes;
            final androidx.compose.material3.TimePickerState timePickerState = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.node.Ref<java.lang.Boolean> ref = this.getHighSpeedVideoFpsRanges;
            androidx.compose.material3.TimePickerColors timePickerColors = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer2.changed(mutableState);
            boolean changedInstance = composer2.changedInstance(timePickerState);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                        int m7091getUtf16CodePointZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7091getUtf16CodePointZmokQxo(keyEvent.m7078unboximpl());
                        if (48 <= m7091getUtf16CodePointZmokQxo && m7091getUtf16CodePointZmokQxo < 58 && androidx.compose.ui.text.TextRange.m8039getStartimpl(androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$18(mutableState).getSelection()) == 2 && androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$18(mutableState).getText().length() == 2) {
                            androidx.compose.material3.TimePickerState.this.mo2878setSelection6_8s6DQ(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI());
                        }
                        return java.lang.Boolean.FALSE;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier onKeyEvent = androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(companion2, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.text.input.TextFieldValue access$TimeInputImpl$lambda$18 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$18(mutableState);
            boolean changedInstance2 = composer2.changedInstance(timePickerState);
            boolean changed2 = composer2.changed(mutableState);
            boolean changedInstance3 = composer2.changedInstance(ref);
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changedInstance2 | changed2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.TimePickerState.this, ref, mutableState, (androidx.compose.ui.text.input.TextFieldValue) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            int m4058getHouryecRtBI = androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI();
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 115, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean changedInstance4 = composer2.changedInstance(timePickerState);
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.TimePickerState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.material3.TimePickerKt.getHighResolutionOutputSizeshNQ4ISI(onKeyEvent, access$TimeInputImpl$lambda$18, function1, timePickerState, m4058getHouryecRtBI, keyboardOptions, new androidx.compose.foundation.text.KeyboardActions(null, null, (kotlin.jvm.functions.Function1) rememberedValue3, null, null, null, 59, null), timePickerColors, composer2, 24576, 0);
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            f = androidx.compose.material3.TimePickerKt.Camera2StreamConfigurationMap;
            androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(companion3, f, androidx.compose.material3.tokens.TimeInputTokens.INSTANCE.m5100getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed3 = composer2.changed(mutableState2);
            boolean changedInstance5 = composer2.changedInstance(timePickerState);
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if ((changed3 | changedInstance5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                        boolean z = androidx.compose.ui.input.key.KeyEvent_androidKt.m7091getUtf16CodePointZmokQxo(keyEvent.m7078unboximpl()) == 0 && androidx.compose.ui.text.TextRange.m8039getStartimpl(androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$22(mutableState2).getSelection()) == 0;
                        if (z) {
                            androidx.compose.material3.TimePickerState.this.mo2878setSelection6_8s6DQ(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI());
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.ui.Modifier onPreviewKeyEvent = androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(companion4, (kotlin.jvm.functions.Function1) rememberedValue4);
            androidx.compose.ui.text.input.TextFieldValue access$TimeInputImpl$lambda$22 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$22(mutableState2);
            boolean changedInstance6 = composer2.changedInstance(timePickerState);
            boolean changed4 = composer2.changed(mutableState2);
            boolean changedInstance7 = composer2.changedInstance(ref);
            java.lang.Object rememberedValue5 = composer2.rememberedValue();
            if ((changedInstance6 | changed4 | changedInstance7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.Camera2StreamConfigurationMap(androidx.compose.material3.TimePickerState.this, ref, mutableState2, (androidx.compose.ui.text.input.TextFieldValue) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            int m4059getMinuteyecRtBI = androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI();
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions2 = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 115, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean changedInstance8 = composer2.changedInstance(timePickerState);
            java.lang.Object rememberedValue6 = composer2.rememberedValue();
            if (changedInstance8 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.Camera2StreamConfigurationMap(androidx.compose.material3.TimePickerState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.material3.TimePickerKt.getHighResolutionOutputSizeshNQ4ISI(onPreviewKeyEvent, access$TimeInputImpl$lambda$22, function12, timePickerState, m4059getMinuteyecRtBI, keyboardOptions2, new androidx.compose.foundation.text.KeyboardActions(null, null, (kotlin.jvm.functions.Function1) rememberedValue6, null, null, null, 59, null), timePickerColors, composer2, 24576, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.TimePickerState timePickerState) {
        timePickerState.mo2878setSelection6_8s6DQ(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.TimePickerState timePickerState, androidx.compose.ui.node.Ref ref, final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        androidx.compose.material3.TimePickerKt.m4041access$timeInputOnChange_K77t0(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI(), timePickerState, textFieldValue, androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$18(mutableState), timePickerState.getGetHighSpeedVideoSizes() ? 23 : 12, ref, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.text.input.TextFieldValue) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material3.TimePickerState timePickerState) {
        timePickerState.mo2878setSelection6_8s6DQ(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material3.TimePickerState timePickerState, androidx.compose.ui.node.Ref ref, final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        androidx.compose.material3.TimePickerKt.m4041access$timeInputOnChange_K77t0(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI(), timePickerState, textFieldValue, androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$22(mutableState), 59, ref, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.text.input.TextFieldValue) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return kotlin.Unit.INSTANCE;
    }

    TimePickerKt$TimeInputImpl$2$1(androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState, androidx.compose.material3.TimePickerState timePickerState, androidx.compose.ui.node.Ref<java.lang.Boolean> ref, androidx.compose.material3.TimePickerColors timePickerColors, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState2) {
        this.getHighSpeedVideoSizes = mutableState;
        this.Camera2StreamConfigurationMap = timePickerState;
        this.getHighSpeedVideoFpsRanges = ref;
        this.getHighSpeedVideoFpsRangesFor = timePickerColors;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
