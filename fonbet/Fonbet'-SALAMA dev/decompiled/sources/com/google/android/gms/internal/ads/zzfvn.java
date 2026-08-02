package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzfvn extends zzfvb {
    final /* synthetic */ zzfvq zza;
    private final Object zzb;
    private int zzc;

    public zzfvn(zzfvq zzfvqVar, int i7) {
        this.zza = zzfvqVar;
        this.zzb = zzfvq.zzg(zzfvqVar, i7);
        this.zzc = i7;
    }

    private final void zza() {
        int zzw;
        int i7 = this.zzc;
        if (i7 == -1 || i7 >= this.zza.size() || !zzfte.zza(this.zzb, zzfvq.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            return null;
        }
        return zzfvq.zzj(this.zza, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzfvb, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfvq zzfvqVar = this.zza;
        Object zzj = zzfvq.zzj(zzfvqVar, i7);
        zzfvq.zzn(zzfvqVar, this.zzc, obj);
        return zzj;
    }
}
