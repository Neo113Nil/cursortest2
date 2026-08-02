package com.paypal.oslo.feature.cryptocurrency.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1", f = "CryptoSettingsScreen.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {66}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSettingsScreenKt$CryptoSettingsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.LifecycleOwner getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1$1", f = "CryptoSettingsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.access$CryptoSettingsScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI) instanceof com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Initial)) {
                this.Camera2StreamConfigurationMap.loadSettings$cryptocurrency_prodRelease();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = cryptoSettingsViewModel;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighResolutionOutputSizeshNQ4ISI, androidx.lifecycle.Lifecycle.State.RESUMED, new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoSettingsScreenKt$CryptoSettingsScreen$1$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt$CryptoSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleOwner;
        this.getHighSpeedVideoFpsRangesFor = cryptoSettingsViewModel;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
