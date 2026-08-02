package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ6\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/network/ConcurrentRequestStrategy;", "", "", "key", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcoil3/fetch/FetchResult;", "block", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConcurrentRequestStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.content.ConcurrentRequestStrategy.Companion INSTANCE = coil3.content.ConcurrentRequestStrategy.Companion.getHighSpeedVideoSizes;
    public static final coil3.content.ConcurrentRequestStrategy UNCOORDINATED = new coil3.content.UncoordinatedConcurrentRequestStrategy();

    java.lang.Object apply(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/network/ConcurrentRequestStrategy$Companion;", "", "<init>", "()V", "Lcoil3/network/ConcurrentRequestStrategy;", "UNCOORDINATED", "Lcoil3/network/ConcurrentRequestStrategy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ coil3.content.ConcurrentRequestStrategy.Companion getHighSpeedVideoSizes = new coil3.content.ConcurrentRequestStrategy.Companion();

        private Companion() {
        }
    }
}
