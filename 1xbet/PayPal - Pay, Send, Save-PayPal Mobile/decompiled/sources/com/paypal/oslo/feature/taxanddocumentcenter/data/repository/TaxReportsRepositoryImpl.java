package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportsRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReportsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;", "taxReportsMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;", "sectionsProcessor", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;)V", "", "fiscalYear", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportsDomain;", "getTaxReports", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countryCode", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "getTaxReportSections", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportsRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TaxReportsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper taxReportsMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor taxReportSectionsProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToTaxDocumentCenterErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSectionsProcessor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
        this.getHighSpeedVideoFpsRanges = taxReportsMapper;
        this.Camera2StreamConfigurationMap = callErrorToTaxDocumentCenterErrorMapper;
        this.getHighSpeedVideoSizes = taxReportSectionsProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTaxReports(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReports$1 taxReportsRepositoryImpl$getTaxReports$1;
        int i;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports;
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports2;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReports$1) {
            taxReportsRepositoryImpl$getTaxReports$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReports$1) continuation;
            if ((taxReportsRepositoryImpl$getTaxReports$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                taxReportsRepositoryImpl$getTaxReports$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = taxReportsRepositoryImpl$getTaxReports$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxReportsRepositoryImpl$getTaxReports$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Fetching tax reports", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fiscalYear", str)), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.TaxReportsInput taxReportsInput = new com.paypal.oslo.api.graphql.schema.type.TaxReportsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery(taxReportsInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    taxReportsRepositoryImpl$getTaxReports$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    taxReportsRepositoryImpl$getTaxReports$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxReportsInput);
                    taxReportsRepositoryImpl$getTaxReports$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    taxReportsRepositoryImpl$getTaxReports$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, taxReportsRepositoryImpl$getTaxReports$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "getTaxReports");
                    both = new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.map(callError));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue();
                        com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError2, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "getTaxReports");
                        both = new arrow.core.Ior.Both(this.Camera2StreamConfigurationMap.map(callError2), both2.getRightValue());
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) both).getValue());
                }
                if (both instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                    if (data == null || (taxReports2 = data.getTaxReports()) == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
                    }
                    return new arrow.core.Ior.Right(this.getHighSpeedVideoFpsRanges.map(taxReports2));
                }
                if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) both3.getLeftValue();
                    com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data data2 = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue()).getData();
                    if (data2 == null || (taxReports = data2.getTaxReports()) == null) {
                        return new arrow.core.Ior.Left(taxDocumentCenterError);
                    }
                    return new arrow.core.Ior.Both(taxDocumentCenterError, this.getHighSpeedVideoFpsRanges.map(taxReports));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        taxReportsRepositoryImpl$getTaxReports$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReports$1(this, continuation);
        java.lang.Object obj2 = taxReportsRepositoryImpl$getTaxReports$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxReportsRepositoryImpl$getTaxReports$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTaxReportSections(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, ? extends java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReportSections$1 taxReportsRepositoryImpl$getTaxReportSections$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReportSections$1) {
            taxReportsRepositoryImpl$getTaxReportSections$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReportSections$1) continuation;
            if ((taxReportsRepositoryImpl$getTaxReportSections$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                taxReportsRepositoryImpl$getTaxReportSections$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = taxReportsRepositoryImpl$getTaxReportSections$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxReportsRepositoryImpl$getTaxReportSections$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    taxReportsRepositoryImpl$getTaxReportSections$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    taxReportsRepositoryImpl$getTaxReportSections$1.getHighSpeedVideoFpsRangesFor = str2;
                    taxReportsRepositoryImpl$getTaxReportSections$1.Camera2StreamConfigurationMap = 1;
                    obj = getTaxReports(str, taxReportsRepositoryImpl$getTaxReportSections$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) taxReportsRepositoryImpl$getTaxReportSections$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) taxReportsRepositoryImpl$getTaxReportSections$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return this.getHighSpeedVideoSizes.buildSectionsWithError(kotlin.collections.CollectionsKt.emptyList(), str, str2, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return this.getHighSpeedVideoSizes.buildSectionsWithError(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain) ((arrow.core.Ior.Right) ior).getValue()).getItems(), str, str2, null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return this.getHighSpeedVideoSizes.buildSectionsWithError(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain) both.getRightValue()).getItems(), str, str2, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) leftValue);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        taxReportsRepositoryImpl$getTaxReportSections$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl$getTaxReportSections$1(this, continuation);
        java.lang.Object obj2 = taxReportsRepositoryImpl$getTaxReportSections$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxReportsRepositoryImpl$getTaxReportSections$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
