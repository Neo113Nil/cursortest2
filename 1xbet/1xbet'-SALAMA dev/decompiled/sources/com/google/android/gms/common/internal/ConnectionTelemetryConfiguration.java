package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new E(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f11230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f11235f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z4, boolean z7, int[] iArr, int i7, int[] iArr2) {
        this.f11230a = rootTelemetryConfiguration;
        this.f11231b = z4;
        this.f11232c = z7;
        this.f11233d = iArr;
        this.f11234e = i7;
        this.f11235f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f11230a, i7, false);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11231b ? 1 : 0);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11232c ? 1 : 0);
        Y4.D.o0(parcel, 4, this.f11233d, false);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11234e);
        Y4.D.o0(parcel, 6, this.f11235f, false);
        Y4.D.z0(iX0, parcel);
    }
}
