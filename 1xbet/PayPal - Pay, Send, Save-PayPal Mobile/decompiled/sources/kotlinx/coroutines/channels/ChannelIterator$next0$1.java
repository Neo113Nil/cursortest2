package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {1092}, m = io.ktor.http.LinkHeader.Rel.Next, n = {"$this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ChannelIterator$next0$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(null, this);
    }

    ChannelIterator$next0$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelIterator$next0$1> continuation) {
        super(continuation);
    }
}
