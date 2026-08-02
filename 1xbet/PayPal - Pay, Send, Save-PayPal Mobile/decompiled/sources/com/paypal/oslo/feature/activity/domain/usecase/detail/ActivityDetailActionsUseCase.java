package com.paypal.oslo.feature.activity.domain.usecase.detail;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001a8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/detail/ActivityDetailActionsUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "activityBaseActionHandler", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)V", "", "initSupportedAction$activity_prodRelease", "()V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deepLinkURL", "invokeDeepLink$activity_prodRelease", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "getNavigationActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "getGetNavigationActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "getWebKitActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "getGetWebKitActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "getMutationQueryActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "getGetMutationQueryActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailActionsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions getMutationQueryActions;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions getNavigationActions;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions getWebKitActions;

    @javax.inject.Inject
    public ActivityDetailActionsUseCase(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBaseActionsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        this.Camera2StreamConfigurationMap = activityBaseActionsProvider;
        this.getHighSpeedVideoFpsRangesFor = activityFeatureManager;
        this.getNavigationActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CONFIRM_TAX_ID, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SAY_THANKS, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHIPPING_SHIP, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHIPPING_TRACK, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_STORY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.MARK_AS_COMPLETE, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SEND_MONEY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SEND_AGAIN, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.BILL_SPLIT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHARE_AGAIN}));
        this.getWebKitActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ACCEPT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DENY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TRACKING, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHIP}));
        this.getMutationQueryActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.HIDE}));
        initSupportedAction$activity_prodRelease();
    }

    /* renamed from: getGetNavigationActions$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions getGetNavigationActions() {
        return this.getNavigationActions;
    }

    /* renamed from: getGetWebKitActions$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions getGetWebKitActions() {
        return this.getWebKitActions;
    }

    /* renamed from: getGetMutationQueryActions$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions getGetMutationQueryActions() {
        return this.getMutationQueryActions;
    }

    public final void initSupportedAction$activity_prodRelease() {
        this.Camera2StreamConfigurationMap.getSupportedActions$activity_prodRelease().add(this.getNavigationActions);
        this.Camera2StreamConfigurationMap.getSupportedActions$activity_prodRelease().add(this.getWebKitActions);
        this.Camera2StreamConfigurationMap.getSupportedActions$activity_prodRelease().add(this.getMutationQueryActions);
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult> continuation) {
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("invoke", "Action Enabled: ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.isActionsEnabled())));
        return this.Camera2StreamConfigurationMap.handleAction$activity_prodRelease(activityActionModel, continuation);
    }

    public final void invokeDeepLink$activity_prodRelease(java.lang.String deepLinkURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkURL, "");
        this.Camera2StreamConfigurationMap.handleDeepLink$activity_prodRelease(deepLinkURL);
    }
}
