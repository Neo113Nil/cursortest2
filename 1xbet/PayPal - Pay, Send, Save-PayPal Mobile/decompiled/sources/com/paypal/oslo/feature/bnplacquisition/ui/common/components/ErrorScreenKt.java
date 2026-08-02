package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\f\u001a\u0089\u0001\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"ErrorScreen", "", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "onButtonClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "onBack", "onClose", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenContent", "avatarIcon", "Lcom/paypal/pds/core/Icon;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "onClick", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolbarTitle", "screenContentDescription", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ErrorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreen(final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(842657097);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fullscreenErrorUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function05 = function03;
                        i3 |= startRestartGroup.changedInstance(function05) ? 131072 : 65536;
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            str3 = str2;
                            function06 = function04;
                            function07 = function05;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str4 = i4 != 0 ? null : str2;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function08 = i5 != 0 ? null : function04;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function09 = i6 != 0 ? null : function05;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(842657097, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreen (ErrorScreen.kt:58)");
                            }
                            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(fullscreenErrorUiModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(fullscreenErrorUiModel.getDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(fullscreenErrorUiModel.getButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(value);
                            sb.append(". ");
                            sb.append(value2);
                            java.lang.String obj = sb.toString();
                            int i8 = i3 << 12;
                            composer2 = startRestartGroup;
                            getHighSpeedVideoFpsRanges(fullscreenErrorUiModel.getIcon(), value, value2, value3, function0, fullscreenErrorUiModel.getToolBarContent(), modifier4, str4, obj, function08, fullscreenErrorUiModel.getShowExitButton() ? function09 : null, startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 15) | ((i3 << 9) & 57344) | (3670016 & i8) | (29360128 & i8) | ((i3 << 15) & 1879048192), 0, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            str3 = str4;
                            function06 = function08;
                            function07 = function09;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.$r8$lambda$XfF43zVMMd_Tiee3liN54Ds0Z_U(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel.this, function0, modifier3, str3, function06, function07, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function05 = function03;
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function04 = function02;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function05 = function03;
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function04 = function02;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function05 = function03;
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function04 = function02;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function05 = function03;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.pds.core.Icon icon, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent, androidx.compose.ui.Modifier modifier, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final java.lang.String str6;
        java.lang.String str7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2113828877);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? startRestartGroup.changed(toolBarContent) : startRestartGroup.changedInstance(toolBarContent) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(str4) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(str5) ? 67108864 : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i10 = i2 | 6;
            } else {
                if ((i2 & 6) != 0) {
                    i9 = i2;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        str6 = str4;
                        str7 = str5;
                        function04 = function02;
                        modifier3 = modifier2;
                        function05 = function03;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion2 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str8 = i5 != 0 ? null : str4;
                        final java.lang.String str9 = i6 != 0 ? null : str5;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function06 = i7 != 0 ? null : function02;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function07 = i8 != 0 ? null : function03;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2113828877, i4, i9, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenContent (ErrorScreen.kt:95)");
                        }
                        if (str9 != null) {
                            startRestartGroup.startReplaceGroup(266008929);
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                            boolean z = (234881024 & i4) == 67108864;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.m12326$r8$lambda$EcfHHplqc0up4JQ3ttvzLsba7A(str9, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            str7 = str9;
                            obj = null;
                            companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion3, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            str7 = str9;
                            obj = null;
                            startRestartGroup.startReplaceGroup(266096349);
                            startRestartGroup.endReplaceGroup();
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj)).then(companion), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "error_screen_container");
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        androidx.compose.ui.Modifier modifier4 = companion2;
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(com.paypal.oslo.core.commonui.utils.RefTextKt.value(toolBarContent.getBackButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(toolBarContent.getCloseButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16()), str8, function06, function07, false, startRestartGroup, ((i4 >> 12) & 7168) | ((i4 >> 15) & 57344) | ((i9 << 15) & 458752), 64);
                        androidx.compose.ui.Modifier align = boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
                        int i12 = i4 << 6;
                        com.paypal.pds.components.EmptyStateKt.EmptyState(icon, align, null, str, str2, str3, function0, startRestartGroup, (i4 & 14) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016), 4);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function05 = function07;
                        str6 = str8;
                        modifier3 = modifier4;
                        function04 = function06;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final java.lang.String str10 = str7;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function04;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function05;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.m12328$r8$lambda$Y5T6EQDveBfDKooxTtrGWfmW2Q(com.paypal.pds.core.Icon.this, str, str2, str3, function0, toolBarContent, modifier3, str6, str10, function08, function09, i, i2, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i10 = i2 | (startRestartGroup.changedInstance(function03) ? 4 : 2);
            }
            i9 = i10;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i9 = i10;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$EcfHHplqc0up4JQ3tt-vzLsba7A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12326$r8$lambda$EcfHHplqc0up4JQ3ttvzLsba7A(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GbJx-oH-7wyJenhWZlJ7ibdPE-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12327$r8$lambda$GbJxoH7wyJenhWZlJ7ibdPEw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(801246183);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(801246183, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenPreview (ErrorScreen.kt:141)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Something went wrong"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("We're having some difficulty completing your request at the moment."), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.RETRY_BUTTON_TEXT), com.paypal.pds.core.Icon.NoIcon.INSTANCE, true, false, false, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_BACK_BUTTON), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_CLOSE)));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ErrorScreen(fullscreenErrorUiModel, function0, null, "Title", (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 27696, 36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ErrorScreenKt.m12327$r8$lambda$GbJxoH7wyJenhWZlJ7ibdPEw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XfF43zVMMd_Tiee3liN54Ds0Z_U(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreen(fullscreenErrorUiModel, function0, modifier, str, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y5T6EQ-DveBfDKooxTtrGWfmW2Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12328$r8$lambda$Y5T6EQDveBfDKooxTtrGWfmW2Q(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent, androidx.compose.ui.Modifier modifier, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoFpsRanges(icon, str, str2, str3, function0, toolBarContent, modifier, str4, str5, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
