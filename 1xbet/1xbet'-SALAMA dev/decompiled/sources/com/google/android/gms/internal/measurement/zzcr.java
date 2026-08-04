package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.D;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
final class zzcr extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzee zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.zzd = zzeeVar;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzd.zzj;
        D.i(zzccVar);
        zzccVar.setCurrentScreen(new b(this.zza), this.zzb, this.zzc, this.zzh);
    }
}
