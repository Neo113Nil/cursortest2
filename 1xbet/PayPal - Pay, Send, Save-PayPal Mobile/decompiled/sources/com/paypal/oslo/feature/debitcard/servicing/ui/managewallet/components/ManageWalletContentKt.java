package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001aM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"ManageWalletContent", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "displayProductName", "", "walletInstruments", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "onConfirmDevice", "Lkotlin/Function1;", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;", "onRemoveClick", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "modifier", "Landroidx/compose/ui/Modifier;", "showWidget", "", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ManageWalletSection", "instrument", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletContentKt {
    public static final void ManageWalletContent(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final java.lang.String str, final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>> function1, final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageWalletViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(12913557);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(appNavigator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(manageWalletViewModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (i & 16777216) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
        }
        int i5 = i2 & 512;
        if (i5 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            z2 = i5 != 0 ? true : z;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(12913557, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContent (ManageWalletContent.kt:76)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            androidx.compose.ui.Modifier modifier4 = modifier3;
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
            boolean z3 = (29360128 & i3) == 8388608 || ((i3 & 16777216) != 0 && startRestartGroup.changedInstance(userIntentContext));
            boolean changedInstance = startRestartGroup.changedInstance(manageWalletViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.m14458$r8$lambda$DkXJy66_v1d0jAZ9EwNFWVg5LU(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, manageWalletViewModel);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i6 = i3;
            com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(null, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toolbar_back_button, startRestartGroup, 0)), null, 5, null), com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_screen_title, new java.lang.Object[]{str}, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
            boolean z4 = true;
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            boolean z5 = false;
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
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(957191090);
            for (final com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument : list) {
                kotlin.jvm.functions.Function0<kotlin.Unit> invoke = function1.invoke(walletInstrument);
                boolean z6 = (i6 & 3670016) == 1048576 ? z4 : z5;
                boolean changedInstance2 = startRestartGroup.changedInstance(walletInstrument);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z6 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.$r8$lambda$c71627E9G_9nPtSHb12wkWZ5JVg(kotlin.jvm.functions.Function1.this, walletInstrument);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                int i7 = i6 >> 9;
                Camera2StreamConfigurationMap(walletInstrument, invoke, manageWalletViewModel, function0, userIntentContext, null, startRestartGroup, (i7 & 896) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 12) | (i7 & 57344), 32);
                z5 = z5;
                z4 = true;
            }
            startRestartGroup.endReplaceGroup();
            if (z2) {
                startRestartGroup.startReplaceGroup(-391401717);
                composer2 = startRestartGroup;
                modifier2 = modifier4;
                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSectionKt.PushProvisioningSection(appNavigator, debitCardProductName, manageWalletViewModel, null, composer2, (i6 & 126) | ((i6 >> 9) & 896), 8);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                modifier2 = modifier4;
                composer2.startReplaceGroup(-391203751);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier5 = modifier2;
            final boolean z7 = z2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.m14459$r8$lambda$nqYuWdfBVEILOZOP3I8TPhnY2g(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardProductName, str, list, function1, manageWalletViewModel, function12, userIntentContext, modifier5, z7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1277308306);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(walletInstrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(manageWalletViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (i & 32768) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1277308306, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletSection (ManageWalletContent.kt:155)");
                }
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.WalletInstrumentInfoKt.WalletInstrumentInfo(walletInstrument, function0, userIntentContext, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | (i4 & 126) | ((i4 >> 6) & 896), 8);
                if (walletInstrument.hasAction(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.LOCK, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.UNLOCK)) {
                    startRestartGroup.startReplaceGroup(1959939065);
                    boolean z = (i4 & 57344) == 16384 || ((i4 & 32768) != 0 && startRestartGroup.changedInstance(userIntentContext));
                    boolean changedInstance = startRestartGroup.changedInstance(walletInstrument);
                    boolean changedInstance2 = startRestartGroup.changedInstance(manageWalletViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | z | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.$r8$lambda$xK9kZ_wOy1lT6wCXmyh9OIjHz08(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, walletInstrument, manageWalletViewModel, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt.WalletInstrumentLock(walletInstrument, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, i4 & 14, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1960801082);
                    startRestartGroup.endReplaceGroup();
                }
                if (walletInstrument.hasAction(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CLOSE)) {
                    startRestartGroup.startReplaceGroup(1960872165);
                    int i6 = i4 >> 9;
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentRemovalKt.WalletInstrumentRemoval(function02, userIntentContext, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 3) | (i6 & 14) | (i6 & 112), 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1961015354);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.$r8$lambda$PClClF2dLIqDOBl1sY_7LmwgwnA(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument.this, function0, manageWalletViewModel, function02, userIntentContext, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$DkXJy66_v1d0jAZ9EwNF-WVg5LU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14458$r8$lambda$DkXJy66_v1d0jAZ9EwNFWVg5LU(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel) {
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getBACK_BUTTON(), userIntentContext, null, 8, null);
        manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PClClF2dLIqDOBl1sY_7LmwgwnA(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(walletInstrument, function0, manageWalletViewModel, function02, userIntentContext, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c71627E9G_9nPtSHb12wkWZ5JVg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument) {
        function1.invoke(walletInstrument.getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nqYuWdfBVEILOZOP3I8T-PhnY2g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14459$r8$lambda$nqYuWdfBVEILOZOP3I8TPhnY2g(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageWalletContent(appNavigator, debitCardProductName, str, list, function1, manageWalletViewModel, function12, userIntentContext, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xK9kZ_wOy1lT6wCXmyh9OIjHz08(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, boolean z) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlock_wallet_toggle;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled unlockWalletToggled;
        if (z) {
            unlock_wallet_toggle = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getLOCK_WALLET_TOGGLE();
        } else {
            unlock_wallet_toggle = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUNLOCK_WALLET_TOGGLE();
        }
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_ID, unlock_wallet_toggle, userIntentContext, null, 8, null);
        if (z) {
            unlockWalletToggled = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled(walletInstrument.getId());
        } else {
            unlockWalletToggled = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled(walletInstrument.getId());
        }
        manageWalletViewModel.processEvent(unlockWalletToggled);
        return kotlin.Unit.INSTANCE;
    }
}
