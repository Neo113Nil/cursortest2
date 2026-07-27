package com.unity3d.player;

/* loaded from: classes7.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f11722a;

    public P0(S0 s0) {
        this.f11722a = s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11722a.destroyPlayer();
        this.f11722a.a(3);
    }
}
