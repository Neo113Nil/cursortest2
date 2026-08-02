package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/data/repository/RetrievePaymentTokenRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/RetrievePaymentTokenRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/RetrievePaymentTokenError;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "retrievePaymentToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleSuccess$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "handleFailure$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "handlePartialSuccess$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RetrievePaymentTokenRepositoryImpl implements com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public RetrievePaymentTokenRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object retrievePaymentToken(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo>> continuation) {
        com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1) {
            retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 = (com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1) continuation;
            if ((retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12 = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1;
                java.lang.Object obj = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery paymentTokenQuery = new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery(str);
                    retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentTokenQuery);
                    retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, paymentTokenQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, retrievePaymentTokenRepositoryImpl$retrievePaymentToken$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return handleFailure$wallet_prodRelease((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return handleSuccess$wallet_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return handlePartialSuccess$wallet_prodRelease((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue(), (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 = new com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1(this, continuation);
        com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 retrievePaymentTokenRepositoryImpl$retrievePaymentToken$122 = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$1;
        java.lang.Object obj2 = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = retrievePaymentTokenRepositoryImpl$retrievePaymentToken$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> handleSuccess$wallet_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data data2 = data.getData();
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data data3 = data2 instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data ? data2 : null;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken = data3 != null ? data3.getPaymentToken() : null;
        if (paymentToken == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Retrieve Payment Token finished with success with null data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null)), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError.Business.NoDataAvailable.INSTANCE);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Retrieve Payment Token finished with success.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, paymentToken)), null, 4, null);
        return arrow.core.EitherKt.right(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.RetrievePaymentTokenRepositoryMapperKt.toDomain(paymentToken));
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> handleFailure$wallet_prodRelease(com.paypal.oslo.core.network.graphql.error.CallError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError.Business.ValidationError.INSTANCE);
        }
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError.Network.INSTANCE);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> handlePartialSuccess$wallet_prodRelease(com.paypal.oslo.core.network.graphql.error.CallError error, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data data2 = data.getData();
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data data3 = data2 instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data ? data2 : null;
        com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken = data3 != null ? data3.getPaymentToken() : null;
        if (paymentToken == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Retrieve Payment Token query finished with no result.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null)), null, 4, null);
            return handleFailure$wallet_prodRelease(error);
        }
        return arrow.core.EitherKt.right(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.RetrievePaymentTokenRepositoryMapperKt.toDomain(paymentToken));
    }
}
