package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.g(parcel, readInt);
                    break;
                case 2:
                    i = b.t(parcel, readInt);
                    break;
                case 3:
                    z2 = b.m(parcel, readInt);
                    break;
                case 4:
                    str2 = b.g(parcel, readInt);
                    break;
                case 5:
                    str3 = b.g(parcel, readInt);
                    break;
                case 6:
                    str4 = b.g(parcel, readInt);
                    break;
                case 7:
                    str5 = b.g(parcel, readInt);
                    break;
                case '\b':
                    str6 = b.g(parcel, readInt);
                    break;
                case '\t':
                    str7 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzc(str, i, z2, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
