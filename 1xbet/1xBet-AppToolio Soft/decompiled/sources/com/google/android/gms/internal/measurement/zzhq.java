package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzhq implements Callable<String> {
    private final /* synthetic */ zzhm zzaps;

    zzhq(zzhm zzhmVar) {
        this.zzaps = zzhmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ String call() throws Exception {
        zzfk zziv;
        String str;
        String zzjk = this.zzaps.zzgj().zzjk();
        if (zzjk != null) {
            return zzjk;
        }
        zzhm zzfy = this.zzaps.zzfy();
        String str2 = null;
        if (zzfy.zzgh().zzju()) {
            zziv = zzfy.zzgi().zziv();
            str = "Cannot retrieve app instance id from analytics worker thread";
        } else {
            if (!zzee.isMainThread()) {
                long elapsedRealtime = zzfy.zzbt().elapsedRealtime();
                String zzaj = zzfy.zzaj(120000L);
                long elapsedRealtime2 = zzfy.zzbt().elapsedRealtime() - elapsedRealtime;
                str2 = (zzaj != null || elapsedRealtime2 >= 120000) ? zzaj : zzfy.zzaj(120000 - elapsedRealtime2);
                if (str2 != null) {
                    throw new TimeoutException();
                }
                this.zzaps.zzgj().zzbu(str2);
                return str2;
            }
            zziv = zzfy.zzgi().zziv();
            str = "Cannot retrieve app instance id from main thread";
        }
        zziv.log(str);
        if (str2 != null) {
        }
    }
}
