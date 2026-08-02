package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzafo implements zzacy {
    private final long zzb;
    private final zzacy zzc;

    public zzafo(long j, zzacy zzacyVar) {
        this.zzb = j;
        this.zzc = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzG() {
        this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzP(zzadu zzaduVar) {
        this.zzc.zzP(new zzafn(this, zzaduVar, zzaduVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzaeb zzw(int i7, int i8) {
        return this.zzc.zzw(i7, i8);
    }
}
