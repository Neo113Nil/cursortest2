package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSelfCorrectionRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReportSelfCorrectionRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/selfcorrection/RequestTaxReportSelfCorrectionResultMapper;", "resultMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "errorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/selfcorrection/RequestTaxReportSelfCorrectionResultMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;)V", "", "reportId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/selfcorrection/RequestTaxReportSelfCorrectionResult;", "requestSelfCorrection", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/selfcorrection/RequestTaxReportSelfCorrectionResultMapper;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportSelfCorrectionRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public TaxReportSelfCorrectionRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.selfcorrection.RequestTaxReportSelfCorrectionResultMapper requestTaxReportSelfCorrectionResultMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrectionResultMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToTaxDocumentCenterErrorMapper, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = requestTaxReportSelfCorrectionResultMapper;
        this.getHighSpeedVideoFpsRanges = callErrorToTaxDocumentCenterErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0051, B:12:0x00ca, B:15:0x00d0, B:16:0x0113, B:18:0x0121, B:20:0x0127, B:22:0x013a, B:25:0x0142, B:27:0x014a, B:28:0x0154, B:33:0x00ef, B:34:0x010d, B:35:0x0112), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestSelfCorrection(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1 taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1;
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
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data data;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1) {
            taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1) continuation;
            if ((taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1.getOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1 taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1;
                java.lang.Object obj2 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl.m20290$r8$lambda$7aCSo1dYtVzU8X5JmqKiYYep2k((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj3, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput requestTaxReportSelfCorrectionInput = new com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation requestTaxReportSelfCorrectionMutation = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation(requestTaxReportSelfCorrectionInput);
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getInputSizeshNQ4ISI = function2;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputFormats = atomicReference;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputMinFrameDuration = defaultRaise;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputSizes = iorRaise3;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestTaxReportSelfCorrectionInput);
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputStallDurationlomOqCM = iorRaise3;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoFpsRanges = 0;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoFpsRangesFor = 0;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.Camera2StreamConfigurationMap = 0;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoSizes = 0;
                        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, requestTaxReportSelfCorrectionMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        obj2 = execute$default;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
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
                    int i2 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoSizes;
                    int i3 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.Camera2StreamConfigurationMap;
                    int i4 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoFpsRangesFor;
                    int i6 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getHighSpeedVideoFpsRanges;
                    iorRaise2 = (arrow.core.raise.IorRaise) taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputStallDurationlomOqCM;
                    iorRaise = (arrow.core.raise.IorRaise) taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getOutputFormats;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$12.getInputSizeshNQ4ISI;
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
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
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
                    both = new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
                if (data != null || (requestTaxReportSelfCorrection = data.getRequestTaxReportSelfCorrection()) == null) {
                    iorRaise.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult map = this.getHighSpeedVideoSizes.map(requestTaxReportSelfCorrection);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj3, map);
            }
        }
        taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1(this, continuation);
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1 taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$122 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$1;
        java.lang.Object obj22 = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxReportSelfCorrectionRepositoryImpl$requestSelfCorrection$122.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
        if (data != null) {
        }
        iorRaise.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$7aCSo1dY-tVzU8X5JmqKiYYep2k, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError m20290$r8$lambda$7aCSo1dYtVzU8X5JmqKiYYep2k(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError2, "");
        return taxDocumentCenterError;
    }
}
