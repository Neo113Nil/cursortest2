package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdcu {
    private final zzfqi zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzinq zzg;
    private final String zzh;
    private final zzfdl zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzflw zzk;
    private final zzdji zzl;

    zzdcu(zzfqi zzfqiVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzinq zzinqVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfdl zzfdlVar, zzflw zzflwVar, zzdji zzdjiVar) {
        this.zza = zzfqiVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzinqVar;
        this.zzh = str2;
        this.zzi = zzfdlVar;
        this.zzj = zzgVar;
        this.zzk = zzflwVar;
        this.zzl = zzdjiVar;
    }

    public final ListenableFuture zza(Bundle bundle) {
        this.zzl.zza();
        zzfqc zzfqcVar = zzfqc.SIGNALS;
        zzfqi zzfqiVar = this.zza;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zza(this.zzi.zza(new Bundle(), bundle), zzfqcVar, zzfqiVar).zzi();
    }

    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture zza = zza(bundle);
        return this.zza.zzb(zzfqc.REQUEST_PARCEL, zza, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdcu.this.zzc(zza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzcbv zzc(ListenableFuture listenableFuture, Bundle bundle) {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzid)).booleanValue() && this.zzj.zzx();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzcbv(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z, this.zzk.zza(), bundle);
    }
}
