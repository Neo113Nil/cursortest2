package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhi implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhj zza;
    private final java.lang.String zzb;

    zzhi(com.google.android.gms.measurement.internal.zzhj zzhjVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzhjVar);
        this.zza = zzhjVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzaV().zze().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbq zzb = com.google.android.gms.internal.measurement.zzbp.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzaV().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zza;
            zzibVar.zzaV().zzk().zza("Install Referrer Service connected");
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzhh(this, zzb, this));
        } catch (java.lang.RuntimeException e) {
            this.zza.zza.zzaV().zze().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
    }

    final /* synthetic */ java.lang.String zza() {
        return this.zzb;
    }
}
