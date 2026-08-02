package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0016\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/BuyerInfoApiRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/BuyerInfoApiRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;", "buyerInfoEntityMapper", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/BuyerInfoDTO;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BuyerInfoApiRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BuyerInfoApiRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper buyerInfoEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = buyerInfoEntityMapper;
        this.getHighSpeedVideoFpsRanges = callErrorMapper;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        this.getHighSpeedVideoSizes = checkoutLogger;
        this.getInputSizeshNQ4ISI = appSwitchSession;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository
    public final java.lang.Object getBuyerInfo(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x008f, B:15:0x0099, B:16:0x00c2, B:21:0x00b5, B:22:0x00ed, B:23:0x00f2), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1 buyerInfoApiRepositoryImpl$fetchBuyerInfo$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1) {
            buyerInfoApiRepositoryImpl$fetchBuyerInfo$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1) continuation;
            if ((buyerInfoApiRepositoryImpl$fetchBuyerInfo$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                buyerInfoApiRepositoryImpl$fetchBuyerInfo$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1 buyerInfoApiRepositoryImpl$fetchBuyerInfo$12 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$1;
                java.lang.Object obj = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery getBuyerInfoQuery = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery(str);
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getInputFormats = defaultRaise;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoSizesFor = defaultRaise3;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getInputSizeshNQ4ISI = defaultRaise3;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoSizes = 0;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoFpsRangesFor = 0;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoFpsRanges = 0;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getOutputMinFrameDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getBuyerInfoQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, buyerInfoApiRepositoryImpl$fetchBuyerInfo$12, 2, (java.lang.Object) null);
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
                    int i2 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoFpsRanges;
                    int i4 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) buyerInfoApiRepositoryImpl$fetchBuyerInfo$12.getInputFormats;
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
                    right = new arrow.core.Either.Left(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), "BUYER_INFO"));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity convert = this.getHighResolutionOutputSizeshNQ4ISI.convert((com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO) raise.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo) raise.bind(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right))))));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(convert);
            }
        }
        buyerInfoApiRepositoryImpl$fetchBuyerInfo$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1(this, continuation);
        com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$fetchBuyerInfo$1 buyerInfoApiRepositoryImpl$fetchBuyerInfo$122 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$1;
        java.lang.Object obj2 = buyerInfoApiRepositoryImpl$fetchBuyerInfo$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buyerInfoApiRepositoryImpl$fetchBuyerInfo$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity convert2 = this.getHighResolutionOutputSizeshNQ4ISI.convert((com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO) raise.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo) raise.bind(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right))))));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(convert2);
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo = external.getBuyerInfo();
            if (buyerInfo == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "BuyerInfo field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(buyerInfo);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO> Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo p0) {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason name2;
        com.paypal.oslo.feature.inappcheckout.data.dto.EConsentContingencyDTO eConsentContingencyDTO;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str2 = p0.get__typename();
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalBuyerInfoSuccessResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse = p0.getOnExternalBuyerInfoSuccessResponse();
                if (onExternalBuyerInfoSuccessResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Successfully fetched buyer info", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userId", onExternalBuyerInfoSuccessResponse.getUserId())), null, 4, null);
                java.lang.String userId = onExternalBuyerInfoSuccessResponse.getUserId();
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name3 = onExternalBuyerInfoSuccessResponse.getName();
                com.paypal.oslo.feature.inappcheckout.data.dto.BuyerNameDTO buyerNameDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.BuyerNameDTO(name3.getGivenName(), name3.getSurname());
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage = onExternalBuyerInfoSuccessResponse.getProfileImage();
                com.paypal.oslo.feature.inappcheckout.data.dto.ProfileImageDTO profileImageDTO = profileImage != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.ProfileImageDTO(profileImage.getImagePath()) : null;
                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> contingencies = onExternalBuyerInfoSuccessResponse.getContingencies();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency contingency : contingencies) {
                    java.lang.String str3 = contingency.get__typename();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "externalPhoneNumberRequiredContingency")) {
                        eConsentContingencyDTO = contingency.getOnExternalPhoneNumberRequiredContingency() != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.EConsentContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.ECONSENT, (java.lang.String) null, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "externalEConsentContingency")) {
                        eConsentContingencyDTO = contingency.getOnExternalEConsentContingency() != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.EConsentContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.ECONSENT, (java.lang.String) null, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                    } else {
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Unknown contingency type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, contingency.get__typename())), null, 4, null);
                        eConsentContingencyDTO = null;
                    }
                    if (eConsentContingencyDTO != null) {
                        arrayList.add(eConsentContingencyDTO);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                java.lang.Object email = onExternalBuyerInfoSuccessResponse.getEmail();
                com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO buyerInfoDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO(userId, buyerNameDTO, profileImageDTO, arrayList3, email instanceof java.lang.String ? (java.lang.String) email : null);
                defaultRaise.complete();
                return new arrow.core.Either.Right(buyerInfoDTO);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalBuyerInfoErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse = p0.getOnExternalBuyerInfoErrorResponse();
                if (onExternalBuyerInfoErrorResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalBuyerInfoErrorResponse.getErrors());
                if (error == null || (name2 = error.getName()) == null || (str = name2.name()) == null) {
                    str = "UNKNOWN_ERROR";
                }
                java.lang.String str4 = str;
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(onExternalBuyerInfoErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl.m15415$r8$lambda$K5_eo9eDu4ta6T11RJT01XCEE((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error) obj);
                    }
                }, 30, null);
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Buyer info fetch returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Buyer info errors: ");
                sb.append(joinToString$default);
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str4, sb.toString(), true, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Unknown response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p0.get__typename())), null, 4, null);
            java.lang.String str5 = p0.get__typename();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown response type: ");
            sb2.append(str5);
            defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", sb2.toString(), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* renamed from: $r8$lambda$K5_eo9eDu4ta6T11RJT01X-C-EE, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m15415$r8$lambda$K5_eo9eDu4ta6T11RJT01XCEE(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }
}
