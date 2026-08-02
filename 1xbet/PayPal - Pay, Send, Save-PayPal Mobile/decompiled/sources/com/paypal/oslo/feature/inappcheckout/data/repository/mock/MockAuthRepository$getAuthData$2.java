package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository$getAuthData$2", f = "MockAuthRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MockAuthRepository$getAuthData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider;
        android.content.Context context;
        kotlinx.serialization.json.Json json;
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity;
        kotlinx.serialization.json.Json json2;
        com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper;
        kotlinx.serialization.json.Json json3;
        com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper initializeCheckoutEntityMapper;
        kotlinx.serialization.json.Json json4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository = this.getHighSpeedVideoFpsRangesFor;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                mockFileNameProvider = mockAuthRepository.getInputFormats;
                java.lang.String getHighSpeedVideoFpsRanges = mockFileNameProvider.getGetHighSpeedVideoFpsRanges();
                context = mockAuthRepository.getHighSpeedVideoFpsRanges;
                json = mockAuthRepository.getHighResolutionOutputSizeshNQ4ISI;
                java.io.InputStream open = context.getAssets().open(getHighSpeedVideoFpsRanges);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                try {
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = null;
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    json.getSerializersModule();
                    kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText);
                    java.lang.String access$extractReturnUrl = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository.access$extractReturnUrl(mockAuthRepository, jsonObject);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForTopLevelErrors = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository.access$checkForTopLevelErrors(mockAuthRepository, jsonObject, access$extractReturnUrl);
                    if (access$checkForTopLevelErrors != null) {
                        defaultRaise2.raise(access$checkForTopLevelErrors);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForFundingSelectionErrors = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository.access$checkForFundingSelectionErrors(mockAuthRepository, jsonObject, access$extractReturnUrl);
                    if (access$checkForFundingSelectionErrors != null) {
                        defaultRaise2.raise(access$checkForFundingSelectionErrors);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "initializeCheckout");
                    kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "fundingSelection");
                    kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "buyerInfo");
                    if (jsonElement != null) {
                        initializeCheckoutEntityMapper = mockAuthRepository.Camera2StreamConfigurationMap;
                        json4 = mockAuthRepository.getHighResolutionOutputSizeshNQ4ISI;
                        initializeCheckoutEntity = initializeCheckoutEntityMapper.convert((com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO) json4.decodeFromJsonElement(com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO.INSTANCE.serializer(), jsonElement));
                    } else {
                        initializeCheckoutEntity = null;
                    }
                    if (jsonElement2 != null) {
                        fundingSelectionEntityMapper = mockAuthRepository.getHighSpeedVideoSizes;
                        json3 = mockAuthRepository.getHighResolutionOutputSizeshNQ4ISI;
                        fundingSelectionEntity = fundingSelectionEntityMapper.convert((com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO) json3.decodeFromJsonElement(com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO.INSTANCE.serializer(), jsonElement2));
                    } else {
                        fundingSelectionEntity = null;
                    }
                    if (jsonElement3 != null) {
                        json2 = mockAuthRepository.getHighResolutionOutputSizeshNQ4ISI;
                        buyerInfoEntity = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository.access$toEntity(mockAuthRepository, (com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO) json2.decodeFromJsonElement(com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO.INSTANCE.serializer(), jsonElement3));
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(initializeCheckoutEntity, fundingSelectionEntity, buyerInfoEntity);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(authenticationXOResponse);
                } finally {
                }
            } catch (java.io.IOException e) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Failed to read mock auth data file";
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, message, true, null, null));
                throw new kotlin.KotlinNothingValueException();
            } catch (kotlinx.serialization.SerializationException e2) {
                java.lang.String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = "Failed to parse mock auth data";
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, message2, true, null, null));
                throw new kotlin.KotlinNothingValueException();
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository$getAuthData$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository$getAuthData$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAuthRepository$getAuthData$2(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository$getAuthData$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = mockAuthRepository;
    }
}
