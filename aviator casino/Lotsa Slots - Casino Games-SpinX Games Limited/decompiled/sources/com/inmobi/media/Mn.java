package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Mn {
    public static final void a(android.widget.ProgressBar progressBar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBar, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            progressBar.setProgress(i, true);
        } else {
            progressBar.setProgress(i);
        }
    }

    public static final boolean b(android.view.View view, android.view.ViewGroup parentView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, parentView);
        }
        return false;
    }

    public static final boolean a(android.view.View view, android.view.ViewGroup parentView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(parent, parentView)) {
                return true;
            }
            parent = parent instanceof android.view.ViewGroup ? ((android.view.ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final void a(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
