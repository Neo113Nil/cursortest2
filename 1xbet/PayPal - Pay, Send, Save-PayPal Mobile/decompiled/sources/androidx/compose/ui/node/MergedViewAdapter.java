package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "<init>", "()V", "T", "", "id", "Lkotlin/Function0;", "factory", "get", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "", "willInsert", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "didInsert", "didUpdate", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "", "adapters", "Ljava/util/List;", "getAdapters", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MergedViewAdapter implements androidx.compose.ui.node.ViewAdapter {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.ui.node.ViewAdapter> adapters = new java.util.ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public final int getId() {
        return this.id;
    }

    public final java.util.List<androidx.compose.ui.node.ViewAdapter> getAdapters() {
        return this.adapters;
    }

    public final <T extends androidx.compose.ui.node.ViewAdapter> T get(int id, kotlin.jvm.functions.Function0<? extends T> factory) {
        androidx.compose.ui.node.ViewAdapter viewAdapter;
        java.util.List<androidx.compose.ui.node.ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i);
            if (viewAdapter.getId() == id) {
                break;
            }
            i++;
        }
        T t = viewAdapter instanceof androidx.compose.ui.node.ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        getAdapters().add(invoke);
        return invoke;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public final void willInsert(android.view.View view, android.view.ViewGroup parent) {
        java.util.List<androidx.compose.ui.node.ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public final void didInsert(android.view.View view, android.view.ViewGroup parent) {
        java.util.List<androidx.compose.ui.node.ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public final void didUpdate(android.view.View view, android.view.ViewGroup parent) {
        java.util.List<androidx.compose.ui.node.ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, parent);
        }
    }
}
