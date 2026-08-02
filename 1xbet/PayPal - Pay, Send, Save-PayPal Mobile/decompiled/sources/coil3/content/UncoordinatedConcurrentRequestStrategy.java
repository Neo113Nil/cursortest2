package coil3.content;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/network/UncoordinatedConcurrentRequestStrategy;", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "()V", "", "p0", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcoil3/fetch/FetchResult;", "", "p1", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UncoordinatedConcurrentRequestStrategy implements coil3.content.ConcurrentRequestStrategy {
    @Override // coil3.content.ConcurrentRequestStrategy
    public final java.lang.Object apply(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        return function1.invoke(continuation);
    }
}
