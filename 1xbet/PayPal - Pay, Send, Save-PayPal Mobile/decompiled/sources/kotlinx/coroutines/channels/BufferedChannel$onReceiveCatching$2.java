package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2 getHighSpeedVideoSizes = new kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2();

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object m24079boximpl;
        m24079boximpl = kotlinx.coroutines.channels.ChannelResult.m24079boximpl(r2 == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED() ? kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(bufferedChannel.getCloseCause()) : kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(obj2));
        return m24079boximpl;
    }

    BufferedChannel$onReceiveCatching$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
