package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/internal/NopCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NopCollector implements kotlinx.coroutines.flow.FlowCollector<java.lang.Object> {
    public static final kotlinx.coroutines.flow.internal.NopCollector INSTANCE = new kotlinx.coroutines.flow.internal.NopCollector();

    private NopCollector() {
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
