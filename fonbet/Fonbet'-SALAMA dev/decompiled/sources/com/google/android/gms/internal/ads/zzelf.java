package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzelf {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzele zzb;

    public final zzele zza() {
        return this.zzb;
    }

    public final void zzb(zzele zzeleVar) {
        this.zzb = zzeleVar;
    }

    public final void zzc(boolean z4) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
