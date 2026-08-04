package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new Z2.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11281f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11284z;

    public MethodInvocation(int i7, int i8, int i9, long j, long j3, String str, String str2, int i10, int i11) {
        this.f11276a = i7;
        this.f11277b = i8;
        this.f11278c = i9;
        this.f11279d = j;
        this.f11280e = j3;
        this.f11281f = str;
        this.f11282x = str2;
        this.f11283y = i10;
        this.f11284z = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11276a);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11277b);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11278c);
        Y4.D.B0(parcel, 4, 8);
        parcel.writeLong(this.f11279d);
        Y4.D.B0(parcel, 5, 8);
        parcel.writeLong(this.f11280e);
        Y4.D.s0(parcel, 6, this.f11281f, false);
        Y4.D.s0(parcel, 7, this.f11282x, false);
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(this.f11283y);
        Y4.D.B0(parcel, 9, 4);
        parcel.writeInt(this.f11284z);
        Y4.D.z0(iX0, parcel);
    }
}
