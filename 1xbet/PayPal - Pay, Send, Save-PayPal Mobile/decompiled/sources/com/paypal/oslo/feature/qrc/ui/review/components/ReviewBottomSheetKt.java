package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"ReviewBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onDismiss", "Lkotlin/Function0;", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "primaryButtonText", "onPrimaryButtonClick", "secondaryButtonText", "onSecondaryButtonClick", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LowBalanceBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "NoPaymentMethodBottomSheetPreview", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str4, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(219707985);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(str4) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                function04 = function03;
                i3 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    str5 = str4;
                    function05 = function04;
                } else {
                    final java.lang.String str6 = i5 != 0 ? null : str4;
                    if (i4 != 0) {
                        function04 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(219707985, i3, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheet (ReviewBottomSheet.kt:64)");
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function04;
                    int i6 = i3 << 6;
                    java.lang.String str7 = str6;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, str, str2, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1111689706, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$0qAxe9xml4Wtgl25ToUC5ZPyWuc(kotlin.jvm.functions.Function0.this, str3, str6, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 918552576 | (i3 & 14) | (i3 & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | (57344 & i6) | (458752 & i6) | ((i3 << 15) & 3670016), 8);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function05 = function06;
                    str5 = str7;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$1z6WVZaibgM3bZSI23SpLre5IwA(com.paypal.pds.components.BottomSheetController.this, function0, str, str2, str3, function02, str5, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function04 = function03;
            if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        function04 = function03;
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0qAxe9xml4Wtgl25ToUC5ZPyWuc(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1111689706, i, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheet.<anonymous> (ReviewBottomSheet.kt:75)");
            }
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1707paddingVpY3zN4);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769856, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            if (str2 == null || function02 == null) {
                composer.startReplaceGroup(550876974);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(550595928);
                com.paypal.pds.components.ButtonKt.Button(function02, str2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769856, 408);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1z6WVZaibgM3bZSI23SpLre5IwA(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function02, java.lang.String str4, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewBottomSheet(bottomSheetController, function0, str, str2, str3, function02, str4, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ObqC07rYSPvd-kYvhaGY-w9tUY8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17856$r8$lambda$ObqC07rYSPvdkYvhaGYw9tUY8(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UM7R2gE5T1Lm40t225YjixtlQfQ(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xs3RiRIji9MEbdhCAjvGLmH9DXc(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aMQjrCZirkOfAFfQKMBJxBHMpbA(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gi0iX6W3GnzAQRzik4w1cldyA7Y(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jPUYJFq657P43Cb83TC1KZ0GXq4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(529991883);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(529991883, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.NoPaymentMethodBottomSheetPreview (ReviewBottomSheet.kt:130)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$NoPaymentMethodBottomSheetPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$Xs3RiRIji9MEbdhCAjvGLmH9DXc(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_title_payment_method_needed, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_desc_payment_method_needed, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_button_add_payment_method, startRestartGroup, 0);
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$aMQjrCZirkOfAFfQKMBJxBHMpbA(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ReviewBottomSheet(bottomSheetController, function0, stringResource, stringResource2, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue4, null, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$jPUYJFq657P43Cb83TC1KZ0GXq4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tkbjQYsq4epyMDYxYCKDCgy8eC0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1257116979);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1257116979, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.LowBalanceBottomSheetPreview (ReviewBottomSheet.kt:107)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$LowBalanceBottomSheetPreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.m17856$r8$lambda$ObqC07rYSPvdkYvhaGYw9tUY8(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_title_low_balance, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_desc_low_balance, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_button_add_payment_method, startRestartGroup, 0);
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$UM7R2gE5T1Lm40t225YjixtlQfQ(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_top_up_balance, startRestartGroup, 0);
            boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$gi0iX6W3GnzAQRzik4w1cldyA7Y(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ReviewBottomSheet(bottomSheetController, function0, stringResource, stringResource2, stringResource3, function02, stringResource4, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.$r8$lambda$tkbjQYsq4epyMDYxYCKDCgy8eC0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
