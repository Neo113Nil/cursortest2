package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
import p155w1.C1010l1;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14231a;

    public b(k kVar) {
        this.f14231a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        k kVar = this.f14231a;
        if (kVar.f14339u) {
            return;
        }
        boolean z7 = false;
        C1017n0 c1017n0 = kVar.f14321b;
        if (z4) {
            a aVar = kVar.f14340v;
            c1017n0.f17813d = aVar;
            ((FlutterJNI) c1017n0.f17812c).setAccessibilityDelegate(aVar);
            ((FlutterJNI) c1017n0.f17812c).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            c1017n0.f17813d = null;
            ((FlutterJNI) c1017n0.f17812c).setAccessibilityDelegate(null);
            ((FlutterJNI) c1017n0.f17812c).setSemanticsEnabled(false);
        }
        C1010l1 c1010l1 = kVar.f14337s;
        if (c1010l1 != null) {
            boolean zIsTouchExplorationEnabled = kVar.f14322c.isTouchExplorationEnabled();
            p121q5.m mVar = (p121q5.m) c1010l1.f17777a;
            if (mVar.f15941y.f16038b.f14112a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!z4 && !zIsTouchExplorationEnabled) {
                z7 = true;
            }
            mVar.setWillNotDraw(z7);
        }
    }
}
