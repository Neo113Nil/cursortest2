package androidx.compose.ui.node;

/* compiled from: ViewInterop.android.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a1\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\bH\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"viewAdaptersKey", "", "tagKey", com.ironsource.X3.i.W, "", "getOrAddAdapter", "T", "Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "id", "factory", "Lkotlin/Function0;", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "getViewAdapter", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

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
        java.lang.Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof androidx.compose.ui.node.MergedViewAdapter) {
            return (androidx.compose.ui.node.MergedViewAdapter) tag;
        }
        return null;
    }

    public static final androidx.compose.ui.node.MergedViewAdapter getViewAdapter(android.view.View view) {
        int i = viewAdaptersKey;
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
