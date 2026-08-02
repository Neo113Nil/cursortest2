package io.ktor.client.engine.android;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 130, 136}, m = "writeTo", n = {}, s = {})
/* loaded from: classes17.dex */
final class AndroidClientEngineKt$writeTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.engine.android.AndroidClientEngineKt.writeTo(null, null, null, this);
    }

    AndroidClientEngineKt$writeTo$1(kotlin.coroutines.Continuation<? super io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1> continuation) {
        super(continuation);
    }
}
