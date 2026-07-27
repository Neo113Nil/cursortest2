package com.unity3d.player;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class J extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f11713a;

    public J(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.f11713a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        SurfaceView surfaceView;
        boolean populateNodeInfo;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        int[] rootNodeIds;
        SurfaceView surfaceView4;
        if (i == -1) {
            surfaceView2 = this.f11713a.b;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(surfaceView2);
            surfaceView3 = this.f11713a.b;
            Object parent = surfaceView3.getParent();
            if (parent instanceof View) {
                obtain.setParent((View) parent);
            }
            rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
            if (rootNodeIds != null) {
                for (int i2 : rootNodeIds) {
                    surfaceView4 = this.f11713a.b;
                    obtain.addChild(surfaceView4, i2);
                }
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        surfaceView = this.f11713a.b;
        populateNodeInfo = UnityAccessibilityDelegate.populateNodeInfo(obtain2, i, surfaceView);
        if (populateNodeInfo) {
            return obtain2;
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        boolean isNodeDismissable;
        UnityPlayer unityPlayer3;
        UnityPlayer unityPlayer4;
        boolean isNodeSelectable;
        UnityPlayer unityPlayer5;
        UnityPlayer unityPlayer6;
        if (i2 == 64) {
            return this.f11713a.sendEventForVirtualViewId(i, 32768);
        }
        if (i2 == 128) {
            return this.f11713a.sendEventForVirtualViewId(i, 65536);
        }
        if (i2 == 16) {
            isNodeSelectable = UnityAccessibilityDelegate.isNodeSelectable(i);
            if (!isNodeSelectable) {
                return false;
            }
            unityPlayer5 = this.f11713a.f11731a;
            Objects.requireNonNull(unityPlayer5);
            G g = new G(this, unityPlayer5, i);
            unityPlayer6 = this.f11713a.f11731a;
            unityPlayer6.invokeOnMainThread((Runnable) g);
            return true;
        }
        if (i2 == 4096 || i2 == 8192) {
            unityPlayer = this.f11713a.f11731a;
            Objects.requireNonNull(unityPlayer);
            H h = new H(this, unityPlayer, i2, i);
            unityPlayer2 = this.f11713a.f11731a;
            unityPlayer2.invokeOnMainThread((Runnable) h);
            return true;
        }
        if (i2 != 1048576) {
            return false;
        }
        isNodeDismissable = UnityAccessibilityDelegate.isNodeDismissable(i);
        if (!isNodeDismissable) {
            return false;
        }
        unityPlayer3 = this.f11713a.f11731a;
        Objects.requireNonNull(unityPlayer3);
        I i3 = new I(unityPlayer3, i);
        unityPlayer4 = this.f11713a.f11731a;
        unityPlayer4.invokeOnMainThread((Runnable) i3);
        return true;
    }
}
