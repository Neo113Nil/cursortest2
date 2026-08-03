package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzgh extends com.google.android.gms.internal.games_v2.zzgg {
    static final com.google.android.gms.internal.games_v2.zzgg zza = new com.google.android.gms.internal.games_v2.zzgh(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzgh(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.games_v2.zzfv.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgg, com.google.android.gms.internal.games_v2.zzgc
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgc
    final java.lang.Object[] zze() {
        return this.zzb;
    }
}
