package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzm implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.playcore_age_signals.zzo zza;

    /* synthetic */ zzm(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar, com.google.android.gms.internal.playcore_age_signals.zzn zznVar) {
        java.util.Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar;
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzoVar.zzc().post(new com.google.android.gms.internal.playcore_age_signals.zzk(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar;
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzoVar.zzc().post(new com.google.android.gms.internal.playcore_age_signals.zzl(this));
    }
}
