package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641s0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z4) {
        popupWindow.setIsClippedToScreen(z4);
    }
}
