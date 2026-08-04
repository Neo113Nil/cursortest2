package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzdqp {
    final /* synthetic */ zzdqq zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdqp(zzdqq zzdqqVar) {
        this.zza = zzdqqVar;
    }

    public static /* bridge */ /* synthetic */ zzdqp zza(zzdqp zzdqpVar) {
        zzdqpVar.zzb.putAll(zzdqpVar.zza.zzc);
        return zzdqpVar;
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
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzi() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp zzdqpVar = this.zza;
                zzdqpVar.zza.zza.zze(zzdqpVar.zzb);
            }
        });
    }

    public final void zzj() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqm
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp zzdqpVar = this.zza;
                zzdqpVar.zza.zza.zzg(zzdqpVar.zzb);
            }
        });
    }

    public final void zzk() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // java.lang.Runnable
            public final void run() {
                zzdqp zzdqpVar = this.zza;
                zzdqpVar.zza.zza.zzf(zzdqpVar.zzb);
            }
        });
    }
}
