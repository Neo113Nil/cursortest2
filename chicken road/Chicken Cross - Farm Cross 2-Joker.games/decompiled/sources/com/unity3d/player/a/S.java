package com.unity3d.player.a;

import com.unity3d.player.C4904e0;
import com.unity3d.player.S0;

/* loaded from: classes7.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f11754a;

    public S(T t) {
        this.f11754a = t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y y = this.f11754a.f11755a.h;
        S0 s0 = y.f;
        if (s0 != null) {
            y.f11760a.removeViewFromPlayer(s0);
            y.i = false;
            y.f.destroyPlayer();
            y.f = null;
            C4904e0 c4904e0 = y.c;
            if (c4904e0 != null) {
                c4904e0.a();
            }
        }
        this.f11754a.f11755a.h.f11760a.onResume();
    }
}
