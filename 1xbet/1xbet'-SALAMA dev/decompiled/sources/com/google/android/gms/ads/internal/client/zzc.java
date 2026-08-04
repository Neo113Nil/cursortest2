package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10719b;

    public zzc(String str, String str2) {
        this.f10718a = str;
        this.f10719b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10718a, false);
        D.s0(parcel, 2, this.f10719b, false);
        D.z0(iX0, parcel);
    }
}
