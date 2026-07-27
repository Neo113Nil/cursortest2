package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* loaded from: classes7.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f11698a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public A0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore) {
        this.b = unityPlayerForActivityOrService;
        this.f11698a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean nativePause;
        nativePause = this.b.nativePause();
        if (nativePause) {
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.b;
            unityPlayerForActivityOrService.mQuitting = true;
            unityPlayerForActivityOrService.shutdown();
            this.b.queueDestroy();
        }
        this.f11698a.release();
    }
}
