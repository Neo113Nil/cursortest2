package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/UpdateCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/UpdateCardRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "stringsProvider", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "payload", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;)Larrow/core/Either;", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateCardRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public UpdateCardRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutStringsProvider, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = callErrorMapper;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutStringsProvider;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository
    public final java.lang.Object updateCard(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$updateCard$2(this, cardOperationPayloadEntity, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0176 A[Catch: all -> 0x005b, RaiseCancellationException -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005e, all -> 0x005b, blocks: (B:11:0x0056, B:12:0x016c, B:15:0x0176, B:16:0x01a5, B:21:0x0198, B:22:0x01ca, B:23:0x01cf), top: B:10:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$performUpdateCard$1 updateCardRepositoryImpl$performUpdateCard$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$performUpdateCard$1) {
            updateCardRepositoryImpl$performUpdateCard$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$performUpdateCard$1) continuation;
            if ((updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = updateCardRepositoryImpl$performUpdateCard$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        java.lang.String fiId = cardOperationPayloadEntity.getFiId();
                        if (fiId == null) {
                            fiId = "";
                        }
                        java.lang.String securityCode = cardOperationPayloadEntity.getSecurityCode();
                        if (securityCode == null) {
                            securityCode = "";
                        }
                        java.lang.String expiryMonth = cardOperationPayloadEntity.getExpiryMonth();
                        if (expiryMonth == null) {
                            expiryMonth = "";
                        }
                        java.lang.String expiryYear = cardOperationPayloadEntity.getExpiryYear();
                        if (expiryYear == null) {
                            expiryYear = "";
                        }
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput(fiId, securityCode, expiryMonth, expiryYear);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalNameInput externalNameInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalNameInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getCardholder().getGivenName()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getCardholder().getSurname()), null, null, null, 57, null);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput(externalNameInput);
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput buildAddressInput = com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryUtilsKt.buildAddressInput(cardOperationPayloadEntity.getAddress());
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation updateCardMutation = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation(cardOperationPayloadEntity.getBaToken(), externalCardUpdateInput, externalCardholderInput, buildAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType.MOBILE, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardOperationPayloadEntity.getPaypalRequestId()), cardOperationPayloadEntity.getPreferred());
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.inappcheckout.LoggerKt.log;
                        java.lang.String fiId2 = cardOperationPayloadEntity.getFiId();
                        if (fiId2 == null) {
                            fiId2 = "";
                        }
                        com.paypal.android.logger.Logger.d$default(logger, "Initiating update card mutation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fiId", fiId2)), null, 4, null);
                        com.apollographql.apollo.ApolloCall addNativeCheckoutHeaders = com.paypal.oslo.feature.inappcheckout.data.utils.ApolloClientExtensionsKt.addNativeCheckoutHeaders(this.getHighSpeedVideoFpsRanges.mutation(updateCardMutation));
                        updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardOperationPayloadEntity);
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputMinFrameDuration = defaultRaise;
                        updateCardRepositoryImpl$performUpdateCard$1.getInputFormats = defaultRaise3;
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalCardUpdateInput);
                        updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalNameInput);
                        updateCardRepositoryImpl$performUpdateCard$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalCardholderInput);
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAddressInput);
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardMutation);
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputSizes = defaultRaise3;
                        updateCardRepositoryImpl$performUpdateCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoFpsRangesFor = 0;
                        updateCardRepositoryImpl$performUpdateCard$1.Camera2StreamConfigurationMap = 0;
                        updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoSizes = 0;
                        updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(addNativeCheckoutHeaders, null, updateCardRepositoryImpl$performUpdateCard$1, 2, null);
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
                    int i2 = updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoSizes;
                    int i3 = updateCardRepositoryImpl$performUpdateCard$1.Camera2StreamConfigurationMap;
                    int i4 = updateCardRepositoryImpl$performUpdateCard$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = updateCardRepositoryImpl$performUpdateCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) updateCardRepositoryImpl$performUpdateCard$1.getOutputSizes;
                    raise2 = (arrow.core.raise.Raise) updateCardRepositoryImpl$performUpdateCard$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) updateCardRepositoryImpl$performUpdateCard$1.getOutputMinFrameDuration;
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
                    right = new arrow.core.Either.Left(this.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), this.getHighResolutionOutputSizeshNQ4ISI.stringValue(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_update_card)));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(cardOperationSuccessEntity);
            }
        }
        updateCardRepositoryImpl$performUpdateCard$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$performUpdateCard$1(this, continuation);
        java.lang.Object obj2 = updateCardRepositoryImpl$performUpdateCard$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateCardRepositoryImpl$performUpdateCard$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(cardOperationSuccessEntity2);
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard> Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard = external.getUpdateCard();
            if (updateCard == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "UpdateCard field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(updateCard);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity> getHighSpeedVideoSizes(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard p0) {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason name2;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str2 = p0.get__typename();
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalUpdateCardSuccessResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse = p0.getOnExternalUpdateCardSuccessResponse();
                if (onExternalUpdateCardSuccessResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully updated card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", onExternalUpdateCardSuccessResponse.getId())), null, 4, null);
                java.lang.String id = onExternalUpdateCardSuccessResponse.getId();
                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> staleDomains = onExternalUpdateCardSuccessResponse.getStaleDomains();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(staleDomains, 10));
                java.util.Iterator<T> it = staleDomains.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain) it.next()).getDomain().name()));
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity(id, arrayList);
                defaultRaise.complete();
                return new arrow.core.Either.Right(cardOperationSuccessEntity);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalUpdateCardErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse = p0.getOnExternalUpdateCardErrorResponse();
                if (onExternalUpdateCardErrorResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalUpdateCardErrorResponse.getErrors());
                if (error == null || (name2 = error.getName()) == null || (str = name2.name()) == null) {
                    str = "UNKNOWN_ERROR";
                }
                java.lang.String str3 = str;
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(onExternalUpdateCardErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl.m15421$r8$lambda$koV7GxcgfqN7fhAp2LBAgYA5qw((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error) obj);
                    }
                }, 30, null);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Update card returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Update card errors: ");
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
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* renamed from: $r8$lambda$koV7GxcgfqN7fhAp2LBAgY-A5qw, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m15421$r8$lambda$koV7GxcgfqN7fhAp2LBAgYA5qw(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }
}
