package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00008\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u0005"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "()V", "clear", "onClear", "", "", "index", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "remove", "(Ljava/util/List;II)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "move", "(Ljava/util/List;III)V", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "Landroidx/compose/runtime/Stack;", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "Ljava/util/ArrayList;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "current", "getCurrent", "setCurrent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractApplier<T> implements androidx.compose.runtime.Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final java.util.ArrayList<T> stack = androidx.compose.runtime.Stack.m5282constructorimpl$default(null, 1, null);

    protected abstract void onClear();

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    public final T getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    protected void setCurrent(T t) {
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T node) {
        androidx.compose.runtime.Stack.m5292pushimpl(this.stack, getCurrent());
        setCurrent(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(androidx.compose.runtime.Stack.m5291popimpl(this.stack));
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        androidx.compose.runtime.Stack.m5280clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    protected final void remove(java.util.List<T> list, int i, int i2) {
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    protected final void move(java.util.List<T> list, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            java.util.List<T> subList = list.subList(i, i3 + i);
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) subList);
            subList.clear();
            list.addAll(i4, mutableList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }
}
