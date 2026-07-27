package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f10267a;

    public b(g gVar) {
        this.f10267a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        g gVar = this.f10267a;
        if (gVar.f10376t) {
            return;
        }
        boolean z5 = false;
        B4.i iVar = gVar.f10358b;
        if (z) {
            ((FlutterJNI) iVar.f312c).setSemanticsEnabled(true);
        } else {
            gVar.i(false);
            ((FlutterJNI) iVar.f312c).setSemanticsEnabled(false);
        }
        V0.j jVar = gVar.f10374r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = gVar.f10359c.isTouchExplorationEnabled();
            w2.m mVar = (w2.m) jVar.f3212b;
            if (mVar.f12178i.f10083b.f10146a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!z && !isTouchExplorationEnabled) {
                z5 = true;
            }
            mVar.setWillNotDraw(z5);
        }
    }
}
