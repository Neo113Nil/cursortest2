package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzt extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzr zza;

    public zzt(com.google.android.gms.internal.measurement.zzr zzrVar) {
        super("internal.logger");
        this.zza = zzrVar;
        this.zze.put("log", new com.google.android.gms.internal.measurement.zzs(this, false, true));
        this.zze.put(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT, new com.google.android.gms.internal.measurement.zzp(this, androidx.core.app.NotificationCompat.GROUP_KEY_SILENT));
        ((com.google.android.gms.internal.measurement.zzai) this.zze.get(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT)).zzm("log", new com.google.android.gms.internal.measurement.zzs(this, true, true));
        this.zze.put("unmonitored", new com.google.android.gms.internal.measurement.zzq(this, "unmonitored"));
        ((com.google.android.gms.internal.measurement.zzai) this.zze.get("unmonitored")).zzm("log", new com.google.android.gms.internal.measurement.zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.zzr zzb() {
        return this.zza;
    }
}
