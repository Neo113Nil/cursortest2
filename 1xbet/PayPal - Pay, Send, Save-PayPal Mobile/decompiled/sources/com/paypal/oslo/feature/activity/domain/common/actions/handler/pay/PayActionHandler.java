package com.paypal.oslo.feature.activity.domain.common.actions.handler.pay;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/pay/PayActionHandler;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "invokePayAction$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PayActionHandler {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayActionHandler(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        this.Camera2StreamConfigurationMap = activityComposeConfig;
    }

    public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult invokePayAction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        if (activityActionsTransactionInfo == null) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("invokePayAction", "Transaction info is null for PAY action");
        } else {
            com.paypal.oslo.core.navigation.AppNavigator navigator = this.Camera2StreamConfigurationMap.getNavigator();
            if (navigator != null) {
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler.$r8$lambda$_hMrmqHATD0wVAatjDOkXywG9BE(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
            }
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf(activityActionModel.getType())));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_hMrmqHATD0wVAatjDOkXywG9BE(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.toPayNavigationDestination(activityActionsTransactionInfo));
        return kotlin.Unit.INSTANCE;
    }
}
