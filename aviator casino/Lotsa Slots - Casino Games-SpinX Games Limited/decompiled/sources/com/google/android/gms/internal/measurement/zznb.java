package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznb implements com.google.android.gms.internal.measurement.zznj {
    private final com.google.android.gms.internal.measurement.zznj[] zza;

    zznb(com.google.android.gms.internal.measurement.zznj... zznjVarArr) {
        this.zza = zznjVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final com.google.android.gms.internal.measurement.zzni zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.measurement.zznj zznjVar = this.zza[i];
            if (zznjVar.zzb(cls)) {
                return zznjVar.zzc(cls);
            }
        }
        java.lang.String name = cls.getName();
        java.lang.String.valueOf(name);
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(name)));
    }
}
