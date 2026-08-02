package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzbz extends com.google.android.gms.internal.fido.zzbu {
    private final com.google.android.gms.internal.fido.zzcc zza;

    zzbz(com.google.android.gms.internal.fido.zzcc zzccVar, int i) {
        super(zzccVar.size(), i);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
