package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* loaded from: classes4.dex */
public final class zzd implements Parcelable.Creator<zze> {
    @Override // android.os.Parcelable.Creator
    public final zze createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzajb zzajbVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = b.g(parcel, readInt);
                    break;
                case 4:
                    zzajbVar = (zzajb) b.f(parcel, readInt, zzajb.CREATOR);
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
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zze(str, str2, str3, zzajbVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zze[] newArray(int i) {
        return new zze[i];
    }
}
