package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/InitError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2", f = "ThalesInitializer.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesInitializer$init$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.init.ThalesInitializer getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        com.paypal.android.taptopay.data.thales.init.AppPaymentExperience appPaymentExperience;
        boolean z;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Initializing", null, null, 6, null);
        com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = thalesInitializer;
        this.Camera2StreamConfigurationMap = 1;
        com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2 thalesInitializer$init$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesInitializer$init$2));
        kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            context = thalesInitializer.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            appPaymentExperience = thalesInitializer.getInputFormats;
            z = thalesInitializer.getInputSizeshNQ4ISI;
            if (com.paypal.android.taptopay.data.thales.init.ThalesInitializer.access$setPaymentExperience(thalesInitializer, context, appPaymentExperience, z)) {
                coroutineDispatcher = thalesInitializer.getHighSpeedVideoFpsRangesFor;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2$1$1(safeContinuation2, thalesInitializer, null), 3, null);
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                cardDataSource = thalesInitializer.getHighSpeedVideoFpsRanges;
                cardDataSource.rehydrate$tap_to_pay_data_thales_release();
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError("Internal exception", th))));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesInitializer$init$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesInitializer$init$2(com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.init.ThalesInitializer$init$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = thalesInitializer;
    }
}
