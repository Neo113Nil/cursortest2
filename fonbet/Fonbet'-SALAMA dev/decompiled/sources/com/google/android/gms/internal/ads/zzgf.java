package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgf implements zzfw {
    private zzgx zzb;
    private String zzc;
    private boolean zzf;
    private final zzgr zza = new zzgr();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgf zzb(boolean z4) {
        this.zzf = true;
        return this;
    }

    public final zzgf zzc(int i7) {
        this.zzd = i7;
        return this;
    }

    public final zzgf zzd(int i7) {
        this.zze = i7;
        return this;
    }

    public final zzgf zze(zzgx zzgxVar) {
        this.zzb = zzgxVar;
        return this;
    }

    public final zzgf zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgk zza() {
        zzgk zzgkVar = new zzgk(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgx zzgxVar = this.zzb;
        if (zzgxVar != null) {
            zzgkVar.zzf(zzgxVar);
        }
        return zzgkVar;
    }
}
