package com.unity3d.player;

import android.view.SurfaceView;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.player.UnityAccessibilityDelegate.a;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class L implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f11716a;

    public L(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        this.f11716a = unityAccessibilityDelegate;
        accessibilityManager = unityAccessibilityDelegate.c;
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager2 = unityAccessibilityDelegate.c;
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
        accessibilityManager3 = unityAccessibilityDelegate.c;
        if (accessibilityManager3.isEnabled()) {
            onAccessibilityStateChanged(true);
        }
    }

    public void cleanup() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        accessibilityManager = this.f11716a.c;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager2 = this.f11716a.c;
        accessibilityManager2.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        SurfaceView surfaceView4;
        AccessibilityManager accessibilityManager;
        if (z) {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.f11716a;
            surfaceView3 = unityAccessibilityDelegate.b;
            surfaceView3.setAccessibilityDelegate(unityAccessibilityDelegate);
            surfaceView4 = this.f11716a.b;
            surfaceView4.setWillNotDraw(false);
            accessibilityManager = this.f11716a.c;
            onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            return;
        }
        surfaceView = this.f11716a.b;
        surfaceView.setAccessibilityDelegate(null);
        surfaceView2 = this.f11716a.b;
        surfaceView2.setWillNotDraw(true);
        onTouchExplorationStateChanged(false);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        AccessibilityManager accessibilityManager;
        SurfaceView surfaceView;
        boolean z2;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        SurfaceView surfaceView2;
        accessibilityManager = this.f11716a.c;
        boolean z3 = accessibilityManager.isEnabled() && z;
        if (z3) {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.f11716a;
            surfaceView2 = unityAccessibilityDelegate.b;
            surfaceView2.setOnHoverListener(unityAccessibilityDelegate.new a());
        } else {
            surfaceView = this.f11716a.b;
            surfaceView.setOnHoverListener(null);
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.f11716a;
        z2 = unityAccessibilityDelegate2.i;
        if (z2 == z3) {
            return;
        }
        unityAccessibilityDelegate2.i = z3;
        unityPlayer = unityAccessibilityDelegate2.f11731a;
        Objects.requireNonNull(unityPlayer);
        K k = new K(unityPlayer, z3);
        unityPlayer2 = this.f11716a.f11731a;
        unityPlayer2.invokeOnMainThread((Runnable) k);
    }
}
