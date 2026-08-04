package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeu implements zzacv {
    private final zzed zza = new zzed(4);
    private final zzadw zzb = new zzadw(-1, -1, "image/avif");

    private final boolean zza(zzacw zzacwVar, int i7) {
        this.zza.zzI(4);
        ((zzack) zzacwVar).zzm(this.zza.zzN(), 0, 4, false);
        return this.zza.zzu() == ((long) i7);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        return this.zzb.zzb(zzacwVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zzb.zze(zzacyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzb.zzf(j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) throws EOFException, InterruptedIOException {
        ((zzack) zzacwVar).zzl(4, false);
        return zza(zzacwVar, 1718909296) && zza(zzacwVar, 1635150182);
    }
}
