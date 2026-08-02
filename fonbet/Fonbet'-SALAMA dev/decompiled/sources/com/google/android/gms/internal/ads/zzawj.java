package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzawj implements Callable {
    private final zzavr zza;
    private final zzarr zzb;

    public zzawj(zzavr zzavrVar, zzarr zzarrVar) {
        this.zza = zzavrVar;
        this.zzb = zzarrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.zza.zzk() != null) {
            this.zza.zzk().get();
        }
        zzasm zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                this.zzb.zzaY(zzc.zzaV(), zzgwq.zza());
            }
            return null;
        } catch (zzgxv | NullPointerException unused) {
            return null;
        }
    }
}
