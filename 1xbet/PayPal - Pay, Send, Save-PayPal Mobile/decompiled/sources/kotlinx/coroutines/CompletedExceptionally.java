package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "", "<init>", "(Ljava/lang/Throwable;Z)V", "_handled", "Lkotlinx/atomicfu/AtomicBoolean;", "getHandled", "()Z", "makeHandled", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CompletedExceptionally {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final java.lang.Throwable cause;

    public CompletedExceptionally(java.lang.Throwable th, boolean z) {
        this.cause = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public /* synthetic */ CompletedExceptionally(java.lang.Throwable th, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(this.cause);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final boolean getHandled() {
        return getHighResolutionOutputSizeshNQ4ISI.get(this) == 1;
    }

    public final boolean makeHandled() {
        return getHighResolutionOutputSizeshNQ4ISI.compareAndSet(this, 0, 1);
    }
}
