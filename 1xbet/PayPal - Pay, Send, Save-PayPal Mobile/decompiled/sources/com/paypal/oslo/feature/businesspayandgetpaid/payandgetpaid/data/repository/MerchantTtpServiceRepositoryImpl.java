package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/data/repository/MerchantTtpServiceRepositoryImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/repository/MerchantTtpServiceRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayOnboardingError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/MerchantTapToPayOnboardingStatus;", "fetchTapToPayOnboardingStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MerchantTtpServiceRepositoryImpl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MerchantTtpServiceRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x008c, B:15:0x0092, B:20:0x00d5, B:21:0x00f3, B:23:0x00fb, B:25:0x0101, B:27:0x0107, B:30:0x0116, B:31:0x0120, B:34:0x00e2, B:35:0x0121, B:36:0x0126, B:37:0x0127, B:38:0x0137, B:43:0x00ad, B:44:0x00c7, B:45:0x00cc), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #3 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x008c, B:15:0x0092, B:20:0x00d5, B:21:0x00f3, B:23:0x00fb, B:25:0x0101, B:27:0x0107, B:30:0x0116, B:31:0x0120, B:34:0x00e2, B:35:0x0121, B:36:0x0126, B:37:0x0127, B:38:0x0137, B:43:0x00ad, B:44:0x00c7, B:45:0x00cc), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.repository.MerchantTtpServiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchTapToPayOnboardingStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError, ? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1 merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Ior.Both both;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus status;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1) {
            merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1) continuation;
            if ((merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.get().query(new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.Camera2StreamConfigurationMap = defaultRaise;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getInputFormats = defaultRaise3;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoFpsRangesFor = 0;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoFpsRanges = 0;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizes = 0;
                        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = execute$default;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizes;
                    int i3 = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoFpsRanges;
                    int i5 = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError.NetworkError.INSTANCE);
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError.NetworkError.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    raise.raise((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError.NetworkError) ((arrow.core.Ior.Left) both).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (both instanceof arrow.core.Ior.Right) {
                    graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue();
                } else {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.Object leftValue = ((arrow.core.Ior.Both) both).getLeftValue();
                    graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) both).getRightValue();
                }
                com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data data = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data) graphQLData.getData();
                if (data == null || (merchantTapToPayOnboarding = data.getMerchantTapToPayOnboarding()) == null || (status = merchantTapToPayOnboarding.getStatus()) == null) {
                    raise.raise(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayOnboardingError.NotFoundError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus tapToPayOnboardingStatus = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceResponseMappersKt.toTapToPayOnboardingStatus(status);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(tapToPayOnboardingStatus);
            }
        }
        merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1(this, continuation);
        java.lang.Object obj2 = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantTtpServiceRepositoryImpl$fetchTapToPayOnboardingStatus$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }
}
