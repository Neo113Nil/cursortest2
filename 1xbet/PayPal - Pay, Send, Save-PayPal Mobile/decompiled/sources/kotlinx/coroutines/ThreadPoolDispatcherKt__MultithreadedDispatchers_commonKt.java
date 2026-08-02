package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CloseableCoroutineDispatcher;", "newSingleThreadContext", "(Ljava/lang/String;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
/* loaded from: classes17.dex */
final /* synthetic */ class ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String str) {
        return kotlinx.coroutines.ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, str);
    }
}
