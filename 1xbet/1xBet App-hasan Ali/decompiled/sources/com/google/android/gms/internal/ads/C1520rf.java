package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520rf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15325a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f15326b;

    public /* synthetic */ C1520rf(C1565sf c1565sf, int i) {
        this.f15325a = i;
        this.f15326b = c1565sf;
    }

    public C1572sm a() {
        Context a5 = this.f15326b.a();
        C1572sm c1572sm = new C1572sm();
        c1572sm.f15599r = 1;
        c1572sm.f15173p = new C1414p6(a5, P2.o.f4767B.f4785s.n(), (AbstractC1483qm) c1572sm, (AbstractC1483qm) c1572sm);
        return c1572sm;
    }

    public C0770ap b() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new C0770ap(c0606Hd, this.f15326b.a(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String c() {
        Q2.I0 liteSdkVersion;
        Q2.Z z3 = (Q2.Z) C0905dr.C(this.f15326b.a()).f13187m;
        if (z3 != null) {
            try {
                liteSdkVersion = z3.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
            if (liteSdkVersion == null) {
                return liteSdkVersion.f4927m;
            }
            return null;
        }
        liteSdkVersion = null;
        if (liteSdkVersion == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15325a) {
            case 0:
                ApplicationInfo applicationInfo = this.f15326b.a().getApplicationInfo();
                AbstractC1400ot.D(applicationInfo);
                return applicationInfo;
            case 1:
                return c();
            case 2:
                C1071hd y5 = C1071hd.y(this.f15326b.a());
                return new C0709Wb(10, (C2308a) y5.f13761l, (C0892dd) ((CD) y5.f13763n).d());
            case 3:
                return new C0997ft(this.f15326b.a(), P2.o.f4767B.f4785s.n());
            case 4:
                return new T2.v(this.f15326b.a());
            case 5:
                return C0905dr.C(this.f15326b.a());
            case 6:
                return new C0850cg(this.f15326b.a());
            case 7:
                return new Ml(this.f15326b.a());
            case 8:
                return new C0812bm(this.f15326b.a());
            case 9:
                Context a5 = this.f15326b.a();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1348nm(a5, c0606Hd, 1);
            case 10:
                return a();
            case 11:
                return new Lm(this.f15326b.a());
            case 12:
                Context a6 = this.f15326b.a();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new Xm(a6, c0606Hd2);
            case 13:
                return new C1214kn(this.f15326b.a());
            case 14:
                return new C1864z7(this.f15326b.a(), false);
            case 15:
                return new Mo(0, this.f15326b.a());
            case 16:
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new C0770ap(c0606Hd3, this.f15326b.a(), 0);
            case 17:
                return b();
            case 18:
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new C0770ap(c0606Hd4, this.f15326b.a(), 2);
            case 19:
                Context a7 = this.f15326b.a();
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                return new C0770ap(a7, c0606Hd5, 3);
            case 20:
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                return new C0770ap(c0606Hd6, this.f15326b.a(), 4);
            case C1639u7.zzm /* 21 */:
                C0606Hd c0606Hd7 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd7);
                return new C0770ap(c0606Hd7, this.f15326b.a(), 5);
            case 22:
                Context a8 = this.f15326b.a();
                C0606Hd c0606Hd8 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd8);
                return new C0770ap(a8, c0606Hd8, 6);
            case 23:
                C0606Hd c0606Hd9 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd9);
                return new C0770ap(c0606Hd9, this.f15326b.a(), 7);
            case 24:
                return e();
            case 25:
                C0606Hd c0606Hd10 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd10);
                this.f15326b.a();
                return new C1441pp(c0606Hd10, 3);
            default:
                return new Wp(this.f15326b.a());
        }
    }

    public C0770ap e() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new C0770ap(c0606Hd, this.f15326b.a(), 8);
    }
}
