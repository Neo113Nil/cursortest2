package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onSend$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onSend$1 getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.channels.BufferedChannel$onSend$1();

    public final void getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        bufferedChannel.registerSelectForSend(selectInstance, obj);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        getHighSpeedVideoFpsRangesFor(bufferedChannel, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    BufferedChannel$onSend$1() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
