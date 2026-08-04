package com.google.android.gms.internal.ads;

import Y4.D;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbuo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuo> CREATOR = new zzbup();
    public final Bundle zza;
    public final VersionInfoParcel zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfcu zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;

    public zzbuo(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfcu zzfcuVar, String str4, boolean z4, boolean z7, Bundle bundle2, Bundle bundle3) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfcuVar;
        this.zzj = str4;
        this.zzk = z4;
        this.zzl = z7;
        this.zzm = bundle2;
        this.zzn = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.k0(parcel, 1, bundle, false);
        D.r0(parcel, 2, this.zzb, i7, false);
        D.r0(parcel, 3, this.zzc, i7, false);
        D.s0(parcel, 4, this.zzd, false);
        D.u0(parcel, 5, this.zze);
        D.r0(parcel, 6, this.zzf, i7, false);
        D.s0(parcel, 7, this.zzg, false);
        D.s0(parcel, 9, this.zzh, false);
        D.r0(parcel, 10, this.zzi, i7, false);
        D.s0(parcel, 11, this.zzj, false);
        boolean z4 = this.zzk;
        D.B0(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z7 = this.zzl;
        D.B0(parcel, 13, 4);
        parcel.writeInt(z7 ? 1 : 0);
        D.k0(parcel, 14, this.zzm, false);
        D.k0(parcel, 15, this.zzn, false);
        D.z0(iX0, parcel);
    }
}
