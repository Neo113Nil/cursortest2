package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0862d;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.T;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        T t = zzj.zzb;
        List<C0862d> list = zzj.zza;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                t = (T) b.f(parcel, readInt, T.CREATOR);
            } else if (c == 2) {
                list = b.k(parcel, readInt, C0862d.CREATOR);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                str = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzj(t, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
