package financial.atomic.muppet.inter;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015J\u0010\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\b\u0010\u000bJ;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072#\u0010\n\u001a\u001f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\fH¦@¢\u0006\u0004\b\b\u0010\u000eJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lfinancial/atomic/muppet/inter/Browser;", "T", "Lfinancial/atomic/muppet/inter/Emitter;", "", "", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfinancial/atomic/muppet/inter/Page;", "newPage", "Lfinancial/atomic/muppet/inter/Page$Factory;", "factory", "(Lfinancial/atomic/muppet/inter/Page$Factory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pages", "()Ljava/util/List;", "", "handle", "()Ljava/lang/String;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Browser<T> extends financial.atomic.muppet.inter.Emitter<java.lang.Object> {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/muppet/inter/Browser$Factory;", "T", "", "Lfinancial/atomic/muppet/inter/Muppet;", "muppet", "Lfinancial/atomic/muppet/inter/Browser;", "create", "(Lfinancial/atomic/muppet/inter/Muppet;)Lfinancial/atomic/muppet/inter/Browser;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory<T> {
        financial.atomic.muppet.inter.Browser<T> create(financial.atomic.muppet.inter.Muppet<T> muppet);
    }

    java.lang.Object close(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.String handle();

    java.lang.Object newPage(financial.atomic.muppet.inter.Page.Factory<T> factory, kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation);

    java.lang.Object newPage(kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation);

    java.lang.Object newPage(kotlin.jvm.functions.Function1<? super financial.atomic.muppet.inter.Browser<T>, ? extends financial.atomic.muppet.inter.Page<? extends T>> function1, kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation);

    java.util.List<financial.atomic.muppet.inter.Page<T>> pages();
}
