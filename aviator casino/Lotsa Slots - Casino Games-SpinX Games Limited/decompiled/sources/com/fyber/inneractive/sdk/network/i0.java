package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.l0 f3841a;

    public i0(com.fyber.inneractive.sdk.network.l0 l0Var) {
        this.f3841a = l0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:11|12|(1:16)|17|(1:123)(1:23)|24|(1:26)|27|28|(13:32|(1:38)|39|40|41|42|43|44|45|46|(1:48)|51|52)|115|(3:34|36|38)|39|40|41|42|43|44|45|46|(0)|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
    
        if (r3 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0171, code lost:
    
        r3.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0174, code lost:
    
        r0.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0177, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x013e, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x011b, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x011c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
    
        if (r1 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018c, code lost:
    
        r1.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017b, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0180, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        if (r1 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        if (r2.f3857a == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        r2.a((java.lang.Object) null, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014a, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
    
        if (r1 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0115, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011f, code lost:
    
        if (r2.f3857a == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0121, code lost:
    
        r2.a((java.lang.Object) null, new java.lang.Exception(r3), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0129, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012c, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0131, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0137, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0139, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013b, code lost:
    
        if (r1 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0160, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0165, code lost:
    
        r3 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.fyber.inneractive.sdk.network.t0 t0Var;
        com.fyber.inneractive.sdk.network.a aVar;
        com.fyber.inneractive.sdk.network.i1 i1Var;
        java.lang.Boolean c;
        com.fyber.inneractive.sdk.network.p0 p0Var;
        com.fyber.inneractive.sdk.network.l0 l0Var = this.f3841a;
        l0Var.getClass();
        android.os.Process.setThreadPriority(10);
        while (l0Var.b) {
            com.fyber.inneractive.sdk.network.o0 o0Var = null;
            try {
                t0Var = (com.fyber.inneractive.sdk.network.t0) l0Var.f3846a.take();
            } catch (java.lang.InterruptedException unused) {
                if (!l0Var.b) {
                    java.lang.Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.f3857a) {
                com.fyber.inneractive.sdk.network.i1 i1Var2 = com.fyber.inneractive.sdk.network.i1.RUNNING;
                t0Var.f = i1Var2;
                if (i1Var2 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY && (p0Var = t0Var.d) != null) {
                    p0Var.a("sdkRequestEndedButWillBeRetried");
                }
                boolean z = (t0Var.o && ((c = ((com.fyber.inneractive.sdk.config.global.features.l) com.fyber.inneractive.sdk.config.IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_manage_request_watchdog")) == null || c.booleanValue())) || t0Var.v();
                com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", com.fyber.inneractive.sdk.util.IAlog.a(l0Var), java.lang.Boolean.valueOf(z));
                if (z) {
                    com.fyber.inneractive.sdk.network.j1 j1Var = l0Var.f;
                    java.lang.Thread currentThread = java.lang.Thread.currentThread();
                    j1Var.getClass();
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestWatchdog : register request: %s", com.fyber.inneractive.sdk.util.IAlog.a(j1Var), t0Var.g);
                    int s = t0Var.s();
                    com.fyber.inneractive.sdk.network.l1 p = t0Var.p();
                    com.fyber.inneractive.sdk.network.n1 n1Var = new com.fyber.inneractive.sdk.network.n1(t0Var, currentThread, p.f3847a + p.b + s);
                    j1Var.f3843a.putIfAbsent(t0Var.g, n1Var);
                    com.fyber.inneractive.sdk.util.r.b.postDelayed(n1Var.d, n1Var.c);
                }
                try {
                } catch (java.lang.Exception e) {
                    com.fyber.inneractive.sdk.util.IAlog.a("failed fetching cache data for url: %s msg: %s", t0Var.r(), e.getMessage());
                    if (!t0Var.f3857a) {
                        t0Var.a((java.lang.Object) null, e, true);
                    }
                }
                if (!t0Var.f3857a && t0Var.h() != null) {
                    aVar = t0Var.i();
                    if (aVar != null && aVar.b != null && !t0Var.f3857a) {
                        t0Var.a(aVar.b, (java.lang.Exception) null, true);
                    }
                    com.fyber.inneractive.sdk.network.l a2 = l0Var.a(t0Var, aVar);
                    com.fyber.inneractive.sdk.network.o0 o0Var2 = l0Var.a(t0Var, a2);
                    com.fyber.inneractive.sdk.network.l0.a(t0Var, a2, o0Var2);
                    com.fyber.inneractive.sdk.network.l0.a(t0Var, o0Var2);
                    t0Var.e();
                    i1Var = com.fyber.inneractive.sdk.network.i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) {
                        com.fyber.inneractive.sdk.network.p0 p0Var2 = t0Var.d;
                    }
                    l0Var.b(t0Var);
                }
                aVar = null;
                if (aVar != null) {
                    t0Var.a(aVar.b, (java.lang.Exception) null, true);
                }
                com.fyber.inneractive.sdk.network.l a22 = l0Var.a(t0Var, aVar);
                com.fyber.inneractive.sdk.network.o0 o0Var22 = l0Var.a(t0Var, a22);
                com.fyber.inneractive.sdk.network.l0.a(t0Var, a22, o0Var22);
                com.fyber.inneractive.sdk.network.l0.a(t0Var, o0Var22);
                t0Var.e();
                i1Var = com.fyber.inneractive.sdk.network.i1.DONE;
                t0Var.f = i1Var;
                if (i1Var == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) {
                }
                l0Var.b(t0Var);
            }
        }
    }
}
