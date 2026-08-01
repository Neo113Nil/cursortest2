package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhz implements zzhr {
    private zziq zzb;
    private String zzc;
    private boolean zzf;
    private final zzik zza = new zzik();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhz zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzhz zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzhz zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzhz zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzhz zzf(zziq zziqVar) {
        this.zzb = zziqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzid zza() {
        zzid zzidVar = new zzid(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zziq zziqVar = this.zzb;
        if (zziqVar != null) {
            zzidVar.zze(zziqVar);
        }
        return zzidVar;
    }
}
