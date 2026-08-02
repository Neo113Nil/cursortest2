package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferedChannel$receiveImpl$1 implements kotlin.jvm.functions.Function3 {
    public static final kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1 INSTANCE = new kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1();

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return invoke((kotlinx.coroutines.channels.ChannelSegment) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
    }

    public final java.lang.Void invoke(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j) {
        throw new java.lang.IllegalStateException("unexpected".toString());
    }
}
