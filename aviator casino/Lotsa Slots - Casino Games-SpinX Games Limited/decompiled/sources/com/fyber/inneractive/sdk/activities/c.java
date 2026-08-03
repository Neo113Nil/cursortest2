package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity f3520a;

    public c(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f3520a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3520a.isFinishing()) {
            return;
        }
        this.f3520a.hideNavigationBar();
    }
}
