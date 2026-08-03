package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4359a;

    public u0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4359a = v0Var;
    }

    @android.webkit.JavascriptInterface
    public void onBackButtonPressed() {
        java.lang.ref.WeakReference weakReference = this.f4359a.q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity) this.f4359a.q.get()).finish();
    }

    @android.webkit.JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f4359a;
        v0Var.d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        java.lang.String str = v0Var.j;
        if (str != null) {
            v0Var.v.set(true);
            v0Var.u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.b;
            com.fyber.inneractive.sdk.web.r0 r0Var = new com.fyber.inneractive.sdk.web.r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                java.util.Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.ignite.r rVar = (com.fyber.inneractive.sdk.ignite.r) it.next();
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI iIgniteServiceAPI = hVar.b;
                    android.os.Bundle bundle = hVar.c;
                    hVar.d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Failed to cancel task", new java.lang.Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.web.s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.h;
            if (vVar != null && !v0Var.r && (mVar2 = v0Var.d) != null) {
                v0Var.r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        com.fyber.inneractive.sdk.web.v0 v0Var2 = this.f4359a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.h;
        if (vVar2 == null || v0Var2.r || (mVar = v0Var2.d) == null) {
            return;
        }
        v0Var2.r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @android.webkit.JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f4359a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.d = mVar2;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, mVar2, v0Var.h.f3757a));
        com.fyber.inneractive.sdk.web.v0 v0Var2 = this.f4359a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.h;
        if (vVar == null || v0Var2.s || (mVar = v0Var2.d) == null) {
            return;
        }
        v0Var2.s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @android.webkit.JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f4359a.w = true;
    }

    @android.webkit.JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f4359a.w = false;
    }

    @android.webkit.JavascriptInterface
    public void onOpenButtonPressed() {
        android.content.Intent launchIntentForPackage;
        if (android.text.TextUtils.isEmpty(this.f4359a.c)) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f4359a;
            v0Var.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("%smPackageName is null", com.fyber.inneractive.sdk.util.IAlog.a(v0Var));
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f4359a.g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f4302a.getPackageManager().getLaunchIntentForPackage(this.f4359a.c);
        } else {
            launchIntentForPackage = new android.content.Intent("android.intent.action.MAIN");
            com.fyber.inneractive.sdk.web.v0 v0Var2 = this.f4359a;
            launchIntentForPackage.setClassName(v0Var2.c, v0Var2.g);
        }
        if (launchIntentForPackage == null) {
            com.fyber.inneractive.sdk.web.v0 v0Var3 = this.f4359a;
            v0Var3.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("%sPackage %s not found", com.fyber.inneractive.sdk.util.IAlog.a(v0Var3), this.f4359a.c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            com.fyber.inneractive.sdk.util.o.f4302a.startActivity(launchIntentForPackage);
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f4359a.h;
            if (vVar != null) {
                java.lang.String simpleName = th.getClass().getSimpleName();
                java.lang.String message = th.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f3757a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f3765a, wVar.b);
            }
        }
    }

    @android.webkit.JavascriptInterface
    public void onTransitionEnded() {
        this.f4359a.x = false;
    }

    @android.webkit.JavascriptInterface
    public void onTransitionStarting() {
        this.f4359a.x = true;
    }
}
