package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdla {
    private final Executor zza;
    private final zzcmu zzb;
    private final zzdcj zzc;
    private final zzcln zzd;

    public zzdla(Executor executor, zzcmu zzcmuVar, zzdcj zzdcjVar, zzcln zzclnVar) {
        this.zza = executor;
        this.zzc = zzdcjVar;
        this.zzb = zzcmuVar;
        this.zzd = zzclnVar;
    }

    public final void zzc(final zzceb zzcebVar) {
        if (zzcebVar == null) {
            return;
        }
        this.zzc.zza(zzcebVar.zzF());
        this.zzc.zzo(new zzaxx() { // from class: com.google.android.gms.internal.ads.zzdkw
            @Override // com.google.android.gms.internal.ads.zzaxx
            public final void zzdn(zzaxw zzaxwVar) {
                zzcft zzN = zzceb.this.zzN();
                Rect rect = zzaxwVar.zzd;
                zzN.zzr(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaxx() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // com.google.android.gms.internal.ads.zzaxx
            public final void zzdn(zzaxw zzaxwVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzaxwVar.zzj ? "0" : "1");
                zzceb.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcebVar);
        zzcft zzN = zzcebVar.zzN();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkf)).booleanValue() && zzN != null) {
            zzN.zzL(this.zzd);
            zzN.zzM(this.zzd, null, null);
        }
        zzcebVar.zzag("/trackActiveViewUnit", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdla.this.zzb.zzd();
            }
        });
        zzcebVar.zzag("/untrackActiveViewUnit", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdla.this.zzb.zzb();
            }
        });
    }
}
