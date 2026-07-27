package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f9342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9343b;

    public e(i iVar, AccessibilityManager accessibilityManager) {
        this.f9343b = iVar;
        this.f9342a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        i iVar = this.f9343b;
        if (iVar.f9446u) {
            return;
        }
        boolean z4 = false;
        if (!z3) {
            iVar.j(false);
            h hVar = iVar.f9441p;
            if (hVar != null) {
                iVar.h(hVar.f9400b, 256);
                iVar.f9441p = null;
            }
        }
        b0.i iVar2 = iVar.f9444s;
        if (iVar2 != null) {
            boolean isEnabled = this.f9342a.isEnabled();
            I1.q qVar = (I1.q) iVar2.f2461b;
            if (qVar.f649i.f9099b.f9165a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z3) {
                z4 = true;
            }
            qVar.setWillNotDraw(z4);
        }
    }
}
