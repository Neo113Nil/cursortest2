package com.paypal.oslo.feature.debitcard.servicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/data/repository/AddressRepositoryImpl;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/AddressRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "getAddresses", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "debitInstrumentId", "address", "", "saveAddress", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressRepositoryImpl extends com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AddressRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository
    public final java.lang.Object getAddresses(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest getAddressesRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput invoke = com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt.getAddressRequestMapper().invoke(getAddressesRequest);
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery(invoke), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl.m14290$r8$lambda$Q2Kid9xHBBpA8qN1EhybgkHzB0((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data) obj);
            }
        }, null, null, createCallConfig$debit_card_prodRelease(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN), null, continuation, 44, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveAddress(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1 addressRepositoryImpl$saveAddress$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1) {
            addressRepositoryImpl$saveAddress$1 = (com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1) continuation;
            if ((addressRepositoryImpl$saveAddress$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                addressRepositoryImpl$saveAddress$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1 addressRepositoryImpl$saveAddress$12 = addressRepositoryImpl$saveAddress$1;
                java.lang.Object obj = addressRepositoryImpl$saveAddress$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressRepositoryImpl$saveAddress$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput updateDebitInstrumentBillingAddressInput = new com.paypal.oslo.api.graphql.schema.type.UpdateDebitInstrumentBillingAddressInput(str, com.apollographql.apollo.api.Optional.INSTANCE.present(debitCardAddress.getId()), null, 4, null);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.debitcard.graphql.UpdateDebitInstrumentBillingAddressMutation updateDebitInstrumentBillingAddressMutation = new com.paypal.oslo.feature.debitcard.graphql.UpdateDebitInstrumentBillingAddressMutation(updateDebitInstrumentBillingAddressInput);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl.$r8$lambda$GWkNrrSUO65WbYArcRynXVTypdw((com.paypal.oslo.feature.debitcard.graphql.UpdateDebitInstrumentBillingAddressMutation.Data) obj2);
                        }
                    };
                    com.paypal.oslo.core.network.graphql.CallConfig createCallConfig$debit_card_prodRelease = createCallConfig$debit_card_prodRelease(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN);
                    com.paypal.oslo.core.network.graphql.RiskSourceId updateDebitInstrumentBillingAddress = com.paypal.oslo.core.network.graphql.RiskSourceId.DebitCard.INSTANCE.getUpdateDebitInstrumentBillingAddress();
                    addressRepositoryImpl$saveAddress$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addressRepositoryImpl$saveAddress$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardAddress);
                    addressRepositoryImpl$saveAddress$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateDebitInstrumentBillingAddressInput);
                    addressRepositoryImpl$saveAddress$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository.executeMutation$default(this, apolloClient, updateDebitInstrumentBillingAddressMutation, function1, null, null, null, createCallConfig$debit_card_prodRelease, updateDebitInstrumentBillingAddress, addressRepositoryImpl$saveAddress$12, 28, null);
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
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                return new arrow.core.Ior.Both(leftValue, kotlin.Unit.INSTANCE);
            }
        }
        addressRepositoryImpl$saveAddress$1 = new com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1(this, continuation);
        com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1 addressRepositoryImpl$saveAddress$122 = addressRepositoryImpl$saveAddress$1;
        java.lang.Object obj2 = addressRepositoryImpl$saveAddress$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressRepositoryImpl$saveAddress$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GWkNrrSUO65WbYArcRynXVTypdw(com.paypal.oslo.feature.debitcard.graphql.UpdateDebitInstrumentBillingAddressMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q2Kid9x-HBBpA8qN1EhybgkHzB0, reason: not valid java name */
    public static /* synthetic */ java.util.List m14290$r8$lambda$Q2Kid9xHBBpA8qN1EhybgkHzB0(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt.getAddressResponseMapper().invoke(data);
    }
}
