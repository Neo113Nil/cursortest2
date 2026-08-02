package io.ktor.network.selector;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0, 1, 1, 2, 2}, l = {70, 74, 90}, m = "process", n = {"mb", "selector", "mb", "selector", "mb", "selector"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class ActorSelectorManager$process$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.network.selector.ActorSelectorManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.network.selector.ActorSelectorManager.access$process(this.getHighSpeedVideoSizes, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$process$1(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.selector.ActorSelectorManager$process$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = actorSelectorManager;
    }
}
