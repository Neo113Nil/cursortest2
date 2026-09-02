package io.flutter.view;

import F.x;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f723b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f723b = iVar;
        this.f722a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        i iVar = this.f723b;
        if (iVar.f827t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            iVar.i(false);
            h hVar = iVar.f822o;
            if (hVar != null) {
                iVar.g(hVar.f779b, 256);
                iVar.f822o = null;
            }
        }
        F.t tVar = iVar.f825r;
        if (tVar != null) {
            boolean isEnabled = this.f722a.isEnabled();
            x xVar = (x) tVar.f114c;
            if (xVar.f130i.f151b.f593a.getIsSoftwareRenderingEnabled()) {
                xVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            xVar.setWillNotDraw(z3);
        }
    }
}
