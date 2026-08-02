package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.ViewParent;

/* loaded from: classes.dex */
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
        ViewParent parent = zzcebVar.zzF().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzdqp zza = this.zzb.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", str);
        zza.zzc(this.zzc);
        zza.zzj();
    }
}
