package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzp extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ android.os.IBinder zza;
    final /* synthetic */ com.google.android.play.core.review.internal.zzs zzb;

    zzp(com.google.android.play.core.review.internal.zzs zzsVar, android.os.IBinder iBinder) {
        this.zzb = zzsVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        java.util.List list;
        java.util.List list2;
        this.zzb.zza.zzn = com.google.android.play.core.review.internal.zze.zzb(this.zza);
        com.google.android.play.core.review.internal.zzt.zzn(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
