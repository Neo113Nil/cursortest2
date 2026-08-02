package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzfzr;

/* loaded from: classes.dex */
final class zzgbs extends zzfzr.zzi implements Runnable {
    private final Runnable zza;

    public zzgbs(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        return AbstractC0486a1.h("task=[", this.zza.toString(), "]");
    }
}
