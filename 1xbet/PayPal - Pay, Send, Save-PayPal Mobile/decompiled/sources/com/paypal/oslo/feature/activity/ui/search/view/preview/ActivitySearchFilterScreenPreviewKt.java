package com.paypal.oslo.feature.activity.ui.search.view.preview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00008CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0003"}, d2 = {"", "", "mockSuggestions", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "mockResults", "Ljava/util/List;", "getMockResults"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchFilterScreenPreviewKt {
    private static final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt.$r8$lambda$V9m7V8eyBW2G1ABSNidd9E0CVXM();
        }
    });
    private static final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> mockResults = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel[]{new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel("txn_123456", "group_789", (java.lang.String) null, new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar(com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, 2, null), 0, (com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Coffee Shop", "Oct 23", "2026-01-20T10:30:00.000Z", new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation("5.99", "USD", false, false, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Debit Card", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, (java.lang.String) null, (java.lang.String) null, new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo((com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) null, "5 pts", (java.util.List) null, (java.lang.Integer) null, 13, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REFUND, "https://example.com/details", null)), com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT, (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) null, (java.util.List) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) null, (java.util.List) null, (java.util.List) null, 8064004, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel("txn_234567", "group_789", (java.lang.String) null, new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar("SR", null, 2, null), 0, (com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Online Shopping", "Oct 24", "2026-01-20T10:30:00.000Z", new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation("6.99", "USD", false, false, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Credit Card", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo) null, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Credit.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT, (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) null, (java.util.List) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) null, (java.util.List) null, (java.util.List) null, 8068100, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel("txn_345678", "group_789", (java.lang.String) null, new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar(com.paypal.pds.core.Icon.Person.INSTANCE, null, 2, null), 0, (com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Online Shopping", "Oct 25", "2026-01-20T10:30:00.000Z", new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation("7.99", "USD", false, false, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null), "Amex Card", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, (java.lang.String) null, "Additional Info", (com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo) null, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Debit.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT, (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) null, (java.util.List) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) null, (java.util.List) null, (java.util.List) null, 8066052, (kotlin.jvm.internal.DefaultConstructorMarker) null)});

    public static final java.util.List<java.lang.String> mockSuggestions() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Suggestion 1", "Suggestion 2", "Suggestion 3", "Suggestion 4"});
    }

    public static final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> getMockResults() {
        return mockResults;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$47_sGo6z5ZJuvl2h4pmqgd5sW6A(final com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1134428528);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activitySearchPreviewParams) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1134428528, i3, -1, "com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreview (ActivitySearchFilterScreenPreview.kt:54)");
            }
            androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.paging.PagingData.Companion.from$default(androidx.paging.PagingData.INSTANCE, activitySearchPreviewParams.getHighSpeedVideoFpsRanges, activitySearchPreviewParams.getHighResolutionOutputSizeshNQ4ISI, null, 0, 0, 28, null)), null, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState = activitySearchPreviewParams.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt.m11952$r8$lambda$st2mzXI2MClFt_zCz6BxN7ChHE((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.ActivitySearchFilterCompose(activitySearchUiState, collectAsLazyPagingItems, (kotlin.jvm.functions.Function1) rememberedValue, activitySearchPreviewParams.getHighSpeedVideoSizes, startRestartGroup, (androidx.paging.compose.LazyPagingItems.$stable << 3) | 384);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt.$r8$lambda$47_sGo6z5ZJuvl2h4pmqgd5sW6A(com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.List $r8$lambda$V9m7V8eyBW2G1ABSNidd9E0CVXM() {
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> list = mockResults;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) it.next(), 0L, 2, null));
        }
        return arrayList;
    }

    /* renamed from: $r8$lambda$st2mzXI2MClFt_zCz-6BxN7ChHE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11952$r8$lambda$st2mzXI2MClFt_zCz6BxN7ChHE(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent activitySearchEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$getMockSearchResults() {
        return (java.util.List) getHighSpeedVideoFpsRangesFor.getValue();
    }
}
