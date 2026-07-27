package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgtc implements ServiceConnection {
    final /* synthetic */ zzgti zza;

    /* synthetic */ zzgtc(zzgti zzgtiVar, byte[] bArr) {
        Objects.requireNonNull(zzgtiVar);
        this.zza = zzgtiVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgti zzgtiVar = this.zza;
        zzgtiVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgtiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgtb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface zzm;
                zzgrm zza = zzgrl.zza(iBinder);
                zzgtc zzgtcVar = zzgtc.this;
                zzgti zzgtiVar2 = zzgtcVar.zza;
                zzgtiVar2.zzn(zza);
                zzgtiVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    zzm = zzgtiVar2.zzm();
                } catch (RemoteException e) {
                    zzgtcVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
                }
                if (zzm == null) {
                    throw null;
                }
                IInterface iInterface = zzm;
                zzm.asBinder().linkToDeath(zzgtiVar2.zzl(), 0);
                zzgti zzgtiVar3 = zzgtcVar.zza;
                zzgtiVar3.zzk(false);
                synchronized (zzgtiVar3.zzj()) {
                    Iterator it = zzgtiVar3.zzj().iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzgtiVar3.zzj().clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgti zzgtiVar = this.zza;
        zzgtiVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgtiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgti zzgtiVar2 = zzgtc.this.zza;
                zzgtiVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface zzm = zzgtiVar2.zzm();
                zzm.getClass();
                zzm.asBinder().unlinkToDeath(zzgtiVar2.zzl(), 0);
                zzgtiVar2.zzn(null);
                zzgtiVar2.zzk(false);
            }
        });
    }
}
