package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
final class zzavp implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavr zzb;

    public zzavp(zzavr zzavrVar, int i7, boolean z4) {
        this.zza = i7;
        this.zzb = zzavrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasm zzasmVar;
        int i7 = this.zza;
        zzavr zzavrVar = this.zzb;
        if (i7 > 0) {
            try {
                Thread.sleep(i7 * zzbbd.zzq.zzf);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzavrVar.zza.getPackageManager().getPackageInfo(zzavrVar.zza.getPackageName(), 0);
            Context context = zzavrVar.zza;
            zzasmVar = zzfmk.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzasmVar = null;
        }
        this.zzb.zzk = zzasmVar;
        if (this.zza < 4) {
            if (zzasmVar != null && zzasmVar.zzaf() && !zzasmVar.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzasmVar.zzag() && zzasmVar.zzf().zzg() && zzasmVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzn(this.zza + 1, true);
        }
    }
}
