package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* loaded from: classes4.dex */
public final class b implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f5168a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f5168a = inneractiveBaseActivity;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f5168a.onBackPressed();
    }
}
