package com.unity3d.player.a;

/* loaded from: classes7.dex */
public final class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f11749a;

    public M(O o) {
        this.f11749a = o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11749a.f11751a.getView().requestPointerCapture();
    }
}
