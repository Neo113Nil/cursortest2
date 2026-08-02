package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001aS\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001a_\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0002\u0010\u0017\u001a \u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002\u001a\r\u0010\u001c\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"toPdsIcon", "Lcom/paypal/pds/core/Icon;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/StepIcon;", "LongTermUrlTag", "", "ShortTermUrlTag", "HowItWorksBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksUiModel;", "imageUrl", "footerText", "onLongTermUrlClick", "Lkotlin/Function0;", "onShortTermUrlClick", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksUiModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HowItWorksContent", "imagePainter", "Landroidx/compose/ui/graphics/painter/Painter;", "onCloseClick", "onGotItClick", "(Landroidx/compose/ui/graphics/painter/Painter;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksUiModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "buildFooterRichText", "Lcom/paypal/pds/core/RichText;", "payMonthlyLabel", "payIn4Label", "HowItWorksContentUsPreview", "(Landroidx/compose/runtime/Composer;I)V", "HowItWorksContentDePreview", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HowItWorksBottomSheetKt {
    private static final com.paypal.pds.core.Icon getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon stepIcon) {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[stepIcon.ordinal()];
        if (i == 1) {
            return com.paypal.pds.core.Icon.Card.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.pds.core.Icon.Mobile.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.pds.core.Icon.Contactless.INSTANCE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.core.Icon.NoIcon.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HowItWorksBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final java.lang.String str5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        java.lang.String str6;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(howItWorksUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-299516951);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(howItWorksUiModel) : startRestartGroup.changedInstance(howItWorksUiModel) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function03 = function0;
                    i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function04 = function02;
                        i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            str4 = str3;
                            function05 = function03;
                            function06 = function04;
                            str5 = str2;
                        } else {
                            if (i8 != 0) {
                                str3 = null;
                            }
                            java.lang.String str7 = i4 != 0 ? "" : str2;
                            if (i5 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function07 = function03;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function08 = function04;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-299516951, i7, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheet (HowItWorksBottomSheet.kt:101)");
                            }
                            if (str3 == null) {
                                startRestartGroup.startReplaceGroup(2032848658);
                                startRestartGroup.endReplaceGroup();
                                str6 = str3;
                                z = true;
                            } else {
                                startRestartGroup.startReplaceGroup(2032848659);
                                str6 = str3;
                                z = true;
                                com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str3).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
                                r1 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(rememberAsyncImagePainter.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success ? rememberAsyncImagePainter : null;
                                startRestartGroup.endReplaceGroup();
                            }
                            final java.lang.String str8 = str7;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function07;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function08;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(374115266, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$bMvF7KnDZjVOy077XbL3lqmCYxU(com.paypal.oslo.core.commonui.components.AsyncImagePainter.this, howItWorksUiModel, str8, function09, function010, bottomSheetController, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i7 & 14), 510);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str4 = str6;
                            str5 = str7;
                            function05 = function07;
                            function06 = function08;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.m12335$r8$lambda$9QbkmotOe4pnfap7Q_92mCGjAQ(com.paypal.pds.components.BottomSheetController.this, howItWorksUiModel, str4, str5, function05, function06, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function04 = function02;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function03 = function0;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function04 = function02;
                i7 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function03 = function0;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function04 = function02;
            i7 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function03 = function0;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function04 = function02;
        i7 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.graphics.painter.Painter painter, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        int i3;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent howItWorksContent;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1509952788);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(howItWorksUiModel) : startRestartGroup.changedInstance(howItWorksUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1509952788, i4, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent (HowItWorksBottomSheet.kt:138)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent content = howItWorksUiModel.getContent();
            final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig config = howItWorksUiModel.getConfig();
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(content.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(content.getStep1Title(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(content.getStep2Title(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(content.getStep3Title(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.weight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1973RoundedCornerShapea9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing32(), com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 0.0f, 12, null));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clip);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (painter != null) {
                startRestartGroup.startReplaceGroup(5586951);
                i3 = i4;
                howItWorksContent = content;
                boxScopeInstance = boxScopeInstance2;
                com.paypal.pds.components.ImageKt.Image(painter, com.paypal.oslo.core.commonui.utils.RefTextKt.value(content.getImageContentDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, com.paypal.pds.components.ImageCornerRadius.None, com.paypal.pds.components.ImageAspectRatio.Landscape4x3, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 221568 | (i3 & 14), 72);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                boxScopeInstance = boxScopeInstance2;
                i3 = i4;
                howItWorksContent = content;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(5944040);
                composer2.endReplaceGroup();
            }
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            com.paypal.pds.components.ButtonStyle buttonStyle = painter != null ? com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE : com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            java.lang.String value5 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent.getCloseContentDescription(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.pds.core.ConstantsKt.getSpacing16());
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.m12336$r8$lambda$Bllx0oo2B9bZaugF6pw1r0lNp8((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(xMark, function03, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), buttonStyle, small, value5, null, false, false, composer2, ((i3 >> 12) & 112) | 24582, 448);
            composer2.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            com.paypal.pds.components.HeaderKt.Header(value, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), (java.lang.String) null, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, 24576, 108);
            final java.lang.String value6 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent.getBadge1(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            final java.lang.String value7 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent.getBadge2(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            final java.lang.String value8 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent.getBadge3(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(companion, com.paypal.pds.core.ConstantsKt.getSpacing16(), config.getSmallPaddingFromHeaderToList() ? com.paypal.pds.core.ConstantsKt.getSpacing8() : com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent howItWorksContent2 = howItWorksContent;
            androidx.compose.runtime.Composer composer3 = composer2;
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(value2, null, null, null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(72282559, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$hl3CUQlczRhZu03C1cDS23h3UYw(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig.this, value6, howItWorksContent2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), null, null, null, false, null, null, null, null, null, false, composer3, 100663296, 0, 524030);
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(value3, null, null, null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1164840408, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$ZKf5szUhe_DP2ZOceVlRaZNoehc(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig.this, value7, howItWorksContent2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), null, null, null, false, null, null, null, null, null, false, composer3, 100663296, 0, 524030);
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(value4, null, null, null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-640034297, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$1B3t9O9JfWiZmP6bIizcGPGXMAw(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig.this, value8, howItWorksContent2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), null, null, null, false, null, null, null, null, null, false, composer3, 100663296, 0, 524030);
            composer2.endNode();
            if (str.length() > 0) {
                composer2.startReplaceGroup(-123411979);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                final java.lang.String value9 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent2.getPayMonthlyLabel(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                final java.lang.String value10 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent2.getPayIn4Label(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                com.paypal.pds.core.RichText invoke = com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$0xeAcUsi7VsUDCSw4asfdJLHmK8(str, value9, value10, (com.paypal.pds.core.Builder) obj);
                    }
                });
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                boolean z = (i3 & 7168) == 2048;
                boolean z2 = (57344 & i3) == 16384;
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if ((z2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$ruHD6W6jL6E1W4wOXh7JqvyzRR4(kotlin.jvm.functions.Function0.this, function02, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, m1708paddingVpY3zN4$default, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, null, null, composer2, 0, 0, 7164);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-122753694);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function04, com.paypal.oslo.core.commonui.utils.RefTextKt.value(howItWorksContent2.getGotItButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i3 >> 18) & 14) | 1769472, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$3IP9vWudzG59M9J0xRbNyoxBhkc(androidx.compose.ui.graphics.painter.Painter.this, howItWorksUiModel, str, function0, function02, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0xeAcUsi7VsUDCSw4asfdJLHmK8(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default >= 0) {
            java.lang.String substring = str.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            com.paypal.pds.core.Builder.append$default(builder, substring, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
            builder.appendLink(str2, "long_term_url");
            str = str.substring(indexOf$default + str2.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str3, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default2 >= 0) {
            java.lang.String substring2 = str.substring(0, indexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
            builder.appendLink(str3, "short_term_url");
            str = str.substring(indexOf$default2 + str3.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        java.lang.String str4 = str;
        if (str4.length() > 0) {
            com.paypal.pds.core.Builder.append$default(builder, str4, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1B3t9O9JfWiZmP6bIizcGPGXMAw(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig howItWorksUiConfig, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent howItWorksContent, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-640034297, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowItWorksBottomSheet.kt:256)");
            }
            if (howItWorksUiConfig.getUseNumericBadges()) {
                composer.startReplaceGroup(-1901852330);
                com.paypal.pds.components.BadgeKt.BadgeNumeric(str, null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeSize.Small.INSTANCE, composer, 3456, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1901588086);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(getHighSpeedVideoSizes(howItWorksContent.getStepIcon3())), null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3IP9vWudzG59M9J0xRbNyoxBhkc(androidx.compose.ui.graphics.painter.Painter painter, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(painter, howItWorksUiModel, str, function0, function02, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9QbkmotOe4pnfap7Q_92mC-GjAQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12335$r8$lambda$9QbkmotOe4pnfap7Q_92mCGjAQ(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HowItWorksBottomSheet(bottomSheetController, howItWorksUiModel, str, str2, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Bllx0oo2B9b-ZaugF6pw1r0lNp8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12336$r8$lambda$Bllx0oo2B9bZaugF6pw1r0lNp8(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, -1.0f);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IqarVoEfWDJ3aYM7jk5tZleJ-Nw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12337$r8$lambda$IqarVoEfWDJ3aYM7jk5tZleJNw(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PLrcejIdvcpHdAvo4jFoRVuKYHs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1615258899);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1615258899, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentDePreview (HowItWorksBottomSheet.kt:380)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("How it works"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Apply for a Ratenzahlung To Go digital card to pay for a single purchase in store."), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Add the digital card to your phone's wallet and shop within 48 hours."), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Hold your phone to the card reader to pay."), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("How it works illustration"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_CLOSE), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Got it"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Card, com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Mobile, com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Contactless, 1024, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig(true, false));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda8
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i5 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i6 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i7 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i8 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i9 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i10 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i11 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i12 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            getHighResolutionOutputSizeshNQ4ISI(null, howItWorksUiModel, "", function0, function02, function03, function04, startRestartGroup, (((((((((((((i3 | i4) | i5) | i6) | i7) | i8) | i9) | i10) | i11) | i12) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 1797510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$PLrcejIdvcpHdAvo4jFoRVuKYHs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZKf5szUhe_DP2ZOceVlRaZNoehc(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig howItWorksUiConfig, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent howItWorksContent, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1164840408, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowItWorksBottomSheet.kt:238)");
            }
            if (howItWorksUiConfig.getUseNumericBadges()) {
                composer.startReplaceGroup(1575219605);
                com.paypal.pds.components.BadgeKt.BadgeNumeric(str, null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeSize.Small.INSTANCE, composer, 3456, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1575483849);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(getHighSpeedVideoSizes(howItWorksContent.getStepIcon2())), null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZyMUeFqTcxNBp3KPipqbTBQkcbk(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bMvF7KnDZjVOy077XbL3lqmCYxU(com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(374115266, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheet.<anonymous> (HowItWorksBottomSheet.kt:115)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter2 = asyncImagePainter;
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$ZyMUeFqTcxNBp3KPipqbTBQkcbk(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.m12337$r8$lambda$IqarVoEfWDJ3aYM7jk5tZleJNw(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
            int i2 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i5 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i6 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i7 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i8 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i9 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i10 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i11 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            getHighResolutionOutputSizeshNQ4ISI(asyncImagePainter2, howItWorksUiModel, str, function0, function02, function03, function04, composer, ((((((((((((i2 | i3) | i4) | i5) | i6) | i7) | i8) | i9) | i10) | i11) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hl3CUQlczRhZu03C1cDS23h3UYw(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig howItWorksUiConfig, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent howItWorksContent, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(72282559, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowItWorksBottomSheet.kt:220)");
            }
            if (howItWorksUiConfig.getUseNumericBadges()) {
                composer.startReplaceGroup(1591162526);
                com.paypal.pds.components.BadgeKt.BadgeNumeric(str, null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeSize.Small.INSTANCE, composer, 3456, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1591426770);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(getHighSpeedVideoSizes(howItWorksContent.getStepIcon1())), null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ruHD6W6jL6E1W4wOXh7JqvyzRR4(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "long_term_url")) {
            function0.invoke();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "short_term_url")) {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sMjLP3nholyy_I6hgQXSqYIrsF8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(915455370);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(915455370, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentUsPreview (HowItWorksBottomSheet.kt:343)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel howItWorksUiModel = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiModel(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("How it works"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Step 1: Find the PayPal option at checkout"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Step 2: Choose your plan"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Step 3: Complete your purchase"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("How it works illustration"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.knotapi.knot.utilities.Constants.META_CLOSE), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Pay Monthly"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanTestTag.PAYMENT_PLAN), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Got it"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("See more about Pay Monthly"), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("1"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), null, null, null, 115712, null), new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig(false, false, 2, null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda17
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            int i3 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i4 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i5 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i6 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i7 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i8 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i9 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i10 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i11 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            int i12 = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            getHighResolutionOutputSizeshNQ4ISI(null, howItWorksUiModel, "See more about Pay Monthly and Pay in 4", function0, function02, function03, function04, startRestartGroup, (((((((((((((i3 | i4) | i5) | i6) | i7) | i8) | i9) | i10) | i11) | i12) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 1797510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksBottomSheetKt.$r8$lambda$sMjLP3nholyy_I6hgQXSqYIrsF8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Card.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Mobile.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.Contactless.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.None.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
