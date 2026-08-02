package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.logging.a;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;

/* loaded from: classes4.dex */
public final class zzaq {
    private static a zzc = new a("TokenRefresher", "FirebaseAuth:");

    @VisibleForTesting
    volatile long zza;

    @VisibleForTesting
    volatile long zzb;
    private final FirebaseApp zzd;

    @VisibleForTesting
    private long zze;

    @VisibleForTesting
    private HandlerThread zzf;

    @VisibleForTesting
    private Handler zzg;

    @VisibleForTesting
    private Runnable zzh;

    public zzaq(FirebaseApp firebaseApp) {
        zzc.c("Initializing TokenRefresher", new Object[0]);
        C0875q.g(firebaseApp);
        this.zzd = firebaseApp;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzg = new com.google.android.gms.internal.p002firebaseauthapi.zze(this.zzf.getLooper());
        this.zzh = new zzat(this, firebaseApp.getName());
        this.zze = 300000L;
    }

    public final void zzb() {
        this.zzg.removeCallbacks(this.zzh);
    }

    public final void zzc() {
        zzc.c(androidx.core.database.a.c(this.zza - this.zze, "Scheduling refresh for "), new Object[0]);
        zzb();
        this.zzb = Math.max((this.zza - DefaultClock.getInstance().currentTimeMillis()) - this.zze, 0L) / 1000;
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }

    public final void zzd() {
        int i = (int) this.zzb;
        this.zzb = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.zzb : i != 960 ? 30L : 960L;
        this.zza = (this.zzb * 1000) + DefaultClock.getInstance().currentTimeMillis();
        zzc.c(androidx.core.database.a.c(this.zza, "Scheduling refresh for "), new Object[0]);
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }
}
