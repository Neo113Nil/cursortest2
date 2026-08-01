package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewy implements zzfdi {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzdab zze;
    private final zzfne zzf;
    private final zzflw zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzp();
    private final zzeae zzi;
    private final zzdap zzj;

    public zzewy(Context context, String str, String str2, zzdab zzdabVar, zzfne zzfneVar, zzflw zzflwVar, zzeae zzeaeVar, zzdap zzdapVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzdabVar;
        this.zzf = zzfneVar;
        this.zzg = zzflwVar;
        this.zzi = zzeaeVar;
        this.zzj = zzdapVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        zzeae zzeaeVar = this.zzi;
        Map zzc = zzeaeVar.zzc();
        String str = this.zzb;
        zzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue()) {
            zzeaeVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzeaeVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza) ? "1" : "0");
        }
        zzdab zzdabVar = this.zze;
        zzflw zzflwVar = this.zzg;
        zzdabVar.zzi(zzflwVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzhcy.zza(new zzewz(this.zza, bundle, str, this.zzc, this.zzh, zzflwVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 12;
    }
}
