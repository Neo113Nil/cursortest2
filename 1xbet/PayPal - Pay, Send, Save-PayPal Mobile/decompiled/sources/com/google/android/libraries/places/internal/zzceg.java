package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzceg extends com.google.android.libraries.places.internal.zzbkc {
    final /* synthetic */ com.google.android.libraries.places.internal.zzceh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzceg(com.google.android.libraries.places.internal.zzceh zzcehVar, com.google.android.libraries.places.internal.zzbix zzbixVar) {
        super(zzbixVar);
        java.util.Objects.requireNonNull(zzcehVar);
        this.zza = zzcehVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbkd, com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzbmgVar.zzf(this.zza.zzb());
        zzf().zza(zzbiwVar, zzbmgVar);
    }
}
