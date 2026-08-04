package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new e(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10728c;

    public zzey(int i7, int i8, String str) {
        this.f10726a = i7;
        this.f10727b = i8;
        this.f10728c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10726a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10727b);
        D.s0(parcel, 3, this.f10728c, false);
        D.z0(iX0, parcel);
    }
}
