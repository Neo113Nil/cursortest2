package com.unity3d.player;

/* loaded from: classes7.dex */
public final class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11814a;

    public x0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11814a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11814a.destroy();
    }
}
