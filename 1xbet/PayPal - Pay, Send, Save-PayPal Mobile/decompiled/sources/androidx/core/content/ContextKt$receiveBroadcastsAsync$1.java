package androidx.core.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.content.ContextKt", f = "Context.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "receiveBroadcastsAsync", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class ContextKt$receiveBroadcastsAsync$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.core.content.ContextKt.receiveBroadcastsAsync(null, null, 0, null, null, null, this);
    }

    ContextKt$receiveBroadcastsAsync$1(kotlin.coroutines.Continuation<? super androidx.core.content.ContextKt$receiveBroadcastsAsync$1> continuation) {
        super(continuation);
    }
}
