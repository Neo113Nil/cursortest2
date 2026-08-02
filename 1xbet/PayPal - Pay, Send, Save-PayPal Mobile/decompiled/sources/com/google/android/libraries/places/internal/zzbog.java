package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbog extends com.google.android.libraries.places.internal.zzbok implements com.google.android.libraries.places.internal.zzbpl, com.google.android.libraries.places.internal.zzbwk {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbog.class.getName());
    private final com.google.android.libraries.places.internal.zzcal zzc;
    private final com.google.android.libraries.places.internal.zzbsq zzd;
    private final boolean zze;
    private com.google.android.libraries.places.internal.zzbmg zzf;
    private volatile boolean zzg;

    protected zzbog(com.google.android.libraries.places.internal.zzcan zzcanVar, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, boolean z) {
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        this.zzc = (com.google.android.libraries.places.internal.zzcal) com.google.common.base.Preconditions.checkNotNull(zzcalVar, "transportTracer");
        this.zze = !java.lang.Boolean.TRUE.equals(zzbisVar.zzi(com.google.android.libraries.places.internal.zzbsz.zzl));
        this.zzd = new com.google.android.libraries.places.internal.zzbwl(this, zzcanVar, zzcaaVar);
        this.zzf = zzbmgVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zza(com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = this.zzf;
        com.google.android.libraries.places.internal.zzbmc zzbmcVar = com.google.android.libraries.places.internal.zzbsz.zza;
        zzbmgVar.zzd(zzbmcVar);
        this.zzf.zzc(zzbmcVar, java.lang.Long.valueOf(zzbjvVar.zzc(java.util.concurrent.TimeUnit.NANOSECONDS)));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzb(int i) {
        this.zzd.zzf(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzc(int i) {
        zze().zzm(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzd(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        zze().zzi(zzbjyVar);
    }

    protected abstract com.google.android.libraries.places.internal.zzbof zze();

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        zze().zza(zzbpnVar);
        zzg().zza(this.zzf, null);
        this.zzf = null;
    }

    protected abstract com.google.android.libraries.places.internal.zzbod zzg();

    @Override // com.google.android.libraries.places.internal.zzbwk
    public final void zzj(com.google.android.libraries.places.internal.zzcam zzcamVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (zzcamVar == null && !z) {
            z3 = false;
        }
        com.google.common.base.Preconditions.checkArgument(z3, "null frame before EOS");
        zzg().zzb(zzcamVar, z, z2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzk() {
        if (zze().zzc()) {
            return;
        }
        zze().zzj();
        zzh().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "Should not cancel with OK status");
        this.zzg = true;
        zzg().zzc(zzbnpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbok, com.google.android.libraries.places.internal.zzcab
    public final boolean zzm() {
        return zzp().zzv() && !this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        zzbtfVar.zzb("remote_addr", zzam().zza(com.google.android.libraries.places.internal.zzbkg.zza));
    }

    @Override // com.google.android.libraries.places.internal.zzbok
    protected /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzboj zzp() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.libraries.places.internal.zzcal zzo() {
        return this.zzc;
    }

    public final boolean zzi() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbok
    protected final com.google.android.libraries.places.internal.zzbsq zzh() {
        return this.zzd;
    }
}
