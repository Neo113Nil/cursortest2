package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceive$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceive$2 getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.channels.BufferedChannel$onReceive$2();

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        return kotlinx.coroutines.channels.BufferedChannel.access$processResultSelectReceive(bufferedChannel, obj, obj2);
    }

    BufferedChannel$onReceive$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
