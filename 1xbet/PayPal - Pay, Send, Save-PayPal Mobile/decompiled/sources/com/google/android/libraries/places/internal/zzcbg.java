package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbg extends com.google.android.libraries.places.internal.zzbog {
    private static final com.google.android.libraries.places.internal.zzcff zzb = new com.google.android.libraries.places.internal.zzcff();
    private final com.google.android.libraries.places.internal.zzbml zzc;
    private final java.lang.String zzd;
    private final com.google.android.libraries.places.internal.zzcaa zze;
    private final java.lang.String zzf;
    private final com.google.android.libraries.places.internal.zzcbf zzg;
    private final com.google.android.libraries.places.internal.zzcbe zzh;
    private final com.google.android.libraries.places.internal.zzbio zzi;
    private final boolean zzj;

    zzcbg(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzcav zzcavVar, com.google.android.libraries.places.internal.zzcbp zzcbpVar, com.google.android.libraries.places.internal.zzccd zzccdVar, java.lang.Object obj, int i, int i2, java.lang.String str, java.lang.String str2, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar, com.google.android.libraries.places.internal.zzbis zzbisVar, boolean z) {
        super(new com.google.android.libraries.places.internal.zzcby(), zzcaaVar, zzcalVar, zzbmgVar, zzbisVar, false);
        this.zzh = new com.google.android.libraries.places.internal.zzcbe(this);
        this.zzj = false;
        this.zze = (com.google.android.libraries.places.internal.zzcaa) com.google.common.base.Preconditions.checkNotNull(zzcaaVar, "statsTraceCtx");
        this.zzc = zzbmlVar;
        this.zzf = str;
        this.zzd = str2;
        this.zzi = zzcbpVar.zzf();
        this.zzg = new com.google.android.libraries.places.internal.zzcbf(this, i, zzcaaVar, obj, zzcavVar, zzccdVar, zzcbpVar, i2, zzbmlVar.zzb(), zzbisVar);
    }

    final boolean zzA() {
        return false;
    }

    public final com.google.android.libraries.places.internal.zzbmj zzz() {
        return this.zzc.zza();
    }

    protected final com.google.android.libraries.places.internal.zzcbf zzy() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbog, com.google.android.libraries.places.internal.zzbok
    protected final /* synthetic */ com.google.android.libraries.places.internal.zzboj zzp() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbog
    protected final /* synthetic */ com.google.android.libraries.places.internal.zzbod zzg() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbog
    protected final /* synthetic */ com.google.android.libraries.places.internal.zzbof zze() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final com.google.android.libraries.places.internal.zzbio zzam() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcbf zzJ() {
        return this.zzg;
    }

    final /* synthetic */ java.lang.String zzI() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcaa zzH() {
        return this.zze;
    }

    final /* synthetic */ java.lang.String zzG() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbml zzF() {
        return this.zzc;
    }
}
