package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzapm {
    public static final boolean zza = zzapn.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapl(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            long j3 = ((zzapl) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j = ((zzapl) list.get(list.size() - 1)).zzc - j3;
        }
        if (j > 0) {
            long j7 = ((zzapl) this.zzb.get(0)).zzc;
            zzapn.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzapl zzaplVar : this.zzb) {
                long j8 = zzaplVar.zzc;
                zzapn.zza("(+%-4d) [%2d] %s", Long.valueOf(j8 - j7), Long.valueOf(zzaplVar.zzb), zzaplVar.zza);
                j7 = j8;
            }
        }
    }
}
