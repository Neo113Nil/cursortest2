package com.google.android.gms.internal.ads;

import P.AbstractC0348d;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzati implements PackageManager$OnChecksumsReadyListener {
    final zzgbw zza = zzgbw.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ApkChecksum apkChecksumF = AbstractC0348d.f(list.get(i7));
                if (apkChecksumF.getType() == 8) {
                    zzgbw zzgbwVar = this.zza;
                    zzfyu zzfyuVarZzf = zzfyu.zzi().zzf();
                    byte[] value = apkChecksumF.getValue();
                    zzgbwVar.zzc(zzfyuVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
