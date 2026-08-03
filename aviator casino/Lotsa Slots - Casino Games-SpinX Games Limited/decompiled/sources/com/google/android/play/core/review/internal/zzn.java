package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzn extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ com.google.android.play.core.review.internal.zzt zza;

    zzn(com.google.android.play.core.review.internal.zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        android.os.IInterface iInterface;
        com.google.android.play.core.review.internal.zzi zziVar;
        android.content.Context context;
        android.content.ServiceConnection serviceConnection;
        com.google.android.play.core.review.internal.zzt zztVar = this.zza;
        iInterface = zztVar.zzn;
        if (iInterface != null) {
            zziVar = zztVar.zzc;
            zziVar.zzd("Unbind from service.", new java.lang.Object[0]);
            com.google.android.play.core.review.internal.zzt zztVar2 = this.zza;
            context = zztVar2.zzb;
            serviceConnection = zztVar2.zzm;
            context.unbindService(serviceConnection);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
