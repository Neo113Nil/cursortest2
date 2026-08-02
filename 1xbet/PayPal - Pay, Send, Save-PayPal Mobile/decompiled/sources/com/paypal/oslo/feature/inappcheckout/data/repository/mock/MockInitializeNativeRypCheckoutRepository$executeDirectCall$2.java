package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository$executeDirectCall$2", f = "MockInitializeNativeRypCheckoutRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MockInitializeNativeRypCheckoutRepository$executeDirectCall$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider;
        android.content.Context context;
        com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository mockInitializeNativeRypCheckoutRepository = this.getHighSpeedVideoSizes;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                mockFileNameProvider = mockInitializeNativeRypCheckoutRepository.getHighSpeedVideoFpsRanges;
                java.lang.String camera2StreamConfigurationMap = mockFileNameProvider.getCamera2StreamConfigurationMap();
                context = mockInitializeNativeRypCheckoutRepository.getHighResolutionOutputSizeshNQ4ISI;
                java.io.InputStream open = context.getAssets().open(camera2StreamConfigurationMap);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                try {
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    initializeNativeRypCheckoutParser = mockInitializeNativeRypCheckoutRepository.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) defaultRaise2.bind(initializeNativeRypCheckoutParser.parse(readText));
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(initializeNativeRypCheckoutResponseEntity);
                } finally {
                }
            } catch (java.io.IOException e) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Failed to read mock InitializeNativeRypCheckout data file";
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, message, true, null, null));
                throw new kotlin.KotlinNothingValueException();
            } catch (kotlinx.serialization.SerializationException e2) {
                java.lang.String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = "Failed to parse mock InitializeNativeRypCheckout data";
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
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository$executeDirectCall$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository$executeDirectCall$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockInitializeNativeRypCheckoutRepository$executeDirectCall$2(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository mockInitializeNativeRypCheckoutRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository$executeDirectCall$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = mockInitializeNativeRypCheckoutRepository;
    }
}
