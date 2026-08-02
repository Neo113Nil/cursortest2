package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/flow/EmptyFlow;", "Lkotlinx/coroutines/flow/Flow;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/FlowCollector;", "p0", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class EmptyFlow implements kotlinx.coroutines.flow.Flow {
    public static final kotlinx.coroutines.flow.EmptyFlow INSTANCE = new kotlinx.coroutines.flow.EmptyFlow();

    private EmptyFlow() {
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<?> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
