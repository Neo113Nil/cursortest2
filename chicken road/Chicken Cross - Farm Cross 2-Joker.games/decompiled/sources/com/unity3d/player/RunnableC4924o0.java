package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4924o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11800a = false;
    public boolean b = false;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    public RunnableC4924o0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        AbstractC4933t abstractC4933t2;
        abstractC4933t = this.e.mSoftInput;
        if (abstractC4933t != null) {
            this.d.setOnHandleFocusListener(new C4920m0(this));
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.e;
            abstractC4933t2 = unityPlayerForActivityOrService.mSoftInput;
            abstractC4933t2.g = new C4922n0(this);
            unityPlayerForActivityOrService.dismissSoftInput();
        }
    }
}
