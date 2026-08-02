package com.paypal.oslo.feature.activity.data.repository.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2", f = "ActivityActionsRepositoryImpl.kt", i = {0, 0, 0}, l = {167}, m = "invokeSuspend", n = {"paymentRequestId", "reason", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = this.getHighSpeedVideoFpsRanges.getActivityActionsTransactionInfo();
                java.lang.String transactionId = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getTransactionId() : null;
                java.lang.String str = transactionId;
                if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                    int i2 = com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.getType().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        paymentRequestCancelReason = com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.CUSTOMER_CANCELED;
                    } else if (i2 == 3) {
                        paymentRequestCancelReason = com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.CUSTOMER_REPORTED_SPAM;
                    } else {
                        java.lang.String rawValue = this.getHighSpeedVideoFpsRanges.getType().getRawValue();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported action type: ");
                        sb.append(rawValue);
                        return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(sb.toString(), null, 2, null), 1, null));
                    }
                    com.paypal.oslo.feature.activity.graphql.CancelPaymentRequestMutation cancelPaymentRequestMutation = new com.paypal.oslo.feature.activity.graphql.CancelPaymentRequestMutation(new com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput(transactionId, paymentRequestCancelReason));
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionId);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestCancelReason);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelPaymentRequestMutation);
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizesFor.getApolloClient(), cancelPaymentRequestMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing paymentRequestId for cancel payment request", null, 2, null), 1, null));
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            final com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl = this.getHighSpeedVideoSizesFor;
            arrow.core.Ior mapActivityGraphQL = com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                }
            });
            if (mapActivityGraphQL instanceof arrow.core.Ior.Left) {
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Ior.Left) mapActivityGraphQL).getValue(), 1, null));
            }
            if (mapActivityGraphQL instanceof arrow.core.Ior.Right) {
                return mapActivityGraphQL;
            }
            if (!(mapActivityGraphQL instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new arrow.core.Ior.Both(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Ior.Both) mapActivityGraphQL).getLeftValue(), 1, null), ((arrow.core.Ior.Both) mapActivityGraphQL).getRightValue());
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("executeCancelPaymentRequest", e);
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, this.getHighSpeedVideoSizesFor.getActivityErrorMapper().mapToDomainError(e), 1, null));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl.access$mapCancelPaymentRequestResult(activityActionsRepositoryImpl, (com.paypal.oslo.feature.activity.graphql.CancelPaymentRequestMutation.Data) graphQLData.getData()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityActionModel;
        this.getHighSpeedVideoSizesFor = activityActionsRepositoryImpl;
    }
}
