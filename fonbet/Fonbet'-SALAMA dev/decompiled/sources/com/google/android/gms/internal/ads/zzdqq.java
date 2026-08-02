package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdqq {
    private final zzdqv zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdqq(zzdqv zzdqvVar, Executor executor) {
        this.zza = zzdqvVar;
        this.zzc = zzdqvVar.zza();
        this.zzb = executor;
    }

    public final zzdqp zza() {
        zzdqp zzdqpVar = new zzdqp(this);
        zzdqp.zza(zzdqpVar);
        return zzdqpVar;
    }

    public final void zze() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlD)).booleanValue()) {
            zzdqp zza = zza();
            zza.zzb("action", "pecr");
            zza.zzj();
        }
    }
}
