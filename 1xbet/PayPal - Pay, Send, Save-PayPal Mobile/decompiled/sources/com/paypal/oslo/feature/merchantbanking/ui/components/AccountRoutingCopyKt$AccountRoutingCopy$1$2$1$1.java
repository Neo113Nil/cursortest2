package com.paypal.oslo.feature.merchantbanking.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1", f = "AccountRoutingCopy.kt", i = {0}, l = {116}, m = "invokeSuspend", n = {"clipData"}, nl = {117}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.Clipboard getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                android.content.ClipData newPlainText = android.content.ClipData.newPlainText(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                androidx.compose.ui.platform.Clipboard clipboard = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(newPlainText);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(newPlainText);
                this.getHighSpeedVideoSizesFor = 1;
                if (clipboard.setClipEntry(androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(newPlainText), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRangesFor.invoke();
        } catch (java.lang.SecurityException e) {
            com.paypal.oslo.feature.merchantbanking.LoggerKt.log.e("Failed to copy to clipboard: insufficient permissions", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1(java.lang.String str, java.lang.String str2, androidx.compose.ui.platform.Clipboard clipboard, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt$AccountRoutingCopy$1$2$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRanges = clipboard;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
