package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Bk extends E5 implements S8 {

    /* renamed from: k, reason: collision with root package name */
    public final String f7870k;

    /* renamed from: l, reason: collision with root package name */
    public final Cj f7871l;

    /* renamed from: m, reason: collision with root package name */
    public final Gj f7872m;

    public Bk(String str, Cj cj, Gj gj) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f7870k = str;
        this.f7871l = cj;
        this.f7872m = gj;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        I8 i8;
        switch (i) {
            case 2:
                BinderC2361b binderC2361b = new BinderC2361b(this.f7871l);
                parcel2.writeNoException();
                F5.e(parcel2, binderC2361b);
                return true;
            case 3:
                String b3 = this.f7872m.b();
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 4:
                List f = this.f7872m.f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String X4 = this.f7872m.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 6:
                Gj gj = this.f7872m;
                synchronized (gj) {
                    i8 = gj.f9243t;
                }
                parcel2.writeNoException();
                F5.e(parcel2, i8);
                return true;
            case 7:
                String Y4 = this.f7872m.Y();
                parcel2.writeNoException();
                parcel2.writeString(Y4);
                return true;
            case 8:
                String W4 = this.f7872m.W();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 9:
                Bundle E5 = this.f7872m.E();
                parcel2.writeNoException();
                F5.d(parcel2, E5);
                return true;
            case 10:
                this.f7871l.x();
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0391w0 J = this.f7872m.J();
                parcel2.writeNoException();
                F5.e(parcel2, J);
                return true;
            case 12:
                Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                this.f7871l.f(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                boolean o5 = this.f7871l.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o5 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                this.f7871l.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                E8 L5 = this.f7872m.L();
                parcel2.writeNoException();
                F5.e(parcel2, L5);
                return true;
            case 16:
                InterfaceC2360a U4 = this.f7872m.U();
                parcel2.writeNoException();
                F5.e(parcel2, U4);
                return true;
            case 17:
                String str = this.f7870k;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
