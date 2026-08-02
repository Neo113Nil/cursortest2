package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0662s0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z4) {
        popupWindow.setIsClippedToScreen(z4);
    }
}
