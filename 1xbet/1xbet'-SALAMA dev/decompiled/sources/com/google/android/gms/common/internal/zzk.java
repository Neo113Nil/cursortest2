package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new E(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f11353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Feature[] f11354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f11356d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.k0(parcel, 1, this.f11353a, false);
        Y4.D.v0(parcel, 2, this.f11354b, i7);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11355c);
        Y4.D.r0(parcel, 4, this.f11356d, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
