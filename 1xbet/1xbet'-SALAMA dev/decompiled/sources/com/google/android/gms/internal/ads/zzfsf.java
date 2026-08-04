package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfsf implements ServiceConnection {
    final /* synthetic */ zzfsh zza;

    public /* synthetic */ zzfsf(zzfsh zzfshVar, zzfsg zzfsgVar) {
        this.zza = zzfshVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // java.lang.Runnable
            public final void run() {
                zzfqh zzfqhVarZzb = zzfqg.zzb(iBinder);
                zzfsf zzfsfVar = this.zza;
                zzfsfVar.zza.zzj = zzfqhVarZzb;
                zzfsfVar.zza.zzc.zzc("linkToDeath", new Object[0]);
                try {
                    IInterface iInterface = zzfsfVar.zza.zzj;
                    if (iInterface == null) {
                        throw null;
                    }
                    iInterface.asBinder().linkToDeath(zzfsfVar.zza.zzh, 0);
                    zzfsfVar.zza.zzf = false;
                    synchronized (zzfsfVar.zza.zze) {
                        try {
                            Iterator it = zzfsfVar.zza.zze.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            zzfsfVar.zza.zze.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e7) {
                    zzfsfVar.zza.zzc.zzb(e7, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfse
            @Override // java.lang.Runnable
            public final void run() {
                zzfsf zzfsfVar = this.zza;
                zzfsfVar.zza.zzc.zzc("unlinkToDeath", new Object[0]);
                IInterface iInterface = zzfsfVar.zza.zzj;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(zzfsfVar.zza.zzh, 0);
                zzfsfVar.zza.zzj = null;
                zzfsfVar.zza.zzf = false;
            }
        });
    }
}
