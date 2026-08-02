package androidx.compose.runtime;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ProduceStateScopeImpl$awaitDispose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.ProduceStateScopeImpl<T> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitDispose(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProduceStateScopeImpl$awaitDispose$1(androidx.compose.runtime.ProduceStateScopeImpl<T> produceStateScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = produceStateScopeImpl;
    }
}
