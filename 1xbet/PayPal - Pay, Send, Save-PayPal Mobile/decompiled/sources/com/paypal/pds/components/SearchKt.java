package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\u001ai\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a!\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"Search", "", "modifier", "Landroidx/compose/ui/Modifier;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "onClearClick", "Lkotlin/Function0;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "placeHolder", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "calculateBorder", "Lkotlin/Pair;", "Lcom/paypal/pds/core/Color;", "Landroidx/compose/ui/unit/Dp;", "isFocused", "", "(ZLandroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "ClearBox", "text", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", com.paypal.pds.components.SearchKt.PlaceholderTag, com.paypal.pds.components.SearchKt.SearchIconTag, "ClearIconTag", "SearchWithPlaceHolderPreview", "(Landroidx/compose/runtime/Composer;I)V", "SearchWithLongTextPreview", "SearchWithKeyboardActionPreview", "pds_release", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SearchKt {
    public static final java.lang.String ClearIconTag = "Clear";
    public static final java.lang.String PlaceholderTag = "PlaceholderTag";
    public static final java.lang.String SearchIconTag = "SearchIconTag";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Search(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        int i7;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i8;
        androidx.compose.ui.Modifier modifier2;
        java.lang.String str4;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2112776904);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        keyboardOptions2 = keyboardOptions;
                        i3 |= startRestartGroup.changed(keyboardOptions2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changed(keyboardActions2) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i10 != 0) {
                                str3 = null;
                            }
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.pds.components.SearchKt.m22005$r8$lambda$rCXsYhdCsoUc1K_zosrTmuK_8s((java.lang.String) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function14 = function12;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function04 = function02;
                            }
                            androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i6 != 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                            androidx.compose.foundation.text.KeyboardActions keyboardActions4 = i7 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                            final java.lang.String str5 = i8 != 0 ? null : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2112776904, i3, -1, "com.paypal.pds.components.Search (Search.kt:95)");
                            }
                            java.lang.String str6 = str3 == null ? "" : str3;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue3;
                            androidx.compose.runtime.State<java.lang.Boolean> collectIsFocusedAsState = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource, startRestartGroup, 6);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(str6, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue4;
                            boolean changed = startRestartGroup.changed(str6);
                            com.paypal.pds.components.SearchKt$Search$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new com.paypal.pds.components.SearchKt$Search$3$1(str6, mutableState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(str6, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                            boolean booleanValue = collectIsFocusedAsState.getValue().booleanValue();
                            boolean changed2 = startRestartGroup.changed(collectIsFocusedAsState);
                            com.paypal.pds.components.SearchKt$Search$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new com.paypal.pds.components.SearchKt$Search$4$1(collectIsFocusedAsState, mutableState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                            boolean booleanValue2 = collectIsFocusedAsState.getValue().booleanValue();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1037396555, 0, -1, "com.paypal.pds.components.calculateBorder (Search.kt:186)");
                            }
                            kotlin.Pair pair = booleanValue2 ? kotlin.TuplesKt.to(com.paypal.pds.core.Color.BorderFocus.INSTANCE, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getBorderSize2())) : kotlin.TuplesKt.to(com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getBorderSize1()));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            com.paypal.pds.core.Color color = (com.paypal.pds.core.Color) pair.component1();
                            float m8615unboximpl = ((androidx.compose.ui.unit.Dp) pair.component2()).m8615unboximpl();
                            androidx.compose.ui.graphics.Shape roundedCornerShapeFull = com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull();
                            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                            long value = com.paypal.pds.core.Color.BorderFocus.INSTANCE.getValue(startRestartGroup, 6);
                            long value2 = com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE.getValue(startRestartGroup, 6);
                            androidx.compose.ui.text.TextStyle textStyle = com.paypal.pds.core.Typography.BodyMedium.INSTANCE.getTextStyle(startRestartGroup, 6);
                            androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue();
                            androidx.compose.ui.Modifier m22099borderDzVHIIc = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), 0.0f, com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 0.0f, 13, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, roundedCornerShapeFull, startRestartGroup, 432, 0), m8615unboximpl, color, roundedCornerShapeFull, startRestartGroup, 3072, 0);
                            boolean changed3 = startRestartGroup.changed(value);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new androidx.compose.ui.graphics.SolidColor(value, null);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            androidx.compose.ui.graphics.SolidColor solidColor = (androidx.compose.ui.graphics.SolidColor) rememberedValue7;
                            boolean changed4 = startRestartGroup.changed(value2);
                            boolean changed5 = startRestartGroup.changed(textStyle);
                            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if ((changed4 | changed5) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = textStyle.m8065copyp1EtxEg((r48 & 1) != 0 ? textStyle.spanStyle.m7982getColor0d7_KjU() : value2, (r48 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            androidx.compose.ui.text.TextStyle textStyle2 = (androidx.compose.ui.text.TextStyle) rememberedValue8;
                            boolean z = (i3 & 896) == 256;
                            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (z || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function13 = function15;
                                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.SearchKt.$r8$lambda$ZrcI2p8Kwp6wTZYjlb4KfMi1qJw(kotlin.jvm.functions.Function1.this, mutableState, (androidx.compose.ui.text.input.TextFieldValue) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            } else {
                                function13 = function15;
                            }
                            int i11 = i3 << 6;
                            int i12 = (3670016 & i11) | 100663296 | (i11 & 29360128);
                            java.lang.String str7 = str5;
                            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) rememberedValue9, m22099borderDzVHIIc, false, false, textStyle2, keyboardOptions4, keyboardActions4, true, 0, 0, (androidx.compose.ui.text.input.VisualTransformation) null, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, mutableInteractionSource, (androidx.compose.ui.graphics.Brush) solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(614200309, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.pds.components.SearchKt.m21999$r8$lambda$6oeeDwoaBlQ9QXITvL0QTKjZ3s(kotlin.jvm.functions.Function0.this, str5, mutableState, (kotlin.jvm.functions.Function2) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, i12, 199680, 7704);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str4 = str7;
                            function03 = function04;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions4;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            str4 = str2;
                            keyboardActions3 = keyboardActions2;
                            function13 = function12;
                            function03 = function02;
                            keyboardOptions3 = keyboardOptions2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final java.lang.String str8 = str3;
                            final java.lang.String str9 = str4;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.SearchKt.$r8$lambda$VJ75ELN1L2BfvVxuwnPpQHEWgk4(androidx.compose.ui.Modifier.this, str8, function13, function03, keyboardOptions3, keyboardActions3, str9, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    keyboardOptions2 = keyboardOptions;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                keyboardOptions2 = keyboardOptions;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            keyboardOptions2 = keyboardOptions;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        keyboardOptions2 = keyboardOptions;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1093198058);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1093198058, i2, -1, "com.paypal.pds.components.ClearBox (Search.kt:192)");
            }
            if (str.length() > 0) {
                startRestartGroup.startReplaceGroup(1273760225);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 6);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), null, null, true, null, null, function0, startRestartGroup, ((i2 << 15) & 3670016) | 3072, 27), ClearIconTag);
                com.paypal.pds.core.Icon.XCircleFill xCircleFill = com.paypal.pds.core.Icon.XCircleFill.INSTANCE;
                com.paypal.pds.core.Icon.XCircleFill xCircleFill2 = xCircleFill;
                com.paypal.pds.components.IconKt.Icon(xCircleFill2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_clear, startRestartGroup, 0), testTag, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27654, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1274355084);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SearchKt.$r8$lambda$LHShol7gcoXK4i0fAS_BpwvUa20(str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3rkn8hPh_niJzSK8Xkxm9UGRzqA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2079449598);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2079449598, updateChangedFlags, -1, "com.paypal.pds.components.SearchWithLongTextPreview (Search.kt:232)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SearchKt.$r8$lambda$5jRGY7jwWaohOddi2kCVCUBCVFk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Search(m1706padding3ABfNKs, "long search query that displays overflow text here in component", function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, "Search", startRestartGroup, 1576374, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SearchKt.$r8$lambda$3rkn8hPh_niJzSK8Xkxm9UGRzqA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5jRGY7jwWaohOddi2kCVCUBCVFk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$6oeeDwoaBlQ9QXITvL0Q-TKjZ3s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21999$r8$lambda$6oeeDwoaBlQ9QXITvL0QTKjZ3s(final kotlin.jvm.functions.Function0 function0, java.lang.String str, final androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(614200309, i2, -1, "com.paypal.pds.components.Search.<anonymous> (Search.kt:144)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 11, null), com.paypal.pds.core.ConstantsKt.getSize20()), SearchIconTag), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer, 25014, 8);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String str2 = str;
            if (str2 == null || str2.length() == 0 || ((androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue()).getText().length() != 0) {
                i3 = i2;
                composer2 = composer;
                composer2.startReplaceGroup(1549776291);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1549527795);
                i3 = i2;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, ""), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 432, 6, 1016);
                composer.endReplaceGroup();
                composer2 = composer;
            }
            function2.invoke(composer2, java.lang.Integer.valueOf(i3 & 14));
            composer.endNode();
            java.lang.String text = ((androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue()).getText();
            boolean changed = composer2.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.SearchKt.$r8$lambda$uMu1JVGIe81EGenf9gieDuUky_8(kotlin.jvm.functions.Function0.this, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges(text, (kotlin.jvm.functions.Function0) rememberedValue, composer2, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LHShol7gcoXK4i0fAS_BpwvUa20(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Pb0gyaG4DT_I81FY9Ppg-QQs5Dw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22001$r8$lambda$Pb0gyaG4DT_I81FY9PpgQQs5Dw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1593054006);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1593054006, updateChangedFlags, -1, "com.paypal.pds.components.SearchWithKeyboardActionPreview (Search.kt:245)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 119, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SearchKt.$r8$lambda$XIX7AkUYtseQTCOLhOcG5Tygsx4(androidx.compose.runtime.MutableState.this, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue2, null, 47, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SearchKt.$r8$lambda$RByOY3jEQJIgiDL4USlQ_VHAexk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Search(m1706padding3ABfNKs, str, function1, (kotlin.jvm.functions.Function0) rememberedValue4, keyboardOptions, keyboardActions, "Search", startRestartGroup, 1600902, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SearchKt.m22001$r8$lambda$Pb0gyaG4DT_I81FY9PpgQQs5Dw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RByOY3jEQJIgiDL4USlQ_VHAexk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VJ75ELN1L2BfvVxuwnPpQHEWgk4(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Search(modifier, str, function1, function0, keyboardOptions, keyboardActions, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XIX7AkUYtseQTCOLhOcG5Tygsx4(androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        mutableState.setValue("Testing Keyboard Action");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YJbrV8Oz-vL-Fiev1NVMJqTalTM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22002$r8$lambda$YJbrV8OzvLFiev1NVMJqTalTM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZrcI2p8Kwp6wTZYjlb4KfMi1qJw(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        mutableState.setValue(textFieldValue);
        function1.invoke(textFieldValue.getText());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rCXsYh-dCsoUc1K_zosrTmuK_8s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22005$r8$lambda$rCXsYhdCsoUc1K_zosrTmuK_8s(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$uMu1JVGIe81EGenf9gieDuUky_8(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(androidx.compose.ui.text.input.TextFieldValue.m8276copy3r_uNRQ$default((androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue(), "", 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wum4NAXax6uL3vlggCxCwELzEDs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1069551124);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1069551124, updateChangedFlags, -1, "com.paypal.pds.components.SearchWithPlaceHolderPreview (Search.kt:220)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SearchKt.m22002$r8$lambda$YJbrV8OzvLFiev1NVMJqTalTM((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Search(m1706padding3ABfNKs, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, "Search", startRestartGroup, 1576326, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SearchKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SearchKt.$r8$lambda$wum4NAXax6uL3vlggCxCwELzEDs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ androidx.compose.ui.text.input.TextFieldValue access$Search$lambda$5(androidx.compose.runtime.MutableState mutableState) {
        return (androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue();
    }
}
