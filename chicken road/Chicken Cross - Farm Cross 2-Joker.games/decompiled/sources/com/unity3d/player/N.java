package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class N extends CaptioningManager.CaptioningChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f11717a;

    public N(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        this.f11717a = unityAccessibilityDelegate;
        captioningManager = unityAccessibilityDelegate.e;
        captioningManager.addCaptioningChangeListener(this);
        captioningManager2 = unityAccessibilityDelegate.e;
        onEnabledChanged(captioningManager2.isEnabled());
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.f11717a.f11731a;
        Objects.requireNonNull(unityPlayer);
        M m = new M(unityPlayer, z);
        unityPlayer2 = this.f11717a.f11731a;
        unityPlayer2.invokeOnMainThread((Runnable) m);
    }

    public void cleanup() {
        CaptioningManager captioningManager;
        captioningManager = this.f11717a.e;
        captioningManager.removeCaptioningChangeListener(this);
    }
}
