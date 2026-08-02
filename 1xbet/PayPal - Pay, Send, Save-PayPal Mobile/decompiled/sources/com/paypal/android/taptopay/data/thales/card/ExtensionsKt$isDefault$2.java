package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/IsDefaultCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2", f = "Extensions.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ExtensionsKt$isDefault$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>>, java.lang.Object> {
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.DigitalizedCard getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = digitalizedCard;
        this.getHighSpeedVideoSizes = 1;
        com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2 extensionsKt$isDefault$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(extensionsKt$isDefault$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        digitalizedCard.isDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, new com.paypal.android.taptopay.data.thales.ThalesAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> asyncResult) {
                getHighSpeedVideoFpsRangesFor(asyncResult);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> asyncResult) {
                com.paypal.android.taptopay.domain.Result.Failure failure;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncResult, "");
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>> continuation = safeContinuation2;
                if (asyncResult.isSuccessful()) {
                    failure = new com.paypal.android.taptopay.domain.Result.Success(asyncResult.getResult());
                } else {
                    java.lang.String errorMessage = asyncResult.getErrorMessage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "");
                    failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.IsDefaultCardError.DefaultError(errorMessage, asyncResult.getCausingException()));
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(failure));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(extensionsKt$isDefault$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtensionsKt$isDefault$2(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = digitalizedCard;
    }
}
