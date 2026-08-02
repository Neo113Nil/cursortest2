package n1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: n1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2158A {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }
}
