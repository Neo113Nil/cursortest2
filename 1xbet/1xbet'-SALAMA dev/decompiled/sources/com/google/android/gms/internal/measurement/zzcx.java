package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import p105o3.b;
import p113p3.d;

/* JADX INFO: loaded from: classes.dex */
final class zzcx extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            zzee zzeeVar = this.zze;
            if (zzee.zzV(this.zza, this.zzb)) {
                str3 = this.zzb;
                str2 = this.zza;
                str = this.zze.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            D.i(this.zzc);
            zzee zzeeVar2 = this.zze;
            zzeeVar2.zzj = zzeeVar2.zzf(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int iA = d.a(this.zzc, "com.google.android.gms.measurement.dynamite");
            int iD = d.d(this.zzc, "com.google.android.gms.measurement.dynamite", false);
            zzcl zzclVar = new zzcl(61000L, Math.max(iA, iD), iD < iA, str, str2, str3, this.zzd, p120q4.d.k(this.zzc));
            zzcc zzccVar = this.zze.zzj;
            D.i(zzccVar);
            zzccVar.initialize(new b(this.zzc), zzclVar, this.zzh);
        } catch (Exception e7) {
            this.zze.zzS(e7, true, false);
        }
    }
}
