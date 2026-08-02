package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzrl {
    public final int zza;
    public final zzuq zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrl(CopyOnWriteArrayList copyOnWriteArrayList, int i7, zzuq zzuqVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuqVar;
    }

    public final zzrl zza(int i7, zzuq zzuqVar) {
        return new zzrl(this.zzc, 0, zzuqVar);
    }

    public final void zzb(Handler handler, zzrm zzrmVar) {
        this.zzc.add(new zzrk(handler, zzrmVar));
    }

    public final void zzc(zzrm zzrmVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzrk zzrkVar = (zzrk) it.next();
            if (zzrkVar.zza == zzrmVar) {
                this.zzc.remove(zzrkVar);
            }
        }
    }

    public zzrl() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
