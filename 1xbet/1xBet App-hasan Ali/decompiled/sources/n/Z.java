package n;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class Z {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z3) {
        return popupWindow.getMaxAvailableHeight(view, i, z3);
    }
}
