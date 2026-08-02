package com.paypal.oslo.feature.activity.ui.detail.model.extensions;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0005*\u00060\u0000j\u0002`\u00012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aO\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001c\u0010\u001a\u001a\u00020\u0005*\u00060\u0000j\u0002`\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityType;", "activityType", "", "requiresConfirmation", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;)Z", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "toActionExecutionState", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;)Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "action", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "onConfirmation", "onInvokeAction", "", "transactionId", "handleActionClick", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getRequiresSuccessModal", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;)Z", "requiresSuccessModal"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailsActionExtensionKt {
    public static /* synthetic */ boolean requiresConfirmation$default(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityType = null;
        }
        return requiresConfirmation(activityActionType, activityType);
    }

    public static final boolean requiresConfirmation(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        if (activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL && activityType == com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT) {
            return false;
        }
        return activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE || activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT || activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL || activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID || activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CONFIRM_TAX_ID;
    }

    public static final boolean getRequiresSuccessModal(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        return activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE || activityActionType == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL;
    }

    public static final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState toActionExecutionState(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult activityActionResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionResult, "");
        if (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) {
            arrow.core.Either<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> either = ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) activityActionResult).getData().toEither();
            if (!(either instanceof arrow.core.Either.Right)) {
                if (either instanceof arrow.core.Either.Left) {
                    return com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = ((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue()).getData();
            if (!(data instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult)) {
                return data instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult ? ((com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult) data).isSuccessful() ? com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE : com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE : data instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.Empty ? com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE : com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult) data).getStatus(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS)) {
                return com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE;
            }
            return com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE;
        }
        if ((activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult) || (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult)) {
            return com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE;
        }
        if (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult) {
            return com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final void handleActionClick(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12, java.lang.String str) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityActionModel.getType();
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo2 = activityActionModel.getActivityActionsTransactionInfo();
        if (requiresConfirmation(type, activityActionsTransactionInfo2 != null ? activityActionsTransactionInfo2.getActivityType() : null)) {
            function1.invoke(activityActionModel);
            return;
        }
        if (activityActionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHARE_AGAIN) {
            java.lang.String url = activityActionModel.getUrl();
            if (url != null) {
                com.paypal.oslo.feature.activity.common.IntentUtilsKt.launchIntent(new com.paypal.oslo.feature.activity.ui.detail.model.IntentType.ShareLink(url), context);
                return;
            }
            return;
        }
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo3 = activityActionModel.getActivityActionsTransactionInfo();
        if (activityActionsTransactionInfo3 != null) {
            copy = activityActionsTransactionInfo3.copy((r20 & 1) != 0 ? activityActionsTransactionInfo3.transactionId : str, (r20 & 2) != 0 ? activityActionsTransactionInfo3.groupId : null, (r20 & 4) != 0 ? activityActionsTransactionInfo3.invoiceId : null, (r20 & 8) != 0 ? activityActionsTransactionInfo3.activityType : null, (r20 & 16) != 0 ? activityActionsTransactionInfo3.activityFlags : null, (r20 & 32) != 0 ? activityActionsTransactionInfo3.activityCounterPartyAmountInformation : null, (r20 & 64) != 0 ? activityActionsTransactionInfo3.counterpartyAccountId : null, (r20 & 128) != 0 ? activityActionsTransactionInfo3.isBlocked : null, (r20 & 256) != 0 ? activityActionsTransactionInfo3.transactionCreatedTime : null);
            activityActionsTransactionInfo = copy;
        } else {
            activityActionsTransactionInfo = null;
        }
        function12.invoke(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel.copy$default(activityActionModel, null, null, activityActionsTransactionInfo, 3, null));
    }
}
