package androidx.core.widget;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class ListViewCompat {
    @androidx.annotation.ReplaceWith(expression = "listView.scrollListBy(y)")
    @java.lang.Deprecated
    public static void scrollListBy(android.widget.ListView listView, int i) {
        listView.scrollListBy(i);
    }

    @androidx.annotation.ReplaceWith(expression = "listView.canScrollList(direction)")
    @java.lang.Deprecated
    public static boolean canScrollList(android.widget.ListView listView, int i) {
        return listView.canScrollList(i);
    }

    private ListViewCompat() {
    }
}
