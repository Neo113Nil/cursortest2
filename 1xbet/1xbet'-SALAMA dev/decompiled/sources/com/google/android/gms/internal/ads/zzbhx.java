package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import I2.J;
import J2.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzbhx implements zzbiz {
    public final /* synthetic */ zzdcp zza;
    public final /* synthetic */ zzcln zzb;

    public /* synthetic */ zzbhx(zzdcp zzdcpVar, zzcln zzclnVar) {
        this.zza = zzdcpVar;
        this.zzb = zzclnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        zzbiy.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            int i7 = J.f3546b;
            j.g("URL missing from click GMSG.");
            return;
        }
        final zzcln zzclnVar = this.zzb;
        zzgat zzgatVarZzu = zzgat.zzu(zzbiy.zza(zzcebVar, str));
        zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzbia
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj2) {
                zzcln zzclnVar2;
                String str2 = (String) obj2;
                zzbiz zzbizVar = zzbiy.zza;
                return (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && (zzclnVar2 = zzclnVar) != null && zzcln.zzj(str)) ? zzclnVar2.zze(str2, C0252s.f2717f.f2722e) : zzgbc.zzh(str2);
            }
        };
        zzgbn zzgbnVar = zzbza.zza;
        zzgbc.zzr((zzgat) zzgbc.zzn(zzgatVarZzu, zzgajVar, zzgbnVar), new zzbin(zzcebVar), zzgbnVar);
    }
}
