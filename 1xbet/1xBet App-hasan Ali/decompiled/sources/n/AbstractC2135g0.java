package n;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: n.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2135g0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
