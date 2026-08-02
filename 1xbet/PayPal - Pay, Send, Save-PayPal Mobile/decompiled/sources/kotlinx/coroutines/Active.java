package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/Active;", "Lkotlinx/coroutines/NotCompleted;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class Active implements kotlinx.coroutines.NotCompleted {
    public static final kotlinx.coroutines.Active INSTANCE = new kotlinx.coroutines.Active();

    private Active() {
    }

    public final java.lang.String toString() {
        return "Active";
    }
}
