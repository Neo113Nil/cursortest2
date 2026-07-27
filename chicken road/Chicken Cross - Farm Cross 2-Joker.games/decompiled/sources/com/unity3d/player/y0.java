package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes7.dex */
public final class y0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11815a;

    public y0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11815a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f11815a.invokeOnMainThread((Runnable) new C4918l0(this, windowInsets));
        return windowInsets;
    }
}
