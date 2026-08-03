package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzs implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.play.core.review.internal.zzt zza;

    /* synthetic */ zzs(com.google.android.play.core.review.internal.zzt zztVar, com.google.android.play.core.review.internal.zzr zzrVar) {
        this.zza = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.play.core.review.internal.zzi zziVar;
        zziVar = this.zza.zzc;
        zziVar.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new com.google.android.play.core.review.internal.zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.play.core.review.internal.zzi zziVar;
        zziVar = this.zza.zzc;
        zziVar.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new com.google.android.play.core.review.internal.zzq(this));
    }
}
