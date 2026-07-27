package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f5495a;

    public i0(l0 l0Var) {
        this.f5495a = l0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:11|12|(1:16)|17|(2:19|(1:21)(1:130))|131|(21:133|24|(1:26)|27|28|(15:32|(1:38)|39|40|41|42|43|44|45|46|47|48|(1:50)|53|54)|124|(3:34|36|38)|39|40|41|42|43|44|45|46|47|48|(0)|53|54)|23|24|(0)|27|28|(16:30|32|(0)|39|40|41|42|43|44|45|46|47|48|(0)|53|54)|124|(0)|39|40|41|42|43|44|45|46|47|48|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0165, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0168, code lost:
    
        r3 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016e, code lost:
    
        if (r3 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0174, code lost:
    
        r3.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0177, code lost:
    
        r0.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0117, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0114, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0115, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0111, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0112, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0140, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0141, code lost:
    
        r3 = null;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x011a, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x011b, code lost:
    
        r3 = null;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00c5, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00c6, code lost:
    
        com.fyber.inneractive.sdk.util.IAlog.a("failed fetching cache data for url: %s msg: %s", r2.r(), r3.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d9, code lost:
    
        if (r2.f5511a == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00db, code lost:
    
        r2.a(null, r3, true, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if ((r3 != null ? r3.booleanValue() : true) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018e, code lost:
    
        r1.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0118, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        com.fyber.inneractive.sdk.network.l0.b(r1, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017f, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0188, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018a, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if (r2.f5511a == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        r2.a(null, r7, false, com.fyber.inneractive.sdk.network.l0.a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014e, code lost:
    
        com.fyber.inneractive.sdk.network.l0.b(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0151, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0154, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015e, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010d, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011f, code lost:
    
        if (r2.f5511a == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0121, code lost:
    
        r2.a(null, new java.lang.Exception(r7), false, com.fyber.inneractive.sdk.network.l0.a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012d, code lost:
    
        com.fyber.inneractive.sdk.network.l0.b(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0130, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0133, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0139, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013b, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013d, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0161, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0162, code lost:
    
        com.fyber.inneractive.sdk.network.l0.b(r3, r6, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t0 t0Var;
        boolean z;
        a aVar;
        i1 i1Var;
        p0 p0Var;
        l0 l0Var = this.f5495a;
        l0Var.getClass();
        Process.setThreadPriority(10);
        while (l0Var.b) {
            l lVar = null;
            try {
                t0Var = (t0) l0Var.f5500a.take();
            } catch (InterruptedException unused) {
                if (!l0Var.b) {
                    Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.f5511a) {
                i1 i1Var2 = i1.RUNNING;
                t0Var.f = i1Var2;
                if (i1Var2 == i1.QUEUED_FOR_RETRY && (p0Var = t0Var.d) != null) {
                    p0Var.a("sdkRequestEndedButWillBeRetried");
                }
                if (t0Var.o) {
                    Boolean c = ((com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.R.O.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_manage_request_watchdog");
                }
                if (!t0Var.v()) {
                    z = false;
                    IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z));
                    if (z) {
                        j1 j1Var = l0Var.f;
                        Thread currentThread = Thread.currentThread();
                        j1Var.getClass();
                        IAlog.a("%s : NetworkRequestWatchdog : register request: %s", IAlog.a(j1Var), t0Var.g);
                        int s = t0Var.s();
                        l1 p = t0Var.p();
                        n1 n1Var = new n1(t0Var, currentThread, p.f5501a + p.b + s);
                        j1Var.f5497a.putIfAbsent(t0Var.g, n1Var);
                        com.fyber.inneractive.sdk.util.r.b.postDelayed(n1Var.d, n1Var.c);
                    }
                    if (!t0Var.f5511a && t0Var.h() != null) {
                        aVar = t0Var.i();
                        if (aVar != null && aVar.b != null && !t0Var.f5511a) {
                            t0Var.a(aVar.b, null, true, null);
                        }
                        l lVar2 = l0Var.a(t0Var, aVar);
                        o0 o0Var = l0Var.a(t0Var, lVar2);
                        l0.a(lVar2, o0Var, t0Var);
                        l0.b(lVar2, o0Var, t0Var);
                        t0Var.e();
                        i1Var = i1.DONE;
                        t0Var.f = i1Var;
                        if (i1Var == i1.QUEUED_FOR_RETRY) {
                            p0 p0Var2 = t0Var.d;
                        }
                        l0Var.b(t0Var);
                    }
                    aVar = null;
                    if (aVar != null) {
                        t0Var.a(aVar.b, null, true, null);
                    }
                    l lVar22 = l0Var.a(t0Var, aVar);
                    o0 o0Var2 = l0Var.a(t0Var, lVar22);
                    l0.a(lVar22, o0Var2, t0Var);
                    l0.b(lVar22, o0Var2, t0Var);
                    t0Var.e();
                    i1Var = i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == i1.QUEUED_FOR_RETRY) {
                    }
                    l0Var.b(t0Var);
                }
                z = true;
                IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z));
                if (z) {
                }
                if (!t0Var.f5511a) {
                    aVar = t0Var.i();
                    if (aVar != null) {
                    }
                    l lVar222 = l0Var.a(t0Var, aVar);
                    o0 o0Var22 = l0Var.a(t0Var, lVar222);
                    l0.a(lVar222, o0Var22, t0Var);
                    l0.b(lVar222, o0Var22, t0Var);
                    t0Var.e();
                    i1Var = i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == i1.QUEUED_FOR_RETRY) {
                    }
                    l0Var.b(t0Var);
                }
                aVar = null;
                if (aVar != null) {
                }
                l lVar2222 = l0Var.a(t0Var, aVar);
                o0 o0Var222 = l0Var.a(t0Var, lVar2222);
                l0.a(lVar2222, o0Var222, t0Var);
                l0.b(lVar2222, o0Var222, t0Var);
                t0Var.e();
                i1Var = i1.DONE;
                t0Var.f = i1Var;
                if (i1Var == i1.QUEUED_FOR_RETRY) {
                }
                l0Var.b(t0Var);
            }
        }
    }
}
