package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzae implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzaf zza;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        zzuVar = this.zza.zzc;
        zzuVar.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        com.google.android.play.core.splitinstall.internal.zzaf zzafVar = this.zza;
        zzafVar.zzc().post(new com.google.android.play.core.splitinstall.internal.zzab(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        zzuVar = this.zza.zzc;
        zzuVar.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        com.google.android.play.core.splitinstall.internal.zzaf zzafVar = this.zza;
        zzafVar.zzc().post(new com.google.android.play.core.splitinstall.internal.zzac(this));
    }

    /* synthetic */ zzae(com.google.android.play.core.splitinstall.internal.zzaf zzafVar, com.google.android.play.core.splitinstall.internal.zzad zzadVar) {
        this.zza = zzafVar;
    }
}
