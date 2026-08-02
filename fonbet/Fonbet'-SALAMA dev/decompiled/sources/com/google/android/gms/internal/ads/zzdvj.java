package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzdvj implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzdvj(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004d, code lost:
    
        if (java.lang.Integer.toString(r6).equals(Q0.a.i0(Q0.a.k0(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        I3.b zzb;
        final zzauo zzauoVar = (zzauo) this.zza.zzb();
        final Context zza = ((zzcgi) this.zzb).zza();
        zzfba zza2 = ((zzcuh) this.zzc).zza();
        long longValue = ((Long) this.zzd.zzb()).longValue();
        zzgbn zzc = zzfdy.zzc();
        int intValue = ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzcS)).intValue();
        if (intValue != -1) {
        }
        o.f1952C.j.getClass();
        if (System.currentTimeMillis() - longValue < ((Integer) r7.f2726c.zzb(zzbby.zzcU)).intValue()) {
            zzb = zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzauo.this.zzc().zzg(zza);
                }
            });
            zzheo.zzb(zzb);
            return zzb;
        }
        zzb = zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzauo.this.zzc().zzf(zza);
            }
        });
        zzheo.zzb(zzb);
        return zzb;
    }
}
