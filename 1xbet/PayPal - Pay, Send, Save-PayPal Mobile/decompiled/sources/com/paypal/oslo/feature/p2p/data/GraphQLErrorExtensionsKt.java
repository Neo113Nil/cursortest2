package com.paypal.oslo.feature.p2p.data;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "", "hasDetailIssue", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GraphQLErrorExtensionsKt {
    public static final boolean hasDetailIssue(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("details") : null;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof java.util.Map) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return false;
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object obj3 = ((java.util.Map) it.next()).get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
