package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final zzaf createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        zzahv zzahvVar = null;
        zzab zzabVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzah zzahVar = null;
        com.google.firebase.auth.zze zzeVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayList3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzahvVar = (zzahv) b.f(parcel, readInt, zzahv.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) b.f(parcel, readInt, zzab.CREATOR);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    str2 = b.g(parcel, readInt);
                    break;
                case 5:
                    arrayList = b.k(parcel, readInt, zzab.CREATOR);
                    break;
                case 6:
                    arrayList2 = b.i(parcel, readInt);
                    break;
                case 7:
                    str3 = b.g(parcel, readInt);
                    break;
                case '\b':
                    bool = b.n(parcel, readInt);
                    break;
                case '\t':
                    zzahVar = (zzah) b.f(parcel, readInt, zzah.CREATOR);
                    break;
                case '\n':
                    z2 = b.m(parcel, readInt);
                    break;
                case 11:
                    zzeVar = (com.google.firebase.auth.zze) b.f(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
                    break;
                case '\f':
                    zzbjVar = (zzbj) b.f(parcel, readInt, zzbj.CREATOR);
                    break;
                case '\r':
                    arrayList3 = b.k(parcel, readInt, com.google.firebase.auth.zzan.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzaf(zzahvVar, zzabVar, str, str2, arrayList, arrayList2, str3, bool, zzahVar, z2, zzeVar, zzbjVar, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i) {
        return new zzaf[i];
    }
}
