package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<java.lang.Throwable, E, kotlin.coroutines.CoroutineContext, kotlin.Unit> {
    BufferedChannel$bindCancellationFun$2(java.lang.Object obj) {
        super(3, obj, kotlinx.coroutines.channels.BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        invoke2(th, (java.lang.Throwable) obj, coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable th, E e, kotlin.coroutines.CoroutineContext coroutineContext) {
        ((kotlinx.coroutines.channels.BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e, coroutineContext);
    }
}
