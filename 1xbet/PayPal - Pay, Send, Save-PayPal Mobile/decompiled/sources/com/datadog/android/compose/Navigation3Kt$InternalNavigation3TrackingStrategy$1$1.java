package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.datadog.android.compose.Navigation3Kt$InternalNavigation3TrackingStrategy$1$1", f = "Navigation3.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class Navigation3Kt$InternalNavigation3TrackingStrategy$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.datadog.android.rum.tracking.ComponentPredicate<T> Camera2StreamConfigurationMap;
    final /* synthetic */ com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.datadog.android.compose.AttributesResolver<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.datadog.android.compose.BackStackKeyResolver<T> getHighSpeedVideoSizes;
    final /* synthetic */ T getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.datadog.android.api.SdkCore getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        T t = this.getHighSpeedVideoSizesFor;
        booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
        com.datadog.android.compose.Navigation3Kt.trackBackStack(t, booleanValue, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputFormats), this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.datadog.android.compose.Navigation3Kt$InternalNavigation3TrackingStrategy$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.datadog.android.compose.Navigation3Kt$InternalNavigation3TrackingStrategy$1$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Navigation3Kt$InternalNavigation3TrackingStrategy$1$1(T t, com.datadog.android.rum.tracking.ComponentPredicate<T> componentPredicate, com.datadog.android.compose.BackStackKeyResolver<T> backStackKeyResolver, com.datadog.android.compose.AttributesResolver<T> attributesResolver, com.datadog.android.api.SdkCore sdkCore, com.datadog.android.api.InternalLogger internalLogger, androidx.compose.runtime.State<java.lang.Boolean> state, kotlin.coroutines.Continuation<? super com.datadog.android.compose.Navigation3Kt$InternalNavigation3TrackingStrategy$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = t;
        this.Camera2StreamConfigurationMap = componentPredicate;
        this.getHighSpeedVideoSizes = backStackKeyResolver;
        this.getHighSpeedVideoFpsRangesFor = attributesResolver;
        this.getOutputFormats = sdkCore;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
