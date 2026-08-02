package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzuj extends zzue {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzuj(zzbn zzbnVar, Object obj, Object obj2) {
        super(zzbnVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzuj zzq(zzap zzapVar) {
        return new zzuj(new zzuk(zzapVar), zzbm.zza, zzc);
    }

    public static zzuj zzr(zzbn zzbnVar, Object obj, Object obj2) {
        return new zzuj(zzbnVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        this.zzb.zzd(i7, zzblVar, z4);
        Object obj = zzblVar.zzb;
        int i8 = zzen.zza;
        if (Objects.equals(obj, this.zze) && z4) {
            zzblVar.zzb = zzc;
        }
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i7, zzbm zzbmVar, long j) {
        this.zzb.zze(i7, zzbmVar, j);
        Object obj = zzbmVar.zzb;
        int i8 = zzen.zza;
        if (Objects.equals(obj, this.zzd)) {
            zzbmVar.zzb = zzbm.zza;
        }
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i7) {
        Object zzf = this.zzb.zzf(i7);
        int i8 = zzen.zza;
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzuj zzp(zzbn zzbnVar) {
        return new zzuj(zzbnVar, this.zzd, this.zze);
    }
}
