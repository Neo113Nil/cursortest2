package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.channels.ChannelSegment<E>, kotlinx.coroutines.channels.ChannelSegment<E>> {
    public static final kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 INSTANCE = new kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, kotlinx.coroutines.channels.BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long l, java.lang.Object obj) {
        return invoke(l.longValue(), (kotlinx.coroutines.channels.ChannelSegment) obj);
    }

    public final kotlinx.coroutines.channels.ChannelSegment<E> invoke(long j, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment) {
        kotlinx.coroutines.channels.ChannelSegment<E> createSegment;
        createSegment = kotlinx.coroutines.channels.BufferedChannelKt.createSegment(j, channelSegment);
        return createSegment;
    }
}
