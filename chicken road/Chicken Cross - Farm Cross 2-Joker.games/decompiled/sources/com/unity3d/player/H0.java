package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.player.a.C4877f;

/* loaded from: classes7.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11709a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public H0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.f11709a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P view = this.b.getView();
        if (view != null) {
            float f = this.f11709a;
            C4877f c4877f = view.f11721a;
            c4877f.f11763a = f;
            ViewGroup.LayoutParams layoutParams = c4877f.getLayoutParams();
            if (f <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c4877f.setLayoutParams(layoutParams);
        }
    }
}
