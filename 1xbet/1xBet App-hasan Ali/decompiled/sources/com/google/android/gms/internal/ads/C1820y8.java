package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.gms.internal.ads.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820y8 extends RelativeLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f16412l = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: k, reason: collision with root package name */
    public AnimationDrawable f16413k;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f16413k;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
