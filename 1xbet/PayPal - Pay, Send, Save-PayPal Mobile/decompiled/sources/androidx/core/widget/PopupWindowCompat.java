package androidx.core.widget;

/* loaded from: classes3.dex */
public final class PopupWindowCompat {
    private PopupWindowCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @java.lang.Deprecated
    public static void showAsDropDown(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static void setOverlapAnchor(android.widget.PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static boolean getOverlapAnchor(android.widget.PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static void setWindowLayoutType(android.widget.PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static int getWindowLayoutType(android.widget.PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
}
