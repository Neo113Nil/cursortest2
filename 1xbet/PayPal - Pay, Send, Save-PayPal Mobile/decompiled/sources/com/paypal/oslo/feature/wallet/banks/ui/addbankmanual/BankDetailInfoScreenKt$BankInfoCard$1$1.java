package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.BankDetailInfoScreenKt$BankInfoCard$1$1", f = "BankDetailInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankDetailInfoScreenKt$BankInfoCard$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.length() > 0 && !this.getHighSpeedVideoFpsRangesFor && !kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getValue(), this.getHighSpeedVideoSizes)) {
            this.getHighSpeedVideoFpsRanges.setValue(this.getHighSpeedVideoSizes);
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(this.getHighResolutionOutputSizeshNQ4ISI, "%1$s", this.getHighSpeedVideoSizes, false, 4, (java.lang.Object) null);
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.Camera2StreamConfigurationMap.getSystemService(android.view.accessibility.AccessibilityManager.class);
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(replace$default);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.BankDetailInfoScreenKt$BankInfoCard$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.BankDetailInfoScreenKt$BankInfoCard$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDetailInfoScreenKt$BankInfoCard$1$1(java.lang.String str, boolean z, androidx.compose.runtime.MutableState<java.lang.String> mutableState, java.lang.String str2, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.BankDetailInfoScreenKt$BankInfoCard$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = context;
    }
}
