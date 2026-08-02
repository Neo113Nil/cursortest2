package io.ktor.network.selector;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "receiveOrNullSuspend", n = {"$this$receiveOrNullSuspend"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class ActorSelectorManager$receiveOrNullSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.network.selector.ActorSelectorManager getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$receiveOrNullSuspend$1(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = actorSelectorManager;
    }
}
