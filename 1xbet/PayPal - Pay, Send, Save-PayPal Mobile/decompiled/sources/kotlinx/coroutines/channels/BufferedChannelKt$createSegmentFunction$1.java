package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.channels.ChannelSegment<E>, kotlinx.coroutines.channels.ChannelSegment<E>> {
    public static final kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 getHighSpeedVideoFpsRanges = new kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Long l, java.lang.Object obj) {
        return kotlinx.coroutines.channels.BufferedChannelKt.access$createSegment(l.longValue(), (kotlinx.coroutines.channels.ChannelSegment) obj);
    }

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, kotlinx.coroutines.channels.BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }
}
