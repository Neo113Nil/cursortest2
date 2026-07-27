package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC4876e;
import com.unity3d.player.a.C4875d;
import com.unity3d.player.a.C4895y;

/* renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4921n extends C4895y {
    public C4875d d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C4921n(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static C4895y a(Object obj, int i, Runnable runnable) {
        C4895y c4895y;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            c4895y = new C4921n(AbstractC4876e.a(obj), i, runnable);
        } else {
            c4895y = new C4895y(runnable);
        }
        c4895y.registerOnBackPressedCallback();
        return c4895y;
    }

    @Override // com.unity3d.player.a.C4895y
    public void registerOnBackPressedCallback() {
        if (this.f11779a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C4875d c4875d = new C4875d(this.f11779a);
            this.d = c4875d;
            AbstractC4876e.a(this.e, this.f, c4875d);
        }
    }

    @Override // com.unity3d.player.a.C4895y
    public void unregisterOnBackPressedCallback() {
        if (this.f11779a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC4876e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
