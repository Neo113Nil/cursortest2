package com.iab.omid.library.inmobi.utils;

/* loaded from: classes5.dex */
public final class h {
    public static java.lang.String a(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static android.app.Activity b(android.view.View view) {
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public static android.view.View c(android.view.View view) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }

    public static float d(android.view.View view) {
        return view.getZ();
    }

    public static boolean e(android.view.View view) {
        android.app.Activity b;
        if (android.os.Build.VERSION.SDK_INT < 24 || (b = b(view)) == null) {
            return false;
        }
        return b.isInPictureInPictureMode();
    }

    public static boolean f(android.view.View view) {
        return a(view) == null;
    }

    public static boolean g(android.view.View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = c(view);
        }
        return true;
    }
}
