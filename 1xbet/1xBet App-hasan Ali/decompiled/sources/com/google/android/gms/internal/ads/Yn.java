package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class Yn implements Jw {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f12361k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Nq f12362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lq f12363m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f12364n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0951es f12365o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Sq f12366p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0769ao f12367q;

    public Yn(C0769ao c0769ao, long j5, Nq nq, Lq lq, String str, C0951es c0951es, Sq sq) {
        this.f12361k = j5;
        this.f12362l = nq;
        this.f12363m = lq;
        this.f12364n = str;
        this.f12365o = c0951es;
        this.f12366p = sq;
        this.f12367q = c0769ao;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public final void mo14o(Object obj) {
        long j5;
        this.f12367q.f12712a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12361k;
        synchronized (this.f12367q) {
            try {
                C0769ao c0769ao = this.f12367q;
                if (c0769ao.f12716e) {
                    c0769ao.f12713b.p(this.f12362l, this.f12363m, 0, null, elapsedRealtime);
                    j5 = elapsedRealtime;
                } else {
                    j5 = elapsedRealtime;
                }
                C0769ao c0769ao2 = this.f12367q;
                if (c0769ao2.f12717g) {
                    return;
                }
                if (C0769ao.h(c0769ao2, this.f12363m)) {
                    ((Zn) this.f12367q.f12715d.get(this.f12363m)).f12523d = j5;
                } else {
                    LinkedHashMap linkedHashMap = this.f12367q.f12715d;
                    Lq lq = this.f12363m;
                    linkedHashMap.put(lq, new Zn(this.f12364n, lq.f10499f0, 0, j5, null));
                }
                this.f12367q.f.d(this.f12363m, j5, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Throwable th) {
        int i;
        C0387u0 c0387u0;
        Integer valueOf;
        long j5;
        int i5;
        C0387u0 c0387u02;
        this.f12367q.f12712a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12361k;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof Rn) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof Yq) {
            i = 5;
        } else if (th instanceof C0856cm) {
            i = AbstractC1803xs.d(th).f5058k == 3 ? 1 : 6;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8661B1)).booleanValue() && (th instanceof C1484qn) && (c0387u0 = ((C1484qn) th).f15174l) != null) {
                valueOf = Integer.valueOf(c0387u0.f5058k);
                synchronized (this.f12367q) {
                    try {
                        C0769ao c0769ao = this.f12367q;
                        if (c0769ao.f12716e) {
                            i5 = i;
                            c0769ao.f12713b.p(this.f12362l, this.f12363m, i5, th instanceof C1484qn ? (C1484qn) th : null, elapsedRealtime);
                            j5 = elapsedRealtime;
                        } else {
                            j5 = elapsedRealtime;
                            i5 = i;
                        }
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.V7)).booleanValue()) {
                            C1041gs c1041gs = this.f12367q.f12714c;
                            C0951es c0951es = this.f12365o;
                            Sq sq = this.f12366p;
                            Lq lq = this.f12363m;
                            c1041gs.c(c0951es.a(sq, lq, lq.f10513n), this.f12363m.f10534x0);
                        }
                        C0769ao c0769ao2 = this.f12367q;
                        if (c0769ao2.f12717g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = c0769ao2.f12715d;
                        Lq lq2 = this.f12363m;
                        linkedHashMap.put(lq2, new Zn(this.f12364n, lq2.f10499f0, i5, j5, valueOf));
                        C0387u0 d5 = AbstractC1803xs.d(th);
                        int i6 = d5.f5058k;
                        if ((i6 == 3 || i6 == 0) && (c0387u02 = d5.f5061n) != null && !c0387u02.f5060m.equals("com.google.android.gms.ads")) {
                            d5 = AbstractC1803xs.d(new C1484qn(13, d5.f5061n));
                        }
                        this.f12367q.f.d(this.f12363m, j5, d5, false);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            i = 6;
        }
        valueOf = null;
        synchronized (this.f12367q) {
        }
    }
}
