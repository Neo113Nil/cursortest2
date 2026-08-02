package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzad extends com.google.android.gms.internal.mlkit_common.zzv {
    private final com.google.android.gms.internal.mlkit_common.zzaf zza;

    zzad(com.google.android.gms.internal.mlkit_common.zzaf zzafVar, int i) {
        super(zzafVar.size(), i);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzv
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
