package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity f3521a;

    public d(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f3521a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3521a.dismissAd(true);
    }
}
