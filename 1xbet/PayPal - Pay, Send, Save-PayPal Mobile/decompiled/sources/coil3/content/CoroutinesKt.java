package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlinx/coroutines/Deferred;", "getCompletedOrNull", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutinesKt {
    public static final <T> T getCompletedOrNull(kotlinx.coroutines.Deferred<? extends T> deferred) {
        try {
            return deferred.getCompleted();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
