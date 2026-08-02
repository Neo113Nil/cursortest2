package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aG\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"DonationContactListScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;Landroidx/compose/runtime/Composer;II)V", "DonationContactListContent", "organizations", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/CharitableOrganization;", "onOrganizationClick", "Lkotlin/Function1;", "onCloseClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DonationContactListScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "uiState", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DonationContactListScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DonationContactListScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel2;
        final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changedInstance;
        boolean z;
        java.lang.Object rememberedValue;
        boolean changed;
        boolean z2;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-367616249);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(appNavigator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                redeemViewModel2 = redeemViewModel;
                if (startRestartGroup.changedInstance(redeemViewModel2)) {
                    i3 = 32;
                    i4 |= i3;
                }
            } else {
                redeemViewModel2 = redeemViewModel;
            }
            i3 = 16;
            i4 |= i3;
        } else {
            redeemViewModel2 = redeemViewModel;
        }
        int i5 = i4;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                i5 &= -113;
                redeemViewModel3 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-367616249, i5, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreen (DonationContactListScreen.kt:87)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(redeemViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(redeemViewModel3);
                int i6 = i5 & 14;
                z = i6 != 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$DonationContactListScreen$1$1(redeemViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState2 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) collectAsStateWithLifecycle.getValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                z2 = i6 == 4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$DonationContactListScreen$2$1(appNavigator, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(redeemState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                redeemState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) collectAsStateWithLifecycle.getValue();
                if (!(redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection)) {
                    startRestartGroup.startReplaceGroup(512494390);
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities = ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection) redeemState).getCharities();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(charities, 10));
                    for (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel charityModel : charities) {
                        arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization(charityModel.getId(), charityModel.getName(), "", charityModel.getLogoUrl()));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    boolean changedInstance2 = startRestartGroup.changedInstance(redeemViewModel3);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.m19470$r8$lambda$sOtST1EkmWh6k4CpKlUcMMkqaM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    boolean changedInstance3 = startRestartGroup.changedInstance(redeemViewModel3);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$DonationContactListScreen$5$1(redeemViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    DonationContactListContent(arrayList2, function1, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue4), null, startRestartGroup, 0, 8);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1091827029);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            redeemViewModel3 = redeemViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(redeemViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(redeemViewModel3);
            int i62 = i5 & 14;
            if (i62 != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$DonationContactListScreen$1$1(redeemViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState redeemState22 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) collectAsStateWithLifecycle2.getValue();
            changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
            if (i62 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changed | z2)) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$DonationContactListScreen$2$1(appNavigator, collectAsStateWithLifecycle2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(redeemState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            redeemState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) collectAsStateWithLifecycle2.getValue();
            if (!(redeemState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection)) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            redeemViewModel3 = redeemViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.$r8$lambda$m_JvTaCRXmwKk7crfmo3FcQvEDE(com.paypal.oslo.core.navigation.AppNavigator.this, redeemViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0480, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DonationContactListContent(final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i4;
        com.paypal.pds.components.AvatarSource image;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1472047224);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i6;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1472047224, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListContent (DonationContactListScreen.kt:165)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, null, false, false, startRestartGroup, ((i3 >> 3) & 112) | 3078, 496);
                startRestartGroup.endNode();
                java.lang.Object obj3 = null;
                float f = 0.0f;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
                androidx.compose.runtime.Composer composer3 = startRestartGroup;
                int i8 = 0;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_donate_title, composer3, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer3, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer3, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_charity_selection_to, composer3, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer3, 384, 6, 1018);
                composer3.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer3, 0);
                int i9 = 1;
                androidx.compose.ui.Modifier m1707paddingVpY3zN42 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1707paddingVpY3zN42);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                composer3.startReplaceGroup(-1714019853);
                androidx.compose.runtime.Composer composer4 = composer3;
                for (final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization charitableOrganization : list) {
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i9, obj3);
                    int i10 = (i3 & 112) == 32 ? i9 : i8;
                    boolean changed = composer4.changed(charitableOrganization);
                    java.lang.Object rememberedValue = composer4.rememberedValue();
                    if ((i10 | (changed ? 1 : 0)) == 0) {
                        obj = rememberedValue;
                    }
                    kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.$r8$lambda$zwMVesOwOitrVnqsJPjkXJtCKBA(kotlin.jvm.functions.Function1.this, charitableOrganization);
                        }
                    };
                    composer4.updateRememberedValue(function02);
                    obj = function02;
                    boolean z = i8;
                    androidx.compose.runtime.Composer composer5 = composer4;
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) obj, composer4, 6, 31);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), z);
                    int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer5, z ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, m22100clickable_mRqjOc);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier m1707paddingVpY3zN43 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12());
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing20()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer5, 48);
                    int hashCode7 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer5, z ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, m1707paddingVpY3zN43);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor7);
                    } else {
                        composer5.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl7, java.lang.Integer.valueOf(hashCode7), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    java.lang.String avatarUrl = charitableOrganization.getAvatarUrl();
                    if (avatarUrl != null) {
                        composer5.startReplaceGroup(-68075868);
                        obj2 = null;
                        i4 = 1;
                        i5 = 2;
                        image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer5.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(avatarUrl).build(), null, null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), composer5, com.paypal.oslo.core.commonui.components.ImageRequest.$stable | 24576, 14), null, 2, null);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-68075869);
                        composer5.endReplaceGroup();
                        image = null;
                        obj2 = null;
                        i4 = 1;
                        i5 = 2;
                    }
                    com.paypal.pds.components.AvatarKt.Avatar(image != null ? image : new com.paypal.pds.components.AvatarSource.Initials(kotlin.text.StringsKt.take(charitableOrganization.getName(), i5)), null, null, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer5, 0, 54);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(charitableOrganization.getName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer5, 384, 6, 1018);
                    composer5.endNode();
                    composer5.endNode();
                    composer4 = composer5;
                    obj3 = obj2;
                    i9 = i4;
                    f = 0.0f;
                    i8 = 0;
                }
                composer2 = composer4;
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.$r8$lambda$c5chtbrmCEdvO7dcgf5tuC4l0lI(list, function1, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i6;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$HHpU6iy6iePoI4qQ-zhQ6FBIbhU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19468$r8$lambda$HHpU6iy6iePoI4qQzhQ6FBIbhU(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization charitableOrganization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charitableOrganization, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c5chtbrmCEdvO7dcgf5tuC4l0lI(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DonationContactListContent(list, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kiinPHshrQQxpoRNtbHROc6_TCM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1914812397);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1914812397, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenPreview (DonationContactListScreen.kt:266)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization[]{new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization("1", "Team Rubicon", "3 completed transactions", "https://cdn-2ba291819f674.static.engineering.dev.paypalinc.com/icons/Amy%20Cinq-Mars.png"), new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "World Central Kitchen, Inc", "10 completed transactions", "https://cdn-2ba291819f674.static.engineering.dev.paypalinc.com/icons/Henrik%20Muller.png"), new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Save the Children", "In your contacts", "https://cdn-2ba291819f674.static.engineering.dev.paypalinc.com/icons/Robert%20Kim.png"), new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization("4", "American Red Cross", "@aisha-anwarzi", "https://cdn-2ba291819f674.static.engineering.dev.paypalinc.com/icons/Amy%20Cinq-Mars.png"), new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization("5", "UNICEF US", "@robertkim20", "https://cdn-2ba291819f674.static.engineering.dev.paypalinc.com/icons/Henrik%20Muller.png")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.m19468$r8$lambda$HHpU6iy6iePoI4qQzhQ6FBIbhU((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DonationContactListContent(listOf, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationContactListScreenKt.$r8$lambda$kiinPHshrQQxpoRNtbHROc6_TCM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m_JvTaCRXmwKk7crfmo3FcQvEDE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DonationContactListScreen(appNavigator, redeemViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sOtST1EkmWh6k4CpKlU-cMMkqaM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19470$r8$lambda$sOtST1EkmWh6k4CpKlUcMMkqaM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization charitableOrganization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charitableOrganization, "");
        redeemViewModel.onSelectCharity(charitableOrganization.getId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zwMVesOwOitrVnqsJPjkXJtCKBA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.CharitableOrganization charitableOrganization) {
        function1.invoke(charitableOrganization);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState access$DonationContactListScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState) state.getValue();
    }
}
