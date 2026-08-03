package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzsd extends com.google.android.gms.internal.consent_sdk.zzsi {
    zzsd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsi
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry zzg = zzg(i);
                if (((com.google.android.gms.internal.consent_sdk.zzqe) ((com.google.android.gms.internal.consent_sdk.zzse) zzg).zza()).zze()) {
                    zzg.setValue(java.util.Collections.unmodifiableList((java.util.List) zzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzd()) {
                if (((com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey()).zze()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
