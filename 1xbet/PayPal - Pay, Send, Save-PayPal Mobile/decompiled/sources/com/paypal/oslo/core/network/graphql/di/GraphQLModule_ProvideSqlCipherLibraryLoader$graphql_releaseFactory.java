package com.paypal.oslo.core.network.graphql.di;

/* loaded from: classes4.dex */
public final class GraphQLModule_ProvideSqlCipherLibraryLoader$graphql_releaseFactory implements dagger.internal.Factory<com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader get() {
        return provideSqlCipherLibraryLoader$graphql_release();
    }

    public static com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideSqlCipherLibraryLoader$graphql_releaseFactory create() {
        return com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideSqlCipherLibraryLoader$graphql_releaseFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader provideSqlCipherLibraryLoader$graphql_release() {
        return (com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.graphql.di.GraphQLModule.INSTANCE.provideSqlCipherLibraryLoader$graphql_release());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideSqlCipherLibraryLoader$graphql_releaseFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideSqlCipherLibraryLoader$graphql_releaseFactory();

        private InstanceHolder() {
        }
    }
}
