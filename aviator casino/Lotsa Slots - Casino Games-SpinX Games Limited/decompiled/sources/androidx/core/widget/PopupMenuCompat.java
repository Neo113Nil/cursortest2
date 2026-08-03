package androidx.core.widget;

/* loaded from: classes2.dex */
public final class PopupMenuCompat {
    private PopupMenuCompat() {
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(java.lang.Object obj) {
        return ((android.widget.PopupMenu) obj).getDragToOpenListener();
    }
}
