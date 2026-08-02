package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1035gm implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1428pc f13645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13647d;

    public /* synthetic */ C1035gm(Object obj, C1428pc c1428pc, int i, int i5) {
        this.f13644a = i5;
        this.f13647d = obj;
        this.f13645b = c1428pc;
        this.f13646c = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f13644a) {
            case 0:
                C1071hd c1071hd = (C1071hd) this.f13647d;
                C1428pc c1428pc = this.f13645b;
                if (c1428pc != null && (bundle = c1428pc.f15007w) != null) {
                    bundle.putBoolean("ls", true);
                }
                return AbstractC1400ot.j0(((Gm) ((AD) c1071hd.f13764o).d()).v3(c1428pc, this.f13646c), new C0990fm(c1428pc, 0), (C0606Hd) c1071hd.f13762m);
            default:
                C0375o c0375o = (C0375o) this.f13647d;
                C1428pc c1428pc2 = this.f13645b;
                if (c1428pc2 != null && (bundle2 = c1428pc2.f15007w) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return AbstractC1400ot.j0(((Gm) ((AD) c0375o.f5046p).d()).w3(c1428pc2, this.f13646c), new C0990fm(c1428pc2, 1), (C0606Hd) c0375o.f5043m);
        }
    }
}
