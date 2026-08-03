package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity f3522a;

    public e(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f3522a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 2) == 0) {
            com.fyber.inneractive.sdk.util.r.b.postDelayed(this.f3522a.mHideNavigationBarTask, 3000L);
        }
    }
}
