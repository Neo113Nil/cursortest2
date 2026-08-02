package com.paypal.oslo.feature.activity.data.repository.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2", f = "ActivityActionsRepositoryImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"accountId", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionsRepositoryImpl$unblockContact$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = this.getHighSpeedVideoFpsRangesFor.getActivityActionsTransactionInfo();
                java.lang.String counterpartyAccountId = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getCounterpartyAccountId() : null;
                java.lang.String str = counterpartyAccountId;
                if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                    com.paypal.oslo.feature.activity.graphql.UnblockContactMutation unblockContactMutation = new com.paypal.oslo.feature.activity.graphql.UnblockContactMutation(new com.paypal.oslo.api.graphql.schema.type.UnblockContactInput(com.apollographql.apollo.api.Optional.INSTANCE.present(counterpartyAccountId), com.apollographql.apollo.api.Optional.INSTANCE.absent()));
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(counterpartyAccountId);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unblockContactMutation);
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighResolutionOutputSizeshNQ4ISI.getApolloClient(), unblockContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing accountId for unblock contact", null, 2, null), 1, null));
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Ior mapActivityGraphQL = com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
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
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("unblockContact", e);
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, this.getHighResolutionOutputSizeshNQ4ISI.getActivityErrorMapper().mapToDomainError(e), 1, null));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.activity.graphql.UnblockContactMutation.UnblockContact unblockContact;
        com.paypal.oslo.feature.activity.graphql.UnblockContactMutation.Data data = (com.paypal.oslo.feature.activity.graphql.UnblockContactMutation.Data) graphQLData.getData();
        boolean z = false;
        if (data != null && (unblockContact = data.getUnblockContact()) != null && unblockContact.isSuccessful()) {
            z = true;
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult(z));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityActionsRepositoryImpl$unblockContact$2(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityActionModel;
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionsRepositoryImpl;
    }
}
