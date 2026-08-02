package com.paypal.oslo.feature.activity.domain.common.provider;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityBaseActionsProvider;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;", "repository", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;", "activityDeepLinkNavigationProvider", "Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityNavigationActionOperationHandler;", "activityNavigationActionOperationHandler", "Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityWebKitActionOperationHandler;", "activityWebKitActionOperationHandler", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityNavigationActionOperationHandler;Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityWebKitActionOperationHandler;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "handleAction$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "", "deepLinkURL", "", "handleDeepLink$activity_prodRelease", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityNavigationActionOperationHandler;", "Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityWebKitActionOperationHandler;", "getHighSpeedVideoFpsRanges", "Ljava/util/HashSet;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "supportedActions", "Ljava/util/HashSet;", "getSupportedActions$activity_prodRelease", "()Ljava/util/HashSet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityBaseActionsProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler getHighSpeedVideoFpsRanges;
    private final java.util.HashSet<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType> supportedActions;

    @javax.inject.Inject
    public ActivityBaseActionsProvider(com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository iActivityActionsRepository, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider, com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler activityNavigationActionOperationHandler, com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler activityWebKitActionOperationHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityActionsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDeepLinkNavigationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigationActionOperationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWebKitActionOperationHandler, "");
        this.getHighSpeedVideoSizes = iActivityActionsRepository;
        this.getHighSpeedVideoFpsRangesFor = activityDeepLinkNavigationProvider;
        this.Camera2StreamConfigurationMap = activityNavigationActionOperationHandler;
        this.getHighSpeedVideoFpsRanges = activityWebKitActionOperationHandler;
        this.supportedActions = new java.util.HashSet<>();
    }

    public final java.util.HashSet<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType> getSupportedActions$activity_prodRelease() {
        return this.supportedActions;
    }

    public final java.lang.Object handleAction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult> continuation) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions actionHandlerType = com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.getActionHandlerType(activityActionModel.getType(), this.supportedActions);
        if ((actionHandlerType instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions) && activityActionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL) {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
            if ((activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getActivityType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT) {
                actionHandlerType = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions(kotlin.collections.SetsKt.setOf(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL));
            }
        }
        if (!(actionHandlerType instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions)) {
            if (!(actionHandlerType instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions)) {
                return actionHandlerType instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions ? getHighSpeedVideoFpsRangesFor(activityActionModel, continuation) : new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Actions not supported", null, 2, null)), 1, null));
            }
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils activityActionsLogUtils = com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.getHighSpeedVideoSizes.getClass()).getSimpleName();
            java.lang.String rawValue = activityActionModel.getType().getRawValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Repository: ");
            sb.append(simpleName);
            sb.append(",ActionType: ");
            sb.append(rawValue);
            activityActionsLogUtils.logActivityActionInfo$activity_prodRelease("processActions", sb.toString());
            return this.getHighSpeedVideoFpsRanges.handleWebKitActionOperation$activity_prodRelease(activityActionModel);
        }
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils activityActionsLogUtils2 = com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE;
        java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.getHighSpeedVideoSizes.getClass()).getSimpleName();
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityActionModel.getType();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Repository: ");
        sb2.append(simpleName2);
        sb2.append(",ActionType: ");
        sb2.append(type);
        activityActionsLogUtils2.logActivityActionInfo$activity_prodRelease("processActions", sb2.toString());
        return this.Camera2StreamConfigurationMap.handleNavigationActionOperation$activity_prodRelease(activityActionModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult> continuation) {
        com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider$processMutationActivity$1 activityBaseActionsProvider$processMutationActivity$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider$processMutationActivity$1) {
            activityBaseActionsProvider$processMutationActivity$1 = (com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider$processMutationActivity$1) continuation;
            if ((activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository iActivityActionsRepository = this.getHighSpeedVideoSizes;
                    activityBaseActionsProvider$processMutationActivity$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityActionModel);
                    activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoSizes = 1;
                    obj = iActivityActionsRepository.performAction(activityActionModel, activityBaseActionsProvider$processMutationActivity$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult((arrow.core.Ior) obj);
            }
        }
        activityBaseActionsProvider$processMutationActivity$1 = new com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider$processMutationActivity$1(this, continuation);
        java.lang.Object obj2 = activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityBaseActionsProvider$processMutationActivity$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult((arrow.core.Ior) obj2);
    }

    public final void handleDeepLink$activity_prodRelease(java.lang.String deepLinkURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkURL, "");
        this.getHighSpeedVideoFpsRangesFor.handleDeepLink$activity_prodRelease(deepLinkURL);
    }
}
