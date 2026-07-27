package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzun {
    public final int zza;
    public final zzxo zzb;
    private final CopyOnWriteArrayList zzc;

    public zzun() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzun(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzxo zzxoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxoVar;
    }

    public final zzun zza(int i, zzxo zzxoVar) {
        return new zzun(this.zzc, 0, zzxoVar);
    }

    public final void zzb(Handler handler, zzuo zzuoVar) {
        this.zzc.add(new zzum(handler, zzuoVar));
    }

    public final void zzc(zzuo zzuoVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzum zzumVar = (zzum) it.next();
            if (zzumVar.zza == zzuoVar) {
                copyOnWriteArrayList.remove(zzumVar);
            }
        }
    }
}
