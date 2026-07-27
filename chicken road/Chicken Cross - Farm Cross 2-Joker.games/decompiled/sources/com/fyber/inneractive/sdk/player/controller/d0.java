package com.fyber.inneractive.sdk.player.controller;

import android.view.View;

/* loaded from: classes4.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f5534a;

    public d0(f0 f0Var) {
        this.f5534a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5534a.b.dismiss();
        v vVar = this.f5534a.f5537a;
        vVar.b.d(vVar.f5549a);
    }
}
