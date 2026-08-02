package kotlinx.coroutines.guava;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/guava/ListenableFutureCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "onCompleted", "(Ljava/lang/Object;)V", "", "", "p1", "onCancelled", "(Ljava/lang/Throwable;Z)V", "Lkotlinx/coroutines/guava/JobListenableFuture;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/guava/JobListenableFuture;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ListenableFutureCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public final kotlinx.coroutines.guava.JobListenableFuture<T> getHighSpeedVideoFpsRanges;

    public ListenableFutureCoroutine(kotlin.coroutines.CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.guava.JobListenableFuture<>(this);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(T p0) {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.set(p0);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(java.lang.Throwable p0, boolean p1) {
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(p0);
    }
}
