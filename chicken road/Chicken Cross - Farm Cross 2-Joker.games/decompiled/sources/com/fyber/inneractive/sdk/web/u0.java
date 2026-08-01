package com.fyber.inneractive.sdk.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f6017a;

    public u0(v0 v0Var) {
        this.f6017a = v0Var;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f6017a.q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f6017a.q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f6017a;
        v0Var.d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.j;
        if (str != null) {
            v0Var.v.set(true);
            v0Var.u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                Iterator it = hVar.g.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.ignite.r rVar = (com.fyber.inneractive.sdk.ignite.r) it.next();
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.b;
                    Bundle bundle = hVar.c;
                    hVar.d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.h;
            if (vVar != null && !v0Var.r && (mVar2 = v0Var.d) != null) {
                v0Var.r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f6017a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.h;
        if (vVar2 == null || v0Var2.r || (mVar = v0Var2.d) == null) {
            return;
        }
        v0Var2.r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f6017a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.d = mVar2;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, mVar2, v0Var.h.f5410a));
        v0 v0Var2 = this.f6017a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.h;
        if (vVar == null || v0Var2.s || (mVar = v0Var2.d) == null) {
            return;
        }
        v0Var2.s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f6017a.w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f6017a.w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f6017a.c)) {
            v0 v0Var = this.f6017a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f6017a.g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f5960a.getPackageManager().getLaunchIntentForPackage(this.f6017a.c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f6017a;
            launchIntentForPackage.setClassName(v0Var2.c, v0Var2.g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f6017a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f6017a.c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            com.fyber.inneractive.sdk.util.o.f5960a.startActivity(launchIntentForPackage);
        } catch (Throwable th) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f6017a.h;
            if (vVar != null) {
                String simpleName = th.getClass().getSimpleName();
                String message = th.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f5410a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f5418a, wVar.b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f6017a.x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f6017a.x = true;
    }
}
