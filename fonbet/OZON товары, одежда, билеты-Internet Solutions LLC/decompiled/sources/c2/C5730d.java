package c2;

import D1.C2809k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.e;
import j1.l;
import k1.C7460f;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5730d {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(l lVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C7460f focusRect = lVar.getFocusRect();
        if (focusRect == null) {
            return null;
        }
        return new Rect((((int) focusRect.n()) + iArr[0]) - iArr2[0], (((int) focusRect.q()) + iArr[1]) - iArr2[1], (((int) focusRect.o()) + iArr[0]) - iArr2[0], (((int) focusRect.h()) + iArr[1]) - iArr2[1]);
    }

    public static final View c(e.c cVar) {
        View K11 = C2809k.f(cVar.getNode()).K();
        if (K11 != null) {
            return K11;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
