package coil3.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032'\u0010\t\u001a#\b\u0001\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/network/NetworkClient;", "", "T", "Lcoil3/network/NetworkRequest;", "request", "Lkotlin/Function2;", "Lcoil3/network/NetworkResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "block", "executeRequest", "(Lcoil3/network/NetworkRequest;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NetworkClient {
    <T> java.lang.Object executeRequest(coil3.content.NetworkRequest networkRequest, kotlin.jvm.functions.Function2<? super coil3.content.NetworkResponse, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation);
}
