package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522rh implements Di, InterfaceC0808bi {

    /* renamed from: k, reason: collision with root package name */
    public final C2308a f15330k;

    /* renamed from: l, reason: collision with root package name */
    public final C1567sh f15331l;

    /* renamed from: m, reason: collision with root package name */
    public final Wq f15332m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15333n;

    public C1522rh(C2308a c2308a, C1567sh c1567sh, Wq wq, String str) {
        this.f15330k = c2308a;
        this.f15331l = c1567sh;
        this.f15332m = wq;
        this.f15333n = str;
    }

    @Override // com.google.android.gms.internal.ads.Di
    public final void i() {
        this.f15330k.getClass();
        this.f15331l.f15569c.put(this.f15333n, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        this.f15330k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f15332m.f;
        C1567sh c1567sh = this.f15331l;
        ConcurrentHashMap concurrentHashMap = c1567sh.f15569c;
        String str2 = this.f15333n;
        Long l5 = (Long) concurrentHashMap.get(str2);
        if (l5 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c1567sh.f15570d.put(str, Long.valueOf(elapsedRealtime - l5.longValue()));
    }
}
