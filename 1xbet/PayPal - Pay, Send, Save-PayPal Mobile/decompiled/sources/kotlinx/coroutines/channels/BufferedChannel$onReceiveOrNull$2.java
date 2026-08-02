package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 getHighSpeedVideoSizes = new kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2();

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        return kotlinx.coroutines.channels.BufferedChannel.access$processResultSelectReceiveOrNull(bufferedChannel, obj, obj2);
    }

    BufferedChannel$onReceiveOrNull$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
