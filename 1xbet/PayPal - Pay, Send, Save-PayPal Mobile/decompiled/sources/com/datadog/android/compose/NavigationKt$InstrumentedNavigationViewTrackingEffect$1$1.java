package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1", f = "Navigation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.datadog.android.api.SdkCore Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.datadog.android.compose.internal.TelemetryKt.sendTelemetry(true, com.datadog.android.compose.internal.InstrumentationType.ViewTracking, com.datadog.android.compose.internal.SupportLibrary.Navigation, this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1(com.datadog.android.api.SdkCore sdkCore, kotlin.coroutines.Continuation<? super com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sdkCore;
    }
}
