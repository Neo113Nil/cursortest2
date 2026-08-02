package com.paypal.oslo.feature.activity.domain.usecase.common;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityActionsBaseUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "activityBaseActionHandler", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)V", "", "initSupportedAction$activity_prodRelease", "()V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deepLinkURL", "invokeDeepLink$activity_prodRelease", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "getNavigationActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "getGetNavigationActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "getWebKitActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "getGetWebKitActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "getMutationQueryActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "getGetMutationQueryActions$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ActivityActionsBaseUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions getMutationQueryActions;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions getNavigationActions;
    private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions getWebKitActions;

    public ActivityActionsBaseUseCase(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBaseActionsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        this.getHighSpeedVideoSizes = activityBaseActionsProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = activityFeatureManager;
        this.getNavigationActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.UOME_CANCEL, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.UOME_PAY_SUBMIT}));
        this.getWebKitActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TRACKING, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAYMENT_ACCEPT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAYMENT_DENY, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT_PROBLEM}));
        this.getMutationQueryActions = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.HIDE}));
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
        this.getHighSpeedVideoSizes.getSupportedActions$activity_prodRelease().add(this.getNavigationActions);
        this.getHighSpeedVideoSizes.getSupportedActions$activity_prodRelease().add(this.getWebKitActions);
        this.getHighSpeedVideoSizes.getSupportedActions$activity_prodRelease().add(this.getMutationQueryActions);
    }

    public final void invokeDeepLink$activity_prodRelease(java.lang.String deepLinkURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkURL, "");
        this.getHighSpeedVideoSizes.handleDeepLink$activity_prodRelease(deepLinkURL);
    }

    public java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult> continuation) {
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("invoke", "Action Enabled: ".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.isActionsEnabled())));
        return this.getHighSpeedVideoSizes.handleAction$activity_prodRelease(activityActionModel, continuation);
    }
}
