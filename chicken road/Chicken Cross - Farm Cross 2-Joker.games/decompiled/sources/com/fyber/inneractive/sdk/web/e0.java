package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f5990a;
    public int b = -1;
    public final /* synthetic */ i0 c;

    public e0(i0 i0Var) {
        this.c = i0Var;
    }

    public final void a() {
        try {
            i0 i0Var = this.c;
            i0Var.getClass();
            IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(i0Var));
            if (this.f5990a != null) {
                i0 i0Var2 = this.c;
                i0Var2.getClass();
                IAlog.a("%sunregistering broadcast receiver", IAlog.a(i0Var2));
                this.f5990a.unregisterReceiver(this);
                this.f5990a = null;
            }
        } catch (Throwable th) {
            IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int a2;
        if (this.f5990a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (a2 = com.fyber.inneractive.sdk.util.o.a()) == this.b) {
            return;
        }
        this.b = a2;
        i0 i0Var = this.c;
        m mVar = i0Var.b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.n0);
            i0Var.b.getViewTreeObserver().addOnPreDrawListener(i0Var.n0);
        }
    }
}
