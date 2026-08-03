package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3530a;

    public m(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3530a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3530a.finish();
    }
}
