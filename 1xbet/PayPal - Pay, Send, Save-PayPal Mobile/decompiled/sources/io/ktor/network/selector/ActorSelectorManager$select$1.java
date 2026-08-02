package io.ktor.network.selector;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "select", n = {"selector"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class ActorSelectorManager$select$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.network.selector.ActorSelectorManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$select$1(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.selector.ActorSelectorManager$select$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = actorSelectorManager;
    }
}
