package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzlq {
    static final com.google.android.gms.internal.measurement.zzlq zza = new com.google.android.gms.internal.measurement.zzlq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile com.google.android.gms.internal.measurement.zzlq zzd;
    private final java.util.Map zze;

    zzlq() {
        this.zze = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.measurement.zzlq zza() {
        com.google.android.gms.internal.measurement.zzlq zzlqVar = zzd;
        if (zzlqVar != null) {
            return zzlqVar;
        }
        synchronized (com.google.android.gms.internal.measurement.zzlq.class) {
            com.google.android.gms.internal.measurement.zzlq zzlqVar2 = zzd;
            if (zzlqVar2 != null) {
                return zzlqVar2;
            }
            int i = com.google.android.gms.internal.measurement.zznt.zza;
            com.google.android.gms.internal.measurement.zzlq zzb2 = com.google.android.gms.internal.measurement.zzly.zzb(com.google.android.gms.internal.measurement.zzlq.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final com.google.android.gms.internal.measurement.zzmd zzb(com.google.android.gms.internal.measurement.zznl zznlVar, int i) {
        return (com.google.android.gms.internal.measurement.zzmd) this.zze.get(new com.google.android.gms.internal.measurement.zzlp(zznlVar, i));
    }

    zzlq(boolean z) {
        this.zze = java.util.Collections.emptyMap();
    }
}
