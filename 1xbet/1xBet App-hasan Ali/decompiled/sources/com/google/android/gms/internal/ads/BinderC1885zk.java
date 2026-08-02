package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1885zk extends E5 implements R8 {

    /* renamed from: k, reason: collision with root package name */
    public final String f16761k;

    /* renamed from: l, reason: collision with root package name */
    public final Cj f16762l;

    /* renamed from: m, reason: collision with root package name */
    public final Gj f16763m;

    public BinderC1885zk(String str, Cj cj, Gj gj) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f16761k = str;
        this.f16762l = cj;
        this.f16763m = gj;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        Cj cj = this.f16762l;
        Gj gj = this.f16763m;
        switch (i) {
            case 2:
                BinderC2361b binderC2361b = new BinderC2361b(cj);
                parcel2.writeNoException();
                F5.e(parcel2, binderC2361b);
                return true;
            case 3:
                String b3 = gj.b();
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 4:
                List f = gj.f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String X4 = gj.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 6:
                I8 N5 = gj.N();
                parcel2.writeNoException();
                F5.e(parcel2, N5);
                return true;
            case 7:
                String Y4 = gj.Y();
                parcel2.writeNoException();
                parcel2.writeString(Y4);
                return true;
            case 8:
                double v4 = gj.v();
                parcel2.writeNoException();
                parcel2.writeDouble(v4);
                return true;
            case 9:
                String d5 = gj.d();
                parcel2.writeNoException();
                parcel2.writeString(d5);
                return true;
            case 10:
                String c5 = gj.c();
                parcel2.writeNoException();
                parcel2.writeString(c5);
                return true;
            case 11:
                Bundle E5 = gj.E();
                parcel2.writeNoException();
                F5.d(parcel2, E5);
                return true;
            case 12:
                cj.x();
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC0391w0 J = gj.J();
                parcel2.writeNoException();
                F5.e(parcel2, J);
                return true;
            case 14:
                Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                cj.f(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                boolean o5 = cj.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o5 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                cj.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                E8 L5 = gj.L();
                parcel2.writeNoException();
                F5.e(parcel2, L5);
                return true;
            case 18:
                InterfaceC2360a U4 = gj.U();
                parcel2.writeNoException();
                F5.e(parcel2, U4);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f16761k);
                return true;
            default:
                return false;
        }
    }
}
