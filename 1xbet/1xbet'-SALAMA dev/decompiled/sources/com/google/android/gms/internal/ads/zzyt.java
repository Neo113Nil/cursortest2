package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzyt {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyu zzyuVar) {
        zzc(zzyuVar);
        this.zza.add(new zzys(handler, zzyuVar));
    }

    public final void zzb(final int i7, final long j, final long j3) {
        for (final zzys zzysVar : this.zza) {
            if (!zzysVar.zzc) {
                zzysVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzysVar.zzb.zzZ(i7, j, j3);
                    }
                });
            }
        }
    }

    public final void zzc(zzyu zzyuVar) {
        for (zzys zzysVar : this.zza) {
            if (zzysVar.zzb == zzyuVar) {
                zzysVar.zzc();
                this.zza.remove(zzysVar);
            }
        }
    }
}
