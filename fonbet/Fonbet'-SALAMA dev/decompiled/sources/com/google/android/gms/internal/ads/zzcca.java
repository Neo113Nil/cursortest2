package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.AbstractC0308p;
import I2.P;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcca extends AbstractC0308p {
    final zzcaw zza;
    final zzcci zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcca(zzcaw zzcawVar, zzcci zzcciVar, String str, String[] strArr) {
        this.zza = zzcawVar;
        this.zzb = zzcciVar;
        this.zzc = str;
        this.zzd = strArr;
        o.f1952C.f1953A.zzb(this);
    }

    @Override // I2.AbstractC0308p
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            P.f3579l.post(new zzcbz(this));
        }
    }

    @Override // I2.AbstractC0308p
    public final I3.b zzb() {
        return (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzch)).booleanValue() && (this.zzb instanceof zzccr)) ? zzbza.zzf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.zzb.zzw(r0.zzc, r0.zzd, zzcca.this));
                return valueOf;
            }
        }) : super.zzb();
    }

    public final String zze() {
        return this.zzc;
    }
}
