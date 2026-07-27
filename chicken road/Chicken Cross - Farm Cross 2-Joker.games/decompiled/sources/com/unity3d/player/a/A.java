package com.unity3d.player.a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.view.ViewCompat;

/* loaded from: classes7.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f11738a;

    public A(B b) {
        this.f11738a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11738a.b.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(this.f11738a.b.getResources(), this.f11738a.b.f11740a)}));
    }
}
