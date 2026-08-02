package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxq extends zzya implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxq(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9) {
        super(i7, zzboVar, i8);
        this.zze = zzln.zza(i9, zzxtVar.zzR) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxq zzxqVar) {
        return Integer.compare(this.zzf, zzxqVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        return false;
    }
}
