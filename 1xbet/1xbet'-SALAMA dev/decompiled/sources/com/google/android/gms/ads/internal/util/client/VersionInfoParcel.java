package com.google.android.gms.ads.internal.util.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p150v0.a;

/* JADX INFO: loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new e(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10838e;

    public VersionInfoParcel(String str, int i7, int i8, boolean z4, boolean z7) {
        this.f10834a = str;
        this.f10835b = i7;
        this.f10836c = i8;
        this.f10837d = z4;
        this.f10838e = z7;
    }

    public static VersionInfoParcel j() {
        return new VersionInfoParcel(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, this.f10834a, false);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10835b);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10836c);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10837d ? 1 : 0);
        D.B0(parcel, 6, 4);
        parcel.writeInt(this.f10838e ? 1 : 0);
        D.z0(iX0, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VersionInfoParcel(int i7, int i8, boolean z4, boolean z7) {
        String str;
        if (z4) {
            str = "0";
        } else {
            str = "1";
        }
        StringBuilder sbG = a.g("afma-sdk-a-v", i7, ".", i8, ".");
        sbG.append(str);
        this(sbG.toString(), i7, i8, z4, z7);
    }
}
