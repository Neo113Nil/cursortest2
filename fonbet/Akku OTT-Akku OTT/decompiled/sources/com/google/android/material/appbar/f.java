package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public final class f {
    public final View a;
    public int b;
    public int c;
    public int d;

    public f(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        ViewCompat.offsetTopAndBottom(view, i - (view.getTop() - this.b));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.c));
    }
}
