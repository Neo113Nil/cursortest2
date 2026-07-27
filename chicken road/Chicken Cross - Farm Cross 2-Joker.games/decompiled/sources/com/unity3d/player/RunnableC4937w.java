package com.unity3d.player;

/* renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4937w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4939y f11812a;

    public RunnableC4937w(C4939y c4939y) {
        this.f11812a = c4939y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11812a.c.requestFocus();
        this.f11812a.e();
    }
}
