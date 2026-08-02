package com.paypal.oslo.feature.activity.data.repository.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2", f = "ActivityActionsRepositoryImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {"accountId", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionsRepositoryImpl$blockContact$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = this.getHighSpeedVideoFpsRangesFor.getActivityActionsTransactionInfo();
            java.lang.String counterpartyAccountId = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getCounterpartyAccountId() : null;
            java.lang.String str = counterpartyAccountId;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing counterpartyAccountId for block contact", null, 2, null), 1, null));
            }
            com.paypal.oslo.feature.activity.graphql.BlockActivityContactMutation blockActivityContactMutation = new com.paypal.oslo.feature.activity.graphql.BlockActivityContactMutation(new com.paypal.oslo.api.graphql.schema.type.BlockContactInput(com.apollographql.apollo.api.Optional.INSTANCE.present(counterpartyAccountId), com.apollographql.apollo.api.Optional.INSTANCE.absent()));
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(counterpartyAccountId);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(blockActivityContactMutation);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes.getApolloClient(), blockActivityContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior mapActivityGraphQL = com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
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
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) mapActivityGraphQL;
        return new arrow.core.Ior.Both(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) both.getLeftValue(), 1, null), both.getRightValue());
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.activity.graphql.BlockActivityContactMutation.BlockContact blockContact;
        com.paypal.oslo.feature.activity.graphql.BlockActivityContactMutation.Data data = (com.paypal.oslo.feature.activity.graphql.BlockActivityContactMutation.Data) graphQLData.getData();
        boolean z = false;
        if (data != null && (blockContact = data.getBlockContact()) != null && blockContact.isSuccessful()) {
            z = true;
        }
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult(z));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityActionsRepositoryImpl$blockContact$2(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityActionModel;
        this.getHighSpeedVideoSizes = activityActionsRepositoryImpl;
    }
}
