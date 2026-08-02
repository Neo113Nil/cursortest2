package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u0019\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/InvokeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "Lkotlinx/coroutines/CompletionHandler;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "", "getOnCancelling", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class InvokeOnCompletion extends kotlinx.coroutines.JobNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0);
    }
}
