package com.unity3d.player;

/* loaded from: classes7.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11704a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityAccessibilityDelegate c;

    public D(UnityAccessibilityDelegate unityAccessibilityDelegate, int i, int i2) {
        this.c = unityAccessibilityDelegate;
        this.f11704a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.sendEventForVirtualViewId(this.f11704a, this.b);
    }
}
