package com.google.android.gms.ads.internal.offline.buffering;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new e(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f10795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10797c;

    public zza(String str, String str2, String str3) {
        this.f10795a = str;
        this.f10796b = str2;
        this.f10797c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10795a, false);
        D.s0(parcel, 2, this.f10796b, false);
        D.s0(parcel, 3, this.f10797c, false);
        D.z0(x02, parcel);
    }
}
