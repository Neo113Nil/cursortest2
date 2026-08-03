package kotlinx.coroutines.channels;

/* compiled from: Actor.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class LazyActorCoroutine$onSend$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.LazyActorCoroutine<?>, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1 INSTANCE = new kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1();

    LazyActorCoroutine$onSend$1() {
        super(3, kotlinx.coroutines.channels.LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.channels.LazyActorCoroutine<?> lazyActorCoroutine, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        invoke2(lazyActorCoroutine, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.channels.LazyActorCoroutine<?> lazyActorCoroutine, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        lazyActorCoroutine.onSendRegFunction(selectInstance, obj);
    }
}
