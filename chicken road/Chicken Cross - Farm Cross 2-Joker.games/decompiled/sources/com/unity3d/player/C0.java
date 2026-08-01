package com.unity3d.player;

/* loaded from: classes7.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11702a;

    public C0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11702a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11702a.nativeSendSurfaceChangedEvent();
    }
}
