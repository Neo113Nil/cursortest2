package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzer extends com.google.android.gms.internal.play_billing.zzfb {
    zzer(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                java.util.Map.Entry zzg = zzg(i);
                if (((com.google.android.gms.internal.play_billing.zzch) zzg.getKey()).zzg()) {
                    zzg.setValue(java.util.Collections.unmodifiableList((java.util.List) zzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzc()) {
                if (((com.google.android.gms.internal.play_billing.zzch) entry.getKey()).zzg()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
