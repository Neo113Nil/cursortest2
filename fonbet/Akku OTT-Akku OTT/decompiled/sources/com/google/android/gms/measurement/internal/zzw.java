package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.collection.f;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzw extends BroadcastReceiver {
    private final zzic zza;

    public zzw(zzic zzicVar) {
        this.zza = zzicVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        char c;
        if (intent == null) {
            f.c(this.zza, "App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            f.c(this.zza, "App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                f.c(this.zza, "App receiver called with unknown action");
                return;
            }
            zzic zzicVar = this.zza;
            zzicVar.zzaV().zzk().zza("[sgtm] App Receiver notified batches are available");
            zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzw.this.zza();
                }
            });
            return;
        }
        final zzic zzicVar2 = this.zza;
        zzqp.zza();
        if (zzicVar2.zzc().zzp(null, zzfy.zzaQ)) {
            zzicVar2.zzaV().zzk().zza("App receiver notified triggers are available");
            zzicVar2.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzic zzicVar3 = zzic.this;
                    if (!zzicVar3.zzk().zzS()) {
                        f.c(zzicVar3, "registerTrigger called but app not eligible");
                        return;
                    }
                    zzicVar3.zzj().zzv();
                    final zzlj zzj = zzicVar3.zzj();
                    Objects.requireNonNull(zzj);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzlj.this.zzw();
                        }
                    }).start();
                }
            });
        }
    }

    public final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
    }
}
