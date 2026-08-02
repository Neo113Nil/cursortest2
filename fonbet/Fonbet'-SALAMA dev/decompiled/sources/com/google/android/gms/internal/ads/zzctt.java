package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.L;
import I2.M;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzctt {
    private final zzffe zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhea zzg;
    private final String zzh;
    private final zzesk zzi;
    private final L zzj;
    private final zzfba zzk;
    private final int zzl;
    private final zzdab zzm;

    public zzctt(zzffe zzffeVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhea zzheaVar, L l7, String str2, zzesk zzeskVar, zzfba zzfbaVar, zzdab zzdabVar, int i7) {
        this.zza = zzffeVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzheaVar;
        this.zzh = str2;
        this.zzi = zzeskVar;
        this.zzj = l7;
        this.zzk = zzfbaVar;
        this.zzm = zzdabVar;
        this.zzl = i7;
    }

    public static zzbuo zza(zzctt zzcttVar, I3.b bVar, Bundle bundle) {
        zzcts zzctsVar = (zzcts) bVar.get();
        Bundle bundle2 = zzctsVar.zza;
        String str = (String) ((I3.b) zzcttVar.zzg.zzb()).get();
        boolean z4 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgV)).booleanValue() && ((M) zzcttVar.zzj).k();
        String str2 = zzcttVar.zzh;
        PackageInfo packageInfo = zzcttVar.zzf;
        List list = zzcttVar.zze;
        return new zzbuo(bundle2, zzcttVar.zzb, zzcttVar.zzc, zzcttVar.zzd, list, packageInfo, str, str2, null, null, z4, zzcttVar.zzk.zza(), bundle, zzctsVar.zzb);
    }

    public final I3.b zzb(Bundle bundle) {
        this.zzm.zza();
        return zzfeo.zzc(this.zzi.zza(new zzcts(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfey.SIGNALS, this.zza).zza();
    }

    public final I3.b zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final I3.b zzb = zzb(bundle);
        return this.zza.zza(zzfey.REQUEST_PARCEL, zzb, (I3.b) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzctr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzctt.zza(zzctt.this, zzb, bundle);
            }
        }).zza();
    }
}
