package com.unity3d.player;

/* loaded from: classes7.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11707a;

    public F0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11707a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11707a.nativeResume();
    }
}
