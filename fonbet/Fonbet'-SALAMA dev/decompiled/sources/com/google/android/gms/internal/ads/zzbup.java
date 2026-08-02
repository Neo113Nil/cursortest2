package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbup implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfcu zzfcuVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        boolean z4 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = Q0.a.j(readInt, parcel);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) Q0.a.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 5:
                    arrayList = Q0.a.p(readInt, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) Q0.a.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case '\b':
                default:
                    Q0.a.X(readInt, parcel);
                    break;
                case '\t':
                    str3 = Q0.a.n(readInt, parcel);
                    break;
                case '\n':
                    zzfcuVar = (zzfcu) Q0.a.m(parcel, readInt, zzfcu.CREATOR);
                    break;
                case 11:
                    str4 = Q0.a.n(readInt, parcel);
                    break;
                case '\f':
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case '\r':
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case 14:
                    bundle2 = Q0.a.j(readInt, parcel);
                    break;
                case 15:
                    bundle3 = Q0.a.j(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbuo(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfcuVar, str4, z4, z7, bundle2, bundle3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbuo[i7];
    }
}
