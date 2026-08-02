package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl$fetch$2", f = "MockFundingSelectionApiRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {46}, m = "invokeSuspend", n = {"raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-MockFundingSelectionApiRepositoryImpl$fetch$2$1"}, nl = {47}, s = {"L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class MockFundingSelectionApiRepositoryImpl$fetch$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl mockFundingSelectionApiRepositoryImpl;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider;
        android.content.Context context;
        kotlinx.serialization.json.Json json;
        com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mockFundingSelectionApiRepositoryImpl = this.getInputSizeshNQ4ISI;
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                this.getHighSpeedVideoFpsRangesFor = mockFundingSelectionApiRepositoryImpl;
                this.getOutputFormats = defaultRaise;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoSizesFor = 1;
                if (kotlinx.coroutines.DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultRaise2 = defaultRaise;
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
            defaultRaise2 = (arrow.core.raise.DefaultRaise) this.getOutputFormats;
            mockFundingSelectionApiRepositoryImpl = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl) this.getHighSpeedVideoFpsRangesFor;
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
        mockFileNameProvider = mockFundingSelectionApiRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor = mockFileNameProvider.getGetHighSpeedVideoFpsRangesFor();
        context = mockFundingSelectionApiRepositoryImpl.getHighSpeedVideoFpsRanges;
        json = mockFundingSelectionApiRepositoryImpl.getHighSpeedVideoSizes;
        java.io.InputStream open = context.getAssets().open(getHighSpeedVideoFpsRangesFor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            json.getSerializersModule();
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO fundingSelectionDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO) json.decodeFromString(com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO.INSTANCE.serializer(), readText);
            fundingSelectionEntityMapper = mockFundingSelectionApiRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity convert = fundingSelectionEntityMapper.convert(fundingSelectionDTO);
            defaultRaise2.complete();
            return new arrow.core.Either.Right(convert);
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl$fetch$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl$fetch$2(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockFundingSelectionApiRepositoryImpl$fetch$2(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl mockFundingSelectionApiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl$fetch$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = mockFundingSelectionApiRepositoryImpl;
    }
}
