package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes4.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f5170a;

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f5170a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5170a.dismissAd(true);
    }
}
