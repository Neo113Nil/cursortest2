package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571sl implements Hr {

    /* renamed from: l, reason: collision with root package name */
    public final C1392ol f15595l;

    /* renamed from: m, reason: collision with root package name */
    public final C2308a f15596m;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15594k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f15597n = new HashMap();

    public C1571sl(C1392ol c1392ol, Set set, C2308a c2308a) {
        this.f15595l = c1392ol;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1526rl c1526rl = (C1526rl) it.next();
            HashMap hashMap = this.f15597n;
            c1526rl.getClass();
            hashMap.put(Dr.f8391o, c1526rl);
        }
        this.f15596m = c2308a;
    }

    public final void a(Dr dr, boolean z3) {
        C1526rl c1526rl = (C1526rl) this.f15597n.get(dr);
        if (c1526rl == null) {
            return;
        }
        String str = true != z3 ? "f." : "s.";
        HashMap hashMap = this.f15594k;
        Dr dr2 = c1526rl.f15372b;
        if (hashMap.containsKey(dr2)) {
            this.f15596m.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(dr2)).longValue();
            this.f15595l.f14844a.put("label.".concat(c1526rl.f15371a), str + elapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void k(Dr dr, String str) {
        HashMap hashMap = this.f15594k;
        if (hashMap.containsKey(dr)) {
            this.f15596m.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(dr)).longValue();
            String valueOf = String.valueOf(str);
            this.f15595l.f14844a.put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f15597n.containsKey(dr)) {
            a(dr, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void o(Dr dr, String str) {
        this.f15596m.getClass();
        this.f15594k.put(dr, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void q(Dr dr, String str, Throwable th) {
        HashMap hashMap = this.f15594k;
        if (hashMap.containsKey(dr)) {
            this.f15596m.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(dr)).longValue();
            String valueOf = String.valueOf(str);
            this.f15595l.f14844a.put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f15597n.containsKey(dr)) {
            a(dr, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void y(String str) {
    }
}
