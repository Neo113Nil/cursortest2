package sg.bigo.ads.S;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsCallback;

/* loaded from: classes3.dex */
public final class b extends CustomTabsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Y0.i f12526a;
    public final /* synthetic */ f b;

    public b(f fVar, sg.bigo.ads.Y0.i iVar) {
        this.b = fVar;
        this.f12526a = iVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        sg.bigo.ads.Y0.i iVar = this.f12526a;
        if (iVar == null) {
            return;
        }
        if (i == 5) {
            iVar.a(1);
            return;
        }
        if (i == 1) {
            SystemClock.elapsedRealtime();
            iVar.h++;
            if (iVar.m.compareAndSet(true, false)) {
                iVar.a(4);
                return;
            }
            return;
        }
        if (i == 3) {
            if (iVar.o) {
                return;
            }
            iVar.a(6);
        } else {
            if (i == 4) {
                iVar.i = true;
                return;
            }
            if (i == 2) {
                iVar.o = true;
                if (iVar.n.compareAndSet(true, false)) {
                    iVar.a(5);
                    return;
                }
                return;
            }
            if (i == 6) {
                sg.bigo.ads.s1.b.a("06002062", sg.bigo.ads.s1.b.a(iVar, iVar.l.isEmpty() ? null : (sg.bigo.ads.Q.f) iVar.l.get(0), System.currentTimeMillis() - iVar.k, iVar.h, iVar.b, iVar.c, (String) null, ""));
                sg.bigo.ads.F0.b.b("sp_ads", "landing_webview_close_info", "", 3);
                this.b.f12530a.d = null;
            }
        }
    }
}
