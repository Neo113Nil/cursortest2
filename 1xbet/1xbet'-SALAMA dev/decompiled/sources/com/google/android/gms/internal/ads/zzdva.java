package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzdva {
    private final zzgbn zza;
    private final zzgbn zzb;
    private final zzdwj zzc;
    private final zzhea zzd;

    public zzdva(zzgbn zzgbnVar, zzgbn zzgbnVar2, zzdwj zzdwjVar, zzhea zzheaVar) {
        this.zza = zzgbnVar;
        this.zzb = zzgbnVar2;
        this.zzc = zzdwjVar;
        this.zzd = zzheaVar;
    }

    public static zzdxd zza(zzdva zzdvaVar, zzbuo zzbuoVar) {
        return (zzdxd) zzdvaVar.zzc.zza(zzbuoVar).get(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ I3.b zzb(zzdva zzdvaVar, final zzbuo zzbuoVar, int i7, zzdxc zzdxcVar) {
        Bundle bundle;
        if (zzbuoVar != null && (bundle = zzbuoVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgbc.zzn(((zzdyg) zzdvaVar.zzd.zzb()).zzc(zzbuoVar, i7), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(new zzdxd((InputStream) obj, zzbuoVar));
            }
        }, zzdvaVar.zzb);
    }

    public final I3.b zzc(final zzbuo zzbuoVar) {
        String str = zzbuoVar.zzd;
        P p5 = o.f1952C.f1957c;
        I3.b bVarZzg = P.d(str) ? zzgbc.zzg(new zzdxc(1)) : zzgbc.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdva.zza(this.zza, zzbuoVar);
            }
        }), ExecutionException.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzduy
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgbc.zzg(cause);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgbc.zzf(bVarZzg, zzdxc.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdva.zzb(this.zza, zzbuoVar, callingUid, (zzdxc) obj);
            }
        }, this.zzb);
    }
}
