package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
import w1.C1719l1;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14225a;

    public b(k kVar) {
        this.f14225a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        k kVar = this.f14225a;
        if (kVar.f14333u) {
            return;
        }
        boolean z7 = false;
        C1726n0 c1726n0 = kVar.f14315b;
        if (z4) {
            a aVar = kVar.f14334v;
            c1726n0.f17807d = aVar;
            ((FlutterJNI) c1726n0.f17806c).setAccessibilityDelegate(aVar);
            ((FlutterJNI) c1726n0.f17806c).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            c1726n0.f17807d = null;
            ((FlutterJNI) c1726n0.f17806c).setAccessibilityDelegate(null);
            ((FlutterJNI) c1726n0.f17806c).setSemanticsEnabled(false);
        }
        C1719l1 c1719l1 = kVar.f14331s;
        if (c1719l1 != null) {
            boolean isTouchExplorationEnabled = kVar.f14316c.isTouchExplorationEnabled();
            q5.m mVar = (q5.m) c1719l1.f17771a;
            if (mVar.f15935y.f16032b.f14106a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!z4 && !isTouchExplorationEnabled) {
                z7 = true;
            }
            mVar.setWillNotDraw(z7);
        }
    }
}
