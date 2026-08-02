package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzqv {
    final /* synthetic */ zzqx zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack$StreamEventCallback zzc = new zzqu(this);

    public zzqv(zzqx zzqxVar) {
        this.zza = zzqxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzqt] */
    public final void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzqt
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
