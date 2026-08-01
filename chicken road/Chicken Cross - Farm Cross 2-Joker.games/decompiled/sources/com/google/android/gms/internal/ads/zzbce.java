package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbce implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbcg zzb;

    zzbce(zzbcg zzbcgVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzbcgVar);
        this.zzb = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaza zzazaVar;
        int i = this.zza;
        zzbcg zzbcgVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbcgVar.zza;
            zzazaVar = zzfyp.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzazaVar = null;
        }
        zzbcg zzbcgVar2 = this.zzb;
        zzbcgVar2.zzs(zzazaVar);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzazaVar != null && zzazaVar.zza() && !zzazaVar.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzazaVar.zzg() && zzazaVar.zzh().zza() && zzazaVar.zzh().zzb() != -2) {
                return;
            }
            zzbcgVar2.zzp(i2 + 1, true);
        }
    }
}
