package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtv implements Parcelable.Creator {
    public static final zzbtu zza(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        float f7 = 0.0f;
        float f8 = 0.0f;
        long jP = 0;
        long jP2 = 0;
        int iN = 0;
        Bundle bundleJ = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String strN = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundleJ2 = null;
        int iN2 = 0;
        ArrayList arrayListP = null;
        Bundle bundleJ3 = null;
        boolean zK = false;
        int iN3 = 0;
        int iN4 = 0;
        String strN5 = null;
        String strN6 = null;
        ArrayList arrayListP2 = null;
        String strN7 = null;
        zzbey zzbeyVar = null;
        ArrayList arrayListP3 = null;
        String strN8 = null;
        boolean zK2 = false;
        int iN5 = 0;
        int iN6 = 0;
        boolean zK3 = false;
        String strN9 = null;
        String strN10 = null;
        boolean zK4 = false;
        int iN7 = 0;
        Bundle bundleJ4 = null;
        String strN11 = null;
        com.google.android.gms.ads.internal.client.zzee zzeeVar = null;
        boolean zK5 = false;
        Bundle bundleJ5 = null;
        String strN12 = null;
        String strN13 = null;
        String strN14 = null;
        boolean zK6 = false;
        ArrayList arrayList = null;
        String strN15 = null;
        ArrayList arrayListP4 = null;
        int iN8 = 0;
        boolean zK7 = false;
        boolean zK8 = false;
        boolean zK9 = false;
        ArrayList arrayListP5 = null;
        String strN16 = null;
        zzblj zzbljVar = null;
        String strN17 = null;
        Bundle bundleJ6 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 2:
                    bundleJ = Q0.a.j(i7, parcel);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) Q0.a.m(parcel, i7, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) Q0.a.m(parcel, i7, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strN2 = Q0.a.n(i7, parcel);
                    break;
                case '\t':
                    strN3 = Q0.a.n(i7, parcel);
                    break;
                case '\n':
                    strN4 = Q0.a.n(i7, parcel);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) Q0.a.m(parcel, i7, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundleJ2 = Q0.a.j(i7, parcel);
                    break;
                case '\r':
                    iN2 = Q0.a.N(i7, parcel);
                    break;
                case 14:
                    arrayListP = Q0.a.p(i7, parcel);
                    break;
                case 15:
                    bundleJ3 = Q0.a.j(i7, parcel);
                    break;
                case 16:
                    zK = Q0.a.K(i7, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    Q0.a.X(i7, parcel);
                    break;
                case 18:
                    iN3 = Q0.a.N(i7, parcel);
                    break;
                case 19:
                    iN4 = Q0.a.N(i7, parcel);
                    break;
                case 20:
                    Q0.a.j0(parcel, i7, 4);
                    f7 = parcel.readFloat();
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    strN5 = Q0.a.n(i7, parcel);
                    break;
                case 25:
                    jP = Q0.a.P(i7, parcel);
                    break;
                case 26:
                    strN6 = Q0.a.n(i7, parcel);
                    break;
                case 27:
                    arrayListP2 = Q0.a.p(i7, parcel);
                    break;
                case 28:
                    strN7 = Q0.a.n(i7, parcel);
                    break;
                case 29:
                    zzbeyVar = (zzbey) Q0.a.m(parcel, i7, zzbey.CREATOR);
                    break;
                case 30:
                    arrayListP3 = Q0.a.p(i7, parcel);
                    break;
                case 31:
                    jP2 = Q0.a.P(i7, parcel);
                    break;
                case '!':
                    strN8 = Q0.a.n(i7, parcel);
                    break;
                case '\"':
                    Q0.a.j0(parcel, i7, 4);
                    f8 = parcel.readFloat();
                    break;
                case '#':
                    iN5 = Q0.a.N(i7, parcel);
                    break;
                case '$':
                    iN6 = Q0.a.N(i7, parcel);
                    break;
                case '%':
                    zK3 = Q0.a.K(i7, parcel);
                    break;
                case '\'':
                    strN9 = Q0.a.n(i7, parcel);
                    break;
                case '(':
                    zK2 = Q0.a.K(i7, parcel);
                    break;
                case ')':
                    strN10 = Q0.a.n(i7, parcel);
                    break;
                case '*':
                    zK4 = Q0.a.K(i7, parcel);
                    break;
                case '+':
                    iN7 = Q0.a.N(i7, parcel);
                    break;
                case ',':
                    bundleJ4 = Q0.a.j(i7, parcel);
                    break;
                case '-':
                    strN11 = Q0.a.n(i7, parcel);
                    break;
                case '.':
                    zzeeVar = (com.google.android.gms.ads.internal.client.zzee) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                    break;
                case '/':
                    zK5 = Q0.a.K(i7, parcel);
                    break;
                case '0':
                    bundleJ5 = Q0.a.j(i7, parcel);
                    break;
                case '1':
                    strN12 = Q0.a.n(i7, parcel);
                    break;
                case '2':
                    strN13 = Q0.a.n(i7, parcel);
                    break;
                case '3':
                    strN14 = Q0.a.n(i7, parcel);
                    break;
                case '4':
                    zK6 = Q0.a.K(i7, parcel);
                    break;
                case '5':
                    int iR = Q0.a.R(i7, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iR == 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i8 = parcel.readInt();
                        for (int i9 = 0; i9 < i8; i9++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iR);
                        arrayList = arrayList2;
                    }
                    break;
                case '6':
                    strN15 = Q0.a.n(i7, parcel);
                    break;
                case '7':
                    arrayListP4 = Q0.a.p(i7, parcel);
                    break;
                case '8':
                    iN8 = Q0.a.N(i7, parcel);
                    break;
                case '9':
                    zK7 = Q0.a.K(i7, parcel);
                    break;
                case ':':
                    zK8 = Q0.a.K(i7, parcel);
                    break;
                case ';':
                    zK9 = Q0.a.K(i7, parcel);
                    break;
                case '<':
                    arrayListP5 = Q0.a.p(i7, parcel);
                    break;
                case '=':
                    strN16 = Q0.a.n(i7, parcel);
                    break;
                case '?':
                    zzbljVar = (zzblj) Q0.a.m(parcel, i7, zzblj.CREATOR);
                    break;
                case '@':
                    strN17 = Q0.a.n(i7, parcel);
                    break;
                case 'A':
                    bundleJ6 = Q0.a.j(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbtu(iN, bundleJ, zzmVar, zzrVar, strN, applicationInfo, packageInfo, strN2, strN3, strN4, versionInfoParcel, bundleJ2, iN2, arrayListP, bundleJ3, zK, iN3, iN4, f7, strN5, jP, strN6, arrayListP2, strN7, zzbeyVar, arrayListP3, jP2, strN8, f8, zK2, iN5, iN6, zK3, strN9, strN10, zK4, iN7, bundleJ4, strN11, zzeeVar, zK5, bundleJ5, strN12, strN13, strN14, zK6, arrayList, strN15, arrayListP4, iN8, zK7, zK8, zK9, arrayListP5, strN16, zzbljVar, strN17, bundleJ6);
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
