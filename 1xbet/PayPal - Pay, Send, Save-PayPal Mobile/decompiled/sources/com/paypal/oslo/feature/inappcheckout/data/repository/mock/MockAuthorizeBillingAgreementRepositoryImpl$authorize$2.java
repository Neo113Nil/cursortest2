package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl$authorize$2", f = "MockAuthorizeBillingAgreementRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {64}, m = "invokeSuspend", n = {"raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-MockAuthorizeBillingAgreementRepositoryImpl$authorize$2$1"}, nl = {65}, s = {"L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class MockAuthorizeBillingAgreementRepositoryImpl$authorize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockAuthorizeBillingAgreementRepositoryImpl;
        java.lang.Boolean bool;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str;
        arrow.core.raise.Raise raise;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        android.content.Context context;
        kotlinx.serialization.json.Json json;
        com.paypal.oslo.feature.inappcheckout.data.dto.AuthorizeBACreationDTO authorizeBACreationDTO;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity;
        com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO;
        com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper;
        kotlinx.serialization.json.Json json2;
        kotlinx.serialization.json.JsonElement jsonElement;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.getOutputMinFrameDurationlomOqCM;
        try {
            if (r2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                mockAuthorizeBillingAgreementRepositoryImpl = this.getOutputStallDuration;
                bool = this.getHighResolutionOutputSizeshNQ4ISI;
                defaultRaise = new arrow.core.raise.DefaultRaise(false);
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                if (str2 != null) {
                    this.getOutputFormats = str2;
                    this.getOutputMinFrameDuration = mockAuthorizeBillingAgreementRepositoryImpl;
                    this.getInputSizeshNQ4ISI = bool;
                    this.getHighSpeedVideoSizesFor = defaultRaise;
                    this.getOutputSizes = defaultRaise2;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.Camera2StreamConfigurationMap = 0;
                    this.getHighSpeedVideoSizes = 0;
                    this.getInputFormats = 0;
                    this.getOutputMinFrameDurationlomOqCM = 1;
                    if (kotlinx.coroutines.DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    raise = defaultRaise2;
                } else {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("Fi not selected", "Fi not selected", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
            } else {
                if (r2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                raise = (arrow.core.raise.Raise) this.getOutputSizes;
                defaultRaise = (arrow.core.raise.DefaultRaise) this.getHighSpeedVideoSizesFor;
                bool = (java.lang.Boolean) this.getInputSizeshNQ4ISI;
                mockAuthorizeBillingAgreementRepositoryImpl = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl) this.getOutputMinFrameDuration;
                java.lang.String str3 = (java.lang.String) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                str = str3;
            }
            atomicInteger = mockAuthorizeBillingAgreementRepositoryImpl.getInputSizeshNQ4ISI;
            java.lang.String access$determineCtaMockFileName = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl.access$determineCtaMockFileName(mockAuthorizeBillingAgreementRepositoryImpl, atomicInteger.incrementAndGet());
            context = mockAuthorizeBillingAgreementRepositoryImpl.getHighSpeedVideoFpsRanges;
            json = mockAuthorizeBillingAgreementRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
            java.io.InputStream open = context.getAssets().open(access$determineCtaMockFileName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                json.getSerializersModule();
                kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText);
                com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForTopLevelErrors = com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl.access$checkForTopLevelErrors(mockAuthorizeBillingAgreementRepositoryImpl, jsonObject);
                if (access$checkForTopLevelErrors != null) {
                    raise.raise(access$checkForTopLevelErrors);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                kotlinx.serialization.json.JsonObject jsonObject2 = jsonElement2 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2) : null;
                kotlinx.serialization.json.JsonObject jsonObject3 = (jsonObject2 == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement);
                if (jsonObject3 != null) {
                    json2 = mockAuthorizeBillingAgreementRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
                    authorizeBACreationDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.AuthorizeBACreationDTO) json2.decodeFromJsonElement(com.paypal.oslo.feature.inappcheckout.data.dto.AuthorizeBACreationDTO.INSTANCE.serializer(), jsonObject3);
                }
                authorizeBACreationDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.AuthorizeBACreationDTO((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> contingencies = authorizeBACreationDTO.getContingencies();
                if (contingencies == null || (contingencyDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) contingencies)) == null) {
                    contingencyEntity = null;
                } else {
                    contingencyMapper = mockAuthorizeBillingAgreementRepositoryImpl.Camera2StreamConfigurationMap;
                    contingencyEntity = contingencyMapper.map(contingencyDTO);
                }
                if (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency) {
                    mockFileNameProvider = mockAuthorizeBillingAgreementRepositoryImpl.getHighSpeedVideoFpsRangesFor;
                    mockFileNameProvider.setCtaMockFileName("mocks/cta_mocks/cta_response_success.json");
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity(authorizeBACreationDTO.getReturnURL(), authorizeBACreationDTO.getMerchantName(), authorizeBACreationDTO.getStatus(), authorizeBACreationDTO.getIntent(), authorizeBACreationDTO.getPayerID(), contingencyEntity, str, kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
                defaultRaise.complete();
                return new arrow.core.Either.Right(authorizeBACreationEntity);
            } finally {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r2));
        } catch (java.lang.Throwable th) {
            r2.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl$authorize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl$authorize$2(this.getHighSpeedVideoFpsRanges, this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAuthorizeBillingAgreementRepositoryImpl$authorize$2(java.lang.String str, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockAuthorizeBillingAgreementRepositoryImpl, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl$authorize$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputStallDuration = mockAuthorizeBillingAgreementRepositoryImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = bool;
    }
}
