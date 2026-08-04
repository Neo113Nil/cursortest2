package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzfsh {
    private final zzftz zza;
    private final Context zzb;
    private final zzfsi zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfrz
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfsh.zzh(this.zza);
        }
    };

    public zzfsh(Context context, zzfsi zzfsiVar, String str, Intent intent, zzfrm zzfrmVar) {
        this.zzb = context;
        this.zzc = zzfsiVar;
        final String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzfud.zza(new zzftz(str2) { // from class: com.google.android.gms.internal.ads.zzfry
            public final /* synthetic */ String zza = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.zza, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    public static /* synthetic */ void zzf(zzfsh zzfshVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e7) {
            zzfshVar.zzc.zza("error caused by ", e7);
        }
    }

    public static /* synthetic */ void zzg(zzfsh zzfshVar, Runnable runnable) {
        if (zzfshVar.zzj != null || zzfshVar.zzf) {
            if (!zzfshVar.zzf) {
                runnable.run();
                return;
            }
            zzfshVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (zzfshVar.zze) {
                zzfshVar.zze.add(runnable);
            }
            return;
        }
        zzfshVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        synchronized (zzfshVar.zze) {
            zzfshVar.zze.add(runnable);
        }
        zzfsf zzfsfVar = new zzfsf(zzfshVar, null);
        zzfshVar.zzi = zzfsfVar;
        zzfshVar.zzf = true;
        if (zzfshVar.zzb.bindService(zzfshVar.zzg, zzfsfVar, 1)) {
            return;
        }
        zzfshVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfshVar.zzf = false;
        synchronized (zzfshVar.zze) {
            zzfshVar.zze.clear();
        }
    }

    public static /* synthetic */ void zzh(zzfsh zzfshVar) {
        zzfshVar.zzc.zzc("%s : Binder has died.", zzfshVar.zzd);
        synchronized (zzfshVar.zze) {
            zzfshVar.zze.clear();
        }
    }

    public static /* synthetic */ void zzi(zzfsh zzfshVar) {
        if (zzfshVar.zzj != null) {
            zzfshVar.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = zzfshVar.zzb;
            ServiceConnection serviceConnection = zzfshVar.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            zzfshVar.zzf = false;
            zzfshVar.zzj = null;
            zzfshVar.zzi = null;
            synchronized (zzfshVar.zze) {
                zzfshVar.zze.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsa
            @Override // java.lang.Runnable
            public final void run() {
                zzfsh.zzf(this.zza, runnable);
            }
        });
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzm(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsb
            @Override // java.lang.Runnable
            public final void run() {
                zzfsh.zzg(this.zza, runnable);
            }
        });
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsc
            @Override // java.lang.Runnable
            public final void run() {
                zzfsh.zzi(this.zza);
            }
        });
    }
}
