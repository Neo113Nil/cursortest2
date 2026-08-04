package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzdvu {
    private final ScheduledExecutorService zza;
    private final zzgbn zzb;
    private final zzgbn zzc;
    private final zzdwp zzd;
    private final zzhea zze;

    public zzdvu(ScheduledExecutorService scheduledExecutorService, zzgbn zzgbnVar, zzgbn zzgbnVar2, zzdwp zzdwpVar, zzhea zzheaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgbnVar;
        this.zzc = zzgbnVar2;
        this.zzd = zzdwpVar;
        this.zze = zzheaVar;
    }

    public static zzdxd zza(zzdvu zzdvuVar, zzbuo zzbuoVar) {
        return (zzdxd) zzdvuVar.zzd.zza(zzbuoVar).get(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ I3.b zzb(zzdvu zzdvuVar, final zzbuo zzbuoVar, int i7, Throwable th) {
        Bundle bundle;
        if (zzbuoVar != null && (bundle = zzbuoVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgbc.zzn(((zzdyg) zzdvuVar.zze.zzb()).zzd(zzbuoVar, i7), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(new zzdxd((InputStream) obj, zzbuoVar));
            }
        }, zzdvuVar.zzb);
    }

    public final I3.b zzc(final zzbuo zzbuoVar) {
        I3.b bVarZzb;
        String str = zzbuoVar.zzd;
        P p5 = o.f1952C.f1957c;
        if (P.d(str)) {
            bVarZzb = zzgbc.zzg(new zzdxc(1));
        } else {
            bVarZzb = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhu)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdvu.zza(this.zza, zzbuoVar);
                }
            }) : this.zzd.zza(zzbuoVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgat) zzgbc.zzf((zzgat) zzgbc.zzo(zzgat.zzu(bVarZzb), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdvt
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdvu.zzb(this.zza, zzbuoVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
