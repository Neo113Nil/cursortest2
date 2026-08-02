package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class zzbzm {
    private final zzbzf zza;
    private final AtomicInteger zzb;

    public zzbzm() {
        zzbzf zzbzfVar = new zzbzf();
        this.zza = zzbzfVar;
        this.zzb = new AtomicInteger(0);
        zzgbc.zzr(zzbzfVar, new zzbzk(this), zzbza.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhI)).booleanValue()) {
            o.f1952C.f1961g.zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzbzj zzbzjVar, zzbzh zzbzhVar) {
        zzgbc.zzr(this.zza, new zzbzl(this, zzbzjVar, zzbzhVar), zzbza.zzg);
    }
}
