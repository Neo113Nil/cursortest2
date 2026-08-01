package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfyq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfzk zza;
    private final String zzb;
    private final String zzc;
    private final zzbei zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfyi zzg;
    private final long zzh;

    public zzfyq(Context context, int i, zzbei zzbeiVar, String str, String str2, String str3, zzfyi zzfyiVar) {
        this.zzb = str;
        this.zzd = zzbeiVar;
        this.zzc = str2;
        this.zzg = zzfyiVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfzk zzfzkVar = new zzfzk(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfzkVar;
        this.zze = new LinkedBlockingQueue();
        zzfzkVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        zzfyi zzfyiVar = this.zzg;
        if (zzfyiVar != null) {
            zzfyiVar.zzc(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfzp zzc = zzc();
        if (zzc != null) {
            try {
                zzfzw zzg = zzc.zzg(new zzfzu(1, this.zzd, this.zzb, this.zzc));
                zzd(IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfzw(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfzw(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfzw zza(int i) {
        zzfzw zzfzwVar;
        try {
            zzfzwVar = (zzfzw) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzh, e);
            zzfzwVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfzwVar != null) {
            if (zzfzwVar.zzc == 7) {
                zzfyi.zzg(3);
            } else {
                zzfyi.zzg(2);
            }
        }
        return zzfzwVar == null ? new zzfzw(null, 1) : zzfzwVar;
    }

    public final void zzb() {
        zzfzk zzfzkVar = this.zza;
        if (zzfzkVar != null) {
            if (zzfzkVar.isConnected() || zzfzkVar.isConnecting()) {
                zzfzkVar.disconnect();
            }
        }
    }

    protected final zzfzp zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
