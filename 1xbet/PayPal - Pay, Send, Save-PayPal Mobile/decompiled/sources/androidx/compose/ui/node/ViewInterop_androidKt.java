package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", "T", "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "getOrAddAdapter", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "", "key", "tagKey", "(Ljava/lang/String;)I", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "(Landroid/view/View;)Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapter", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewInterop_androidKt {
    private static final int getHighSpeedVideoSizes = tagKey("ViewAdapter");

    public static final <T extends androidx.compose.ui.node.ViewAdapter> T getOrAddAdapter(android.view.View view, int i, kotlin.jvm.functions.Function0<? extends T> function0) {
        androidx.compose.ui.node.ViewAdapter viewAdapter;
        androidx.compose.ui.node.MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        java.util.List<androidx.compose.ui.node.ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i2);
            if (viewAdapter.getId() == i) {
                break;
            }
            i2++;
        }
        T t = viewAdapter instanceof androidx.compose.ui.node.ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T invoke = function0.invoke();
        viewAdapter2.getAdapters().add(invoke);
        return invoke;
    }

    public static final int tagKey(java.lang.String str) {
        return str.hashCode() | 50331648;
    }

    public static final androidx.compose.ui.node.MergedViewAdapter getViewAdapterIfExists(android.view.View view) {
        java.lang.Object tag = view.getTag(getHighSpeedVideoSizes);
        if (tag instanceof androidx.compose.ui.node.MergedViewAdapter) {
            return (androidx.compose.ui.node.MergedViewAdapter) tag;
        }
        return null;
    }

    public static final androidx.compose.ui.node.MergedViewAdapter getViewAdapter(android.view.View view) {
        int i = getHighSpeedVideoSizes;
        java.lang.Object tag = view.getTag(i);
        androidx.compose.ui.node.MergedViewAdapter mergedViewAdapter = tag instanceof androidx.compose.ui.node.MergedViewAdapter ? (androidx.compose.ui.node.MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        androidx.compose.ui.node.MergedViewAdapter mergedViewAdapter2 = new androidx.compose.ui.node.MergedViewAdapter();
        view.setTag(i, mergedViewAdapter2);
        return mergedViewAdapter2;
    }
}
