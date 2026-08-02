package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository;

/* loaded from: classes15.dex */
public final class CategorySelectionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CategorySelectionRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl(lazy);
    }
}
