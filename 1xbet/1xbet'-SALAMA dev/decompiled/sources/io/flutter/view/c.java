package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14233b;

    public c(k kVar, AccessibilityManager accessibilityManager) {
        this.f14233b = kVar;
        this.f14232a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        k kVar = this.f14233b;
        if (kVar.f14339u) {
            return;
        }
        boolean z7 = false;
        if (!z4) {
            kVar.i(false);
            g gVar = kVar.f14333o;
            if (gVar != null) {
                kVar.g(gVar.f14291b, 256);
                kVar.f14333o = null;
            }
        }
        C1010l1 c1010l1 = kVar.f14337s;
        if (c1010l1 != null) {
            boolean zIsEnabled = this.f14232a.isEnabled();
            p121q5.m mVar = (p121q5.m) c1010l1.f17777a;
            if (mVar.f15941y.f16038b.f14112a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z4) {
                z7 = true;
            }
            mVar.setWillNotDraw(z7);
        }
    }
}
