package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class zzcoq implements zzcvk {
    private final zzceb zza;
    private final zzdqq zzb;
    private final zzfaf zzc;

    public zzcoq(zzceb zzcebVar, zzdqq zzdqqVar, zzfaf zzfafVar) {
        this.zza = zzcebVar;
        this.zzb = zzdqqVar;
        this.zzc = zzfafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        zzceb zzcebVar;
        String str;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmP)).booleanValue() || (zzcebVar = this.zza) == null) {
            return;
        }
        for (ViewParent parent = zzcebVar.zzF().getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                str = "1";
                zzdqp zzdqpVarZza = this.zzb.zza();
                zzdqpVarZza.zzb("action", "hcp");
                zzdqpVarZza.zzb("hcp", str);
                zzdqpVarZza.zzc(this.zzc);
                zzdqpVarZza.zzj();
            }
        }
        str = "0";
        zzdqp zzdqpVarZza2 = this.zzb.zza();
        zzdqpVarZza2.zzb("action", "hcp");
        zzdqpVarZza2.zzb("hcp", str);
        zzdqpVarZza2.zzc(this.zzc);
        zzdqpVarZza2.zzj();
    }
}
