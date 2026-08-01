package com.unity3d.player;

/* renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4935u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC4936v f11810a;

    public RunnableC4935u(DialogC4936v dialogC4936v) {
        this.f11810a = dialogC4936v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a2 = this.f11810a.d;
        a2.a(a2.a(), true);
    }
}
