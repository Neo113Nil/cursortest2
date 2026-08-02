package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.util.List;

/* loaded from: classes.dex */
final class zzxm extends zzxj {
    private final zzxk zzbqg = new zzxk();

    zzxm() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.zzxj
    public final void zza(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> zza = this.zzbqg.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printStream.print("Suppressed: ");
                th2.printStackTrace(printStream);
            }
        }
    }
}
