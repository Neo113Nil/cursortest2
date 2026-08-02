package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceive$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceive$1 getHighSpeedVideoFpsRanges = new kotlinx.coroutines.channels.BufferedChannel$onReceive$1();

    public final void Camera2StreamConfigurationMap(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        kotlinx.coroutines.channels.BufferedChannel.access$registerSelectForReceive(bufferedChannel, selectInstance, obj);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        Camera2StreamConfigurationMap(bufferedChannel, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    BufferedChannel$onReceive$1() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
