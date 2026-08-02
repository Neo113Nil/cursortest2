package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzewf extends zzevn {
    public zzewf(Context context, Executor executor, zzcgb zzcgbVar, zzexw zzexwVar, zzewd zzewdVar, zzfay zzfayVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcgbVar, zzexwVar, zzewdVar, zzfayVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ zzctv zze(zzcnm zzcnmVar, zzctz zzctzVar, zzdaj zzdajVar) {
        zzcnc zzc = this.zza.zzc();
        zzc.zzd(zzctzVar);
        zzc.zzc(zzdajVar);
        return zzc;
    }
}
