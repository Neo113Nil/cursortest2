package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0}, l = {48, 49}, m = "execute", n = {"callable"}, s = {"L$0"})
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$execute$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.room.CoroutinesRoom.Companion getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.execute(null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$1(androidx.room.CoroutinesRoom.Companion companion, kotlin.coroutines.Continuation<? super androidx.room.CoroutinesRoom$Companion$execute$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = companion;
    }
}
