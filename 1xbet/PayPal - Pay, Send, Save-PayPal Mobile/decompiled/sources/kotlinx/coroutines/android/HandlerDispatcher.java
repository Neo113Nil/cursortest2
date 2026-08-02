package kotlinx.coroutines.android;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b"}, d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "immediate", "Lkotlinx/coroutines/android/HandlerContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HandlerDispatcher extends kotlinx.coroutines.MainCoroutineDispatcher implements kotlinx.coroutines.Delay {
    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract kotlinx.coroutines.android.HandlerDispatcher getImmediate();

    private HandlerDispatcher() {
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long j, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, coroutineContext);
    }

    public /* synthetic */ HandlerDispatcher(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
