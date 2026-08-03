package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzk extends com.google.android.gms.internal.playcore_age_signals.zze {
    final /* synthetic */ android.os.IBinder zza;
    final /* synthetic */ com.google.android.gms.internal.playcore_age_signals.zzm zzb;

    zzk(com.google.android.gms.internal.playcore_age_signals.zzm zzmVar, android.os.IBinder iBinder) {
        this.zza = iBinder;
        java.util.Objects.requireNonNull(zzmVar);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        java.util.List list;
        java.util.List list2;
        com.google.android.play.agesignals.protocol.IAgeSignalsService asInterface = com.google.android.play.agesignals.protocol.IAgeSignalsService.Stub.asInterface(this.zza);
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzb.zza;
        zzoVar.zzn = asInterface;
        com.google.android.gms.internal.playcore_age_signals.zzo.zzr(zzoVar);
        zzoVar.zzh = false;
        list = zzoVar.zze;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        list2 = zzoVar.zze;
        list2.clear();
    }
}
