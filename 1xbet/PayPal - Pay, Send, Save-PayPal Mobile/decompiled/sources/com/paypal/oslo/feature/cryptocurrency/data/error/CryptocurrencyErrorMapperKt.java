package com.paypal.oslo.feature.cryptocurrency.data.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "toCryptocurrencyError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptocurrencyErrorMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError toCryptocurrencyError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable dataUnavailable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
            java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()).iterator();
            do {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getExtensions();
                java.lang.Object obj = extensions != null ? extensions.get("details") : null;
                java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
                if (list != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (obj2 instanceof java.util.Map) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object obj3 = ((java.util.Map) it2.next()).get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                        if (str2 != null) {
                            str = str2;
                            break;
                        }
                    }
                }
            } while (str == null);
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "CODE_INVALIDATED")) {
                dataUnavailable = com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.CodeInvalidated.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, "INTERNAL_DECLINE")) {
                dataUnavailable = com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InternalDecline.INSTANCE;
            } else {
                java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
                java.util.Iterator<T> it3 = m11659getErrors1X0FAY.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it3.next()).getMessage());
                }
                dataUnavailable = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList2)));
            }
            return dataUnavailable;
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            if (((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode() == 404) {
                return com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE;
            }
            return com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Network.INSTANCE;
        }
        return com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Network.INSTANCE;
    }
}
