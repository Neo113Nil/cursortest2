package com.paypal.oslo.core.network.graphql.di;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/di/GraphQLMultibindingsModule;", "", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "bindPluginInterceptors", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface GraphQLMultibindingsModule {
    @dagger.multibindings.Multibinds
    java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> bindPluginInterceptors();
}
