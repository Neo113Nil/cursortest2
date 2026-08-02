package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzbba {
    final /* synthetic */ zzbbc zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbba(zzbbc zzbbcVar, byte[] bArr, zzbbb zzbbbVar) {
        this.zza = zzbbcVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbbc zzbbcVar = this.zza;
            if (zzbbcVar.zzb) {
                zzbbcVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e7) {
            j.c("Clearcut log failed", e7);
        }
    }

    public final zzbba zza(int i7) {
        this.zzc = i7;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbaz
            @Override // java.lang.Runnable
            public final void run() {
                zzbba.this.zzd();
            }
        });
    }
}
