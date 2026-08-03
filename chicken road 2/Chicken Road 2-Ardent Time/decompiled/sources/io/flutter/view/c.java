package io.flutter.view;

/* loaded from: classes.dex */
public final class c implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.h f7797a;

    public c(io.flutter.view.h hVar) {
        this.f7797a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        io.flutter.view.h hVar = this.f7797a;
        if (hVar.t) {
            return;
        }
        boolean z3 = false;
        I0.b bVar = hVar.f7885b;
        if (z2) {
            ((io.flutter.embedding.engine.FlutterJNI) bVar.f658c).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((io.flutter.embedding.engine.FlutterJNI) bVar.f658c).setSemanticsEnabled(false);
        }
        C.j jVar = hVar.f7901r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = hVar.f7886c.isTouchExplorationEnabled();
            P0.t tVar = (P0.t) jVar.f88b;
            if (tVar.f1394i.f7616b.f7676a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            tVar.setWillNotDraw(z3);
        }
    }
}
