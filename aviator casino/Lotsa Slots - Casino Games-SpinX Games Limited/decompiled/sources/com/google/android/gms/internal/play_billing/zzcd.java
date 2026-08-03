package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzcd {
    static final com.google.android.gms.internal.play_billing.zzcd zza = new com.google.android.gms.internal.play_billing.zzcd(true);
    private static volatile boolean zzb = false;
    private static volatile com.google.android.gms.internal.play_billing.zzcd zzc;
    private final java.util.Map zzd;

    zzcd() {
        this.zzd = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.play_billing.zzcq zzb(com.google.android.gms.internal.play_billing.zzec zzecVar, int i) {
        return (com.google.android.gms.internal.play_billing.zzcq) this.zzd.get(new com.google.android.gms.internal.play_billing.zzcc(zzecVar, i));
    }

    zzcd(boolean z) {
        this.zzd = java.util.Collections.emptyMap();
    }

    public static com.google.android.gms.internal.play_billing.zzcd zza() {
        com.google.android.gms.internal.play_billing.zzcd zzcdVar = zzc;
        if (zzcdVar != null) {
            return zzcdVar;
        }
        synchronized (com.google.android.gms.internal.play_billing.zzcd.class) {
            com.google.android.gms.internal.play_billing.zzcd zzcdVar2 = zzc;
            if (zzcdVar2 != null) {
                return zzcdVar2;
            }
            com.google.android.gms.internal.play_billing.zzcd zzb2 = com.google.android.gms.internal.play_billing.zzcl.zzb(com.google.android.gms.internal.play_billing.zzcd.class);
            zzc = zzb2;
            return zzb2;
        }
    }
}
