package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReconciliationReportRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReconciliationReportRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/reconciliation/CreateTaxReconciliationReportResultMapper;", "resultMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "errorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/reconciliation/CreateTaxReconciliationReportResultMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;)V", "", "fiscalYear", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/reconciliation/CreateTaxReconciliationReportResult;", "createReconciliationReport", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/reconciliation/CreateTaxReconciliationReportResultMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReconciliationReportRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TaxReconciliationReportRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.reconciliation.CreateTaxReconciliationReportResultMapper createTaxReconciliationReportResultMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTaxReconciliationReportResultMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToTaxDocumentCenterErrorMapper, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighSpeedVideoFpsRanges = createTaxReconciliationReportResultMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = callErrorToTaxDocumentCenterErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0051, B:12:0x00ca, B:15:0x00d0, B:16:0x0113, B:18:0x0121, B:20:0x0127, B:22:0x013a, B:25:0x0142, B:27:0x014a, B:28:0x0154, B:33:0x00ef, B:34:0x010d, B:35:0x0112), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createReconciliationReport(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.reconciliation.CreateTaxReconciliationReportResult>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1 taxReconciliationReportRepositoryImpl$createReconciliationReport$1;
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
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation.Data data;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation.CreateTaxReconciliationReport createTaxReconciliationReport;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1) {
            taxReconciliationReportRepositoryImpl$createReconciliationReport$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1) continuation;
            if ((taxReconciliationReportRepositoryImpl$createReconciliationReport$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                taxReconciliationReportRepositoryImpl$createReconciliationReport$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1 taxReconciliationReportRepositoryImpl$createReconciliationReport$12 = taxReconciliationReportRepositoryImpl$createReconciliationReport$1;
                java.lang.Object obj2 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl.$r8$lambda$Ma1fI3mKDrwCrgCPySBhiqH4ET0((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj3, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput createTaxReconciliationReportInput = new com.paypal.oslo.api.graphql.schema.type.CreateTaxReconciliationReportInput(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation createTaxReconciliationReportMutation = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation(createTaxReconciliationReportInput);
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputMinFrameDuration = function2;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getInputSizeshNQ4ISI = atomicReference;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getInputFormats = defaultRaise;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputSizeshNQ4ISI = iorRaise3;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createTaxReconciliationReportInput);
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputStallDurationlomOqCM = iorRaise3;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoSizes = 0;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoFpsRangesFor = 0;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoFpsRanges = 0;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.Camera2StreamConfigurationMap = 0;
                        taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputStallDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createTaxReconciliationReportMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, taxReconciliationReportRepositoryImpl$createReconciliationReport$12, 2, (java.lang.Object) null);
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
                    int i2 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.Camera2StreamConfigurationMap;
                    int i3 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoFpsRanges;
                    int i4 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoFpsRangesFor;
                    int i6 = taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getHighSpeedVideoSizes;
                    iorRaise2 = (arrow.core.raise.IorRaise) taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputStallDurationlomOqCM;
                    iorRaise = (arrow.core.raise.IorRaise) taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getInputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getInputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) taxReconciliationReportRepositoryImpl$createReconciliationReport$12.getOutputMinFrameDuration;
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
                    both = new arrow.core.Ior.Left(this.getHighResolutionOutputSizeshNQ4ISI.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(this.getHighResolutionOutputSizeshNQ4ISI.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
                if (data != null || (createTaxReconciliationReport = data.getCreateTaxReconciliationReport()) == null) {
                    iorRaise.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.reconciliation.CreateTaxReconciliationReportResult map = this.getHighSpeedVideoFpsRanges.map(createTaxReconciliationReport);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj3, map);
            }
        }
        taxReconciliationReportRepositoryImpl$createReconciliationReport$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1(this, continuation);
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReconciliationReportRepositoryImpl$createReconciliationReport$1 taxReconciliationReportRepositoryImpl$createReconciliationReport$122 = taxReconciliationReportRepositoryImpl$createReconciliationReport$1;
        java.lang.Object obj22 = taxReconciliationReportRepositoryImpl$createReconciliationReport$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxReconciliationReportRepositoryImpl$createReconciliationReport$122.getOutputStallDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.CreateTaxReconciliationReportMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
        if (data != null) {
        }
        iorRaise.raise(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError $r8$lambda$Ma1fI3mKDrwCrgCPySBhiqH4ET0(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError2, "");
        return taxDocumentCenterError;
    }
}
