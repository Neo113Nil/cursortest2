package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/SharingStarted;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlow;", "", "p0", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "command", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class StartedLazily implements kotlinx.coroutines.flow.SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> p0) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.StartedLazily$command$1(p0, null));
    }

    public final java.lang.String toString() {
        return "SharingStarted.Lazily";
    }
}
