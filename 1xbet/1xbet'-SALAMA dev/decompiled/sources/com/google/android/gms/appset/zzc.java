package com.google.android.gms.appset;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10865b;

    public zzc(String str, int i7) {
        this.f10864a = str;
        this.f10865b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10864a, false);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10865b);
        D.z0(iX0, parcel);
    }
}
