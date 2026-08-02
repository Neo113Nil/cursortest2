package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbeo implements com.google.android.libraries.places.internal.zzbev {
    private final com.google.android.libraries.places.internal.zzbev[] zza;

    @Override // com.google.android.libraries.places.internal.zzbev
    public final boolean zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbev
    public final com.google.android.libraries.places.internal.zzbeu zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.libraries.places.internal.zzbev zzbevVar = this.zza[i];
            if (zzbevVar.zzb(cls)) {
                return zzbevVar.zzc(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    zzbeo(com.google.android.libraries.places.internal.zzbev... zzbevVarArr) {
        this.zza = zzbevVarArr;
    }
}
