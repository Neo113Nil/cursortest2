package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgrb implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgrd zza;

    zzgrb(zzgrd zzgrdVar) {
        Objects.requireNonNull(zzgrdVar);
        this.zza = zzgrdVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgrd zzgrdVar = this.zza;
        synchronized (zzgrdVar) {
            if (z) {
                zzgrdVar.zzg(System.currentTimeMillis());
                zzgrdVar.zzj(true);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zzgrdVar.zzh() > 0 && currentTimeMillis >= zzgrdVar.zzh()) {
                    zzgrdVar.zzi(currentTimeMillis - zzgrdVar.zzh());
                }
                zzgrdVar.zzj(false);
            }
        }
    }
}
