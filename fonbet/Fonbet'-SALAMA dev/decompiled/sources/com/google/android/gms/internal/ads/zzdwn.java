package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zzdwn implements InterfaceC0850b, InterfaceC0851c {
    protected final zzbzf zza = new zzbzf();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbuo zze;
    protected zzbtt zzf;

    public static void zzc(Context context, I3.b bVar, Executor executor) {
        if (((Boolean) zzbdq.zzj.zze()).booleanValue() || ((Boolean) zzbdq.zzh.zze()).booleanValue()) {
            zzgbc.zzr(bVar, new zzdwk(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(ConnectionResult connectionResult) {
        int i7 = J.f3546b;
        j.b("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdxc(1));
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
        int i8 = J.f3546b;
        j.b("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (!this.zzf.isConnected()) {
                    if (this.zzf.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.zzf.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
