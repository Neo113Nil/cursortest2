package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = b.v(parcel, readInt);
                    break;
                case 2:
                    bArr = b.c(parcel, readInt);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    bundle = b.b(parcel, readInt);
                    break;
                case 5:
                    i = b.t(parcel, readInt);
                    break;
                case 6:
                    j2 = b.v(parcel, readInt);
                    break;
                case 7:
                    str2 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzom(j, bArr, str, bundle, i, j2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzom[i];
    }
}
