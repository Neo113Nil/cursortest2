package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class M7 extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final P2.d f10601k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10602l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10603m;

    public M7(P2.d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f10601k = dVar;
        this.f10602l = str;
        this.f10603m = str2;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f10602l);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f10603m);
            return true;
        }
        P2.d dVar = this.f10601k;
        if (i == 3) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            if (h1 != null) {
                dVar.l((View) BinderC2361b.t1(h1));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            dVar.d();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        dVar.i();
        parcel2.writeNoException();
        return true;
    }
}
