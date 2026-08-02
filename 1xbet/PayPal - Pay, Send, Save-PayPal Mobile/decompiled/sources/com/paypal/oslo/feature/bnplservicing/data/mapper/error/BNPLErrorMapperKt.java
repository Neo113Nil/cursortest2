package com.paypal.oslo.feature.bnplservicing.data.mapper.error;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "toBNPLErrors", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/util/List;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;", "partialErrorMap", "Ljava/util/Map;", "getPartialErrorMap", "()Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BNPLErrorMapperKt {
    private static final java.util.Map<java.lang.String, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType> partialErrorMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PREQUALIFICATION_SUMMARY, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PREQUALIFICATION_SUMMARY), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PREQUALIFICATION_SUMMARY_AMOUNT, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PREQUALIFICATION_SUMMARY_AMOUNT), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_ACTIVE, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_ACTIVE), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_ACTIVE_PAGE, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_ACTIVE_PAGE), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_ACTIVE_PAGE_ITEMS, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_ACTIVE_PLANS), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_HISTORY, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_HISTORY), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_HISTORY_PAGE, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_HISTORY_PAGE), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_HISTORY_PAGE_ITEMS, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_HISTORY_PLANS), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLAN_DETAILS, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLAN_DETAILS), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLAN_DETAILS_AUTOPAY, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLAN_DETAILS_AUTOPAY), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLAN_DETAILS_FI, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLAN_DETAILS_FI), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLAN_DETAILS_ACTIVITIES, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLAN_DETAILS_ACTIVITIES), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.MAKE_A_PAYMENT, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.MAKE_A_PAYMENT), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.MAKE_A_PAYMENT_FI, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.MAKE_A_PAYMENT_FI));

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> toBNPLErrors(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError unknownNetworkError;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType;
        java.lang.Object obj;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                unknownNetworkError = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause(), null, 2, null);
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                unknownNetworkError = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody(), null, 8, null);
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                unknownNetworkError = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause(), null, 2, null);
            }
            return kotlin.collections.CollectionsKt.listOf(unknownNetworkError);
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        for (com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError : m11659getErrors1X0FAY) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
            if (extensions == null) {
                extensions = kotlin.collections.MapsKt.emptyMap();
            }
            java.lang.Object obj2 = extensions.get("name");
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str == null) {
                str = "UNKNOWN";
            }
            java.lang.Object obj3 = extensions.get("service");
            java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.Object obj4 = extensions.get("details");
            java.util.List list = obj4 instanceof java.util.List ? (java.util.List) obj4 : null;
            if (list != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj5 : list) {
                    java.util.Map map = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
                    if (map != null) {
                        java.lang.Object obj6 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                        java.lang.String str3 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                        java.lang.Object obj7 = map.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                        java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                        java.lang.Object obj8 = map.get("field");
                        java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                        java.lang.Object obj9 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                        errorDetail = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail(str3, str4, str5, obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null);
                    } else {
                        errorDetail = null;
                    }
                    if (errorDetail != null) {
                        arrayList4.add(errorDetail);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(str, str2, arrayList);
            java.lang.String message = graphQLError.getMessage();
            java.util.List<java.lang.Object> path = graphQLError.getPath();
            if (path != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj10 : path) {
                    java.lang.String str6 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    if (str6 != null) {
                        arrayList5.add(str6);
                    }
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                java.util.ArrayList arrayList6 = arrayList2.isEmpty() ? null : arrayList2;
                if (arrayList6 != null) {
                    java.util.Iterator it = arrayList6.iterator();
                    if (!it.hasNext()) {
                        throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    java.lang.Object next = it.next();
                    while (it.hasNext()) {
                        java.lang.String str7 = (java.lang.String) it.next();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append((java.lang.String) next);
                        sb.append(".");
                        sb.append(str7);
                        next = sb.toString();
                    }
                    java.lang.String str8 = (java.lang.String) next;
                    if (str8 != null) {
                        if (str8.length() <= 0) {
                            str8 = null;
                        }
                        if (str8 != null) {
                            java.util.Iterator it2 = kotlin.collections.CollectionsKt.sortedWith(partialErrorMap.entrySet(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.bnplservicing.data.mapper.error.BNPLErrorMapperKt$getPartialErrorTypes$$inlined$sortedByDescending$1
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((java.lang.String) ((java.util.Map.Entry) t2).getKey()).length()), java.lang.Integer.valueOf(((java.lang.String) ((java.util.Map.Entry) t).getKey()).length()));
                                }
                            }).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str8, (java.lang.CharSequence) ((java.util.Map.Entry) obj).getKey(), false, 2, (java.lang.Object) null)) {
                                    break;
                                }
                            }
                            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                            if (entry == null || (partialErrorType = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType) entry.getValue()) == null) {
                                partialErrorType = com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.NONE;
                            }
                            arrayList3.add(partialErrorType == com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.NONE ? new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError(partialErrorType, message, arrayList2, graphQLExtensions) : new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown(message, arrayList2, graphQLExtensions));
                        }
                    }
                }
            }
            partialErrorType = com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.NONE;
            arrayList3.add(partialErrorType == com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.NONE ? new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError(partialErrorType, message, arrayList2, graphQLExtensions) : new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown(message, arrayList2, graphQLExtensions));
        }
        return arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList3));
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType> getPartialErrorMap() {
        return partialErrorMap;
    }
}
