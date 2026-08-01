package com.unity3d.player.a;

import com.unity3d.player.S0;

/* loaded from: classes7.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f11758a;

    public W(Y y) {
        this.f11758a = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y y = this.f11758a;
        S0 s0 = y.f;
        if (s0 != null) {
            y.f11760a.addViewToPlayer(s0, true);
            Y y2 = this.f11758a;
            y2.i = true;
            y2.f.requestFocus();
        }
    }
}
