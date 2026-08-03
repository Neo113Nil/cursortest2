package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class e0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f4332a;
    public int b = -1;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 c;

    public e0(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.c = i0Var;
    }

    public final void a() {
        try {
            com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
            i0Var.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sunregister screen broadcast receiver called", com.fyber.inneractive.sdk.util.IAlog.a(i0Var));
            if (this.f4332a != null) {
                com.fyber.inneractive.sdk.web.i0 i0Var2 = this.c;
                i0Var2.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sunregistering broadcast receiver", com.fyber.inneractive.sdk.util.IAlog.a(i0Var2));
                this.f4332a.unregisterReceiver(this);
                this.f4332a = null;
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        int b;
        if (this.f4332a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (b = com.fyber.inneractive.sdk.util.o.b()) == this.b) {
            return;
        }
        this.b = b;
        com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
        com.fyber.inneractive.sdk.web.m mVar = i0Var.b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.n0);
            i0Var.b.getViewTreeObserver().addOnPreDrawListener(i0Var.n0);
        }
    }
}
