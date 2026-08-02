package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdmc implements Callable {
    private final E2.a zza;
    private final Context zzb;
    private final zzdqq zzc;
    private final zzeaf zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzfia zzh;
    private final zzeaq zzi;
    private final zzfbe zzj;

    public zzdmc(Context context, Executor executor, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, E2.a aVar, zzceo zzceoVar, zzeaf zzeafVar, zzfia zzfiaVar, zzdqq zzdqqVar, zzeaq zzeaqVar, zzfbe zzfbeVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzauoVar;
        this.zzg = versionInfoParcel;
        this.zza = aVar;
        this.zzd = zzeafVar;
        this.zzh = zzfiaVar;
        this.zzc = zzdqqVar;
        this.zzi = zzeaqVar;
        this.zzj = zzfbeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdmf zzdmfVar = new zzdmf(this);
        zzdmfVar.zzk();
        return zzdmfVar;
    }
}
