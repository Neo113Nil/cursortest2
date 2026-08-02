package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/room/RoomExternalOperationElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "<init>", "()V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoomExternalOperationElement implements kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext.Key<androidx.room.RoomExternalOperationElement> {
    public static final androidx.room.RoomExternalOperationElement INSTANCE = new androidx.room.RoomExternalOperationElement();

    private RoomExternalOperationElement() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<androidx.room.RoomExternalOperationElement> getKey() {
        return INSTANCE;
    }
}
