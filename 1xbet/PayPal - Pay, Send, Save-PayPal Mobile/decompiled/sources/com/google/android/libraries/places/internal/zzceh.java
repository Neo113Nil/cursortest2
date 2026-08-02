package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzceh implements com.google.android.libraries.places.internal.zzbiy {
    private final com.google.android.libraries.places.internal.zzbmg zza;

    zzceh(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbmg) com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "extraHeaders");
    }

    @Override // com.google.android.libraries.places.internal.zzbiy
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbit zzbitVar) {
        return new com.google.android.libraries.places.internal.zzceg(this, zzbitVar.zza(zzbmlVar, zzbisVar));
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzb() {
        return this.zza;
    }
}
