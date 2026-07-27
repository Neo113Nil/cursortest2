package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f6010a;

    public r(i0 i0Var) {
        this.f6010a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f6010a;
        if (i0Var.V == null) {
            try {
                i0Var.getClass();
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f6010a.V = new e0(this.f6010a);
                if (com.fyber.inneractive.sdk.util.o.a(this.f6010a.b) != null) {
                    i0 i0Var2 = this.f6010a;
                    e0 e0Var = i0Var2.V;
                    Context a2 = com.fyber.inneractive.sdk.util.o.a(i0Var2.b);
                    i0 i0Var3 = e0Var.c;
                    i0Var3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(i0Var3));
                    e0Var.f5990a = a2;
                    a2.registerReceiver(e0Var, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                i0 i0Var4 = this.f6010a;
                i0Var4.getClass();
                IAlog.f("%sfailed registering orientation broadcast recevier", IAlog.a(i0Var4));
                if (IAlog.f5940a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
