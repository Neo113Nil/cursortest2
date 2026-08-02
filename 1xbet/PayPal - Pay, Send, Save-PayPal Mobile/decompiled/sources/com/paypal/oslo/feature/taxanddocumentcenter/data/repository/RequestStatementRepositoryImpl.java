package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/RequestStatementRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/RequestStatementRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/GenerateStatementRequestMapper;", "requestMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/RequestStatementMapper;", "statementMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "errorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/GenerateStatementRequestMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/RequestStatementMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "", "requestStatement", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/GenerateStatementRequestMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/RequestStatementMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestStatementRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RequestStatementRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.GenerateStatementRequestMapper generateStatementRequestMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement.RequestStatementMapper requestStatementMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateStatementRequestMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestStatementMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToTaxDocumentCenterErrorMapper, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoSizes = generateStatementRequestMapper;
        this.getHighSpeedVideoFpsRanges = requestStatementMapper;
        this.getHighSpeedVideoFpsRangesFor = callErrorToTaxDocumentCenterErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0128 A[Catch: all -> 0x005a, RaiseCancellationException -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x005d, all -> 0x005a, blocks: (B:11:0x0055, B:12:0x0120, B:15:0x0128, B:16:0x0175, B:18:0x0183, B:20:0x0189, B:22:0x01a4, B:25:0x01ac, B:27:0x01b4, B:28:0x01be, B:33:0x014c, B:34:0x016f, B:35:0x0174), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestStatement(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest generateStatementRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1 requestStatementRepositoryImpl$requestStatement$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.Data data;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.RequestTaxDocument requestTaxDocument;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1) {
            requestStatementRepositoryImpl$requestStatement$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1) continuation;
            if ((requestStatementRepositoryImpl$requestStatement$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                requestStatementRepositoryImpl$requestStatement$1.getOutputSizes -= 2147483648;
                com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1 requestStatementRepositoryImpl$requestStatement$12 = requestStatementRepositoryImpl$requestStatement$1;
                java.lang.Object obj2 = requestStatementRepositoryImpl$requestStatement$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = requestStatementRepositoryImpl$requestStatement$12.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl.$r8$lambda$0PDk301vkw54_fiRANGGZCihmTw((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj3, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Requesting tax document statement", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fileType", generateStatementRequest.getFileType().name()), kotlin.TuplesKt.to("transactionType", generateStatementRequest.getTransactionType().name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, generateStatementRequest.getStartTime()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, generateStatementRequest.getEndTime())), null, 4, null);
                        com.paypal.oslo.api.graphql.schema.type.RequestTaxDocumentInput map = this.getHighSpeedVideoSizes.map(generateStatementRequest);
                        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation requestTaxDocumentMutation = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation(map);
                        requestStatementRepositoryImpl$requestStatement$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generateStatementRequest);
                        requestStatementRepositoryImpl$requestStatement$12.getInputFormats = function2;
                        requestStatementRepositoryImpl$requestStatement$12.getOutputMinFrameDuration = atomicReference;
                        requestStatementRepositoryImpl$requestStatement$12.getOutputFormats = defaultRaise;
                        requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        requestStatementRepositoryImpl$requestStatement$12.getOutputSizeshNQ4ISI = iorRaise3;
                        requestStatementRepositoryImpl$requestStatement$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                        requestStatementRepositoryImpl$requestStatement$12.getOutputStallDurationlomOqCM = iorRaise3;
                        requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoFpsRangesFor = 0;
                        requestStatementRepositoryImpl$requestStatement$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoSizes = 0;
                        requestStatementRepositoryImpl$requestStatement$12.Camera2StreamConfigurationMap = 0;
                        requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoFpsRanges = 0;
                        requestStatementRepositoryImpl$requestStatement$12.getOutputSizes = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, requestTaxDocumentMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, requestStatementRepositoryImpl$requestStatement$12, 2, (java.lang.Object) null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoFpsRanges;
                    int i3 = requestStatementRepositoryImpl$requestStatement$12.Camera2StreamConfigurationMap;
                    int i4 = requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoSizes;
                    int i5 = requestStatementRepositoryImpl$requestStatement$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = requestStatementRepositoryImpl$requestStatement$12.getHighSpeedVideoFpsRangesFor;
                    iorRaise = (arrow.core.raise.IorRaise) requestStatementRepositoryImpl$requestStatement$12.getOutputStallDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) requestStatementRepositoryImpl$requestStatement$12.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) requestStatementRepositoryImpl$requestStatement$12.getOutputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) requestStatementRepositoryImpl$requestStatement$12.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) requestStatementRepositoryImpl$requestStatement$12.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = function22;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "requestStatement");
                    both = new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.map(callError));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (both instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                        com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError2, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "requestStatement");
                        both = new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.map(callError2), ((arrow.core.Ior.Both) both).getRightValue());
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
                if (data != null || (requestTaxDocument = data.getRequestTaxDocument()) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRanges.map(requestTaxDocument).booleanValue());
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(boxBoolean) : new arrow.core.Ior.Both(obj3, boxBoolean);
            }
        }
        requestStatementRepositoryImpl$requestStatement$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1(this, continuation);
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.RequestStatementRepositoryImpl$requestStatement$1 requestStatementRepositoryImpl$requestStatement$122 = requestStatementRepositoryImpl$requestStatement$1;
        java.lang.Object obj22 = requestStatementRepositoryImpl$requestStatement$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = requestStatementRepositoryImpl$requestStatement$122.getOutputSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError $r8$lambda$0PDk301vkw54_fiRANGGZCihmTw(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError2, "");
        return taxDocumentCenterError;
    }
}
