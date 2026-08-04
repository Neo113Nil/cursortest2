package com.google.android.gms.signin.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new l(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zat f11562b;

    public zai(int i7, zat zatVar) {
        this.f11561a = i7;
        this.f11562b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11561a);
        D.r0(parcel, 2, this.f11562b, i7, false);
        D.z0(iX0, parcel);
    }
}
