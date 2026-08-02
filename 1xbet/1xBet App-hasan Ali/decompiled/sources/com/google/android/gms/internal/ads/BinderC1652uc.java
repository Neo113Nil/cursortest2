package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1652uc extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final String f15866k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15867l;

    public BinderC1652uc(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f15866k = str;
        this.f15867l = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC1652uc)) {
            BinderC1652uc binderC1652uc = (BinderC1652uc) obj;
            if (m3.v.g(this.f15866k, binderC1652uc.f15866k) && m3.v.g(Integer.valueOf(this.f15867l), Integer.valueOf(binderC1652uc.f15867l))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f15866k);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f15867l);
        return true;
    }
}
