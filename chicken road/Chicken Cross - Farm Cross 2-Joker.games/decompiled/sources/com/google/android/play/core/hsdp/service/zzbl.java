package com.google.android.play.core.hsdp.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzbl implements ServiceConnection {
    final /* synthetic */ zzbn zza;

    /* synthetic */ zzbl(zzbn zzbnVar, zzbm zzbmVar) {
        Objects.requireNonNull(zzbnVar);
        this.zza = zzbnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.zza.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzbj
            @Override // java.lang.Runnable
            public final void run() {
                zzba zzbaVar;
                List list;
                List list2;
                List list3;
                IInterface iInterface;
                IBinder.DeathRecipient deathRecipient;
                zzbl zzblVar = zzbl.this;
                zzbn zzbnVar = zzblVar.zza;
                zzbaVar = zzbnVar.zzh;
                zzbnVar.zzk = (IInterface) zzbaVar.zza(iBinder);
                Log.i("ServiceConnMgrImpl", "notifyOnConnected");
                zzbn.zzp(zzbnVar);
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "linkToDeath");
                }
                try {
                    iInterface = zzbnVar.zzk;
                } catch (RemoteException e) {
                    Log.e("ServiceConnMgrImpl", "linkToDeath failed", e);
                }
                if (iInterface == null) {
                    throw null;
                }
                IInterface iInterface2 = iInterface;
                IBinder asBinder = iInterface.asBinder();
                deathRecipient = zzbnVar.zzi;
                asBinder.linkToDeath(deathRecipient, 0);
                zzbn zzbnVar2 = zzblVar.zza;
                zzbnVar2.zzf = false;
                list = zzbnVar2.zzd;
                synchronized (list) {
                    list2 = zzbnVar2.zzd;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list3 = zzbnVar2.zzd;
                    list3.clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.zza.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                IInterface iInterface;
                IInterface iInterface2;
                IBinder.DeathRecipient deathRecipient;
                zzbn zzbnVar = zzbl.this.zza;
                iInterface = zzbnVar.zzk;
                if (iInterface != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    iInterface2 = zzbnVar.zzk;
                    iInterface2.getClass();
                    IBinder asBinder = iInterface2.asBinder();
                    deathRecipient = zzbnVar.zzi;
                    asBinder.unlinkToDeath(deathRecipient, 0);
                    zzbnVar.zzk = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    zzbnVar.zzs();
                }
                zzbnVar.zzf = false;
            }
        });
    }
}
