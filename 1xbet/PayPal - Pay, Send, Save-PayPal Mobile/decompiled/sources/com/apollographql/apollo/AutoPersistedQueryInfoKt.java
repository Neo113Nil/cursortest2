package com.apollographql.apollo;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"'\u0010\u0006\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/apollographql/apollo/AutoPersistedQueryInfo;", "getAutoPersistedQueryInfo", "(Lcom/apollographql/apollo/api/ApolloResponse;)Lcom/apollographql/apollo/AutoPersistedQueryInfo;", "autoPersistedQueryInfo"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutoPersistedQueryInfoKt {
    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.AutoPersistedQueryInfo getAutoPersistedQueryInfo(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        return (com.apollographql.apollo.AutoPersistedQueryInfo) apolloResponse.executionContext.get(com.apollographql.apollo.AutoPersistedQueryInfo.INSTANCE);
    }
}
