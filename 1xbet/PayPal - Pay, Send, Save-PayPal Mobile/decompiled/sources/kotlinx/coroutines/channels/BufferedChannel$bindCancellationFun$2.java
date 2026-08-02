package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<java.lang.Throwable, E, kotlin.coroutines.CoroutineContext, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th, E e, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.channels.BufferedChannel.access$onCancellationImplDoNotCall((kotlinx.coroutines.channels.BufferedChannel) this.receiver, th, e, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        getHighResolutionOutputSizeshNQ4ISI(th, obj, coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    BufferedChannel$bindCancellationFun$2(java.lang.Object obj) {
        super(3, obj, kotlinx.coroutines.channels.BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }
}
