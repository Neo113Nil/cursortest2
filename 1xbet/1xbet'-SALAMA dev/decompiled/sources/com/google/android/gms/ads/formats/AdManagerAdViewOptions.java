package com.google.android.gms.ads.formats;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10709a;

    public AdManagerAdViewOptions(boolean z4) {
        this.f10709a = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10709a ? 1 : 0);
        D.z0(iX0, parcel);
    }
}
