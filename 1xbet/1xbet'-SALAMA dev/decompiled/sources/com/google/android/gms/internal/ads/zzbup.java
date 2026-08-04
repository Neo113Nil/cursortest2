package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbup implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        Bundle bundleJ = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String strN = null;
        ArrayList arrayListP = null;
        PackageInfo packageInfo = null;
        String strN2 = null;
        String strN3 = null;
        zzfcu zzfcuVar = null;
        String strN4 = null;
        Bundle bundleJ2 = null;
        Bundle bundleJ3 = null;
        boolean zK = false;
        boolean zK2 = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    bundleJ = Q0.a.j(i7, parcel);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, i7, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) Q0.a.m(parcel, i7, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 5:
                    arrayListP = Q0.a.p(i7, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) Q0.a.m(parcel, i7, PackageInfo.CREATOR);
                    break;
                case 7:
                    strN2 = Q0.a.n(i7, parcel);
                    break;
                case '\b':
                default:
                    Q0.a.X(i7, parcel);
                    break;
                case '\t':
                    strN3 = Q0.a.n(i7, parcel);
                    break;
                case '\n':
                    zzfcuVar = (zzfcu) Q0.a.m(parcel, i7, zzfcu.CREATOR);
                    break;
                case 11:
                    strN4 = Q0.a.n(i7, parcel);
                    break;
                case '\f':
                    zK = Q0.a.K(i7, parcel);
                    break;
                case '\r':
                    zK2 = Q0.a.K(i7, parcel);
                    break;
                case 14:
                    bundleJ2 = Q0.a.j(i7, parcel);
                    break;
                case 15:
                    bundleJ3 = Q0.a.j(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbuo(bundleJ, versionInfoParcel, applicationInfo, strN, arrayListP, packageInfo, strN2, strN3, zzfcuVar, strN4, zK, zK2, bundleJ2, bundleJ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbuo[i7];
    }
}
