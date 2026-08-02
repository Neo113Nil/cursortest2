package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import androidx.work.Constraints$Builder$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzauo implements PackageManager$OnChecksumsReadyListener {
    final zzgeh zza = zzgeh.zze();

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum m268m = Constraints$Builder$$ExternalSyntheticApiModelOutline0.m268m(list.get(i));
                type = m268m.getType();
                if (type == 8) {
                    zzgeh zzgehVar = this.zza;
                    zzgbd zzf = zzgbd.zzi().zzf();
                    value = m268m.getValue();
                    zzgehVar.zzc(zzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
