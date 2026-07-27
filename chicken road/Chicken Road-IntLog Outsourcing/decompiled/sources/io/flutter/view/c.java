package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f10268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10269b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f10269b = gVar;
        this.f10268a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        g gVar = this.f10269b;
        if (gVar.f10376t) {
            return;
        }
        boolean z5 = false;
        if (!z) {
            gVar.i(false);
            f fVar = gVar.f10371o;
            if (fVar != null) {
                gVar.g(fVar.f10327b, 256);
                gVar.f10371o = null;
            }
        }
        V0.j jVar = gVar.f10374r;
        if (jVar != null) {
            boolean isEnabled = this.f10268a.isEnabled();
            w2.m mVar = (w2.m) jVar.f3212b;
            if (mVar.f12178i.f10083b.f10146a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z) {
                z5 = true;
            }
            mVar.setWillNotDraw(z5);
        }
    }
}
