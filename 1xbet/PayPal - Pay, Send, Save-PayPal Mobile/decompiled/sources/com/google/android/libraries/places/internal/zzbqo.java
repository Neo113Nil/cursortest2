package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqo extends com.google.android.libraries.places.internal.zzbqd {
    final com.google.android.libraries.places.internal.zzbiw zza;
    final com.google.android.libraries.places.internal.zzbnp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbqo(com.google.android.libraries.places.internal.zzbqu zzbquVar, com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        super(zzbquVar.zzj());
        java.util.Objects.requireNonNull(zzbquVar);
        this.zza = zzbiwVar;
        this.zzb = zzbnpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqd
    public final void zza() {
        this.zza.zzc(this.zzb, new com.google.android.libraries.places.internal.zzbmg());
    }
}
