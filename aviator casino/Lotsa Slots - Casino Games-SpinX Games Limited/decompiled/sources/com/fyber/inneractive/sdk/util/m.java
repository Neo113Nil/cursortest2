package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.displayCutout());
        int b = com.fyber.inneractive.sdk.util.o.b();
        if (b == 1) {
            view.setPadding(insets.left, 0, 0, 0);
        } else if (b == 2) {
            view.setPadding(0, 0, 0, insets.bottom);
        } else if (b != 3) {
            view.setPadding(0, insets.top, 0, 0);
        } else {
            view.setPadding(0, 0, insets.right, 0);
        }
        return windowInsets;
    }
}
