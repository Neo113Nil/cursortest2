package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/repository/CallUsRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/CallUsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;", "fetchCallUsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallUsRepositoryImpl implements com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CallUsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository
    public final java.lang.Object fetchCallUsData(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, com.paypal.oslo.feature.helpcenter.domain.models.CallUsData>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("Call Us API not yet available in schema", null, 2, null));
    }
}
