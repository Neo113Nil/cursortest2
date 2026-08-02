package com.paypal.oslo.feature.wallet.me.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreferencesProduct;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1", f = "DefaultProductsUseCase.kt", i = {0, 1}, l = {39, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {38, 60}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes16.dex */
final class DefaultProductsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r2.emit(r9, r8) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineDispatcher = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
            this.Camera2StreamConfigurationMap = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1.AnonymousClass1(null), this);
            if (obj != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreferencesProduct;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1$1", f = "DefaultProductsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct(true, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference[]{new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.ONLINE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_payment_preferences_online_payments, new java.lang.Object[0]), null, 4, null), new com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.IN_STORE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_payment_preferences_in_store_payments, new java.lang.Object[0]), null, 4, null)}));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct> continuation) {
            return ((com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1 defaultProductsUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1(this.getHighSpeedVideoFpsRanges, continuation);
        defaultProductsUseCase$invoke$1.getHighSpeedVideoSizes = obj;
        return defaultProductsUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultProductsUseCase$invoke$1(com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase defaultProductsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = defaultProductsUseCase;
    }
}
