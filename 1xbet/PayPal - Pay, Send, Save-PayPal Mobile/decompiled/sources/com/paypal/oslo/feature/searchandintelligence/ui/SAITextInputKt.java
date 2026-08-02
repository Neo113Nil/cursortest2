package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a]\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"MaxLines", "", "SAITextInput", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "enabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "onSendClick", "Lkotlin/Function0;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SAITextInputEmptyPreview", "(Landroidx/compose/runtime/Composer;I)V", "SAITextInputWithTextPreview", "SAITextInputDisabledPreview", "SAITextInputFocusedPreview", "SAITextInputEmptyFocusedPreview", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SAITextInputKt {
    /* JADX WARN: Removed duplicated region for block: B:113:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SAITextInput(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str2, final boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(941202052);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        function02 = function0;
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function03 = function0;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(941202052, i6, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInput (SAITextInput.kt:95)");
                        }
                        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
                        final boolean booleanValue = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, (i6 >> 18) & 14).getValue().booleanValue();
                        boolean changed = startRestartGroup.changed(booleanValue);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.ui.unit.Dp.m8599boximpl(booleanValue ? com.paypal.pds.core.ConstantsKt.getBorderSize2() : com.paypal.pds.core.ConstantsKt.getBorderSize1());
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        float m8615unboximpl = ((androidx.compose.ui.unit.Dp) rememberedValue3).m8615unboximpl();
                        boolean changed2 = startRestartGroup.changed(booleanValue);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (com.paypal.pds.core.Color) (booleanValue ? com.paypal.pds.core.Color.BorderFocus.INSTANCE : com.paypal.pds.core.Color.BorderUtilityGlow.INSTANCE);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.pds.core.Color color = (com.paypal.pds.core.Color) rememberedValue4;
                        m8065copyp1EtxEg = r28.m8065copyp1EtxEg((r48 & 1) != 0 ? r28.spanStyle.m7982getColor0d7_KjU() : com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(startRestartGroup, 6), (r48 & 2) != 0 ? r28.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r28.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r28.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r28.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r28.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r28.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r28.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r28.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r28.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r28.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r28.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r28.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r28.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r28.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r28.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r28.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r28.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r28.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r28.platformStyle : null, (r48 & 1048576) != 0 ? r28.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r28.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r28.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE.getTextStyle(startRestartGroup, 6).paragraphStyle.getTextMotion() : null);
                        final boolean z2 = z && !kotlin.text.StringsKt.isBlank(str);
                        boolean z3 = z2 || (z && booleanValue);
                        boolean changed3 = startRestartGroup.changed(z2);
                        boolean z4 = (i6 & 458752) == 131072;
                        boolean changed4 = startRestartGroup.changed(softwareKeyboardController);
                        boolean changedInstance = startRestartGroup.changedInstance(focusManager);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((changed3 | z4 | changed4 | changedInstance) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.m19163$r8$lambda$i54gNrGNDx6MhOfJ9jbZSchJ70(z2, function03, softwareKeyboardController, focusManager);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        final kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        final boolean z5 = z2;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function03;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize56()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), m8615unboximpl, color, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), startRestartGroup, 0, 0), com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.SAI_TEXT_INPUT_TEST_TAG);
                        androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(com.paypal.pds.core.Color.ContentFaint.INSTANCE.getValue(startRestartGroup, 6), null);
                        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, java.lang.Boolean.TRUE, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8220getSendeUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 117, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        boolean changed5 = startRestartGroup.changed(function04);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (changed5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.m19161$r8$lambda$WKYuixA3N3_QewKPm_vcsAmNg(kotlin.jvm.functions.Function0.this, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue6, 31, null);
                        androidx.compose.ui.graphics.SolidColor solidColor2 = solidColor;
                        final boolean z6 = z3;
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(3415745, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.m19162$r8$lambda$AztIQguMGmEpKP8vdVoISrg3EI(z6, function04, z5, str, booleanValue, str2, (kotlin.jvm.functions.Function2) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54);
                        composer2 = startRestartGroup;
                        androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(str, function1, testTag, z, false, m8065copyp1EtxEg, keyboardOptions, keyboardActions, false, 3, 0, (androidx.compose.ui.text.input.VisualTransformation) null, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, mutableInteractionSource4, (androidx.compose.ui.graphics.Brush) solidColor2, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) rememberComposableLambda, composer2, (i6 & 14) | 905969664 | (i6 & 112) | (i6 & 7168), ((i6 >> 9) & 7168) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7184);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        function02 = function05;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.$r8$lambda$vU5dAEDJ8_ui5AqXdHWSQs_RQHo(str, function1, str2, z, modifier3, function02, mutableInteractionSource3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i3;
                if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i3;
            if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i3;
        if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-W-KYuixA3N3_QewKPm_vcsAmNg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19161$r8$lambda$WKYuixA3N3_QewKPm_vcsAmNg(kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AztIQguMGmEpKP8vdVoI-Srg3EI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19162$r8$lambda$AztIQguMGmEpKP8vdVoISrg3EI(boolean z, kotlin.jvm.functions.Function0 function0, boolean z2, java.lang.String str, boolean z3, java.lang.String str2, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(3415745, i2, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInput.<anonymous> (SAITextInput.kt:144)");
            }
            androidx.compose.ui.Modifier instrument$default = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12()), com.paypal.oslo.feature.searchandintelligence.ui.analytics.chatinput.SearchBarComponentAnalyticsConfig.INSTANCE, (java.lang.Integer) null, (java.lang.Integer) null, 6, (java.lang.Object) null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, instrument$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 11, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            boolean z4 = kotlin.text.StringsKt.isBlank(str) && !z3;
            androidx.compose.ui.Alignment centerStart = androidx.compose.ui.Alignment.INSTANCE.getCenterStart();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (z4) {
                composer.startReplaceGroup(-704783364);
                i3 = i2;
                composer2 = composer;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
            } else {
                i3 = i2;
                composer2 = composer;
                composer2.startReplaceGroup(-704550957);
                composer.endReplaceGroup();
            }
            androidx.compose.runtime.Composer composer3 = composer2;
            function2.invoke(composer3, java.lang.Integer.valueOf(i3 & 14));
            composer.endNode();
            if (z4) {
                composer3.startReplaceGroup(1388594817);
                i4 = 0;
                com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_beta, composer3, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.SAI_BETA_BADGE_TEST_TAG), com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeEmphasis.Default, com.paypal.pds.components.BadgeSize.Medium.INSTANCE, null, null, composer, 28032, 96);
                composer.endReplaceGroup();
            } else {
                i4 = 0;
                composer3.startReplaceGroup(1389100985);
                composer.endReplaceGroup();
            }
            composer.endNode();
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowUp.INSTANCE, function0, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.analytics.chatinput.SubmitButtonItemAnalyticsConfig.INSTANCE), com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.SAI_SEND_BUTTON_TEST_TAG), z ? com.paypal.pds.components.ButtonStyle.Primary.INSTANCE : com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_chat_input_send, composer3, i4), null, z2, false, composer, 24582, 320);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i54gNrGNDx6MhOfJ9jb-ZSchJ70, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19163$r8$lambda$i54gNrGNDx6MhOfJ9jbZSchJ70(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.ui.focus.FocusManager focusManager) {
        if (z) {
            function0.invoke();
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iB2e3obNikzpJMr4XCvHXHT6vTg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1114411407);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1114411407, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputEmptyFocusedPreview (SAITextInput.kt:261)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SAITextInputKt.INSTANCE.getLambda$266009336$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.$r8$lambda$iB2e3obNikzpJMr4XCvHXHT6vTg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n1Bw990YohTjUTP1wC3Bx94MGaI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-820157084);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-820157084, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputFocusedPreview (SAITextInput.kt:246)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SAITextInputKt.INSTANCE.m19148getLambda$44834691$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.$r8$lambda$n1Bw990YohTjUTP1wC3Bx94MGaI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pOCttJ86S17rrQLavYxN5nJe20k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1369610584);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1369610584, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputWithTextPreview (SAITextInput.kt:218)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SAITextInputKt.INSTANCE.getLambda$1190547119$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.$r8$lambda$pOCttJ86S17rrQLavYxN5nJe20k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tXrJf0RknDM2qjMHwGe5RJ_wNHs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1496523058);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1496523058, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputEmptyPreview (SAITextInput.kt:204)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SAITextInputKt.INSTANCE.getLambda$1248414759$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.$r8$lambda$tXrJf0RknDM2qjMHwGe5RJ_wNHs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uk4BhY9QLkO-smW63mG3_ELoU0s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19164$r8$lambda$uk4BhY9QLkOsmW63mG3_ELoU0s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1106131681);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1106131681, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputDisabledPreview (SAITextInput.kt:232)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SAITextInputKt.INSTANCE.getLambda$1454026022$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SAITextInputKt.m19164$r8$lambda$uk4BhY9QLkOsmW63mG3_ELoU0s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vU5dAEDJ8_ui5AqXdHWSQs_RQHo(java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String str2, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SAITextInput(str, function1, str2, z, modifier, function0, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
