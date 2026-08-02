package com.google.android.gms.internal.ads;

import android.content.Context;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026gd implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13590a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f13591b;

    /* renamed from: c, reason: collision with root package name */
    public final ED f13592c;

    public /* synthetic */ C1026gd(CD cd, ED ed, int i) {
        this.f13590a = i;
        this.f13591b = cd;
        this.f13592c = ed;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13590a) {
            case 0:
                return new C0709Wb(10, (C2308a) this.f13592c.f8474a, (C0892dd) this.f13591b.d());
            case 1:
                return new C1034gl((C1773x6) this.f13591b.d(), (C1666uq) this.f13592c.f8474a);
            case 2:
                Context context = (Context) this.f13591b.d();
                C0578Df c0578Df = (C0578Df) this.f13592c.f8474a;
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1798xn(context, c0578Df, c0606Hd, 0);
            case 3:
                return new C1888zn((Context) this.f13591b.d(), (C0578Df) this.f13592c.f8474a, 0);
            case 4:
                return new Dn((Context) this.f13591b.d(), (C0594Ff) this.f13592c.f8474a);
            case 5:
                return new C1888zn((Context) this.f13591b.d(), (C0622Jf) this.f13592c.f8474a, 1);
            default:
                return new C1888zn((Context) this.f13591b.d(), (C0636Lf) this.f13592c.f8474a, 2);
        }
    }

    public C1026gd(ED ed, CD cd) {
        this.f13590a = 0;
        this.f13592c = ed;
        this.f13591b = cd;
    }
}
