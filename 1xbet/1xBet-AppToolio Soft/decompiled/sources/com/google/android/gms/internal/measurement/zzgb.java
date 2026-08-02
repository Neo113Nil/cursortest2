package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.MainThread;

/* loaded from: classes.dex */
final class zzgb implements ServiceConnection {
    final /* synthetic */ zzfz zzamx;

    private zzgb(zzfz zzfzVar) {
        this.zzamx = zzfzVar;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzgn zzgnVar;
        zzgn zzgnVar2;
        zzgn zzgnVar3;
        zzgn zzgnVar4;
        zzgn zzgnVar5;
        if (iBinder == null) {
            zzgnVar5 = this.zzamx.zzacv;
            zzgnVar5.zzgi().zziy().log("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.zzamx.zzamv = zzs.zza(iBinder);
            if (this.zzamx.zzamv == null) {
                zzgnVar4 = this.zzamx.zzacv;
                zzgnVar4.zzgi().zziy().log("Install Referrer Service implementation was not found");
            } else {
                zzgnVar2 = this.zzamx.zzacv;
                zzgnVar2.zzgi().zzja().log("Install Referrer Service connected");
                zzgnVar3 = this.zzamx.zzacv;
                zzgnVar3.zzgh().zzc(new zzgc(this));
            }
        } catch (Exception e) {
            zzgnVar = this.zzamx.zzacv;
            zzgnVar.zzgi().zziy().zzg("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgn zzgnVar;
        zzfz zzfzVar = this.zzamx;
        zzfzVar.zzamv = null;
        zzgnVar = zzfzVar.zzacv;
        zzgnVar.zzgi().zzja().log("Install Referrer Service disconnected");
    }
}
