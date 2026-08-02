package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001aQ\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a7\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"LabelView", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "labelCustomization", "Lcom/paypal/android/threeds/ui/customization/LabelCustomization;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/android/threeds/ui/customization/LabelCustomization;Landroidx/compose/runtime/Composer;II)V", "LabelHeaderView", "TextBoxView", "textState", "onInputChanged", "Lkotlin/Function1;", "hintText", "textBoxCustomization", "Lcom/paypal/android/threeds/ui/customization/TextBoxCustomization;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/paypal/android/threeds/ui/customization/TextBoxCustomization;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/runtime/Composer;II)V", "ButtonView", "buttonCustomization", "Lcom/paypal/android/threeds/ui/customization/ButtonCustomization;", "buttonOnClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/android/threeds/ui/customization/ButtonCustomization;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OutlinedButtonView", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsCustomViewsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LabelView(final java.lang.String str, androidx.compose.ui.Modifier modifier, final com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2091884868);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(labelCustomization) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2091884868, i3, -1, "com.paypal.android.threeds.ui.LabelView (ThreeDsCustomViews.kt:52)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization2 = labelCustomization == null ? new com.paypal.android.threeds.ui.customization.LabelCustomization() : labelCustomization;
                long m11048getTextSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11048getTextSizekPz2Gy4(labelCustomization2);
                long m11047getTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11047getTextColorvNxB06k(labelCustomization2);
                androidx.compose.ui.text.font.FontFamily fontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getFontFromResource(context, labelCustomization2);
                java.lang.String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    startRestartGroup.startReplaceGroup(633829203);
                    androidx.compose.material.TextKt.m2830Text4IGK_g(str, modifier4, m11047getTextColorvNxB06k, m11048getTextSizekPz2Gy4, (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW400(), fontFromResource, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112), 0, 130960);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(634037926);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.m10994$r8$lambda$3XnqAbE479EmgpjXYwSyZ_kg6o(str, modifier3, labelCustomization, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LabelHeaderView(final java.lang.String str, androidx.compose.ui.Modifier modifier, final com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1132096303);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(labelCustomization) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1132096303, i3, -1, "com.paypal.android.threeds.ui.LabelHeaderView (ThreeDsCustomViews.kt:75)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization2 = labelCustomization == null ? new com.paypal.android.threeds.ui.customization.LabelCustomization() : labelCustomization;
                long m11041getLabelHeadingTextSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11041getLabelHeadingTextSizekPz2Gy4(labelCustomization2);
                long m11040getLabelHeadingTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11040getLabelHeadingTextColorvNxB06k(labelCustomization2);
                androidx.compose.ui.text.font.FontFamily headingFontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getHeadingFontFromResource(context, labelCustomization2);
                java.lang.String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    startRestartGroup.startReplaceGroup(-2096700848);
                    androidx.compose.material.TextKt.m2830Text4IGK_g(str, modifier4, m11040getLabelHeadingTextColorvNxB06k, m11041getLabelHeadingTextSizekPz2Gy4, (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500(), headingFontFromResource, 0L, (androidx.compose.ui.text.style.TextDecoration) null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112), 0, 130448);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-2096445997);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$OrGnzaSer1FC4UIzGC7RUidY53Y(str, modifier3, labelCustomization, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextBoxView(androidx.compose.ui.Modifier modifier, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, java.lang.String str2, final com.paypal.android.threeds.ui.customization.TextBoxCustomization textBoxCustomization, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final java.lang.String str3;
        int i4;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str4;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-42313547);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str2;
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(textBoxCustomization) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                keyboardOptions2 = keyboardOptions;
                i3 |= startRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str4 = str3;
                    keyboardOptions3 = keyboardOptions2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        str3 = "";
                    }
                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i4 != 0 ? new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null) : keyboardOptions2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-42313547, i5, -1, "com.paypal.android.threeds.ui.TextBoxView (ThreeDsCustomViews.kt:102)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    com.paypal.android.threeds.ui.customization.TextBoxCustomization textBoxCustomization2 = textBoxCustomization == null ? new com.paypal.android.threeds.ui.customization.TextBoxCustomization() : textBoxCustomization;
                    long m11043getTextBoxBorderColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11043getTextBoxBorderColorvNxB06k(textBoxCustomization2);
                    float m11045getTextBoxCornerRadiusu2uoSUM = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11045getTextBoxCornerRadiusu2uoSUM(textBoxCustomization2);
                    final long m11046getTextBoxHintColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11046getTextBoxHintColorvNxB06k(textBoxCustomization2);
                    com.paypal.android.threeds.ui.customization.TextBoxCustomization textBoxCustomization3 = textBoxCustomization2;
                    long m11047getTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11047getTextColorvNxB06k(textBoxCustomization3);
                    float m11044getTextBoxBorderWidthu2uoSUM = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11044getTextBoxBorderWidthu2uoSUM(textBoxCustomization2);
                    long m11048getTextSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11048getTextSizekPz2Gy4(textBoxCustomization3);
                    final androidx.compose.ui.text.font.FontFamily fontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getFontFromResource(context, textBoxCustomization3);
                    boolean changedInstance = startRestartGroup.changedInstance(context);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$l38XI9X61SGgXHb62sQD9B5elpI(context, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.Modifier m1297borderxT4_qwU = androidx.compose.foundation.BorderKt.m1297borderxT4_qwU(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier4, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), 0.0f, 1, null), m11044getTextBoxBorderWidthu2uoSUM, m11043getTextBoxBorderColorvNxB06k, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(m11045getTextBoxCornerRadiusu2uoSUM));
                    m8065copyp1EtxEg = r25.m8065copyp1EtxEg((r48 & 1) != 0 ? r25.spanStyle.m7982getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r25.spanStyle.getFontSize() : m11048getTextSizekPz2Gy4, (r48 & 4) != 0 ? r25.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r25.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r25.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r25.spanStyle.getFontFamily() : fontFromResource, (r48 & 64) != 0 ? r25.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r25.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r25.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r25.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r25.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r25.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r25.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r25.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r25.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r25.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r25.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r25.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r25.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r25.platformStyle : null, (r48 & 1048576) != 0 ? r25.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r25.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r25.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault().paragraphStyle.getTextMotion() : null);
                    androidx.compose.material.TextFieldColors m2814outlinedTextFieldColorsdx8h9Zs = androidx.compose.material.TextFieldDefaults.INSTANCE.m2814outlinedTextFieldColorsdx8h9Zs(m11047getTextColorvNxB06k, 0L, 0L, m11047getTextColorvNxB06k, 0L, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1769472, 0, 48, 2097046);
                    androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-782971792, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$tmxRtZHAsL18heTfMtpVQ0SBYZA(str3, m11046getTextBoxHintColorvNxB06k, fontFromResource, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54);
                    int i8 = i5 >> 3;
                    java.lang.String str5 = str3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    androidx.compose.material.TextFieldKt.TextField(str, function1, m1297borderxT4_qwU, false, false, m8065copyp1EtxEg, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) rememberComposableLambda, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, false, (androidx.compose.ui.text.input.VisualTransformation) null, keyboardOptions4, (androidx.compose.foundation.text.KeyboardActions) null, true, 0, 0, (androidx.compose.foundation.interaction.MutableInteractionSource) null, (androidx.compose.ui.graphics.Shape) null, m2814outlinedTextFieldColorsdx8h9Zs, composer2, (i8 & 14) | 12582912 | (i8 & 112), ((i5 >> 9) & 896) | 24576, 503640);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    modifier3 = modifier5;
                    keyboardOptions3 = keyboardOptions4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$2NWwYxEwtGf9TmPUSQPLVJtHmiI(androidx.compose.ui.Modifier.this, str, function1, str4, textBoxCustomization, keyboardOptions3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            keyboardOptions2 = keyboardOptions;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str2;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        keyboardOptions2 = keyboardOptions;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonView(final java.lang.String str, androidx.compose.ui.Modifier modifier, final com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1404625770);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(buttonCustomization) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1404625770, i4, -1, "com.paypal.android.threeds.ui.ButtonView (ThreeDsCustomViews.kt:148)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization2 = buttonCustomization == null ? new com.paypal.android.threeds.ui.customization.ButtonCustomization() : buttonCustomization;
                long m11037getButtonBackgroundColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11037getButtonBackgroundColorvNxB06k(buttonCustomization2);
                float m11038getButtonCornerRadiusu2uoSUM = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11038getButtonCornerRadiusu2uoSUM(buttonCustomization2);
                com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization3 = buttonCustomization2;
                final androidx.compose.ui.text.font.FontFamily fontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getFontFromResource(context, buttonCustomization3);
                final long m11048getTextSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11048getTextSizekPz2Gy4(buttonCustomization3);
                final long m11039getButtonTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11039getButtonTextColorvNxB06k(buttonCustomization2);
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                androidx.compose.material.ButtonKt.Button(function0, androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11023getThree_ds_margin_48D9Ej5fM(), 1, null), false, null, null, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(m11038getButtonCornerRadiusu2uoSUM), null, androidx.compose.material.ButtonDefaults.INSTANCE.m2523buttonColorsro_MJ88(m11037getButtonBackgroundColorvNxB06k, 0L, 0L, 0L, startRestartGroup, androidx.compose.material.ButtonDefaults.$stable << 12, 14), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2004497754, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$X3WONDXlJAhp9FRukUkMtWBHYZU(m11039getButtonTextColorvNxB06k, m11048getTextSizekPz2Gy4, fontFromResource, str, (androidx.compose.foundation.layout.RowScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306368, 348);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.m10995$r8$lambda$ZNIQRupF_FeWVA5OI0pXMln0(str, modifier3, buttonCustomization, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButtonView(final java.lang.String str, androidx.compose.ui.Modifier modifier, final com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(643267736);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(buttonCustomization) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(643267736, i4, -1, "com.paypal.android.threeds.ui.OutlinedButtonView (ThreeDsCustomViews.kt:186)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization2 = buttonCustomization == null ? new com.paypal.android.threeds.ui.customization.ButtonCustomization() : buttonCustomization;
                long m11037getButtonBackgroundColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11037getButtonBackgroundColorvNxB06k(buttonCustomization2);
                float m11038getButtonCornerRadiusu2uoSUM = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11038getButtonCornerRadiusu2uoSUM(buttonCustomization2);
                com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization3 = buttonCustomization2;
                final androidx.compose.ui.text.font.FontFamily fontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getFontFromResource(context, buttonCustomization3);
                final long m11048getTextSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11048getTextSizekPz2Gy4(buttonCustomization3);
                final long m11039getButtonTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11039getButtonTextColorvNxB06k(buttonCustomization2);
                modifier2 = modifier3;
                composer2 = startRestartGroup;
                androidx.compose.material.ButtonKt.OutlinedButton(function0, androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11023getThree_ds_margin_48D9Ej5fM(), 1, null), false, null, null, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(m11038getButtonCornerRadiusu2uoSUM), androidx.compose.foundation.BorderStrokeKt.m1312BorderStrokecXLIe8U(com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11004getThree_ds_margin_1D9Ej5fM(), m11037getButtonBackgroundColorvNxB06k), androidx.compose.material.ButtonDefaults.INSTANCE.m2531outlinedButtonColorsRGew2ao(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), 0L, 0L, startRestartGroup, (androidx.compose.material.ButtonDefaults.$stable << 9) | 6, 6), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2010535526, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.m10996$r8$lambda$kX0oSDWogsIhOmfEJ1DEjg7U1U(m11039getButtonTextColorvNxB06k, m11048getTextSizekPz2Gy4, fontFromResource, str, (androidx.compose.foundation.layout.RowScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306368, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            final androidx.compose.ui.Modifier modifier4 = modifier2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsCustomViewsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.ThreeDsCustomViewsKt.$r8$lambda$m4zMYVga2qwvZOax7ELJcwpHBmo(str, modifier4, buttonCustomization, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        final androidx.compose.ui.Modifier modifier42 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2NWwYxEwtGf9TmPUSQPLVJtHmiI(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String str2, com.paypal.android.threeds.ui.customization.TextBoxCustomization textBoxCustomization, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TextBoxView(modifier, str, function1, str2, textBoxCustomization, keyboardOptions, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3Xn-qAbE479EmgpjXYwSyZ_kg6o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10994$r8$lambda$3XnqAbE479EmgpjXYwSyZ_kg6o(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LabelView(str, modifier, labelCustomization, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OrGnzaSer1FC4UIzGC7RUidY53Y(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.android.threeds.ui.customization.LabelCustomization labelCustomization, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LabelHeaderView(str, modifier, labelCustomization, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X3WONDXlJAhp9FRukUkMtWBHYZU(long j, long j2, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2004497754, i, -1, "com.paypal.android.threeds.ui.ButtonView.<anonymous> (ThreeDsCustomViews.kt:167)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(str, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, new androidx.compose.ui.text.TextStyle(j, j2, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777176, (kotlin.jvm.internal.DefaultConstructorMarker) null), composer, 0, 0, org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZNIQRup-F_FeWVA5OI0pXMl--n0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10995$r8$lambda$ZNIQRupF_FeWVA5OI0pXMln0(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ButtonView(str, modifier, buttonCustomization, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kX0oSDWogsIhOmfEJ1DEjg-7U1U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10996$r8$lambda$kX0oSDWogsIhOmfEJ1DEjg7U1U(long j, long j2, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2010535526, i, -1, "com.paypal.android.threeds.ui.OutlinedButtonView.<anonymous> (ThreeDsCustomViews.kt:206)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(str, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, new androidx.compose.ui.text.TextStyle(j, j2, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777176, (kotlin.jvm.internal.DefaultConstructorMarker) null), composer, 0, 0, org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l38XI9X61SGgXHb62sQD9B5elpI(android.content.Context context, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        java.lang.String string = context.getString(com.paypal.android.threeds.R.string.text_field);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, string);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m4zMYVga2qwvZOax7ELJcwpHBmo(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.android.threeds.ui.customization.ButtonCustomization buttonCustomization, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OutlinedButtonView(str, modifier, buttonCustomization, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tmxRtZHAsL18heTfMtpVQ0SBYZA(java.lang.String str, long j, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-782971792, i, -1, "com.paypal.android.threeds.ui.TextBoxView.<anonymous> (ThreeDsCustomViews.kt:124)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(str, (androidx.compose.ui.Modifier) null, j, 0L, (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW400(), fontFamily, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 130970);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
