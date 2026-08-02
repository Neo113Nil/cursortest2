package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.View;

/* loaded from: classes.dex */
public final class zzaxb extends zzaxe {
    private final View zzh;

    public zzaxb(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, View view) {
        super(zzavrVar, "qdXdYKGIDEc2nBTvoPjz+CgR+4W5sp2yvVwp3UKT3AUX5lHNEM0A4zI5MI07tN9G", "GvtK8JGCkHfavcPlTIA1koV/bSO3r4QwG/aY/ttYw/o=", zzarrVar, i7, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        if (this.zzh != null) {
            zzbbp zzbbpVar = zzbby.zzdD;
            C0254t c0254t = C0254t.f2723d;
            Boolean bool = (Boolean) c0254t.f2726c.zzb(zzbbpVar);
            Boolean bool2 = (Boolean) c0254t.f2726c.zzb(zzbby.zzkW);
            zzavv zzavvVar = new zzavv((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzask zza = zzasl.zza();
            zza.zzb(zzavvVar.zza.longValue());
            zza.zzd(zzavvVar.zzb.longValue());
            zza.zze(zzavvVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzavvVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzavvVar.zzd.longValue());
            }
            this.zzd.zzW((zzasl) zza.zzbr());
        }
    }
}
