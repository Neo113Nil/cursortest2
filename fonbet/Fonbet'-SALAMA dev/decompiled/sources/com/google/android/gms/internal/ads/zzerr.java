package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerr implements zzesh {
    private final zzbxm zza;
    private final zzgbn zzb;
    private final Context zzc;

    public zzerr(zzbxm zzbxmVar, zzgbn zzgbnVar, Context context) {
        this.zza = zzbxmVar;
        this.zzb = zzgbnVar;
        this.zzc = context;
    }

    public static zzers zzc(zzerr zzerrVar) {
        if (!zzerrVar.zza.zzp(zzerrVar.zzc)) {
            return new zzers(null, null, null, null, null);
        }
        String zze = zzerrVar.zza.zze(zzerrVar.zzc);
        String str = zze == null ? "" : zze;
        String zzc = zzerrVar.zza.zzc(zzerrVar.zzc);
        String str2 = zzc == null ? "" : zzc;
        String zzb = zzerrVar.zza.zzb(zzerrVar.zzc);
        String str3 = zzb == null ? "" : zzb;
        String str4 = true != zzerrVar.zza.zzp(zzerrVar.zzc) ? null : "fa";
        return new zzers(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) C0254t.f2723d.f2726c.zzb(zzbby.zzaw) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerr.zzc(zzerr.this);
            }
        });
    }
}
