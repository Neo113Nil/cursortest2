package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_SCRP_ID}, m = "receiveOrNull", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReceiveChannel$receiveOrNull$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(null, this);
    }

    ReceiveChannel$receiveOrNull$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1> continuation) {
        super(continuation);
    }
}
