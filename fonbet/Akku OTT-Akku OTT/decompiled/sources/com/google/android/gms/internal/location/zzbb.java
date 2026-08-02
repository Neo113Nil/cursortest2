package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0862d;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        List<C0862d> list = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        list = b.k(parcel, readInt, C0862d.CREATOR);
                        break;
                    case 6:
                        str = b.g(parcel, readInt);
                        break;
                    case 7:
                        z2 = b.m(parcel, readInt);
                        break;
                    case '\b':
                        z3 = b.m(parcel, readInt);
                        break;
                    case '\t':
                        z4 = b.m(parcel, readInt);
                        break;
                    case '\n':
                        str2 = b.g(parcel, readInt);
                        break;
                    case 11:
                        z5 = b.m(parcel, readInt);
                        break;
                    case '\f':
                        z6 = b.m(parcel, readInt);
                        break;
                    case '\r':
                        str3 = b.g(parcel, readInt);
                        break;
                    case 14:
                        j = b.v(parcel, readInt);
                        break;
                    default:
                        b.y(parcel, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.f(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        b.l(parcel, z);
        return new zzba(locationRequest, list, str, z2, z3, z4, str2, z5, z6, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
        return new zzba[i];
    }
}
