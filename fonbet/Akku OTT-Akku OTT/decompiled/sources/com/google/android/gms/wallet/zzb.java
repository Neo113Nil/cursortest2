package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzb implements Parcelable.Creator {
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
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.g(parcel, readInt);
                    break;
                case 3:
                    str2 = b.g(parcel, readInt);
                    break;
                case 4:
                    str3 = b.g(parcel, readInt);
                    break;
                case 5:
                    str4 = b.g(parcel, readInt);
                    break;
                case 6:
                    str5 = b.g(parcel, readInt);
                    break;
                case 7:
                    str6 = b.g(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.g(parcel, readInt);
                    break;
                case '\t':
                    str8 = b.g(parcel, readInt);
                    break;
                case '\n':
                    str9 = b.g(parcel, readInt);
                    break;
                case 11:
                    z2 = b.m(parcel, readInt);
                    break;
                case '\f':
                    str10 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zza(str, str2, str3, str4, str5, str6, str7, str8, str9, z2, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
