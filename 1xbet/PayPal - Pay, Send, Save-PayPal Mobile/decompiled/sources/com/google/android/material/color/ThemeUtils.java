package com.google.android.material.color;

/* loaded from: classes8.dex */
public final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(android.content.Context context, int i) {
        android.content.res.Resources.Theme windowDecorViewTheme;
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof android.app.Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((android.app.Activity) context)) == null) {
            return;
        }
        windowDecorViewTheme.applyStyle(i, true);
    }

    private static android.content.res.Resources.Theme getWindowDecorViewTheme(android.app.Activity activity) {
        android.view.View peekDecorView;
        android.content.Context context;
        android.view.Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
