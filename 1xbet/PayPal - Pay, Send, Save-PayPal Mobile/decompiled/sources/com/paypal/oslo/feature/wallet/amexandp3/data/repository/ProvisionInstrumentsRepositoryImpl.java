package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/data/repository/ProvisionInstrumentsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/ProvisionInstrumentsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "provisionEligibleInstruments", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleSuccess$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "handleFailure$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "handlePartialSuccess$wallet_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsRepositoryImpl implements com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ProvisionInstrumentsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object provisionEligibleInstruments(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult>> continuation) {
        com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1) {
            provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 = (com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1) continuation;
            if ((provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12 = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1;
                java.lang.Object obj = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation provisionInstrumentsMutation = new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation();
                    provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionInstrumentsMutation);
                    provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, provisionInstrumentsMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$12, 2, (java.lang.Object) null);
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
        provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 = new com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1(this, continuation);
        com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$122 = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1;
        java.lang.Object obj2 = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = provisionInstrumentsRepositoryImpl$provisionEligibleInstruments$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult> handleSuccess$wallet_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (data.getData() != null) {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data data2 = data.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
            if (data2.getProvisionInstruments() != null) {
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data data3 = data.getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data3, "");
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments = data3.getProvisionInstruments();
                kotlin.jvm.internal.Intrinsics.checkNotNull(provisionInstruments, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Provision Instruments finished with success.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, provisionInstruments)), null, 4, null);
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImplKt.toProvisionInstrumentsResult(provisionInstruments));
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Provision Instruments finished with success with null data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null)), null, 4, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.NoDataAvailable.INSTANCE);
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult> handleFailure$wallet_prodRelease(com.paypal.oslo.core.network.graphql.error.CallError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.ValidationError.INSTANCE);
        }
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Network.INSTANCE);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final arrow.core.Either<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult> handlePartialSuccess$wallet_prodRelease(com.paypal.oslo.core.network.graphql.error.CallError error, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (data.getData() != null) {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data data2 = data.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
            if (data2.getProvisionInstruments() != null) {
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data data3 = data.getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data3, "");
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments = data3.getProvisionInstruments();
                kotlin.jvm.internal.Intrinsics.checkNotNull(provisionInstruments, "");
                if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImplKt.toProvisionInstrumentsResult(provisionInstruments));
                }
                if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImplKt.addErrorMessages(com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImplKt.toProvisionInstrumentsResult(provisionInstruments), (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) error));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Provision Instrument mutation finished with no result.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null)), null, 4, null);
        return handleFailure$wallet_prodRelease(error);
    }
}
