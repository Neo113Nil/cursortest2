package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1", f = "MockCardRepository.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MockCardRepository$handleSelectIdvMethod$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod[] identityVerificationMethodArr = {new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms("abc", "***-***-1234"), new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail("def", "****@paypal.com"), new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Website("ghi", com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL), new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService("jkl", "408-555-1212"), new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp("mno", "Mock Bank"), new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds("pqr", com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL)};
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) identityVerificationMethodArr), new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1$1", f = "MockCardRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.coroutines.Continuation<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> continuation = this.getHighSpeedVideoSizes;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(identityVerificationMethod));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1.AnonymousClass1) create(identityVerificationMethod, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> continuation, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1.AnonymousClass1> continuation2) {
            super(2, continuation2);
            this.getHighSpeedVideoSizes = continuation;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MockCardRepository$handleSelectIdvMethod$2$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> continuation, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$handleSelectIdvMethod$2$1> continuation2) {
        super(2, continuation2);
        this.getHighSpeedVideoSizes = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
    }
}
