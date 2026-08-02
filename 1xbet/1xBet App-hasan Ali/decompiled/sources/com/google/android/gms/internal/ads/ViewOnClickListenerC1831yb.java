package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1831yb implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16436k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16437l;

    public /* synthetic */ ViewOnClickListenerC1831yb(int i, Object obj) {
        this.f16436k = i;
        this.f16437l = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16436k) {
            case 0:
                ((C1876zb) this.f16437l).A(true);
                break;
            default:
                ((Vk) this.f16437l).f11920j.f4713b = true;
                break;
        }
    }
}
