package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.P;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzemb implements zzesh {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcrm zze;
    private final zzfch zzf;
    private final zzfba zzg;
    private final L zzh = o.f1952C.f1961g.zzi();
    private final zzdqk zzi;
    private final zzcrz zzj;

    public zzemb(Context context, String str, String str2, zzcrm zzcrmVar, zzfch zzfchVar, zzfba zzfbaVar, zzdqk zzdqkVar, zzcrz zzcrzVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcrmVar;
        this.zzf = zzfchVar;
        this.zzg = zzfbaVar;
        this.zzi = zzdqkVar;
        this.zzj = zzcrzVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        Bundle bundle = new Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue()) {
            zzdqk zzdqkVar = this.zzi;
            o.f1952C.j.getClass();
            zzdqkVar.zzd("tsacc", String.valueOf(System.currentTimeMillis() - this.zzd));
            this.zzi.zzd("foreground", true != P.f(this.zza) ? "1" : "0");
        }
        this.zze.zzk(this.zzg.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgbc.zzh(new zzemc(this.zza, bundle, this.zzb, this.zzc, this.zzh, this.zzg.zzf, this.zzj));
    }
}
