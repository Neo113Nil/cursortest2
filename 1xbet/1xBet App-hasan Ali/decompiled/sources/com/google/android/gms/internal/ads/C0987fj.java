package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987fj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13484a;

    /* renamed from: b, reason: collision with root package name */
    public final C1390oj f13485b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f13486c;

    public /* synthetic */ C0987fj(C1390oj c1390oj, CD cd, int i) {
        this.f13484a = i;
        this.f13485b = c1390oj;
        this.f13486c = cd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13484a) {
            case 0:
                Set m5 = this.f13485b.m((C1837yh) this.f13486c.d());
                AbstractC1400ot.D(m5);
                return m5;
            default:
                return new Si(new C0609Hg(1, (InterfaceC0677Re) this.f13485b.f14828m), (Executor) this.f13486c.d());
        }
    }
}
