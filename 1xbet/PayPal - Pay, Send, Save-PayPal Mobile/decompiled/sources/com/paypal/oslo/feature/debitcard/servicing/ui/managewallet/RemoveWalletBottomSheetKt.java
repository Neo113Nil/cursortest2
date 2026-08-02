package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0012"}, d2 = {"RemoveWalletBottomSheet", "", "onClose", "Lkotlin/Function0;", "onCancel", "onConfirm", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;I)V", "RemoveWalletBottomSheetContent", "onAction", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/RemoveWalletAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "trackRemoveWalletAction", "action", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveWalletBottomSheetKt {
    public static final void RemoveWalletBottomSheet(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1686363595);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 2048 : 1024;
        }
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1686363595, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheet (RemoveWalletBottomSheet.kt:62)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048 || ((i2 & 4096) != 0 && startRestartGroup.changedInstance(userIntentContext));
            boolean z3 = (i2 & 14) == 4;
            boolean z4 = (i2 & 112) == 32;
            boolean z5 = (i2 & 896) == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z3 | z2 | z4 | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.m14456$r8$lambda$Nx08PEZsRKTxcInPPUA2BtdrSY(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, function0, function02, function03, (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean visible = bottomSheetController.getVisible();
            boolean changed = startRestartGroup.changed(function1);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$wC3khYK7x4AsEAqsif8DgyHWVjo(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(visible, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (i3 == 2048 || ((i2 & 4096) != 0 && startRestartGroup.changedInstance(userIntentContext))) {
                z = true;
            }
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$RemoveWalletBottomSheet$2$1(userIntentContext, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
            boolean changed2 = startRestartGroup.changed(function1);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$fMWSVg9MXRiiS22Em6_36na9bAk(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue5, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2143179246, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$T_UIjYpi7_zGcrga27CQQjRYuLo(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 << 3) & 112) | com.paypal.pds.components.BottomSheetController.$stable | 817889280 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 312);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$nUsbG8vdwUg4hAZGPstjAsOKgAw(kotlin.jvm.functions.Function0.this, function02, function03, userIntentContext, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1401716810);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1401716810, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetContent (RemoveWalletBottomSheet.kt:104)");
                }
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_remove_confirmation_title, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, 0);
                com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.m14457$r8$lambda$SjXqSf8AmQ2IkTr6y3OdbGnAxE((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1708paddingVpY3zN4$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, startRestartGroup, 384, 6, 1016);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_remove_confirmation_message, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
                composer2 = startRestartGroup;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_remove_confirmation_button, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, composer2, 0);
                int i6 = i4 & 14;
                boolean z = i6 == 4;
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$Ksd0yUFUx754ED1HMwyQCUcsO7Y(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem(stringResource2, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_cancel, composer2, 0);
                boolean z2 = i6 == 4;
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.$r8$lambda$pGf750diNJp36RFt30w_3UH4a9U(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem(stringResource3, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 108, null);
                com.paypal.pds.components.ButtonGroupKt.ButtonGroup(buttonGroupItemArr, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), null, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer2, com.paypal.pds.components.ButtonGroupAlignment.Vertical.$stable << 9, 4);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.m14455$r8$lambda$57G7tCecOnRPYTtofExMVAPwrM(kotlin.jvm.functions.Function1.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-57G7tCecOnRPYTtofExMVAPwrM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14455$r8$lambda$57G7tCecOnRPYTtofExMVAPwrM(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ksd0yUFUx754ED1HMwyQCUcsO7Y(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Confirm);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nx0-8PEZsRKTxcInPPUA2BtdrSY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14456$r8$lambda$Nx08PEZsRKTxcInPPUA2BtdrSY(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction removeWalletAction) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item close_remove_button;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeWalletAction, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[removeWalletAction.ordinal()];
        if (i == 1) {
            close_remove_button = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getCLOSE_REMOVE_BUTTON();
        } else if (i == 2) {
            close_remove_button = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getCANCEL_REMOVE_BUTTON();
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            close_remove_button = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getCONFIRM_REMOVE_BUTTON();
        }
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_REMOVE_BOTTOM_SHEET, close_remove_button, userIntentContext, null, 8, null);
        int i2 = com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[removeWalletAction.ordinal()];
        if (i2 == 1) {
            function0.invoke();
        } else if (i2 == 2) {
            function02.invoke();
        } else {
            if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function03.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SjXqSf8AmQ2IkTr6y3OdbGn-AxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14457$r8$lambda$SjXqSf8AmQ2IkTr6y3OdbGnAxE(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T_UIjYpi7_zGcrga27CQQjRYuLo(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2143179246, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheet.<anonymous> (RemoveWalletBottomSheet.kt:93)");
            }
            getHighResolutionOutputSizeshNQ4ISI(function1, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fMWSVg9MXRiiS22Em6_36na9bAk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Close);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nUsbG8vdwUg4hAZGPstjAsOKgAw(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, androidx.compose.runtime.Composer composer, int i2) {
        RemoveWalletBottomSheet(function0, function02, function03, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pGf750diNJp36RFt30w_3UH4a9U(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Cancel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wC3khYK7x4AsEAqsif8DgyHWVjo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Close);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Close.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Cancel.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.Confirm.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
