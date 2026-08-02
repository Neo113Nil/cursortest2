package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzfsf implements ServiceConnection {
    final /* synthetic */ zzfsh zza;

    public /* synthetic */ zzfsf(zzfsh zzfshVar, zzfsg zzfsgVar) {
        this.zza = zzfshVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfsi zzfsiVar;
        zzfsiVar = this.zza.zzc;
        zzfsiVar.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // java.lang.Runnable
            public final void run() {
                zzfsi zzfsiVar2;
                zzfsi zzfsiVar3;
                List list;
                List list2;
                List list3;
                IInterface iInterface;
                IBinder.DeathRecipient deathRecipient;
                zzfqh zzb = zzfqg.zzb(iBinder);
                zzfsf zzfsfVar = zzfsf.this;
                zzfsfVar.zza.zzj = zzb;
                zzfsiVar2 = zzfsfVar.zza.zzc;
                zzfsiVar2.zzc("linkToDeath", new Object[0]);
                try {
                    iInterface = zzfsfVar.zza.zzj;
                } catch (RemoteException e7) {
                    zzfsiVar3 = zzfsfVar.zza.zzc;
                    zzfsiVar3.zzb(e7, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                IBinder asBinder = iInterface.asBinder();
                deathRecipient = zzfsfVar.zza.zzh;
                asBinder.linkToDeath(deathRecipient, 0);
                zzfsfVar.zza.zzf = false;
                list = zzfsfVar.zza.zze;
                synchronized (list) {
                    try {
                        list2 = zzfsfVar.zza.zze;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        list3 = zzfsfVar.zza.zze;
                        list3.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfsi zzfsiVar;
        zzfsiVar = this.zza.zzc;
        zzfsiVar.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfse
            @Override // java.lang.Runnable
            public final void run() {
                zzfsi zzfsiVar2;
                IInterface iInterface;
                IBinder.DeathRecipient deathRecipient;
                zzfsf zzfsfVar = zzfsf.this;
                zzfsiVar2 = zzfsfVar.zza.zzc;
                zzfsiVar2.zzc("unlinkToDeath", new Object[0]);
                iInterface = zzfsfVar.zza.zzj;
                iInterface.getClass();
                IBinder asBinder = iInterface.asBinder();
                deathRecipient = zzfsfVar.zza.zzh;
                asBinder.unlinkToDeath(deathRecipient, 0);
                zzfsfVar.zza.zzj = null;
                zzfsfVar.zza.zzf = false;
            }
        });
    }
}
