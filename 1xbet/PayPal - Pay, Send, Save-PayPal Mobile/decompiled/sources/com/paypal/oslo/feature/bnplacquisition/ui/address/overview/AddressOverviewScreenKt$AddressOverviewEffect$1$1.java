package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1", f = "AddressOverviewScreen.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, nl = {135}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AddressOverviewScreenKt$AddressOverviewEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1$1", f = "AddressOverviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect addressOverviewUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (addressOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else if (addressOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.NavigateToAddAddress) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else {
                if (!(addressOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.AddressUpdated)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.invoke(((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.AddressUpdated) addressOverviewUiEffect).getAddress());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect addressOverviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1.AnonymousClass1) create(addressOverviewUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = function02;
            this.getHighSpeedVideoFpsRangesFor = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddressOverviewScreenKt$AddressOverviewEffect$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> flow, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = function02;
        this.getHighSpeedVideoSizes = function1;
    }
}
