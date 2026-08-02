package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new E(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f11294a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11295b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11298e;

    public RootTelemetryConfiguration(int i7, boolean z4, boolean z7, int i8, int i9) {
        this.f11294a = i7;
        this.f11295b = z4;
        this.f11296c = z7;
        this.f11297d = i8;
        this.f11298e = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11294a);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11295b ? 1 : 0);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11296c ? 1 : 0);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11297d);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11298e);
        Y4.D.z0(x02, parcel);
    }
}
