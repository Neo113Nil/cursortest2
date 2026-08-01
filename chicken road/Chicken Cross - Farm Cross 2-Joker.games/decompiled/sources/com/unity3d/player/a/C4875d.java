package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;

/* renamed from: com.unity3d.player.a.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4875d implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4894x f11762a;

    public C4875d(C4894x c4894x) {
        this.f11762a = c4894x;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = this.f11762a.f11778a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
