package com.google.android.gms.common.server.converter;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new E(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringToIntConverter f11372b;

    public zaa(int i7, StringToIntConverter stringToIntConverter) {
        this.f11371a = i7;
        this.f11372b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11371a);
        D.r0(parcel, 2, this.f11372b, i7, false);
        D.z0(iX0, parcel);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f11371a = 1;
        this.f11372b = stringToIntConverter;
    }
}
