package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetailError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1", f = "GetCardDetailUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {53, 55}, m = "invokeSuspend", n = {"$this$flow", "raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetCardDetailUseCase$invoke$1$result$1", "$this$flow", "result"}, nl = {63, 56}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class GetCardDetailUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        if (r0.emit(r2, r9) != r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise;
        arrow.core.Either.Left left;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase getCardDetailUseCase = this.getHighSpeedVideoSizesFor;
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise2 = defaultRaise;
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputFormats = null;
                this.getOutputMinFrameDuration = null;
                this.getInputFormats = 2;
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            if (!kotlin.text.StringsKt.isBlank(str)) {
                cardRepository = getCardDetailUseCase.getHighSpeedVideoSizes;
                java.lang.String obj2 = kotlin.text.StringsKt.trim(str).toString();
                this.getOutputSizes = flowCollector;
                this.getInputSizeshNQ4ISI = defaultRaise;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                this.getOutputMinFrameDuration = defaultRaise2;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getInputFormats = 1;
                obj = cardRepository.getCardDetail(obj2, this);
                if (obj != coroutine_suspended) {
                    defaultRaise3 = defaultRaise;
                    raise = defaultRaise2;
                }
                return coroutine_suspended;
            }
            defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.InvalidCardId.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        raise = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
        defaultRaise3 = (arrow.core.raise.DefaultRaise) this.getInputSizeshNQ4ISI;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getOutputFormats = null;
            this.getOutputMinFrameDuration = null;
            this.getInputFormats = 2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail cardDetail = (com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail) raise.bind((arrow.core.Either) obj);
        defaultRaise3.complete();
        left = new arrow.core.Either.Right(cardDetail);
        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getOutputFormats = null;
        this.getOutputMinFrameDuration = null;
        this.getInputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1 getCardDetailUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, continuation);
        getCardDetailUseCase$invoke$1.getOutputSizes = obj;
        return getCardDetailUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardDetailUseCase$invoke$1(java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase getCardDetailUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizesFor = getCardDetailUseCase;
    }
}
