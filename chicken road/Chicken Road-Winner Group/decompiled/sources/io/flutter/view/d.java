package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9341a;

    public d(i iVar) {
        this.f9341a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z3) {
        i iVar = this.f9341a;
        if (iVar.f9446u) {
            return;
        }
        boolean z4 = false;
        A0.j jVar = iVar.f9428b;
        if (z3) {
            ((FlutterJNI) jVar.f67c).setSemanticsEnabled(true);
        } else {
            iVar.j(false);
            ((FlutterJNI) jVar.f67c).setSemanticsEnabled(false);
        }
        b0.i iVar2 = iVar.f9444s;
        if (iVar2 != null) {
            boolean isTouchExplorationEnabled = iVar.f9429c.isTouchExplorationEnabled();
            I1.q qVar = (I1.q) iVar2.f2461b;
            if (qVar.f649i.f9099b.f9165a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!z3 && !isTouchExplorationEnabled) {
                z4 = true;
            }
            qVar.setWillNotDraw(z4);
        }
    }
}
