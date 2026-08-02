package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        zzpl zzplVar = null;
        String str3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
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
                    zzplVar = (zzpl) b.f(parcel, readInt, zzpl.CREATOR);
                    break;
                case 5:
                    j = b.v(parcel, readInt);
                    break;
                case 6:
                    z2 = b.m(parcel, readInt);
                    break;
                case 7:
                    str3 = b.g(parcel, readInt);
                    break;
                case '\b':
                    zzbgVar = (zzbg) b.f(parcel, readInt, zzbg.CREATOR);
                    break;
                case '\t':
                    j2 = b.v(parcel, readInt);
                    break;
                case '\n':
                    zzbgVar2 = (zzbg) b.f(parcel, readInt, zzbg.CREATOR);
                    break;
                case 11:
                    j3 = b.v(parcel, readInt);
                    break;
                case '\f':
                    zzbgVar3 = (zzbg) b.f(parcel, readInt, zzbg.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzah(str, str2, zzplVar, j, z2, str3, zzbgVar, j2, zzbgVar2, j3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
