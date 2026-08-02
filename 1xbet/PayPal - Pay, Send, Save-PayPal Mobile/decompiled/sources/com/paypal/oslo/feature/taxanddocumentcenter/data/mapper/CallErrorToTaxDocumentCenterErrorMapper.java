package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/CallErrorToTaxDocumentCenterErrorMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/PageErrors;", "mapPageErrors$tax_and_document_center_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/PageErrors;", "", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "getHighSpeedVideoSizes", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallErrorToTaxDocumentCenterErrorMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CallErrorToTaxDocumentCenterErrorMapper() {
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError map(com.paypal.oslo.core.network.graphql.error.CallError input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return Camera2StreamConfigurationMap(((com.paypal.oslo.core.network.graphql.error.CallError.Network) input).getError());
        }
        if (!(input instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError highSpeedVideoSizes = getHighSpeedVideoSizes(arrow.core.NonEmptyList.m9604toListimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) input).m11659getErrors1X0FAY()));
        return highSpeedVideoSizes == null ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError("Unknown GraphQL error") : highSpeedVideoSizes;
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.http.error.NetworkError p0) {
        if (!(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) && !(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) && !(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Network.INSTANCE;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors mapPageErrors$tax_and_document_center_prodRelease(com.paypal.oslo.core.network.graphql.error.CallError input) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError serverError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.core.network.graphql.error.CallError.Network) input).getError());
            return new com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap);
        }
        if (!(input instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) input;
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m9567boximpl) {
            if (!Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        arrow.core.NonEmptyList m9567boximpl2 = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : m9567boximpl2) {
            if (Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj2)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError highSpeedVideoSizes = getHighSpeedVideoSizes(arrayList2);
        if (arrayList4.isEmpty()) {
            serverError = null;
        } else {
            java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4)).getMessage();
            if (kotlin.text.StringsKt.isBlank(message)) {
                message = "Unknown GraphQL error";
            }
            serverError = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError(message);
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors(highSpeedVideoSizes, serverError);
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError getHighSpeedVideoSizes(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> p0) {
        if (p0.isEmpty()) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = p0.iterator();
        java.lang.String str = "";
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage();
            java.lang.String str2 = kotlin.text.StringsKt.isBlank(message) ? "Unknown GraphQL error" : message;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "TAX_REPORT_EXCEPTION")) {
                linkedHashSet.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection[]{com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS}));
                str = "TAX_REPORT_EXCEPTION";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "SAVINGS_REPORT_EXCEPTION")) {
                if (str.length() == 0) {
                    str = "SAVINGS_REPORT_EXCEPTION";
                }
                linkedHashSet.add(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS);
            }
            z = true;
        }
        if (z) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError(str, str, kotlin.collections.CollectionsKt.toList(linkedHashSet));
        }
        java.lang.String message2 = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) p0)).getMessage();
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError(kotlin.text.StringsKt.isBlank(message2) ? "Unknown GraphQL error" : message2);
    }

    private static boolean Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        java.lang.Object firstOrNull;
        java.util.List<java.lang.Object> path = graphQLError.getPath();
        return kotlin.jvm.internal.Intrinsics.areEqual((path == null || (firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) path)) == null) ? null : firstOrNull.toString(), "ipsArticles");
    }
}
