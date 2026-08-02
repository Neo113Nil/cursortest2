package com.google.android.gms.internal.ads;

import java.util.List;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575sp implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15602a;

    /* renamed from: b, reason: collision with root package name */
    public final C1520rf f15603b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f15604c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f15605d;

    public /* synthetic */ C1575sp(C1520rf c1520rf, CD cd, CD cd2, int i) {
        this.f15602a = i;
        this.f15603b = c1520rf;
        this.f15604c = cd;
        this.f15605d = cd2;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15602a) {
            case 0:
                Mo mo = new Mo(0, this.f15603b.f15326b.a());
                C2308a c2308a = (C2308a) this.f15604c.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1396op(mo, 2147483647L, c2308a, c0606Hd, (C1482ql) this.f15605d.d());
            default:
                Mp mo2 = new Mo(0, this.f15603b.f15326b.a());
                Mp mp = (C1396op) this.f15604c.d();
                if (true == ((List) this.f15605d.d()).contains("2")) {
                    mo2 = mp;
                }
                AbstractC1400ot.D(mo2);
                return mo2;
        }
    }
}
