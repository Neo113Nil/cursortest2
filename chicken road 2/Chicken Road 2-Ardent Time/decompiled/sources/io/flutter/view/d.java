package io.flutter.view;

/* loaded from: classes.dex */
public final class d implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.accessibility.AccessibilityManager f7798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.h f7799b;

    public d(io.flutter.view.h hVar, android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.f7799b = hVar;
        this.f7798a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        io.flutter.view.h hVar = this.f7799b;
        if (hVar.t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            hVar.i(false);
            io.flutter.view.g gVar = hVar.f7898o;
            if (gVar != null) {
                hVar.g(gVar.f7856b, 256);
                hVar.f7898o = null;
            }
        }
        C.j jVar = hVar.f7901r;
        if (jVar != null) {
            boolean isEnabled = this.f7798a.isEnabled();
            P0.t tVar = (P0.t) jVar.f88b;
            if (tVar.f1394i.f7616b.f7676a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            tVar.setWillNotDraw(z3);
        }
    }
}
