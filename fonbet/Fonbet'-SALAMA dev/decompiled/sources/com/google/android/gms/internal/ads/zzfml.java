package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfml implements InterfaceC0850b, InterfaceC0851c {
    protected final zzfnh zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfmc zzf;
    private final long zzg;
    private final int zzh;

    public zzfml(Context context, int i7, int i8, String str, String str2, String str3, zzfmc zzfmcVar) {
        this.zzb = str;
        this.zzh = i8;
        this.zzc = str2;
        this.zzf = zzfmcVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfnh zzfnhVar = new zzfnh(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfnhVar;
        this.zzd = new LinkedBlockingQueue();
        zzfnhVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i7, long j, Exception exc) {
        this.zzf.zzc(i7, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        zzfnm zzc = zzc();
        if (zzc != null) {
            try {
                zzfnt zzf = zzc.zzf(new zzfnr(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfnt(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfnt(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfnt zza(int i7) {
        zzfnt zzfntVar;
        try {
            zzfntVar = (zzfnt) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            zzd(2009, this.zzg, e7);
            zzfntVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfntVar != null) {
            if (zzfntVar.zzc == 7) {
                zzfmc.zzg(3);
            } else {
                zzfmc.zzg(2);
            }
        }
        return zzfntVar == null ? new zzfnt(null, 1) : zzfntVar;
    }

    public final void zzb() {
        zzfnh zzfnhVar = this.zza;
        if (zzfnhVar != null) {
            if (zzfnhVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfnm zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
