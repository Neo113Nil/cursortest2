package com.unity3d.player.a;

/* loaded from: classes7.dex */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f11750a;

    public N(O o) {
        this.f11750a = o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11750a.f11751a.getView().releasePointerCapture();
    }
}
