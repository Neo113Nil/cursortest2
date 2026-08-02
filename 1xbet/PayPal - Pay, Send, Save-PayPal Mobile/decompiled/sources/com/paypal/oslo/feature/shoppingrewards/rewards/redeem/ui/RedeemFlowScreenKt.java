package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a=\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"RedeemFlowScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;", "amountScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "successScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "transferScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "viewModel", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;Landroidx/compose/runtime/Composer;II)V", "RedeemFlowContent", "uiState", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "termsRedeemType", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemFlowScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
    
        if ((r34 & 64) != 0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemFlowScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination redeemFlowDestination, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.functions.Function1 function1;
        kotlin.Unit unit;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        int i4;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel4;
        java.lang.Object obj;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemFlowDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-598994516);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(redeemFlowDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(amountScreenComponents) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(commonComponents) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(successScreenComponents) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(transferScreenComponents) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                redeemViewModel2 = redeemViewModel;
                if (startRestartGroup.changedInstance(redeemViewModel2)) {
                    i5 = 1048576;
                    i3 |= i5;
                }
            } else {
                redeemViewModel2 = redeemViewModel;
            }
            i5 = 524288;
            i3 |= i5;
        } else {
            redeemViewModel2 = redeemViewModel;
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 64) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    redeemViewModel2 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -3670017;
                }
                int i6 = i3;
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel5 = redeemViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-598994516, i6, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreen (RedeemFlowScreen.kt:65)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(redeemViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                int i7 = i6 & 14;
                boolean z = i7 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19484$r8$lambda$eNBNAwcCoNAdaUhvIr7DnzgU(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(redeemViewModel5);
                boolean z2 = i7 == 4;
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
                boolean changed = startRestartGroup.changed(function12);
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$RedeemFlowScreen$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (((changedInstance | z2 | changedInstance2) || changed) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    function1 = function12;
                    unit = unit2;
                    bottomSheetController = bottomSheetController2;
                    i4 = i6;
                    redeemViewModel4 = redeemViewModel5;
                    rememberedValue4 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$RedeemFlowScreen$1$1(redeemViewModel5, appNavigator, bottomSheetController2, function1, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    unit = unit2;
                    function1 = function12;
                    bottomSheetController = bottomSheetController2;
                    i4 = i6;
                    redeemViewModel4 = redeemViewModel5;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(redeemViewModel4);
                boolean changedInstance4 = startRestartGroup.changedInstance(redeemFlowDestination);
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$RedeemFlowScreen$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance3 || changedInstance4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    rememberedValue5 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$RedeemFlowScreen$2$1(redeemViewModel4, redeemFlowDestination, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    obj = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) collectAsStateWithLifecycle.getValue();
                int i8 = ((i4 >> 15) & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4);
                composer2 = startRestartGroup;
                redeemViewModel3 = redeemViewModel4;
                RedeemFlowContent(redeemState, redeemViewModel4, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents, composer2, i8);
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.RedeemFlowTermsBottomSheet(bottomSheetController, (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType) mutableState.getValue(), function1, composer2, com.paypal.pds.components.BottomSheetController.$stable, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            redeemViewModel3 = redeemViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$HoliR7vIMgAHlEFYO35fI8fvBg0(com.paypal.oslo.core.navigation.AppNavigator.this, redeemFlowDestination, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents, redeemViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void RedeemFlowContent(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState, final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(715295928);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(redeemState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(redeemViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(amountScreenComponents) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(commonComponents) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(successScreenComponents) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(transferScreenComponents) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(715295928, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowContent (RedeemFlowScreen.kt:146)");
            }
            if ((redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial) || (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading) || (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities) || (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming)) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(2048681250);
                Camera2StreamConfigurationMap(composer2, 0);
                composer2.endReplaceGroup();
            } else {
                if (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture) {
                    startRestartGroup.startReplaceGroup(2048766562);
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.RedeemCaptureAmountScreen((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture) redeemState, redeemViewModel, amountScreenComponents, null, startRestartGroup, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 8);
                    startRestartGroup.endReplaceGroup();
                } else if (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection) {
                    startRestartGroup.startReplaceGroup(2049024606);
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities = ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection) redeemState).getCharities();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(charities, 10));
                    for (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel charityModel : charities) {
                        arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization(charityModel.getId(), charityModel.getName(), "", charityModel.getLogoUrl()));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    boolean changedInstance = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$TQ6Zx8TSMmG1k_YyVDhfzNJuQ8Q(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                    boolean changedInstance2 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$HRCitKYXQUWRqUKVMe3KB2hqw7c(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.DonationContactListContent(arrayList2, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 8);
                    startRestartGroup.endReplaceGroup();
                } else if (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary) {
                    startRestartGroup.startReplaceGroup(2049600400);
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary readySummary = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary) redeemState;
                    java.lang.String formattedAmount = readySummary.getFormattedAmount();
                    java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(readySummary.getConvertedAmount());
                    double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
                    java.lang.String selectedCharityName = readySummary.getSelectedCharityName();
                    java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(readySummary.getAmount());
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData donationSummaryUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData(formattedAmount, doubleValue, selectedCharityName, intOrNull != null ? intOrNull.intValue() : 0, readySummary.getSelectedCharityLogoUrl());
                    boolean changedInstance3 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$4LVc2GqMCmMoo6g2TiqM_8XVcPI(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean changedInstance4 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19486$r8$lambda$pfzLiEn5QpCWGsnnrK9nrnybsM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changedInstance5 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$vBcOlxopgU1S2HswPDf_NL2qHfM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    boolean changedInstance6 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19487$r8$lambda$zjORIm4R9vTS1a3dqc_2XTRn0(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
                    boolean shareInfoEnabled = readySummary.getShareInfoEnabled();
                    boolean changedInstance7 = startRestartGroup.changedInstance(redeemViewModel);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19483$r8$lambda$Y_F28DvUhPEm8RrSp7aI_lKU(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt.DonationSummaryContent(donationSummaryUiData, commonComponents, transferScreenComponents, function0, function02, function03, function12, null, shareInfoEnabled, (kotlin.jvm.functions.Function1) rememberedValue7, composer2, ((i2 >> 6) & 112) | ((i2 >> 9) & 896), 128);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    if (redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation) {
                        composer2.startReplaceGroup(2050643147);
                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation readyConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation) redeemState;
                        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = readyConfirmation.getRedeemType();
                        java.lang.String formattedAmount2 = readyConfirmation.getFormattedAmount();
                        java.lang.String convertedAmount = readyConfirmation.getConvertedAmount();
                        java.lang.String selectedCharityName2 = readyConfirmation.getSelectedCharityName();
                        java.lang.String selectedCharityLogoUrl = readyConfirmation.getSelectedCharityLogoUrl();
                        boolean changedInstance8 = composer2.changedInstance(redeemViewModel);
                        java.lang.Object rememberedValue8 = composer2.rememberedValue();
                        if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19481$r8$lambda$FQI9VXjPerSWyfnc6m8CJPQLlw(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        boolean changedInstance9 = composer2.changedInstance(redeemViewModel);
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (changedInstance9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$W_rSXLmVMDm57KG4ynErnWqLhjE(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue9;
                        boolean changedInstance10 = composer2.changedInstance(redeemViewModel);
                        java.lang.Object rememberedValue10 = composer2.rememberedValue();
                        if (changedInstance10 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$d2t5QOp9ka1KX66j6sicw1DKTvQ(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue10);
                        }
                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenKt.RedemptionConfirmationContent(successScreenComponents, redeemType, formattedAmount2, convertedAmount, selectedCharityName2, selectedCharityLogoUrl, function04, function05, (kotlin.jvm.functions.Function0) rememberedValue10, composer2, (i2 >> 12) & 14, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error)) {
                            composer2.startReplaceGroup(204631955);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(2051274524);
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-24960428, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$uou_aKNicJX7X0PvT58dehoLyrw(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), composer2, 1572870, 62);
                        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType = ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error) redeemState).getErrorType();
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        boolean changedInstance11 = composer2.changedInstance(redeemViewModel);
                        java.lang.Object rememberedValue11 = composer2.rememberedValue();
                        if (changedInstance11 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19482$r8$lambda$P8ZE98R91UrEdQ3WjUYKYo9Lik(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue11);
                        }
                        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateContentKt.ErrorStateContent(errorType, fillMaxSize$default2, (kotlin.jvm.functions.Function0) rememberedValue11, composer2, 48, 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                }
                composer2 = startRestartGroup;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$ea7KL49Ng671w98BmZ6KT_15lLg(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.this, redeemViewModel, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1651457414);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1651457414, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.LoadingContent (RedeemFlowScreen.kt:231)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.m19485$r8$lambda$fyrlQt2dwNL13pciX28pOJjfoU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4LVc2GqMCmMoo6g2TiqM_8XVcPI(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FQI9VXjP-erSWyfnc6m8CJPQLlw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19481$r8$lambda$FQI9VXjPerSWyfnc6m8CJPQLlw(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onActivityClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HRCitKYXQUWRqUKVMe3KB2hqw7c(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HoliR7vIMgAHlEFYO35fI8fvBg0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination redeemFlowDestination, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemFlowScreen(appNavigator, redeemFlowDestination, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents, redeemViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$P8ZE98R91-UrEdQ3WjUYKYo9Lik, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19482$r8$lambda$P8ZE98R91UrEdQ3WjUYKYo9Lik(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onRetry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TQ6Zx8TSMmG1k_YyVDhfzNJuQ8Q(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization charitableOrganization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charitableOrganization, "");
        redeemViewModel.onSelectCharity(charitableOrganization.getId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W_rSXLmVMDm57KG4ynErnWqLhjE(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y_F28D-vUhPEm-8RrSp7aI_-lKU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19483$r8$lambda$Y_F28DvUhPEm8RrSp7aI_lKU(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, boolean z) {
        redeemViewModel.onShareInfoToggle(z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a20JmLhNwqtVM5qYYlP1UQM1kJQ(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.common.navigation.TermsWebViewDestination(str, ""));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d2t5QOp9ka1KX66j6sicw1DKTvQ(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eNBNAwcCoN-A-daUhvIr7D-nzgU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19484$r8$lambda$eNBNAwcCoNAdaUhvIr7DnzgU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$a20JmLhNwqtVM5qYYlP1UQM1kJQ(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ea7KL49Ng671w98BmZ6KT_15lLg(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, int i, androidx.compose.runtime.Composer composer, int i2) {
        RedeemFlowContent(redeemState, redeemViewModel, amountScreenComponents, commonComponents, successScreenComponents, transferScreenComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fyrlQt2d-wNL13pciX28pOJjfoU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19485$r8$lambda$fyrlQt2dwNL13pciX28pOJjfoU(int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pfzLiEn5QpCWGsnnrK9nr-nybsM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19486$r8$lambda$pfzLiEn5QpCWGsnnrK9nrnybsM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qv5BOjatQLLEHvq3Bpo7J8FHoIc(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uou_aKNicJX7X0PvT58dehoLyrw(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-24960428, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowContent.<anonymous>.<anonymous> (RedeemFlowScreen.kt:218)");
            }
            boolean changedInstance = composer.changedInstance(redeemViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowScreenKt.$r8$lambda$qv5BOjatQLLEHvq3Bpo7J8FHoIc(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vBcOlxopgU1S2HswPDf_NL2qHfM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onConfirmDonation();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zj-ORI-m4R9vTS1a3dqc_2XTRn0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19487$r8$lambda$zjORIm4R9vTS1a3dqc_2XTRn0(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        redeemViewModel.onTermsClick(str);
        return kotlin.Unit.INSTANCE;
    }
}
