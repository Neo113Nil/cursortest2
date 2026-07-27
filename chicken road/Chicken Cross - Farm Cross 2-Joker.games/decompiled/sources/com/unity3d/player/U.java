package com.unity3d.player;

import android.view.WindowManager;

/* loaded from: classes7.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11730a;
    public final /* synthetic */ UnityPlayer b;

    public U(UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.f11730a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.b.m_Window.getAttributes();
        attributes.screenBrightness = this.f11730a;
        this.b.m_Window.setAttributes(attributes);
    }
}
