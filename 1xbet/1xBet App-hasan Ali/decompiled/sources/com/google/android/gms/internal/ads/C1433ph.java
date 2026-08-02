package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;

/* renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433ph implements InterfaceC0347a {

    /* renamed from: k, reason: collision with root package name */
    public final C1567sh f15017k;

    /* renamed from: l, reason: collision with root package name */
    public final Wq f15018l;

    public C1433ph(C1567sh c1567sh, Wq wq) {
        this.f15017k = c1567sh;
        this.f15018l = wq;
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        Wq wq = this.f15018l;
        C1567sh c1567sh = this.f15017k;
        String str = wq.f;
        synchronized (c1567sh.f15567a) {
            try {
                Integer num = (Integer) c1567sh.f15568b.get(str);
                c1567sh.f15568b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
