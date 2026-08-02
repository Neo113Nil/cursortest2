package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChild", "()Lkotlinx/coroutines/CopyableThreadContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "mergeForChild", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CopyableThreadContextElement<S> extends kotlinx.coroutines.ThreadContextElement<S> {
    kotlinx.coroutines.CopyableThreadContextElement<S> copyForChild();

    kotlin.coroutines.CoroutineContext mergeForChild(kotlin.coroutines.CoroutineContext.Element overwritingElement);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static <S, R> R fold(kotlinx.coroutines.CopyableThreadContextElement<S> copyableThreadContextElement, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, function2);
        }

        public static <S, E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.CopyableThreadContextElement<S> copyableThreadContextElement, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlinx.coroutines.ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, key);
        }

        public static <S> kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.CopyableThreadContextElement<S> copyableThreadContextElement, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlinx.coroutines.ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, key);
        }

        public static <S> kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.CopyableThreadContextElement<S> copyableThreadContextElement, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, coroutineContext);
        }
    }
}
