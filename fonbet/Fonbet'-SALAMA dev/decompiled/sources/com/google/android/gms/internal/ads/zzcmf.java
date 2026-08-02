package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcmf {
    private final String zza;
    private final zzbnz zzb;
    private final Executor zzc;
    private zzcmk zzd;
    private final zzbiz zze = new zzcmc(this);
    private final zzbiz zzf = new zzcme(this);

    public zzcmf(String str, zzbnz zzbnzVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbnzVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcmf zzcmfVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcmfVar.zza);
    }

    public final void zzc(zzcmk zzcmkVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcmkVar;
    }

    public final void zzd(zzceb zzcebVar) {
        zzcebVar.zzag("/updateActiveView", this.zze);
        zzcebVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzceb zzcebVar) {
        zzcebVar.zzaz("/updateActiveView", this.zze);
        zzcebVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
