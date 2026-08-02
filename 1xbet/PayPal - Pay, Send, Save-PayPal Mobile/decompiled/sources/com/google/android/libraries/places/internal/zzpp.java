package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzpp implements com.google.android.libraries.places.internal.zzps {
    private android.content.Context zza;
    private com.google.android.libraries.places.internal.zzmy zzb;

    @Override // com.google.android.libraries.places.internal.zzps
    public final com.google.android.libraries.places.internal.zzpt zza() {
        com.google.android.libraries.places.internal.zzbig.zzb(this.zza, android.content.Context.class);
        com.google.android.libraries.places.internal.zzbig.zzb(this.zzb, com.google.android.libraries.places.internal.zzmy.class);
        return new com.google.android.libraries.places.internal.zzpq(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzps zzb(com.google.android.libraries.places.internal.zzmy zzmyVar) {
        this.zzb = zzmyVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzps zzc(android.content.Context context) {
        this.zza = context;
        return this;
    }

    /* synthetic */ zzpp(byte[] bArr) {
    }

    private zzpp() {
        throw null;
    }
}
