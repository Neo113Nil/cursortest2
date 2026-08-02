package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
final class zzfmo implements InterfaceC0850b, InterfaceC0851c {
    private final zzfnh zza;
    private final zzfnb zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    public zzfmo(Context context, Looper looper, zzfnb zzfnbVar) {
        this.zzb = zzfnbVar;
        this.zza = new zzfnh(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                if (!this.zza.isConnected()) {
                    if (this.zza.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.zza.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzg(new zzfnf(this.zzb.zzaV()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    zzb();
                    throw th;
                }
                zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
