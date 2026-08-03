package androidx.core.widget;

/* loaded from: classes2.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object obj, android.view.View view) {
        return createDragToOpenListener((android.widget.ListPopupWindow) obj, view);
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow listPopupWindow, android.view.View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }
}
