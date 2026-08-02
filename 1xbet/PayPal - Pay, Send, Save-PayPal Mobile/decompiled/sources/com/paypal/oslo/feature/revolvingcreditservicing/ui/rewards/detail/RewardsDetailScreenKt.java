package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001aO\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"RewardsDetailScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel;Landroidx/compose/runtime/Composer;I)V", "SuccessContent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "earnRates", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/EarnRateUiModel;", "redeemOptions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RedeemOptionUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createMockRewardsData", "balanceState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "RewardsScreenPositiveBalancePreview", "(Landroidx/compose/runtime/Composer;I)V", "RewardsScreenNegativeBalancePreview", "revolvingcredit-servicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsDetailScreenKt {
    public static final void RewardsDetailScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1759780176);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(rewardsDetailViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1759780176, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreen (RewardsDetailScreen.kt:68)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(rewardsDetailViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(rewardsDetailViewModel);
            boolean z = (i3 & 14) == 4;
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1(rewardsDetailViewModel, appNavigator, collectAsStateWithLifecycle, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState rewardsDetailState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState) collectAsStateWithLifecycle.getValue();
            if (rewardsDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready) {
                startRestartGroup.startReplaceGroup(77622478);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel data = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready) rewardsDetailState).getData();
                boolean changedInstance2 = startRestartGroup.changedInstance(rewardsDetailViewModel);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$2$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$2$1$1(rewardsDetailViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoSizes(data, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getEarnRates(), com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getRedeemOptions(), null, startRestartGroup, 0, 16);
                startRestartGroup.endReplaceGroup();
            } else if (rewardsDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading) {
                startRestartGroup.startReplaceGroup(77630198);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else if (rewardsDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError) {
                startRestartGroup.startReplaceGroup(-1888327678);
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE.asString(startRestartGroup, 6), null, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1032297385, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$B0MFDfzpvrdrlroYOHF9vmsnt4Q(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1575936, 54);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue rewardsPaymentPastDue = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(rewardsDetailViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$e1nSZVIhrbenoBN6Uxss4vUUND8(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt.AccountSummaryFullscreenError(rewardsPaymentPastDue, (kotlin.jvm.functions.Function0) rememberedValue3, fillMaxSize$default2, startRestartGroup, 390, 0);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(77663818);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$gIQihi5acf9F2YdxKh9OUzK_YgQ(com.paypal.oslo.core.navigation.AppNavigator.this, rewardsDetailViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1, final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel> list, final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RedeemOptionUiModel> list2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1667260462);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(rewardsDetailUiModel) : startRestartGroup.changedInstance(rewardsDetailUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1667260462, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.SuccessContent (RewardsDetailScreen.kt:189)");
                }
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                java.lang.String promoTitle = rewardsDetailUiModel.getPromoTitle();
                if (promoTitle != null) {
                    startRestartGroup.startReplaceGroup(1834136363);
                    modifier4 = modifier5;
                    i4 = 1;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.components.BannerStyle) null, promoTitle, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                    i5 = 0;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1834136362);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    i4 = 1;
                    i5 = 0;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalance = rewardsDetailUiModel.getCashBackBalance();
                int i7 = i3 & 112;
                int i8 = i7 == 32 ? i4 : i5;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (i8 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$SLX0cqt2HvGxsvT5bV0AvfK8bAM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.component.CashBackCardKt.CashBackCard(cashBackBalance, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 0, 4);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, i5);
                if (!(rewardsDetailUiModel.getCashBackBalance() instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Error)) {
                    startRestartGroup.startReplaceGroup(1834602262);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.component.StatisticsSectionKt.StatisticsSection(rewardsDetailUiModel.getYearToDateCashBack(), rewardsDetailUiModel.getLifetimeCashBack(), null, startRestartGroup, 0, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1834771398);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), startRestartGroup, i5);
                kotlin.jvm.functions.Function0 function0 = null;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.component.EarnSectionKt.EarnSection(list, null, startRestartGroup, (i3 >> 6) & 14, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), startRestartGroup, i5);
                if (rewardsDetailUiModel.isRedeemSectionEnabled()) {
                    startRestartGroup.startReplaceGroup(1834976742);
                    if (rewardsDetailUiModel.getLoyaltyProgramLearnMoreUrl() == null) {
                        startRestartGroup.startReplaceGroup(1835218170);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1835124364);
                        int i9 = i7 == 32 ? i4 : i5;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (i9 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$mqlxFfMzLYtbpI3VHQhPHHxWxzc(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.component.RedeemSectionKt.RedeemSection(list2, null, function0, startRestartGroup, (i3 >> 9) & 14, 2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1835284262);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String asString = rewardsDetailUiModel.getProgramTermsLinkText().asString(startRestartGroup, i5);
                int i10 = i7 == 32 ? i4 : i5;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (i10 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.m18590$r8$lambda$nNQtzOLAvFYKncPyU51JfCrfgY(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.LinkKt.Link(asString, null, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 0, 10);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, i5);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.m18588$r8$lambda$WSQ1cHq68m6Vrs895fqwr1vMKo(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.this, function1, list, list2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel createMockRewardsData(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashBackBalanceUiModel, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel("Boosted offer! Get 110 points per $1 when you redeem to PayPal+ Points. Terms apply.", cashBackBalanceUiModel, "$0.00", "$0.00", false, false, false, (java.lang.String) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B0MFDfzpvrdrlroYOHF9vmsnt4Q(final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1032297385, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreen.<anonymous>.<anonymous> (RewardsDetailScreen.kt:159)");
            }
            boolean changedInstance = composer.changedInstance(rewardsDetailViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.m18587$r8$lambda$MqY7yrC2n_Q0rJI3yVSLshQGg8(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.this);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mdqdy4CSAkiKVuYdN8Rs2bBSzeQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent rewardsDetailEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MqY7yrC2n_Q0rJI3yVSLs-hQGg8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18587$r8$lambda$MqY7yrC2n_Q0rJI3yVSLshQGg8(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel) {
        rewardsDetailViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SLX0cqt2HvGxsvT5bV0AvfK8bAM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRedeemClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W-SQ1cHq68m6Vrs895fqwr1vMKo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18588$r8$lambda$WSQ1cHq68m6Vrs895fqwr1vMKo(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, kotlin.jvm.functions.Function1 function1, java.util.List list, java.util.List list2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(rewardsDetailUiModel, function1, list, list2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X7OULB_gIKatHbjXY1XKEldtVms(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2099080863);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2099080863, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsScreenPositiveBalancePreview (RewardsDetailScreen.kt:258)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel createMockRewardsData = createMockRewardsData(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive(14.85f, "$14.85"));
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
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
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$Mdqdy4CSAkiKVuYdN8Rs2bBSzeQ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(createMockRewardsData, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getEarnRates(), com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getRedeemOptions(), null, startRestartGroup, 48, 16);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$X7OULB_gIKatHbjXY1XKEldtVms(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$d3Sb23phgBWgwh0p-QKmSOmvCfE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18589$r8$lambda$d3Sb23phgBWgwh0pQKmSOmvCfE(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent rewardsDetailEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e1nSZVIhrbenoBN6Uxss4vUUND8(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel) {
        rewardsDetailViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorMakePaymentClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gIQihi5acf9F2YdxKh9OUzK_YgQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        RewardsDetailScreen(appNavigator, rewardsDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mkqAHcNM0wOatUMUs8svsanfHzg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(935144357);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(935144357, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsScreenNegativeBalancePreview (RewardsDetailScreen.kt:281)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel createMockRewardsData = createMockRewardsData(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative(-27.85f, "-$27.85"));
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
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
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.m18589$r8$lambda$d3Sb23phgBWgwh0pQKmSOmvCfE((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(createMockRewardsData, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getEarnRates(), com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.INSTANCE.getRedeemOptions(), null, startRestartGroup, 48, 16);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.$r8$lambda$mkqAHcNM0wOatUMUs8svsanfHzg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mqlxFfMzLYtbpI3VHQhPHHxWxzc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnLearnMoreClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nNQtzOLAvFYKnc-PyU51JfCrfgY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18590$r8$lambda$nNQtzOLAvFYKncPyU51JfCrfgY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsDetailProgramTermsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState access$RewardsDetailScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState) state.getValue();
    }
}
