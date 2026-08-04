package com.google.android.gms.ads.formats;

import B2.e;
import F2.Y;
import F2.Z;
import Y4.D;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f10712c;

    public PublisherAdViewOptions(boolean z4, IBinder iBinder, IBinder iBinder2) {
        this.f10710a = z4;
        this.f10711b = iBinder != null ? Y.zzd(iBinder) : null;
        this.f10712c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10710a ? 1 : 0);
        Z z4 = this.f10711b;
        D.n0(parcel, 2, z4 == null ? null : z4.asBinder());
        D.n0(parcel, 3, this.f10712c);
        D.z0(iX0, parcel);
    }
}
