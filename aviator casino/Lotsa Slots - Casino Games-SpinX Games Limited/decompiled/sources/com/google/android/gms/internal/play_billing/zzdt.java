package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzdt implements com.google.android.gms.internal.play_billing.zzea {
    private final com.google.android.gms.internal.play_billing.zzea[] zza;

    zzdt(com.google.android.gms.internal.play_billing.zzea... zzeaVarArr) {
        this.zza = zzeaVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final com.google.android.gms.internal.play_billing.zzdz zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.play_billing.zzea zzeaVar = this.zza[i];
            if (zzeaVar.zzc(cls)) {
                return zzeaVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final boolean zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
