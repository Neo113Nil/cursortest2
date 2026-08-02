package com.google.android.gms.internal.ads;

import F2.C0254t;

/* loaded from: classes.dex */
public final class zzczo implements zzcxn {
    private int zza;
    private int zzb;

    public zzczo() {
        zzbbp zzbbpVar = zzbby.zzbs;
        C0254t c0254t = C0254t.f2723d;
        this.zza = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        this.zzb = ((Integer) c0254t.f2726c.zzb(zzbby.zzmN)).intValue();
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final synchronized void zzdm(zzfar zzfarVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbt)).booleanValue()) {
            try {
                zzfai zzfaiVar = zzfarVar.zzb.zzb;
                this.zza = zzfaiVar.zzc;
                this.zzb = zzfaiVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
