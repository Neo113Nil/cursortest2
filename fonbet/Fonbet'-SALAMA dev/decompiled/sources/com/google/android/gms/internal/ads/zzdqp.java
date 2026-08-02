package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdqp {
    final /* synthetic */ zzdqq zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdqp(zzdqq zzdqqVar) {
        this.zza = zzdqqVar;
    }

    public static /* bridge */ /* synthetic */ zzdqp zza(zzdqp zzdqpVar) {
        Map map;
        zzdqq zzdqqVar = zzdqpVar.zza;
        Map map2 = zzdqpVar.zzb;
        map = zzdqqVar.zzc;
        map2.putAll(map);
        return zzdqpVar;
    }

    public static /* synthetic */ void zzf(zzdqp zzdqpVar) {
        zzdqv zzdqvVar;
        zzdqvVar = zzdqpVar.zza.zza;
        zzdqvVar.zzf(zzdqpVar.zzb);
    }

    public static /* synthetic */ void zzg(zzdqp zzdqpVar) {
        zzdqv zzdqvVar;
        zzdqvVar = zzdqpVar.zza.zza;
        zzdqvVar.zzg(zzdqpVar.zzb);
    }

    public static /* synthetic */ void zzh(zzdqp zzdqpVar) {
        zzdqv zzdqvVar;
        zzdqvVar = zzdqpVar.zza.zza;
        zzdqvVar.zze(zzdqpVar.zzb);
    }

    public final zzdqp zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdqp zzc(zzfaf zzfafVar) {
        zzb("aai", zzfafVar.zzw);
        zzb("request_id", zzfafVar.zzan);
        zzb("ad_format", zzfaf.zza(zzfafVar.zzb));
        return this;
    }

    public final zzdqp zzd(zzfai zzfaiVar) {
        zzb("gqi", zzfaiVar.zzb);
        return this;
    }

    public final String zze() {
        zzdqv zzdqvVar;
        zzdqvVar = this.zza.zza;
        return zzdqvVar.zzb(this.zzb);
    }

    public final void zzi() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp.zzh(zzdqp.this);
            }
        });
    }

    public final void zzj() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqm
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp.zzg(zzdqp.this);
            }
        });
    }

    public final void zzk() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp.zzf(zzdqp.this);
            }
        });
    }
}
