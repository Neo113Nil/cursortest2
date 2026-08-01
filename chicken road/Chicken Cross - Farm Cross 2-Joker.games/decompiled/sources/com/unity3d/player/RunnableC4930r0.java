package com.unity3d.player;

/* renamed from: com.unity3d.player.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4930r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11806a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC4930r0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.f11806a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        abstractC4933t = this.b.mSoftInput;
        if (abstractC4933t != null) {
            abstractC4933t.a(this.f11806a);
        }
    }
}
