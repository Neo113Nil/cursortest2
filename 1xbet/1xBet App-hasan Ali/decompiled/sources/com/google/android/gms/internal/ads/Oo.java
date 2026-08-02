package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Oo implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10996a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10997b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10998c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10999d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11000e;

    public Oo(Context context, C0606Hd c0606Hd, Wq wq, U2.a aVar) {
        this.f10996a = 6;
        this.f10998c = context;
        this.f10999d = c0606Hd;
        this.f10997b = wq;
        this.f11000e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f10996a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        Yo yo;
        switch (this.f10996a) {
            case 0:
                F7.a((Context) this.f10998c);
                return ((C0606Hd) this.f10999d).d(new S4(7, this));
            case 1:
                return AbstractC1400ot.h0(((C1396op) this.f10999d).d(), new C1383oc(3, this), AbstractC0613Id.f9544g);
            case 2:
                A7 a7 = F7.ib;
                Q2.r rVar = Q2.r.f5053d;
                boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
                Zo zo = (Zo) this.f11000e;
                if (booleanValue && (yo = zo.f12526b) != null) {
                    return AbstractC1400ot.c0(yo);
                }
                A7 a72 = F7.f8885q1;
                D7 d7 = rVar.f5056c;
                if (AbstractC0952et.u((String) d7.a(a72)) || (!((Boolean) d7.a(a7)).booleanValue() && (zo.f12525a.get() || !((Kl) this.f10997b).f10229b))) {
                    return AbstractC1400ot.c0(new Yo(0, new Bundle()));
                }
                zo.f12525a.set(true);
                return ((C0606Hd) this.f10999d).d(new S4(9, this));
            case 3:
                return ((C0606Hd) this.f10999d).d(new S4(15, this));
            case 4:
                return ((C0606Hd) this.f10999d).d(new S4(19, this));
            case 5:
                return ((C0606Hd) this.f10999d).d(new S4(21, this));
            case 6:
                return ((C0606Hd) this.f10999d).d(new S4(23, this));
            default:
                return ((C0606Hd) this.f10999d).d(new S4(25, this));
        }
    }

    public /* synthetic */ Oo(C0606Hd c0606Hd, Object obj, Object obj2, Object obj3, int i) {
        this.f10996a = i;
        this.f10999d = c0606Hd;
        this.f10998c = obj;
        this.f10997b = obj2;
        this.f11000e = obj3;
    }

    public /* synthetic */ Oo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f10996a = i;
        this.f10999d = obj;
        this.f10997b = obj2;
        this.f10998c = obj3;
        this.f11000e = obj4;
    }
}
