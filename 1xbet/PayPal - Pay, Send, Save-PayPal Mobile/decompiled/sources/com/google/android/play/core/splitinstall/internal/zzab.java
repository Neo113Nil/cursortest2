package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzab extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ android.os.IBinder zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzae zzb;

    zzab(com.google.android.play.core.splitinstall.internal.zzae zzaeVar, android.os.IBinder iBinder) {
        this.zzb = zzaeVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        java.util.List list;
        java.util.List list2;
        this.zzb.zza.zzn = com.google.android.play.core.splitinstall.internal.zzbn.zzb(this.zza);
        com.google.android.play.core.splitinstall.internal.zzaf.zzq(this.zzb.zza);
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
