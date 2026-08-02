package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import w1.C1719l1;

/* loaded from: classes2.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f14226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14227b;

    public c(k kVar, AccessibilityManager accessibilityManager) {
        this.f14227b = kVar;
        this.f14226a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        k kVar = this.f14227b;
        if (kVar.f14333u) {
            return;
        }
        boolean z7 = false;
        if (!z4) {
            kVar.i(false);
            g gVar = kVar.f14327o;
            if (gVar != null) {
                kVar.g(gVar.f14285b, 256);
                kVar.f14327o = null;
            }
        }
        C1719l1 c1719l1 = kVar.f14331s;
        if (c1719l1 != null) {
            boolean isEnabled = this.f14226a.isEnabled();
            q5.m mVar = (q5.m) c1719l1.f17771a;
            if (mVar.f15935y.f16032b.f14106a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z4) {
                z7 = true;
            }
            mVar.setWillNotDraw(z7);
        }
    }
}
