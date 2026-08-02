package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/AddCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AddCardRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "stringsProvider", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "payload", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AddCardRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutStringsProvider, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = callErrorMapper;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        this.getHighSpeedVideoSizes = inAppCheckoutStringsProvider;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository
    public final java.lang.Object addCard(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2(this, cardOperationPayloadEntity, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0186 A[Catch: all -> 0x005b, RaiseCancellationException -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005e, all -> 0x005b, blocks: (B:11:0x0056, B:12:0x017c, B:15:0x0186, B:16:0x01b5, B:21:0x01a8, B:22:0x01da, B:23:0x01df), top: B:10:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$performAddCard$1 addCardRepositoryImpl$performAddCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$performAddCard$1) {
            addCardRepositoryImpl$performAddCard$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$performAddCard$1) continuation;
            if ((addCardRepositoryImpl$performAddCard$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                addCardRepositoryImpl$performAddCard$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = addCardRepositoryImpl$performAddCard$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addCardRepositoryImpl$performAddCard$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        java.lang.String cardNumber = cardOperationPayloadEntity.getCardNumber();
                        java.lang.String str = "";
                        java.lang.String str2 = cardNumber == null ? "" : cardNumber;
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String securityCode = cardOperationPayloadEntity.getSecurityCode();
                        if (securityCode == null) {
                            securityCode = "";
                        }
                        com.apollographql.apollo.api.Optional.Present present = companion.present(securityCode);
                        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String expiryMonth = cardOperationPayloadEntity.getExpiryMonth();
                        if (expiryMonth == null) {
                            expiryMonth = "";
                        }
                        com.apollographql.apollo.api.Optional.Present present2 = companion2.present(expiryMonth);
                        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String expiryYear = cardOperationPayloadEntity.getExpiryYear();
                        if (expiryYear != null) {
                            str = expiryYear;
                        }
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput(null, null, str2, present, present2, companion3.present(str), null, 67, null);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalNameInput externalNameInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalNameInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getCardholder().getGivenName()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getCardholder().getSurname()), null, null, null, 57, null);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput(externalNameInput);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput buildAddressInput = com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryUtilsKt.buildAddressInput(cardOperationPayloadEntity.getAddress());
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation addCardMutation = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation(cardOperationPayloadEntity.getBaToken(), externalCardInput, cardOperationPayloadEntity.getPreferred(), externalCardholderInput, buildAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.MOBILE, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getPaypalRequestId()));
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Initiating add card mutation", null, null, 6, null);
                        com.apollographql.apollo.ApolloCall addNativeCheckoutHeaders = com.paypal.oslo.feature.inappcheckout.data.utils.ApolloClientExtensionsKt.addNativeCheckoutHeaders(this.Camera2StreamConfigurationMap.mutation(addCardMutation));
                        addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardOperationPayloadEntity);
                        addCardRepositoryImpl$performAddCard$1.getInputSizeshNQ4ISI = defaultRaise;
                        addCardRepositoryImpl$performAddCard$1.getInputFormats = defaultRaise3;
                        addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalCardInput);
                        addCardRepositoryImpl$performAddCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalNameInput);
                        addCardRepositoryImpl$performAddCard$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalCardholderInput);
                        addCardRepositoryImpl$performAddCard$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAddressInput);
                        addCardRepositoryImpl$performAddCard$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardMutation);
                        addCardRepositoryImpl$performAddCard$1.getOutputSizes = defaultRaise3;
                        addCardRepositoryImpl$performAddCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoFpsRanges = 0;
                        addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoSizes = 0;
                        addCardRepositoryImpl$performAddCard$1.Camera2StreamConfigurationMap = 0;
                        addCardRepositoryImpl$performAddCard$1.getOutputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(addNativeCheckoutHeaders, null, addCardRepositoryImpl$performAddCard$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
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
                    int i2 = addCardRepositoryImpl$performAddCard$1.Camera2StreamConfigurationMap;
                    int i3 = addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoSizes;
                    int i4 = addCardRepositoryImpl$performAddCard$1.getHighSpeedVideoFpsRanges;
                    int i5 = addCardRepositoryImpl$performAddCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) addCardRepositoryImpl$performAddCard$1.getOutputSizes;
                    raise2 = (arrow.core.raise.Raise) addCardRepositoryImpl$performAddCard$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) addCardRepositoryImpl$performAddCard$1.getInputSizeshNQ4ISI;
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
                    right = new arrow.core.Either.Left(this.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), this.getHighSpeedVideoSizes.stringValue(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card)));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard) raise2.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(cardOperationSuccessEntity);
            }
        }
        addCardRepositoryImpl$performAddCard$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$performAddCard$1(this, continuation);
        java.lang.Object obj2 = addCardRepositoryImpl$performAddCard$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addCardRepositoryImpl$performAddCard$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard) raise2.bind(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(cardOperationSuccessEntity2);
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard = external.getAddCard();
            if (addCard == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "AddCard field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(addCard);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity> Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard p0) {
        int i;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str = p0.get__typename();
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "externalAddCardSuccessResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse = p0.getOnExternalAddCardSuccessResponse();
                if (onExternalAddCardSuccessResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully added card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", onExternalAddCardSuccessResponse.getId())), null, 4, null);
                java.lang.String id = onExternalAddCardSuccessResponse.getId();
                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> staleDomains = onExternalAddCardSuccessResponse.getStaleDomains();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(staleDomains, 10));
                java.util.Iterator<T> it = staleDomains.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain) it.next()).getDomain().name()));
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity(id, arrayList);
                defaultRaise.complete();
                return new arrow.core.Either.Right(cardOperationSuccessEntity);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "externalAddCardErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse = p0.getOnExternalAddCardErrorResponse();
                if (onExternalAddCardErrorResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalAddCardErrorResponse.getErrors());
                if (error == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_ERROR", this.getHighSpeedVideoSizes.stringValue(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_unknown), true, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Add card returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, kotlin.collections.CollectionsKt.joinToString$default(onExternalAddCardErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl.m15413$r8$lambda$rNqIPhtowxglkRR5RXv6q9hE7o((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error) obj);
                    }
                }, 30, null))), null, 4, null);
                java.lang.String name2 = error.getName().name();
                switch (com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[error.getName().ordinal()]) {
                    case 1:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_auth_rejected_by_cvv_no_match;
                        break;
                    case 2:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_auth_rejected_by_avs_no_match;
                        break;
                    case 3:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_validation_error;
                        break;
                    case 4:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_instrument_not_supported;
                        break;
                    case 5:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_instrument_blocked;
                        break;
                    case 6:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_instrument_sharing_limit_exceeded;
                        break;
                    case 7:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_issuer_decline;
                        break;
                    case 8:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_unconfirmed_card;
                        break;
                    case 9:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_authorization_timeout;
                        break;
                    default:
                        i = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_unknown;
                        break;
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(name2, this.getHighSpeedVideoSizes.stringValue(i), true, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Unknown response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p0.get__typename())), null, 4, null);
            java.lang.String str2 = p0.get__typename();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown response type: ");
            sb.append(str2);
            defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", sb.toString(), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* renamed from: $r8$lambda$rNqI-PhtowxglkRR5RXv6q9hE7o, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m15413$r8$lambda$rNqIPhtowxglkRR5RXv6q9hE7o(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_CVV_NO_MATCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_AVS_NO_MATCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.VALIDATION_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_NOT_SUPPORTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_BLOCKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_SHARING_LIMIT_EXCEEDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.ISSUER_DECLINE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.UNCONFIRMED_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTHORIZATION_TIMEOUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
