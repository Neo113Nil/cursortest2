package coil3.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "T", "Lkotlin/Function1;", "initializer", "Lcoil3/network/internal/SingleParameterLazy;", "singleParameterLazy", "(Lkotlin/jvm/functions/Function1;)Lcoil3/network/internal/SingleParameterLazy;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleParameterLazyKt {
    public static final <P, T> coil3.content.internal.SingleParameterLazy<P, T> singleParameterLazy(kotlin.jvm.functions.Function1<? super P, ? extends T> function1) {
        return new coil3.content.internal.SingleParameterLazy<>(function1);
    }
}
