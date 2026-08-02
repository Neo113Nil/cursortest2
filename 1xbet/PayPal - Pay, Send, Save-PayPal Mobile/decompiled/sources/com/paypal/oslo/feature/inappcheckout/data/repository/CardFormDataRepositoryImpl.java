package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardFormDataRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;", "cardFormDataEntityMapper", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "fiId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "getCardFormData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/CardFormDataQuery$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/CardFormDataQuery$CardFormData;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/CardFormDataQuery$CardFormData;)Larrow/core/Either;", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFormDataRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardFormDataRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper cardFormDataEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFormDataEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoFpsRanges = cardFormDataEntityMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = callErrorMapper;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository
    public final java.lang.Object getCardFormData(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$getCardFormData$2(this, str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: all -> 0x0047, RaiseCancellationException -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x004a, all -> 0x0047, blocks: (B:11:0x0043, B:12:0x009e, B:15:0x00a8, B:16:0x00d1, B:21:0x00c4, B:22:0x00f6, B:23:0x00fb), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1 cardFormDataRepositoryImpl$fetchCardFormData$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1) {
            cardFormDataRepositoryImpl$fetchCardFormData$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1) continuation;
            if ((cardFormDataRepositoryImpl$fetchCardFormData$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                cardFormDataRepositoryImpl$fetchCardFormData$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1 cardFormDataRepositoryImpl$fetchCardFormData$12 = cardFormDataRepositoryImpl$fetchCardFormData$1;
                java.lang.Object obj = cardFormDataRepositoryImpl$fetchCardFormData$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardFormDataRepositoryImpl$fetchCardFormData$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery cardFormDataQuery = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery(str, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2));
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoSizesFor = defaultRaise;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getInputFormats = defaultRaise3;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getInputSizeshNQ4ISI = defaultRaise3;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoFpsRanges = 0;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoSizes = 0;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.Camera2StreamConfigurationMap = 0;
                        cardFormDataRepositoryImpl$fetchCardFormData$12.getOutputMinFrameDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, cardFormDataQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cardFormDataRepositoryImpl$fetchCardFormData$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
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
                    int i2 = cardFormDataRepositoryImpl$fetchCardFormData$12.Camera2StreamConfigurationMap;
                    int i3 = cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoSizes;
                    int i4 = cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoFpsRanges;
                    int i5 = cardFormDataRepositoryImpl$fetchCardFormData$12.getHighResolutionOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) cardFormDataRepositoryImpl$fetchCardFormData$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) cardFormDataRepositoryImpl$fetchCardFormData$12.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) cardFormDataRepositoryImpl$fetchCardFormData$12.getHighSpeedVideoSizesFor;
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
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper.map$default(this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), null, 2, null));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) raise.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.CardFormData) raise.bind(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)))));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(cardFormDataEntity);
            }
        }
        cardFormDataRepositoryImpl$fetchCardFormData$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1(this, continuation);
        com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1 cardFormDataRepositoryImpl$fetchCardFormData$122 = cardFormDataRepositoryImpl$fetchCardFormData$1;
        java.lang.Object obj2 = cardFormDataRepositoryImpl$fetchCardFormData$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardFormDataRepositoryImpl$fetchCardFormData$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) raise.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.CardFormData) raise.bind(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)))));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(cardFormDataEntity2);
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.CardFormData> getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.CardFormData cardFormData = external.getCardFormData();
            defaultRaise.complete();
            return new arrow.core.Either.Right(cardFormData);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.CardFormData p0) {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardFormDataErrorReason name2;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str2 = p0.get__typename();
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalCardFormDataSuccessResponse")) {
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.OnExternalCardFormDataSuccessResponse onExternalCardFormDataSuccessResponse = p0.getOnExternalCardFormDataSuccessResponse();
                    if (onExternalCardFormDataSuccessResponse == null) {
                        defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully fetched card form data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("successResponse", onExternalCardFormDataSuccessResponse.toString())), null, 4, null);
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Name name3 = onExternalCardFormDataSuccessResponse.getCardholder().getName();
                    com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholderDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO(name3.getGivenName(), name3.getSurname());
                    java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Address> addresses = onExternalCardFormDataSuccessResponse.getAddresses();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
                    for (com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Address address : addresses) {
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Address1 address2 = address.getAddress();
                        arrayList.add(new com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO(address.getId(), address2.getAddressLine1(), address2.getAddressLine2(), address2.getAdminArea2(), address2.getAdminArea1(), address2.getPostalCode()));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.PrefillCardInfo prefillCardInfo = onExternalCardFormDataSuccessResponse.getPrefillCardInfo();
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity convert = this.getHighSpeedVideoFpsRanges.convert(new com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO(cardholderDTO, arrayList2, prefillCardInfo != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO(prefillCardInfo.getLast4Digits(), prefillCardInfo.getCardBrand()) : null));
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(convert);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalCardFormDataErrorResponse")) {
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.OnExternalCardFormDataErrorResponse onExternalCardFormDataErrorResponse = p0.getOnExternalCardFormDataErrorResponse();
                    if (onExternalCardFormDataErrorResponse == null) {
                        defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalCardFormDataErrorResponse.getErrors());
                    if (error == null || (name2 = error.getName()) == null || (str = name2.name()) == null) {
                        str = "UNKNOWN_ERROR";
                    }
                    java.lang.String str3 = str;
                    java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(onExternalCardFormDataErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl.m15416$r8$lambda$IhCVm_ijOnsiZ1s4KAu9WhU2s((com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Error) obj);
                        }
                    }, 30, null);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Card form data fetch returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Card form data errors: ");
                    sb.append(joinToString$default);
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str3, sb.toString(), true, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Unknown response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p0.get__typename())), null, 4, null);
                java.lang.String str4 = p0.get__typename();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown response type: ");
                sb2.append(str4);
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", sb2.toString(), false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: $r8$lambda$Ih--CVm_ijOnsiZ1s4KAu9WhU2s, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m15416$r8$lambda$IhCVm_ijOnsiZ1s4KAu9WhU2s(com.paypal.oslo.feature.inappcheckout.graphql.checkout.CardFormDataQuery.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }
}
