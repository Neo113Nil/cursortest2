package com.unity3d.player;

import com.unity3d.player.a.AbstractC4890t;

/* loaded from: classes7.dex */
public final class E0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11706a;

    public E0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11706a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.f11706a;
        z = unityPlayerForActivityOrService.mMainDisplayOverride;
        if (z) {
            unityPlayerForActivityOrService.getFrameLayout().removeView(this.f11706a.getView());
        } else if (unityPlayerForActivityOrService.getView().getParent() == null) {
            this.f11706a.getFrameLayout().addView(this.f11706a.getView());
        } else {
            AbstractC4890t.Log(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
