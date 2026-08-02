package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SubscriptionsHubContentSection", "", "uiState", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Success;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Success;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SubscriptionsHubContentSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsHubContentSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionsHubContentSection(final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent, kotlin.Unit> function1, final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(340974914);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(340974914, i4, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSection (SubscriptionsHubContentSection.kt:39)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubHeaderKt.SubscriptionsHubHeader(function1, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), success.getShouldShowLinkEntryPoints(), startRestartGroup, (i4 >> 3) & 14, 0);
                java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> subscriptions = success.getSubscriptions();
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt.m19875$r8$lambda$o4ZjrJj0uk2YkRoIVDQDzUfl7U(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.SubscriptionList(subscriptions, (kotlin.jvm.functions.Function1) rememberedValue, lazyListState, null, startRestartGroup, i4 & 896, 8);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt.$r8$lambda$_F317RbhXigWEVSMXflEklTlGgI(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success.this, function1, lazyListState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_F317RbhXigWEVSMXflEklTlGgI(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionsHubContentSection(success, function1, lazyListState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$erqO0F3AdLJWfCaQllxqoceEM9g(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent subscriptionsHubEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsHubEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$f0v9cGM4LeleGz9C04c5-x9ZI_U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19874$r8$lambda$f0v9cGM4LeleGz9C04c5x9ZI_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(675923384);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(675923384, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionPreview (SubscriptionsHubContentSection.kt:65)");
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success = new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel("sub_netflix", com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, null, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "fi_preferred", null, "Credit", null, null, null, 58, null), com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalBalance(), "fi_balance", null, null, null, null, null, 62, null), new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant_netflix", "Netflix", null), new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel("$9.99", "Paid Jan 15"), 4, null)), false, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt.$r8$lambda$erqO0F3AdLJWfCaQllxqoceEM9g((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubscriptionsHubContentSection(success, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt.m19874$r8$lambda$f0v9cGM4LeleGz9C04c5x9ZI_U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o4ZjrJj0uk2YkRoIVDQD-zUfl7U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19875$r8$lambda$o4ZjrJj0uk2YkRoIVDQDzUfl7U(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked(subscriptionItemUiModel));
        return kotlin.Unit.INSTANCE;
    }
}
