package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "Landroidx/compose/runtime/RememberObserver;", "wrapped", "", "afterGroupIndex", "<init>", "(Landroidx/compose/runtime/RememberObserver;I)V", "Landroidx/compose/runtime/RememberObserver;", "getWrapped", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "(Landroidx/compose/runtime/RememberObserver;)V", com.visa.cbp.getEncExpo.warmup, "getAfterGroupIndex", "()I", "setAfterGroupIndex", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class RememberObserverHolder {
    public static final int $stable = 8;
    private int afterGroupIndex;
    private androidx.compose.runtime.RememberObserver wrapped;

    public RememberObserverHolder(androidx.compose.runtime.RememberObserver rememberObserver, int i) {
        this.wrapped = rememberObserver;
        this.afterGroupIndex = i;
    }

    public final int getAfterGroupIndex() {
        return this.afterGroupIndex;
    }

    public final androidx.compose.runtime.RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfterGroupIndex(int i) {
        this.afterGroupIndex = i;
    }

    public final void setWrapped(androidx.compose.runtime.RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
