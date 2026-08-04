package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class zzdie {
    private final zzdqq zza;

    public zzdie(zzdqq zzdqqVar) {
        this.zza = zzdqqVar;
    }

    public final void zza(View view, zzfaf zzfafVar) {
        String str;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmP)).booleanValue() || view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                str = "1";
                zzdqp zzdqpVarZza = this.zza.zza();
                zzdqpVarZza.zzb("action", "hcp");
                zzdqpVarZza.zzb("hcp", str);
                zzdqpVarZza.zzc(zzfafVar);
                zzdqpVarZza.zzj();
            }
        }
        str = "0";
        zzdqp zzdqpVarZza2 = this.zza.zza();
        zzdqpVarZza2.zzb("action", "hcp");
        zzdqpVarZza2.zzb("hcp", str);
        zzdqpVarZza2.zzc(zzfafVar);
        zzdqpVarZza2.zzj();
    }
}
