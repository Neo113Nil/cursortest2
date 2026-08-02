package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
class zzbsp extends com.google.android.libraries.places.internal.zzbmy {
    private final com.google.android.libraries.places.internal.zzbmy zzb;

    zzbsp(com.google.android.libraries.places.internal.zzbmy zzbmyVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbmyVar, "delegate can not be null");
        this.zzb = zzbmyVar;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", this.zzb).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public void zzb(com.google.android.libraries.places.internal.zzbmu zzbmuVar) {
        this.zzb.zzb(zzbmuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public void zzc() {
        this.zzb.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final void zzd() {
        this.zzb.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final java.lang.String zza() {
        return this.zzb.zza();
    }
}
