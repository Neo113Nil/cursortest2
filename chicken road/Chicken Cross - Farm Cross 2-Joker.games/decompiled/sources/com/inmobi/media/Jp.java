package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Jp {
    public static final boolean b(View view, ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, parentView);
        }
        return false;
    }

    public static final void a(ProgressBar progressBar, int i) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        progressBar.setProgress(i, true);
    }

    public static final boolean a(View view, ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (Intrinsics.areEqual(parent, parentView)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
