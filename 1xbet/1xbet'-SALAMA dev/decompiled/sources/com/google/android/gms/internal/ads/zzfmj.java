package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zzfmj implements InterfaceC0806b, InterfaceC0807c {
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
        zzarr zzarrVarZza = zzasm.zza();
        zzarrVarZza.zzB(32768L);
        return (zzasm) zzarrVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        zzfnm zzfnmVarZzd = zzd();
        if (zzfnmVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfnmVarZzd.zze(new zzfni(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzc();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0807c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
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
