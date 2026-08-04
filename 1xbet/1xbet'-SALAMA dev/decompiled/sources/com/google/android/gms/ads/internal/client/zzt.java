package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new e(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10783d;

    public zzt(int i7, int i8, long j, String str) {
        this.f10780a = i7;
        this.f10781b = i8;
        this.f10782c = str;
        this.f10783d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10780a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10781b);
        D.s0(parcel, 3, this.f10782c, false);
        D.B0(parcel, 4, 8);
        parcel.writeLong(this.f10783d);
        D.z0(iX0, parcel);
    }
}
