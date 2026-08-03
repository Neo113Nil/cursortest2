package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/Active;", "Lkotlinx/coroutines/NotCompleted;", "<init>", "()V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Active implements kotlinx.coroutines.NotCompleted {
    public static final kotlinx.coroutines.Active INSTANCE = new kotlinx.coroutines.Active();

    private Active() {
    }

    public java.lang.String toString() {
        return "Active";
    }
}
