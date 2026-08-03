package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgsc implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgsi zza;

    /* synthetic */ zzgsc(com.google.android.gms.internal.ads.zzgsi zzgsiVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzgsiVar);
        this.zza = zzgsiVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        java.lang.Object[] objArr = {componentName};
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        zzgsiVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        zzgsiVar.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgsb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgqm zzb = com.google.android.gms.internal.ads.zzgql.zzb(iBinder);
                com.google.android.gms.internal.ads.zzgsc zzgscVar = com.google.android.gms.internal.ads.zzgsc.this;
                com.google.android.gms.internal.ads.zzgsi zzgsiVar2 = zzgscVar.zza;
                zzgsiVar2.zzn(zzb);
                zzgsiVar2.zzi().zza("linkToDeath", new java.lang.Object[0]);
                try {
                    android.os.IInterface zzm = zzgsiVar2.zzm();
                    zzm.getClass();
                    android.os.IInterface iInterface = zzm;
                    zzm.asBinder().linkToDeath(zzgsiVar2.zzl(), 0);
                } catch (android.os.RemoteException e) {
                    zzgscVar.zza.zzi().zzd(e, "linkToDeath failed", new java.lang.Object[0]);
                }
                com.google.android.gms.internal.ads.zzgsi zzgsiVar3 = zzgscVar.zza;
                zzgsiVar3.zzk(false);
                synchronized (zzgsiVar3.zzj()) {
                    java.util.Iterator it = zzgsiVar3.zzj().iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                    zzgsiVar3.zzj().clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.lang.Object[] objArr = {componentName};
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        zzgsiVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        zzgsiVar.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgsa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgsi zzgsiVar2 = com.google.android.gms.internal.ads.zzgsc.this.zza;
                zzgsiVar2.zzi().zza("unlinkToDeath", new java.lang.Object[0]);
                android.os.IInterface zzm = zzgsiVar2.zzm();
                zzm.getClass();
                zzm.asBinder().unlinkToDeath(zzgsiVar2.zzl(), 0);
                zzgsiVar2.zzn(null);
                zzgsiVar2.zzk(false);
            }
        });
    }
}
