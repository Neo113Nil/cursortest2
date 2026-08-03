package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class b implements android.window.OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveBaseActivity f3519a;

    public b(com.fyber.inneractive.sdk.activities.InneractiveBaseActivity inneractiveBaseActivity) {
        this.f3519a = inneractiveBaseActivity;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f3519a.onBackPressed();
    }
}
