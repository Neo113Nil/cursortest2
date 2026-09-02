package io.flutter.view;

import F.x;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f721a;

    public d(i iVar) {
        this.f721a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        i iVar = this.f721a;
        E.b bVar = iVar.f809b;
        if (iVar.f827t) {
            return;
        }
        if (z2) {
            ((FlutterJNI) bVar.f19b).setSemanticsEnabled(true);
        } else {
            iVar.i(false);
            ((FlutterJNI) bVar.f19b).setSemanticsEnabled(false);
        }
        F.t tVar = iVar.f825r;
        if (tVar != null) {
            boolean isTouchExplorationEnabled = iVar.f810c.isTouchExplorationEnabled();
            x xVar = (x) tVar.f114c;
            if (xVar.f130i.f151b.f593a.getIsSoftwareRenderingEnabled()) {
                xVar.setWillNotDraw(false);
            } else {
                xVar.setWillNotDraw((z2 || isTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
