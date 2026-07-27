package com.unity3d.player.a;

/* renamed from: com.unity3d.player.a.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C4895y {
    public final Runnable b;

    /* renamed from: a, reason: collision with root package name */
    public C4894x f11779a = null;
    public boolean c = true;

    public C4895y(Runnable runnable) {
        this.b = runnable;
    }

    public void unregisterOnBackPressedCallback() {
        this.f11779a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.f11779a != null) {
            return;
        }
        this.f11779a = new C4894x(this.b);
    }
}
