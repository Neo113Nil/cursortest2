package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzmc implements com.google.android.libraries.places.internal.zzmm {
    private android.content.Context zza;
    private com.google.android.libraries.places.internal.zzmp zzb;
    private com.google.android.libraries.places.internal.zzmz zzc;

    @Override // com.google.android.libraries.places.internal.zzmm
    public final com.google.android.libraries.places.internal.zzmn zza() {
        com.google.android.libraries.places.internal.zzbig.zzb(this.zza, android.content.Context.class);
        com.google.android.libraries.places.internal.zzbig.zzb(this.zzb, com.google.android.libraries.places.internal.zzmp.class);
        com.google.android.libraries.places.internal.zzbig.zzb(this.zzc, com.google.android.libraries.places.internal.zzmz.class);
        return new com.google.android.libraries.places.internal.zzmd(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzmm
    public final /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzmm zzb(com.google.android.libraries.places.internal.zzmz zzmzVar) {
        this.zzc = zzmzVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmm
    public final /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzmm zzc(com.google.android.libraries.places.internal.zzmp zzmpVar) {
        this.zzb = zzmpVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmm
    public final /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzmm zzd(android.content.Context context) {
        this.zza = context;
        return this;
    }

    /* synthetic */ zzmc(byte[] bArr) {
    }

    private zzmc() {
        throw null;
    }
}
