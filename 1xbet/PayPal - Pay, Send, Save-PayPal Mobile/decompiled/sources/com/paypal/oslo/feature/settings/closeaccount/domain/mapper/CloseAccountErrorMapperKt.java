package com.paypal.oslo.feature.settings.closeaccount.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/apollographql/apollo/api/Error;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "toCloseAccountError", "(Lcom/apollographql/apollo/api/Error;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/apollographql/apollo/api/ApolloResponse;", "extractCloseAccountError", "(Lcom/apollographql/apollo/api/ApolloResponse;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountErrorMapperKt {
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError toCloseAccountError(com.apollographql.apollo.api.Error error) {
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.ConnectorInfo connectorInfo;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo httpInfo;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorDetail errorDetail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.lang.String message = error.getMessage();
        java.util.List<java.lang.Object> path = error.getPath();
        if (path == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<java.lang.Object> list = path;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            emptyList = arrayList;
        }
        java.util.Map<java.lang.String, java.lang.Object> extensions = error.getExtensions();
        com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions = null;
        java.util.ArrayList arrayList2 = null;
        if (extensions != null) {
            java.lang.Object obj = extensions.get("code");
            java.lang.String obj2 = obj != null ? obj.toString() : null;
            java.lang.String str = obj2 == null ? "" : obj2;
            java.lang.Object obj3 = extensions.get("service");
            java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
            java.lang.Object obj5 = extensions.get("connector");
            java.util.Map map = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
            if (map != null) {
                java.lang.Object obj6 = map.get("coordinate");
                java.lang.String obj7 = obj6 != null ? obj6.toString() : null;
                if (obj7 == null) {
                    obj7 = "";
                }
                connectorInfo = new com.paypal.oslo.feature.settings.closeaccount.domain.model.ConnectorInfo(obj7);
            } else {
                connectorInfo = null;
            }
            java.lang.Object obj8 = extensions.get("http");
            java.util.Map map2 = obj8 instanceof java.util.Map ? (java.util.Map) obj8 : null;
            if (map2 != null) {
                java.lang.Object obj9 = map2.get("status");
                java.lang.Number number = obj9 instanceof java.lang.Number ? (java.lang.Number) obj9 : null;
                httpInfo = new com.paypal.oslo.feature.settings.closeaccount.domain.model.HttpInfo(number != null ? number.intValue() : 0);
            } else {
                httpInfo = null;
            }
            java.lang.Object obj10 = extensions.get("name");
            java.lang.String obj11 = obj10 != null ? obj10.toString() : null;
            java.lang.Object obj12 = extensions.get("details");
            java.util.List list2 = obj12 instanceof java.util.List ? (java.util.List) obj12 : null;
            if (list2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj13 : list2) {
                    java.util.Map map3 = obj13 instanceof java.util.Map ? (java.util.Map) obj13 : null;
                    if (map3 != null) {
                        java.lang.Object obj14 = map3.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                        java.lang.String obj15 = obj14 != null ? obj14.toString() : null;
                        if (obj15 == null) {
                            obj15 = "";
                        }
                        java.lang.Object obj16 = map3.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                        java.lang.String obj17 = obj16 != null ? obj16.toString() : null;
                        if (obj17 == null) {
                            obj17 = "";
                        }
                        errorDetail = new com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorDetail(obj15, obj17);
                    } else {
                        errorDetail = null;
                    }
                    if (errorDetail != null) {
                        arrayList3.add(errorDetail);
                    }
                }
                arrayList2 = arrayList3;
            }
            errorExtensions = new com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions(str, obj4, connectorInfo, httpInfo, obj11, arrayList2);
        }
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, emptyList, errorExtensions);
    }

    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError extractCloseAccountError(com.apollographql.apollo.api.ApolloResponse<?> apolloResponse) {
        com.apollographql.apollo.api.Error error;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
        return (list == null || (error = (com.apollographql.apollo.api.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null || (closeAccountError = toCloseAccountError(error)) == null) ? new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError("Unknown error occurred", kotlin.collections.CollectionsKt.emptyList(), null, 4, null) : closeAccountError;
    }
}
