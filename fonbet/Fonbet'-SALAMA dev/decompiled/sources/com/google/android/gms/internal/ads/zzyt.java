package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzyt {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyu zzyuVar) {
        zzc(zzyuVar);
        this.zza.add(new zzys(handler, zzyuVar));
    }

    public final void zzb(final int i7, final long j, final long j3) {
        boolean z4;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzys zzysVar = (zzys) it.next();
            z4 = zzysVar.zzc;
            if (!z4) {
                handler = zzysVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyu zzyuVar;
                        zzyuVar = zzys.this.zzb;
                        zzyuVar.zzZ(i7, j, j3);
                    }
                });
            }
        }
    }

    public final void zzc(zzyu zzyuVar) {
        zzyu zzyuVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzys zzysVar = (zzys) it.next();
            zzyuVar2 = zzysVar.zzb;
            if (zzyuVar2 == zzyuVar) {
                zzysVar.zzc();
                this.zza.remove(zzysVar);
            }
        }
    }
}
