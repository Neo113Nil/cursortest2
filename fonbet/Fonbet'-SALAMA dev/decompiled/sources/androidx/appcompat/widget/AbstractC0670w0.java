package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0670w0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
