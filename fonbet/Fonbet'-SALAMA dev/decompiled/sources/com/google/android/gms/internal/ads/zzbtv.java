package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbtv implements Parcelable.Creator {
    public static final zzbtu zza(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        float f7 = 0.0f;
        float f8 = 0.0f;
        long j = 0;
        long j3 = 0;
        int i7 = 0;
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i8 = 0;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzbey zzbeyVar = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z8 = false;
        String str9 = null;
        String str10 = null;
        boolean z9 = false;
        int i13 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzee zzeeVar = null;
        boolean z10 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z11 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzblj zzbljVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 2:
                    bundle = Q0.a.j(readInt, parcel);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) Q0.a.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) Q0.a.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case '\t':
                    str3 = Q0.a.n(readInt, parcel);
                    break;
                case '\n':
                    str4 = Q0.a.n(readInt, parcel);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundle2 = Q0.a.j(readInt, parcel);
                    break;
                case '\r':
                    i8 = Q0.a.N(readInt, parcel);
                    break;
                case 14:
                    arrayList = Q0.a.p(readInt, parcel);
                    break;
                case 15:
                    bundle3 = Q0.a.j(readInt, parcel);
                    break;
                case 16:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    Q0.a.X(readInt, parcel);
                    break;
                case 18:
                    i9 = Q0.a.N(readInt, parcel);
                    break;
                case 19:
                    i10 = Q0.a.N(readInt, parcel);
                    break;
                case 20:
                    Q0.a.j0(parcel, readInt, 4);
                    f7 = parcel.readFloat();
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    str5 = Q0.a.n(readInt, parcel);
                    break;
                case 25:
                    j = Q0.a.P(readInt, parcel);
                    break;
                case 26:
                    str6 = Q0.a.n(readInt, parcel);
                    break;
                case 27:
                    arrayList2 = Q0.a.p(readInt, parcel);
                    break;
                case 28:
                    str7 = Q0.a.n(readInt, parcel);
                    break;
                case 29:
                    zzbeyVar = (zzbey) Q0.a.m(parcel, readInt, zzbey.CREATOR);
                    break;
                case 30:
                    arrayList3 = Q0.a.p(readInt, parcel);
                    break;
                case 31:
                    j3 = Q0.a.P(readInt, parcel);
                    break;
                case '!':
                    str8 = Q0.a.n(readInt, parcel);
                    break;
                case '\"':
                    Q0.a.j0(parcel, readInt, 4);
                    f8 = parcel.readFloat();
                    break;
                case '#':
                    i11 = Q0.a.N(readInt, parcel);
                    break;
                case '$':
                    i12 = Q0.a.N(readInt, parcel);
                    break;
                case '%':
                    z8 = Q0.a.K(readInt, parcel);
                    break;
                case '\'':
                    str9 = Q0.a.n(readInt, parcel);
                    break;
                case '(':
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case ')':
                    str10 = Q0.a.n(readInt, parcel);
                    break;
                case '*':
                    z9 = Q0.a.K(readInt, parcel);
                    break;
                case '+':
                    i13 = Q0.a.N(readInt, parcel);
                    break;
                case ',':
                    bundle4 = Q0.a.j(readInt, parcel);
                    break;
                case '-':
                    str11 = Q0.a.n(readInt, parcel);
                    break;
                case '.':
                    zzeeVar = (com.google.android.gms.ads.internal.client.zzee) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                    break;
                case '/':
                    z10 = Q0.a.K(readInt, parcel);
                    break;
                case '0':
                    bundle5 = Q0.a.j(readInt, parcel);
                    break;
                case '1':
                    str12 = Q0.a.n(readInt, parcel);
                    break;
                case '2':
                    str13 = Q0.a.n(readInt, parcel);
                    break;
                case '3':
                    str14 = Q0.a.n(readInt, parcel);
                    break;
                case '4':
                    z11 = Q0.a.K(readInt, parcel);
                    break;
                case '5':
                    int R6 = Q0.a.R(readInt, parcel);
                    int dataPosition = parcel.dataPosition();
                    if (R6 == 0) {
                        arrayList4 = null;
                        break;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i15 = 0; i15 < readInt2; i15++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + R6);
                        arrayList4 = arrayList7;
                        break;
                    }
                case '6':
                    str15 = Q0.a.n(readInt, parcel);
                    break;
                case '7':
                    arrayList5 = Q0.a.p(readInt, parcel);
                    break;
                case '8':
                    i14 = Q0.a.N(readInt, parcel);
                    break;
                case '9':
                    z12 = Q0.a.K(readInt, parcel);
                    break;
                case ':':
                    z13 = Q0.a.K(readInt, parcel);
                    break;
                case ';':
                    z14 = Q0.a.K(readInt, parcel);
                    break;
                case '<':
                    arrayList6 = Q0.a.p(readInt, parcel);
                    break;
                case '=':
                    str16 = Q0.a.n(readInt, parcel);
                    break;
                case '?':
                    zzbljVar = (zzblj) Q0.a.m(parcel, readInt, zzblj.CREATOR);
                    break;
                case '@':
                    str17 = Q0.a.n(readInt, parcel);
                    break;
                case 'A':
                    bundle6 = Q0.a.j(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbtu(i7, bundle, zzmVar, zzrVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i8, arrayList, bundle3, z4, i9, i10, f7, str5, j, str6, arrayList2, str7, zzbeyVar, arrayList3, j3, str8, f8, z7, i11, i12, z8, str9, str10, z9, i13, bundle4, str11, zzeeVar, z10, bundle5, str12, str13, str14, z11, arrayList4, str15, arrayList5, i14, z12, z13, z14, arrayList6, str16, zzbljVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbtu[i7];
    }
}
