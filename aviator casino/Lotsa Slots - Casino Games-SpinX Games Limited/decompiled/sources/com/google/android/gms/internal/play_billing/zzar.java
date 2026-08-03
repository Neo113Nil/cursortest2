package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzar extends com.google.android.gms.internal.play_billing.zzam {
    private final transient com.google.android.gms.internal.play_billing.zzal zza;
    private final transient com.google.android.gms.internal.play_billing.zzai zzb;

    zzar(com.google.android.gms.internal.play_billing.zzal zzalVar, com.google.android.gms.internal.play_billing.zzai zzaiVar) {
        this.zza = zzalVar;
        this.zzb = zzaiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam, com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzam, com.google.android.gms.internal.play_billing.zzaf
    public final com.google.android.gms.internal.play_billing.zzai zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam, com.google.android.gms.internal.play_billing.zzaf
    /* renamed from: zze */
    public final com.google.android.gms.internal.play_billing.zzav iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    final boolean zzf() {
        throw null;
    }
}
