package com.unity3d.player.a;

import android.view.ViewTreeObserver;

/* loaded from: classes7.dex */
public final class H implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.A f11744a;

    public H(com.unity3d.player.A a2) {
        this.f11744a = a2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f11744a.reportSoftInputArea();
    }
}
