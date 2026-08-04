package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;

/* JADX INFO: loaded from: classes.dex */
final class zzfmo implements InterfaceC0806b, InterfaceC0807c {
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
                if (this.zza.isConnected() || this.zza.isConnecting()) {
                    this.zza.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
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
                } finally {
                    zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0807c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
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
