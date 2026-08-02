package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b"}, d2 = {"Lkotlinx/coroutines/flow/ThrowingCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "e", "<init>", "(Ljava/lang/Throwable;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThrowingCollector implements kotlinx.coroutines.flow.FlowCollector<java.lang.Object> {
    public final java.lang.Throwable e;

    public ThrowingCollector(java.lang.Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        throw this.e;
    }
}
