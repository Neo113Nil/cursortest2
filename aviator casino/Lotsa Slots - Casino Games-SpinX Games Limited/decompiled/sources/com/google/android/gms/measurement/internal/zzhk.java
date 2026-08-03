package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhk {
    private final com.google.android.gms.measurement.internal.zzhk.zza zza;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
    public interface zza {
        void doStartService(android.content.Context context, android.content.Intent intent);
    }

    public zzhk(com.google.android.gms.measurement.internal.zzhk.zza zzaVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    public final void zza(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzib zzy = com.google.android.gms.measurement.internal.zzib.zzy(context, null, null);
        com.google.android.gms.measurement.internal.zzgt zzaV = zzy.zzaV();
        if (intent == null) {
            zzaV.zze().zza("Receiver called with null intent");
            return;
        }
        zzy.zzaU();
        java.lang.String action = intent.getAction();
        zzaV.zzk().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzaV.zze().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzaV.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        }
    }
}
