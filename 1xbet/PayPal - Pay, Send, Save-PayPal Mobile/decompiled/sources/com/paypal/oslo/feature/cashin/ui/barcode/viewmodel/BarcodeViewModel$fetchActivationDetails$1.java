package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1", f = "BarcodeViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {130}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$fetchActivationDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeUiState.Loading.INSTANCE);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1", f = "BarcodeViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {117, 126}, m = "invokeSuspend", n = {"$this$coroutineScope", "activationDeferred", "eligibilityDeferred", "cardArtDeferred", "$this$coroutineScope", "activationDeferred", "eligibilityDeferred", "cardArtDeferred", "activationResult", "this_$iv", "details", "$i$f$fold", "$i$a$-fold-BarcodeViewModel$fetchActivationDetails$1$1$2"}, nl = {119, 127}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        private /* synthetic */ java.lang.Object getOutputSizes;
        final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel getOutputStallDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            kotlinx.coroutines.Deferred async$default2;
            kotlinx.coroutines.Deferred async$default3;
            kotlinx.coroutines.Deferred deferred;
            kotlinx.coroutines.Deferred deferred2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputSizes;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDurationlomOqCM;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1(this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, null), 3, null);
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1(this.getOutputStallDuration, null), 3, null);
                async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$cardArtDeferred$1(this.getOutputStallDuration, null), 3, null);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
                this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
                this.getHighSpeedVideoSizesFor = async$default3;
                this.getOutputMinFrameDurationlomOqCM = 1;
                java.lang.Object await = async$default.await(this);
                if (await != coroutine_suspended) {
                    deferred = async$default;
                    obj = await;
                    deferred2 = async$default2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow2 = (kotlinx.coroutines.flow.MutableStateFlow) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2.setValue(obj);
                return kotlin.Unit.INSTANCE;
            }
            async$default3 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizesFor;
            deferred2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
            deferred = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel = this.getOutputStallDuration;
            com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext loadContext = this.getHighSpeedVideoFpsRanges;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails cashInActivationDetails = (com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails) ((arrow.core.Either.Right) either).getValue();
                mutableStateFlow = barcodeViewModel.getHighSpeedVideoSizesFor;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default3);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInActivationDetails);
                this.getOutputFormats = mutableStateFlow;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputMinFrameDurationlomOqCM = 2;
                obj = com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.access$handleActivationSuccess(barcodeViewModel, cashInActivationDetails, deferred2, async$default3, this);
                if (obj != coroutine_suspended) {
                    mutableStateFlow2 = mutableStateFlow;
                    mutableStateFlow2.setValue(obj);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.cashin.domain.error.CashInError cashInError = (com.paypal.oslo.feature.cashin.domain.error.CashInError) ((arrow.core.Either.Left) either).getValue();
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) async$default3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.access$handleActivationError(barcodeViewModel, loadContext, cashInError);
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1.AnonymousClass1(this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getOutputSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext loadContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputStallDuration = barcodeViewModel;
            this.getHighSpeedVideoFpsRanges = loadContext;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$fetchActivationDetails$1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext loadContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = barcodeViewModel;
        this.Camera2StreamConfigurationMap = loadContext;
    }
}
