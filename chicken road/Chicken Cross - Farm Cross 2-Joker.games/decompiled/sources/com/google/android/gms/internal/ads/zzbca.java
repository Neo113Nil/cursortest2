package com.google.android.gms.internal.ads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbca implements zzgac {
    private final zzfyk zza;
    private final zzfyy zzb;
    private final zzbcn zzc;
    private final zzbbz zzd;
    private final zzbbj zze;
    private final zzbcp zzf;
    private final zzbch zzg;
    private final zzbby zzh;

    zzbca(zzfyk zzfykVar, zzfyy zzfyyVar, zzbcn zzbcnVar, zzbbz zzbbzVar, zzbbj zzbbjVar, zzbcp zzbcpVar, zzbch zzbchVar, zzbby zzbbyVar) {
        this.zza = zzfykVar;
        this.zzb = zzfyyVar;
        this.zzc = zzbcnVar;
        this.zzd = zzbbzVar;
        this.zze = zzbbjVar;
        this.zzf = zzbcpVar;
        this.zzg = zzbchVar;
        this.zzh = zzbbyVar;
    }

    private final Map zzf() {
        HashMap hashMap = new HashMap();
        zzfyk zzfykVar = this.zza;
        zzaza zzb = this.zzb.zzb();
        hashMap.put("v", zzfykVar.zza());
        hashMap.put("gms", Boolean.valueOf(zzfykVar.zzc()));
        hashMap.put("gv", Long.valueOf(zzb.zzd()));
        hashMap.put("int", zzb.zzb());
        hashMap.put("attts", Long.valueOf(zzb.zzh().zzb()));
        hashMap.put("att", zzb.zzh().zzd());
        hashMap.put("attkid", zzb.zzh().zzc());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzbch zzbchVar = this.zzg;
        hashMap.put("tcq", Long.valueOf(zzbchVar.zze()));
        hashMap.put("tpq", Long.valueOf(zzbchVar.zzd()));
        hashMap.put("tcv", Long.valueOf(zzbchVar.zzf()));
        hashMap.put("tpv", Long.valueOf(zzbchVar.zzg()));
        hashMap.put("tchv", Long.valueOf(zzbchVar.zzi()));
        hashMap.put("tphv", Long.valueOf(zzbchVar.zzh()));
        hashMap.put("tcc", Long.valueOf(zzbchVar.zzj()));
        hashMap.put("tpc", Long.valueOf(zzbchVar.zzk()));
        zzbbj zzbbjVar = this.zze;
        if (zzbbjVar != null) {
            hashMap.put("nt", Long.valueOf(zzbbjVar.zzc()));
        }
        zzbcp zzbcpVar = this.zzf;
        hashMap.put("vs", Long.valueOf(zzbcpVar.zzc()));
        hashMap.put("vf", Long.valueOf(zzbcpVar.zzd()));
        return hashMap;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzc() {
        Map zzf = zzf();
        zzf.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, this.zzh.zzb());
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzd() {
        zzbcn zzbcnVar = this.zzc;
        Map zzf = zzf();
        zzf.put("lts", Long.valueOf(zzbcnVar.zzc()));
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
