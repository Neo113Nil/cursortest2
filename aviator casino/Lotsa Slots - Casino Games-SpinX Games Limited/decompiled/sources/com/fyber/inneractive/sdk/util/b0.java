package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f4285a = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean b;
    public android.content.Context c;
    public com.fyber.inneractive.sdk.util.y d;

    public static void a(com.fyber.inneractive.sdk.util.b0 b0Var, android.content.Context context, android.content.Intent intent) {
        boolean z;
        synchronized (b0Var) {
            try {
                z = ((android.app.KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sFailed to get lock screen status", com.fyber.inneractive.sdk.util.IAlog.a(b0Var));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.b = false;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", com.fyber.inneractive.sdk.util.IAlog.a(b0Var), java.lang.Boolean.valueOf(b0Var.b), java.lang.Integer.valueOf(b0Var.f4285a.size()));
            java.util.Iterator it = b0Var.f4285a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.util.a0 a0Var = (com.fyber.inneractive.sdk.util.a0) it.next();
                boolean z2 = b0Var.b;
                com.fyber.inneractive.sdk.renderers.n nVar = (com.fyber.inneractive.sdk.renderers.n) a0Var;
                nVar.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sgot onLockScreenStateChanged with: %s", com.fyber.inneractive.sdk.util.IAlog.a(nVar), java.lang.Boolean.valueOf(z2));
                if (z2) {
                    nVar.d(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = nVar.y;
                    if (dVar != null && dVar.g) {
                        dVar.g = false;
                        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
                    }
                } else {
                    nVar.N();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = nVar.y;
                    if (dVar2 != null && !dVar2.h && !dVar2.g && dVar2.f != 0) {
                        dVar2.f = 0L;
                        dVar2.g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
