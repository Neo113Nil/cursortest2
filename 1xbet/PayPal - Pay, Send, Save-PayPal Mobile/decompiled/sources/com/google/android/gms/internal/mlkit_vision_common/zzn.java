package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzn extends com.google.android.gms.internal.mlkit_vision_common.zzh {
    private final com.google.android.gms.internal.mlkit_vision_common.zzp zza;

    zzn(com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar, int i) {
        super(zzpVar.size(), i);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzh
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
