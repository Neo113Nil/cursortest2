package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes4.dex */
public final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f5179a;

    public m(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f5179a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5179a.finish();
    }
}
