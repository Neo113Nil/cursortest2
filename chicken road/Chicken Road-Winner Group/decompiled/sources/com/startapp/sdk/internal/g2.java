package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f3747b;

    public g2(h2 h2Var, Bitmap bitmap) {
        this.f3747b = h2Var;
        this.f3746a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j2 j2Var = this.f3747b.f3824a;
        i2 i2Var = j2Var.f3892d;
        if (i2Var != null) {
            i2Var.a(this.f3746a, j2Var.f3893e);
        }
    }
}
