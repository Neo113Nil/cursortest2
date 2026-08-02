package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Aj implements L5 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f7702k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Cj f7703l;

    public Aj(Cj cj, String str) {
        this.f7702k = str;
        this.f7703l = cj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8702I1)).booleanValue()) {
            if (k5.f10128j) {
                Cj cj = this.f7703l;
                if (cj.f8069u != null) {
                    cj.f8056E.put(this.f7702k, Boolean.TRUE);
                    Cj cj2 = this.f7703l;
                    ?? r02 = cj2.f8069u;
                    if (r02 == 0) {
                        return;
                    }
                    cj2.b(r02.c(), this.f7703l.f8069u.o(), this.f7703l.f8069u.l(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (k5.f10128j) {
                    Cj cj3 = this.f7703l;
                    if (cj3.f8069u != null) {
                        cj3.f8056E.put(this.f7702k, Boolean.TRUE);
                        Cj cj4 = this.f7703l;
                        ?? r03 = cj4.f8069u;
                        if (r03 == 0) {
                        } else {
                            cj4.b(r03.c(), this.f7703l.f8069u.o(), this.f7703l.f8069u.l(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
