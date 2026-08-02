package com.paypal.oslo.feature.activity.data.repository.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2", f = "ActivityActionsRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {110}, m = "invokeSuspend", n = {"$this$withContext", "activityActionsTransactionInfo", "activityTransactionInfo", "transactionId", "transactionCreatedTime", "mutation", "$i$a$-let-ActivityActionsRepositoryImpl$executeHideMutation$2$1"}, nl = {111}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionsRepositoryImpl$executeHideMutation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl;
        java.lang.String str;
        com.apollographql.apollo.api.Optional absent;
        java.lang.Object execute$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = this.getHighResolutionOutputSizeshNQ4ISI.getActivityActionsTransactionInfo();
                if (activityActionsTransactionInfo != null) {
                    activityActionsRepositoryImpl = this.getHighSpeedVideoSizesFor;
                    java.lang.String transactionId = activityActionsTransactionInfo.getTransactionId();
                    java.lang.String transactionCreatedTime = activityActionsTransactionInfo.getTransactionCreatedTime();
                    java.lang.String str2 = transactionId;
                    if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && (str = transactionCreatedTime) != null && !kotlin.text.StringsKt.isBlank(str)) {
                        java.lang.String groupId = activityActionsTransactionInfo.getGroupId();
                        if (groupId == null || (absent = com.apollographql.apollo.api.Optional.INSTANCE.present(groupId)) == null) {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                        }
                        com.paypal.oslo.feature.activity.graphql.InvoiceReportSpamMutation invoiceReportSpamMutation = new com.paypal.oslo.feature.activity.graphql.InvoiceReportSpamMutation(new com.paypal.oslo.api.graphql.schema.type.ReportSpamActivityInput(transactionId, absent, com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE, transactionCreatedTime));
                        this.getOutputStallDuration = coroutineScope;
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityActionsTransactionInfo);
                        this.getHighSpeedVideoFpsRanges = activityActionsRepositoryImpl;
                        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityActionsTransactionInfo);
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionId);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionCreatedTime);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoiceReportSpamMutation);
                        this.getHighSpeedVideoFpsRangesFor = 0;
                        this.getOutputMinFrameDuration = 1;
                        execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(activityActionsRepositoryImpl.getApolloClient(), invoiceReportSpamMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("executeHideMutation", "Missing required transaction info for hide action");
                    return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing required transaction info for hide action", null, 2, null), 1, null));
                }
                com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("executeHideMutation", "Missing activityActionsTransactionInfo for hide action");
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing activityActionsTransactionInfo for hide action", null, 2, null), 1, null));
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl2 = (com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            activityActionsRepositoryImpl = activityActionsRepositoryImpl2;
            execute$default = obj;
            arrow.core.Ior.Both mapActivityGraphQL = com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) execute$default, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                }
            });
            if (mapActivityGraphQL instanceof arrow.core.Ior.Left) {
                mapActivityGraphQL = new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Ior.Left) mapActivityGraphQL).getValue(), 1, null));
            } else if (!(mapActivityGraphQL instanceof arrow.core.Ior.Right)) {
                if (!(mapActivityGraphQL instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                mapActivityGraphQL = new arrow.core.Ior.Both(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Ior.Both) mapActivityGraphQL).getLeftValue(), 1, null), ((arrow.core.Ior.Both) mapActivityGraphQL).getRightValue());
            }
            if (mapActivityGraphQL != null) {
                return mapActivityGraphQL;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("executeHideMutation", "Missing activityActionsTransactionInfo for hide action");
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("Missing activityActionsTransactionInfo for hide action", null, 2, null), 1, null));
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("executeHideMutation", e);
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, this.getHighSpeedVideoSizesFor.getActivityErrorMapper().mapToDomainError(e), 1, null));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        return new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl.access$mapInvoiceReportSpamMutationResult(activityActionsRepositoryImpl, (com.paypal.oslo.feature.activity.graphql.InvoiceReportSpamMutation.Data) graphQLData.getData()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, ? extends com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2 activityActionsRepositoryImpl$executeHideMutation$2 = new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
        activityActionsRepositoryImpl$executeHideMutation$2.getOutputStallDuration = obj;
        return activityActionsRepositoryImpl$executeHideMutation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityActionsRepositoryImpl$executeHideMutation$2(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionModel;
        this.getHighSpeedVideoSizesFor = activityActionsRepositoryImpl;
    }
}
