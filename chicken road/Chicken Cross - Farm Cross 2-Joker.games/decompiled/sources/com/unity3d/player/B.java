package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.concurrent.Semaphore;

/* loaded from: classes7.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f11700a;
    public final /* synthetic */ UnityAccessibilityDelegate b;

    public B(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.b = unityAccessibilityDelegate;
        this.f11700a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibilityManager accessibilityManager;
        CaptioningManager captioningManager;
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.b;
            accessibilityManager = unityAccessibilityDelegate.c;
            if (accessibilityManager != null) {
                unityAccessibilityDelegate.d = new L(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.b;
            captioningManager = unityAccessibilityDelegate2.e;
            if (captioningManager != null) {
                unityAccessibilityDelegate2.f = new N(this.b);
            }
        } finally {
            this.f11700a.release();
        }
    }
}
