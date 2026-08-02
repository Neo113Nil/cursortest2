package com.google.android.gms.internal.ads;

import java.util.List;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620tp implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15730a;

    /* renamed from: b, reason: collision with root package name */
    public final U7 f15731b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f15732c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f15733d;

    public /* synthetic */ C1620tp(U7 u7, CD cd, CD cd2, int i) {
        this.f15730a = i;
        this.f15731b = u7;
        this.f15732c = cd;
        this.f15733d = cd2;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15730a) {
            case 0:
                Vo a5 = this.f15731b.a();
                C2308a c2308a = (C2308a) this.f15732c.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1396op(a5, 2147483647L, c2308a, c0606Hd, (C1482ql) this.f15733d.d());
            default:
                Mp a6 = this.f15731b.a();
                Mp mp = (C1396op) this.f15732c.d();
                if (true == ((List) this.f15733d.d()).contains("29")) {
                    a6 = mp;
                }
                AbstractC1400ot.D(a6);
                return a6;
        }
    }
}
