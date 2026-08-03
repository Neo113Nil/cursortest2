package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzgf extends com.google.android.gms.internal.games_v2.zzgg {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.games_v2.zzgg zzc;

    zzgf(com.google.android.gms.internal.games_v2.zzgg zzggVar, int i, int i2) {
        this.zzc = zzggVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.games_v2.zzfv.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgg, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.games_v2.zzgg
    /* renamed from: zzf */
    public final com.google.android.gms.internal.games_v2.zzgg subList(int i, int i2) {
        com.google.android.gms.internal.games_v2.zzfv.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
