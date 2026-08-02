package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzfq implements zzfx {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgc zzd;

    public zzfq(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
        zzgxVar.getClass();
        if (this.zzb.contains(zzgxVar)) {
            return;
        }
        this.zzb.add(zzgxVar);
        this.zzc++;
    }

    public final void zzg(int i7) {
        zzgc zzgcVar = this.zzd;
        int i8 = zzen.zza;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            ((zzgx) this.zzb.get(i9)).zza(this, zzgcVar, this.zza, i7);
        }
    }

    public final void zzh() {
        zzgc zzgcVar = this.zzd;
        int i7 = zzen.zza;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            ((zzgx) this.zzb.get(i8)).zzb(this, zzgcVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgc zzgcVar) {
        for (int i7 = 0; i7 < this.zzc; i7++) {
            ((zzgx) this.zzb.get(i7)).zzc(this, zzgcVar, this.zza);
        }
    }

    public final void zzj(zzgc zzgcVar) {
        this.zzd = zzgcVar;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            ((zzgx) this.zzb.get(i7)).zzd(this, zzgcVar, this.zza);
        }
    }
}
