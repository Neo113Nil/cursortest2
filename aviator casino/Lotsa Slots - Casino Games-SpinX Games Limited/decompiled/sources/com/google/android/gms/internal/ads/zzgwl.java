package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwl extends com.google.android.gms.internal.ads.zzgwm {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgwm zzc;

    zzgwl(com.google.android.gms.internal.ads.zzgwm zzgwmVar, int i, int i2) {
        java.util.Objects.requireNonNull(zzgwmVar);
        this.zzc = zzgwmVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final java.lang.Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    /* renamed from: zzh */
    public final com.google.android.gms.internal.ads.zzgwm subList(int i, int i2) {
        com.google.android.gms.internal.ads.zzgtj.zzo(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
