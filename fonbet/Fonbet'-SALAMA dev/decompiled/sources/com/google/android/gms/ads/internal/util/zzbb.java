package com.google.android.gms.ads.internal.util;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new e(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f10839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10840b;

    public zzbb(String str, int i7) {
        this.f10839a = str == null ? "" : str;
        this.f10840b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10839a, false);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10840b);
        D.z0(x02, parcel);
    }
}
