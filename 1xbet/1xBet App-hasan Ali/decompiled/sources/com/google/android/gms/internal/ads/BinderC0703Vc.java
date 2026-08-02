package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0703Vc extends E5 implements InterfaceC0591Fc {

    /* renamed from: k, reason: collision with root package name */
    public final String f11884k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11885l;

    public BinderC0703Vc(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f11884k = str;
        this.f11885l = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0591Fc
    public final int b() {
        return this.f11885l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0591Fc
    public final String c() {
        return this.f11884k;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f11884k);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f11885l);
        return true;
    }
}
