package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzaa implements Parcelable.Creator<zzab> {
    @Override // android.os.Parcelable.Creator
    public final zzab createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.g(parcel, readInt);
                    break;
                case 2:
                    str2 = b.g(parcel, readInt);
                    break;
                case 3:
                    str5 = b.g(parcel, readInt);
                    break;
                case 4:
                    str4 = b.g(parcel, readInt);
                    break;
                case 5:
                    str3 = b.g(parcel, readInt);
                    break;
                case 6:
                    str6 = b.g(parcel, readInt);
                    break;
                case 7:
                    z2 = b.m(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzab(str, str2, str3, str4, str5, str6, z2, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab[] newArray(int i) {
        return new zzab[i];
    }
}
