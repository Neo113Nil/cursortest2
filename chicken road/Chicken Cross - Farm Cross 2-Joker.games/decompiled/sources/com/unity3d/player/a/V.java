package com.unity3d.player.a;

/* loaded from: classes7.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f11757a;

    public V(Y y) {
        this.f11757a = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11757a.f11760a.onPause();
    }
}
