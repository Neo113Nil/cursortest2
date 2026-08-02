package com.paypal.oslo.feature.activity.domain.common.actions.operations;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/operations/ActivityWebKitActionOperationHandler;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionType", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityWebKitResult;", "handleWebKitActionOperation$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityWebKitResult;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWebKitActionOperationHandler {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ActivityWebKitActionOperationHandler(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityComposeConfig;
    }

    public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult handleWebKitActionOperation$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionType) {
        java.lang.String transactionId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        int i = com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler.WhenMappings.$EnumSwitchMapping$0[activityActionType.getType().ordinal()];
        if (i == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_UNILATERAL_CANCEL_PATH);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionType.getActivityActionsTransactionInfo();
            transactionId = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getTransactionId() : null;
            sb.append(transactionId != null ? transactionId : "");
            final java.lang.String obj = sb.toString();
            com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighResolutionOutputSizeshNQ4ISI.getNavigator();
            if (navigator != null) {
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler.$r8$lambda$no6dHr0Kk3olJa_KxznNaLyStjI(obj, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        } else if (i == 2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_ISSUE_REFUND_PATH);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo2 = activityActionType.getActivityActionsTransactionInfo();
            transactionId = activityActionsTransactionInfo2 != null ? activityActionsTransactionInfo2.getTransactionId() : null;
            sb2.append(transactionId != null ? transactionId : "");
            final java.lang.String obj2 = sb2.toString();
            com.paypal.oslo.core.navigation.AppNavigator navigator2 = this.getHighResolutionOutputSizeshNQ4ISI.getNavigator();
            if (navigator2 != null) {
                navigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj22) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler.$r8$lambda$no6dHr0Kk3olJa_KxznNaLyStjI(obj2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
                    }
                });
            }
        } else if (i == 3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_ADD_TRACKING_PATH);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo3 = activityActionType.getActivityActionsTransactionInfo();
            transactionId = activityActionsTransactionInfo3 != null ? activityActionsTransactionInfo3.getTransactionId() : null;
            sb3.append(transactionId != null ? transactionId : "");
            final java.lang.String obj3 = sb3.toString();
            com.paypal.oslo.core.navigation.AppNavigator navigator3 = this.getHighResolutionOutputSizeshNQ4ISI.getNavigator();
            if (navigator3 != null) {
                navigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj22) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler.$r8$lambda$no6dHr0Kk3olJa_KxznNaLyStjI(obj3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
                    }
                });
            }
        } else if (i == 4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_CREATE_SHIP_LABEL_PATH);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo4 = activityActionType.getActivityActionsTransactionInfo();
            transactionId = activityActionsTransactionInfo4 != null ? activityActionsTransactionInfo4.getTransactionId() : null;
            sb4.append(transactionId != null ? transactionId : "");
            final java.lang.String obj4 = sb4.toString();
            com.paypal.oslo.core.navigation.AppNavigator navigator4 = this.getHighResolutionOutputSizeshNQ4ISI.getNavigator();
            if (navigator4 != null) {
                navigator4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj22) {
                        return com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler.$r8$lambda$no6dHr0Kk3olJa_KxznNaLyStjI(obj4, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
                    }
                });
            }
        } else {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("handleWebKitActionOperation", "Unsupported activity action type for webview flow. Expected CANCEL or REFUND.");
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(kotlin.collections.SetsKt.setOf(activityActionType.getType())));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$no6dHr0Kk3olJa_KxznNaLyStjI(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto((java.lang.String) null, str, false, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TRACKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHIP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
