package androidx.core.widget;

import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class j {

    static class a {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z11) {
            popupWindow.setOverlapAnchor(z11);
        }

        static void d(PopupWindow popupWindow, int i11) {
            popupWindow.setWindowLayoutType(i11);
        }
    }

    public static void a(@NonNull PopupWindow popupWindow, boolean z11) {
        a.c(popupWindow, z11);
    }

    public static void b(@NonNull PopupWindow popupWindow, int i11) {
        a.d(popupWindow, i11);
    }
}
