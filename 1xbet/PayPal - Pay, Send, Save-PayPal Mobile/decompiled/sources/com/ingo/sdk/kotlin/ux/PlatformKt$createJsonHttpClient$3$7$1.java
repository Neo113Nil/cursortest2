package com.ingo.sdk.kotlin.ux;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "cause", "", "request", "Lio/ktor/client/request/HttpRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.ux.PlatformKt$createJsonHttpClient$3$7$1", f = "Platform.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class PlatformKt$createJsonHttpClient$3$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.invoke((java.lang.Throwable) this.getHighSpeedVideoSizes, (io.ktor.client.request.HttpRequest) this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Throwable th, io.ktor.client.request.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.ingo.sdk.kotlin.ux.PlatformKt$createJsonHttpClient$3$7$1 platformKt$createJsonHttpClient$3$7$1 = new com.ingo.sdk.kotlin.ux.PlatformKt$createJsonHttpClient$3$7$1(this.Camera2StreamConfigurationMap, continuation);
        platformKt$createJsonHttpClient$3$7$1.getHighSpeedVideoSizes = th;
        platformKt$createJsonHttpClient$3$7$1.getHighSpeedVideoFpsRangesFor = httpRequest;
        return platformKt$createJsonHttpClient$3$7$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlatformKt$createJsonHttpClient$3$7$1(kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super io.ktor.client.request.HttpRequest, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.ux.PlatformKt$createJsonHttpClient$3$7$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function2;
    }
}
