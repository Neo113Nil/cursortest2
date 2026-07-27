package com.fyber.inneractive.sdk.activities;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f5169a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f5169a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5169a.isFinishing()) {
            return;
        }
        this.f5169a.hideNavigationBar();
    }
}
