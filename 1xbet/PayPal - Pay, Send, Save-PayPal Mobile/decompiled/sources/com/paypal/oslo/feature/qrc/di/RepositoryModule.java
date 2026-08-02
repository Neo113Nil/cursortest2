package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/RepositoryModule;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "provideSessionRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "Lcom/paypal/oslo/feature/qrc/domain/repository/PaymentRepository;", "providePaymentRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/qrc/domain/repository/PaymentRepository;", "Lcom/paypal/oslo/feature/qrc/domain/repository/EnrollmentRepository;", "provideEnrollmentRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/qrc/domain/repository/EnrollmentRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.di.RepositoryModule INSTANCE = new com.paypal.oslo.feature.qrc.di.RepositoryModule();

    private RepositoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.repository.SessionRepository provideSessionRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl(apolloClient);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository providePaymentRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl(apolloClient);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository provideEnrollmentRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl(apolloClient);
    }
}
