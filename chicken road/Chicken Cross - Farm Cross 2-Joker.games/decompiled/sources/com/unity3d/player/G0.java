package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public final class G0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11708a;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f11708a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P view = this.f11708a.getView();
        if (view != null) {
            com.unity3d.player.a.D d = view.c;
            FrameLayout frameLayout = view.b.getFrameLayout();
            com.unity3d.player.a.C c = d.b;
            if (c != null && c.getParent() != null) {
                frameLayout.removeView(d.b);
            }
            view.c.b = null;
        }
    }
}
