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
final class zzfmj implements InterfaceC0850b, InterfaceC0851c {
    protected final zzfnh zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfmj(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfnh zzfnhVar = new zzfnh(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfnhVar;
        this.zzd = new LinkedBlockingQueue();
        zzfnhVar.checkAvailabilityAndConnect();
    }

    public static zzasm zza() {
        zzarr zza = zzasm.zza();
        zza.zzB(32768L);
        return (zzasm) zza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        zzfnm zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfni(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzasm zzb(int i7) {
        zzasm zzasmVar;
        try {
            zzasmVar = (zzasm) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzasmVar = null;
        }
        return zzasmVar == null ? zza() : zzasmVar;
    }

    public final void zzc() {
        zzfnh zzfnhVar = this.zza;
        if (zzfnhVar != null) {
            if (zzfnhVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfnm zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
