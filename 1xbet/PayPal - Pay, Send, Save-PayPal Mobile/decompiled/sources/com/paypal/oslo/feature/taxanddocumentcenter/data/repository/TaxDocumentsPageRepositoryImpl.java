package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u00132\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b#\u0010$JO\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u0013H\u0002¢\u0006\u0004\b\u001f\u0010%JC\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0&2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\"0\u001dH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxDocumentsPageRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxDocumentsPageRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;", "taxReportsMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/faq/IpsArticleMapper;", "ipsArticleMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;", "sectionsProcessor", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/faq/IpsArticleMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;)V", "", "fiscalYear", "countryCode", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/IpsArticleParams;", "ipsParams", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxDocumentsPageDataDomain;", "getPageData", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/IpsArticleParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;", "p0", "p1", "p2", "p3", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$IpsArticle;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Larrow/core/Ior;", "(Larrow/core/Ior;Larrow/core/Ior;)Larrow/core/Ior;", "Larrow/core/Ior$Both;", "getHighSpeedVideoSizes", "(Larrow/core/Ior$Both;Ljava/util/List;)Larrow/core/Ior;", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/faq/IpsArticleMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsPageRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper getHighResolutionOutputSizeshNQ4ISI;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TaxDocumentsPageRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper taxReportsMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper ipsArticleMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor taxReportSectionsProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ipsArticleMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToTaxDocumentCenterErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSectionsProcessor, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = taxReportsMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = ipsArticleMapper;
        this.getHighSpeedVideoFpsRanges = callErrorToTaxDocumentCenterErrorMapper;
        this.Camera2StreamConfigurationMap = taxReportSectionsProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPageData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.IpsArticleParams ipsArticleParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain>> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl$getPageData$1 taxDocumentsPageRepositoryImpl$getPageData$1;
        int i;
        java.lang.String str3;
        arrow.core.Ior ior;
        java.lang.String str4 = str;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl$getPageData$1) {
            taxDocumentsPageRepositoryImpl$getPageData$1 = (com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl$getPageData$1) continuation;
            if ((taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = taxDocumentsPageRepositoryImpl$getPageData$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.TaxReportsInput taxReportsInput = new com.paypal.oslo.api.graphql.schema.type.TaxReportsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str4));
                    com.paypal.oslo.api.graphql.schema.type.IpsArticlesInput ipsArticlesInput = new com.paypal.oslo.api.graphql.schema.type.IpsArticlesInput(com.paypal.oslo.api.graphql.schema.type.Persona.INSTANCE.safeValueOf(ipsArticleParams.getPersona().name()), com.paypal.oslo.api.graphql.schema.type.Experience.INSTANCE.safeValueOf(ipsArticleParams.getExperience().name()), ipsArticleParams.getProductReferenceId(), ipsArticleParams.getPageReferenceId(), ipsArticleParams.getFieldReferenceId());
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.query(new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery(taxReportsInput, ipsArticlesInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    taxDocumentsPageRepositoryImpl$getPageData$1.Camera2StreamConfigurationMap = str4;
                    str3 = str2;
                    taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizes = str3;
                    taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ipsArticleParams);
                    taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxReportsInput);
                    taxDocumentsPageRepositoryImpl$getPageData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ipsArticlesInput);
                    taxDocumentsPageRepositoryImpl$getPageData$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, taxDocumentsPageRepositoryImpl$getPageData$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str5 = (java.lang.String) taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizes;
                    java.lang.String str6 = (java.lang.String) taxDocumentsPageRepositoryImpl$getPageData$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = str5;
                    str4 = str6;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "getPageData");
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.map(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data data = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
                    }
                    return getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(data.getTaxReports(), str4, str3, null), getHighResolutionOutputSizeshNQ4ISI(data.getIpsArticles(), null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.taxanddocumentcenter.data.util.CallErrorExtensionsKt.logError(callError2, com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "getPageData");
                    com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data data2 = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data) graphQLData.getData();
                    if (data2 == null) {
                        return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.map(callError2));
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors mapPageErrors$tax_and_document_center_prodRelease = this.getHighSpeedVideoFpsRanges.mapPageErrors$tax_and_document_center_prodRelease(callError2);
                    return getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(data2.getTaxReports(), str4, str3, mapPageErrors$tax_and_document_center_prodRelease.getReportError()), getHighResolutionOutputSizeshNQ4ISI(data2.getIpsArticles(), mapPageErrors$tax_and_document_center_prodRelease.getFaqError()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        taxDocumentsPageRepositoryImpl$getPageData$1 = new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl$getPageData$1(this, continuation);
        java.lang.Object obj2 = taxDocumentsPageRepositoryImpl$getPageData$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxDocumentsPageRepositoryImpl$getPageData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Ior<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports p0, java.lang.String p1, java.lang.String p2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError p3) {
        if (p0 == null) {
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
        }
        try {
            return this.Camera2StreamConfigurationMap.buildSectionsWithError(this.getHighSpeedVideoFpsRangesFor.map(p0).getItems(), p1, p2, p3);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to process tax reports", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE);
        }
    }

    private final arrow.core.Ior<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem>> getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle> p0, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError p1) {
        try {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> map = this.getHighResolutionOutputSizeshNQ4ISI.map(p0);
            if (map.isEmpty()) {
                if (p1 != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "FAQ articles failed with server error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", p1.getClass().getSimpleName())), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "FAQ articles are empty - no FAQ data available", null, null, 6, null);
                }
                return new arrow.core.Ior.Left(p1 == null ? com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE : p1);
            }
            return new arrow.core.Ior.Right(map);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to process FAQ articles", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            if (p1 == null) {
                p1 = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData.INSTANCE;
            }
            return new arrow.core.Ior.Left(p1);
        }
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain> getHighSpeedVideoFpsRangesFor(arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, ? extends java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>> p0, arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, ? extends java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem>> p1) {
        boolean z = p0 instanceof arrow.core.Ior.Right;
        if (z && (p1 instanceof arrow.core.Ior.Right)) {
            java.util.List list = (java.util.List) ((arrow.core.Ior.Right) p0).getValue();
            java.util.List list2 = (java.util.List) ((arrow.core.Ior.Right) p1).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Both tax reports and FAQ articles succeeded", null, null, 6, null);
            return new arrow.core.Ior.Right(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(list, list2));
        }
        boolean z2 = p0 instanceof arrow.core.Ior.Both;
        if (z2 && (p1 instanceof arrow.core.Ior.Right)) {
            return getHighSpeedVideoSizes((arrow.core.Ior.Both) p0, (java.util.List) ((arrow.core.Ior.Right) p1).getValue());
        }
        if (z2 && (p1 instanceof arrow.core.Ior.Left)) {
            return getHighSpeedVideoSizes((arrow.core.Ior.Both) p0, kotlin.collections.CollectionsKt.emptyList());
        }
        if (z && (p1 instanceof arrow.core.Ior.Left)) {
            java.util.List list3 = (java.util.List) ((arrow.core.Ior.Right) p0).getValue();
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) p1).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Tax reports succeeded but FAQ articles failed - returning partial data", null, null, 6, null);
            return new arrow.core.Ior.Both(taxDocumentCenterError, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(list3, kotlin.collections.CollectionsKt.emptyList()));
        }
        boolean z3 = p0 instanceof arrow.core.Ior.Left;
        if (z3 && (p1 instanceof arrow.core.Ior.Right)) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) p0).getValue();
            java.util.List list4 = (java.util.List) ((arrow.core.Ior.Right) p1).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Tax reports failed with error, FAQs succeeded - showing report error + FAQs", null, null, 6, null);
            return new arrow.core.Ior.Both(taxDocumentCenterError2, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(kotlin.collections.CollectionsKt.emptyList(), list4));
        }
        if (z3 && (p1 instanceof arrow.core.Ior.Left)) {
            return new arrow.core.Ior.Left((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) p0).getValue());
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Unexpected Ior combination - handling defensively", null, null, 6, null);
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> orNull = p0.getOrNull();
        if (orNull == null) {
            orNull = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> orNull2 = p1.getOrNull();
        if (orNull2 == null) {
            orNull2 = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain taxDocumentsPageDataDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(orNull, orNull2);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError leftOrNull = p0.leftOrNull();
        if (leftOrNull == null) {
            leftOrNull = p1.leftOrNull();
        }
        return leftOrNull != null ? new arrow.core.Ior.Both(leftOrNull, taxDocumentsPageDataDomain) : new arrow.core.Ior.Right(taxDocumentsPageDataDomain);
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain> getHighSpeedVideoSizes(arrow.core.Ior.Both<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, ? extends java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>> p0, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> p1) {
        java.lang.String str;
        if (p1.isEmpty()) {
            str = "Tax reports have section errors, FAQs failed - showing sections with errors + FAQ error";
        } else {
            str = "Tax reports have section errors, FAQs succeeded - showing sections with errors + FAQs";
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, str, null, null, 6, null);
        return new arrow.core.Ior.Both(p0.getLeftValue(), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(p0.getRightValue(), p1));
    }
}
