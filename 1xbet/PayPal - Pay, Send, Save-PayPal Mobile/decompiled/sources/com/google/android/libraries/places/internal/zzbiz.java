package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbiz extends com.google.android.libraries.places.internal.zzbit {
    private final com.google.android.libraries.places.internal.zzbit zza;
    private final com.google.android.libraries.places.internal.zzbiy zzb;

    /* synthetic */ zzbiz(com.google.android.libraries.places.internal.zzbit zzbitVar, com.google.android.libraries.places.internal.zzbiy zzbiyVar, byte[] bArr) {
        this.zza = zzbitVar;
        this.zzb = (com.google.android.libraries.places.internal.zzbiy) com.google.common.base.Preconditions.checkNotNull(zzbiyVar, "interceptor");
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        return this.zzb.zza(zzbmlVar, zzbisVar, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final java.lang.String zzb() {
        return this.zza.zzb();
    }
}
