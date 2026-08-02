package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzef implements zzcz {
    @Override // com.google.android.gms.internal.ads.zzcz
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzcz
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzcz
    public final long zzc() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzcz
    public final zzdj zzd(Looper looper, Handler.Callback callback) {
        return new zzei(new Handler(looper, callback));
    }
}
