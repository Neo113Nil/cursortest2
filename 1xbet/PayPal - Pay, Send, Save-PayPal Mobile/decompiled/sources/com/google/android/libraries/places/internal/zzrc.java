package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzrc extends com.google.android.libraries.places.internal.zzqx {
    private final com.google.android.libraries.places.internal.zzro zza;

    zzrc(java.lang.String str, java.util.UUID uuid, java.lang.String str2, com.google.android.libraries.places.internal.zzro zzroVar, com.google.android.libraries.places.internal.zzrt zzrtVar) {
        super("<skip trace>", uuid, str2, zzrtVar);
        com.google.common.base.Preconditions.checkArgument(zzroVar.zze());
        this.zza = zzroVar;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final com.google.android.libraries.places.internal.zzro zzg() {
        return com.google.android.libraries.places.internal.zzro.zza(this.zza, zzj());
    }
}
