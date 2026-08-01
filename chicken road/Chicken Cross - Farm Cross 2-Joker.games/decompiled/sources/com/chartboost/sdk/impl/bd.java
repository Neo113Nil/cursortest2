package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public Context f4692a;
    public cd b;
    public cd c;
    public cd d;
    public cd e;

    public bd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4692a = context;
        this.b = new cd(context);
        this.c = new cd(this.f4692a);
        this.d = new cd(this.f4692a);
        this.e = new cd(this.f4692a);
    }

    public final cd a() {
        return this.e;
    }

    public final cd b() {
        return this.d;
    }

    public final cd c() {
        return this.c;
    }

    public final cd d() {
        return this.b;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DisplayMetrics displayMetrics = this.f4692a.getResources().getDisplayMetrics();
        b(displayMetrics.widthPixels, displayMetrics.heightPixels);
        View rootView = view.getRootView();
        if (rootView == null) {
            rootView = view;
        }
        a(rootView.getWidth(), rootView.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        b(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    public final void b(int i, int i2) {
        this.b.a(i, i2);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.d.a(i, i2, i3, i4);
    }

    public final void a(int i, int i2) {
        this.c.a(i, i2);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.e.a(i, i2, i3, i4);
    }
}
