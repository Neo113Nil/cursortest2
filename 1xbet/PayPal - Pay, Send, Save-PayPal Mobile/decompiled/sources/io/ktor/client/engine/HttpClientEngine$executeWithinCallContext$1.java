package io.ktor.client.engine;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {175, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class HttpClientEngine$executeWithinCallContext$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$executeWithinCallContext(null, null, this);
    }

    HttpClientEngine$executeWithinCallContext$1(kotlin.coroutines.Continuation<? super io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1> continuation) {
        super(continuation);
    }
}
