package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import o3.BinderC1507b;
import p3.d;

/* loaded from: classes.dex */
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
        boolean zzV;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        zzcc zzccVar2;
        String str4;
        String str5;
        try {
            zzee zzeeVar = this.zze;
            zzV = zzee.zzV(this.zza, this.zzb);
            if (zzV) {
                String str6 = this.zzb;
                String str7 = this.zza;
                str5 = this.zze.zzd;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            D.i(this.zzc);
            zzee zzeeVar2 = this.zze;
            zzeeVar2.zzj = zzeeVar2.zzf(this.zzc, true);
            zzccVar = this.zze.zzj;
            if (zzccVar == null) {
                str4 = this.zze.zzd;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a2 = d.a(this.zzc, "com.google.android.gms.measurement.dynamite");
            zzcl zzclVar = new zzcl(61000L, Math.max(a2, r0), d.d(this.zzc, "com.google.android.gms.measurement.dynamite", false) < a2, str, str2, str3, this.zzd, q4.d.k(this.zzc));
            zzccVar2 = this.zze.zzj;
            D.i(zzccVar2);
            zzccVar2.initialize(new BinderC1507b(this.zzc), zzclVar, this.zzh);
        } catch (Exception e7) {
            this.zze.zzS(e7, true, false);
        }
    }
}
