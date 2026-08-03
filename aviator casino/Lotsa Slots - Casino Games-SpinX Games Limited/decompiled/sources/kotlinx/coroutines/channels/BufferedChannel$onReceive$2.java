package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BufferedChannel$onReceive$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceive$2 INSTANCE = new kotlinx.coroutines.channels.BufferedChannel$onReceive$2();

    BufferedChannel$onReceive$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object processResultSelectReceive;
        processResultSelectReceive = bufferedChannel.processResultSelectReceive(obj, obj2);
        return processResultSelectReceive;
    }
}
