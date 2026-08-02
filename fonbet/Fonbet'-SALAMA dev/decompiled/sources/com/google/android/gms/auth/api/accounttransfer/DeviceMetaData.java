package com.google.android.gms.auth.api.accounttransfer;

import V2.a;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new a(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f10878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10879b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10880c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10881d;

    public DeviceMetaData(int i7, boolean z4, long j, boolean z7) {
        this.f10878a = i7;
        this.f10879b = z4;
        this.f10880c = j;
        this.f10881d = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10878a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10879b ? 1 : 0);
        D.B0(parcel, 3, 8);
        parcel.writeLong(this.f10880c);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10881d ? 1 : 0);
        D.z0(x02, parcel);
    }
}
