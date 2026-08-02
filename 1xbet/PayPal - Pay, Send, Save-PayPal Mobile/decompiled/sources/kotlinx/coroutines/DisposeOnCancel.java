package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/DisposeOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/DisposableHandle;", "p0", "<init>", "(Lkotlinx/coroutines/DisposableHandle;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/DisposableHandle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DisposeOnCancel implements kotlinx.coroutines.CancelHandler {
    private final kotlinx.coroutines.DisposableHandle getHighResolutionOutputSizeshNQ4ISI;

    public DisposeOnCancel(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.getHighResolutionOutputSizeshNQ4ISI = disposableHandle;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(java.lang.Throwable p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisposeOnCancel[");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
