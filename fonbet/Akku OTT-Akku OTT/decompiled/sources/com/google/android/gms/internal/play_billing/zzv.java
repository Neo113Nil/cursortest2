package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class zzv {
    @NonNull
    public static zzeu zza(@NonNull com.android.billingclient.api.zzbs zzbsVar) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = zzbsVar.getClass();
        try {
            zzrVar.zza = zzbsVar.zza(zzrVar);
            return zzuVar;
        } catch (Exception e) {
            zzuVar.zzc(e);
            return zzuVar;
        }
    }
}
