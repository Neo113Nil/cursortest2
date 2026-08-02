package com.google.android.gms.internal.firebase_database;

import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
final class zzi extends zzf {
    private final zzg zzk = new zzg();

    zzi() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzf
    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zzk.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
