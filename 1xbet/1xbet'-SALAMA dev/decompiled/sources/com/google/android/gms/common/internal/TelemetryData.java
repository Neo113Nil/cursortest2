package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new Z2.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11300b;

    public TelemetryData(int i7, List list) {
        this.f11299a = i7;
        this.f11300b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11299a);
        Y4.D.w0(parcel, 2, this.f11300b, false);
        Y4.D.z0(iX0, parcel);
    }
}
