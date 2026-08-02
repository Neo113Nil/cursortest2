package androidx.core.widget;

/* loaded from: classes7.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object obj, android.view.View view) {
        return createDragToOpenListener((android.widget.ListPopupWindow) obj, view);
    }

    @androidx.annotation.ReplaceWith(expression = "listPopupWindow.createDragToOpenListener(src)")
    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow listPopupWindow, android.view.View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }
}
