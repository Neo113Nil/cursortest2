package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzdxo {
    private final zzgbn zza;
    private final zzdwt zzb;
    private final zzhea zzc;

    public zzdxo(zzgbn zzgbnVar, zzdwt zzdwtVar, zzhea zzheaVar) {
        this.zza = zzgbnVar;
        this.zzb = zzdwtVar;
        this.zzc = zzheaVar;
    }

    private final I3.b zzg(final zzbuo zzbuoVar, zzdxn zzdxnVar, final zzdxn zzdxnVar2, final zzgaj zzgajVar) {
        String str = zzbuoVar.zzd;
        P p5 = o.f1952C.f1957c;
        return (zzgat) zzgbc.zzf((zzgat) zzgbc.zzn((zzgat) zzgbc.zzn(zzgat.zzu(P.d(str) ? zzgbc.zzg(new zzdxc(1)) : zzgbc.zzf(zzdxnVar.zza(zzbuoVar), ExecutionException.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return zzgbc.zzg(th);
            }
        }, this.zza)), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(((zzdxd) obj).zzb());
            }
        }, this.zza), zzgajVar, this.zza), zzdxc.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxl
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                I3.b zzn;
                zzdxo zzdxoVar = zzdxo.this;
                zzn = zzgbc.zzn(zzdxnVar2.zza(zzbuoVar), zzgajVar, zzdxoVar.zza);
                return zzn;
            }
        }, this.zza);
    }

    public final I3.b zze(final zzbuo zzbuoVar) {
        zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                String str = new String(zzfyx.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbuo zzbuoVar2 = zzbuo.this;
                zzbuoVar2.zzj = str;
                return zzgbc.zzh(zzbuoVar2);
            }
        };
        final zzdwt zzdwtVar = this.zzb;
        Objects.requireNonNull(zzdwtVar);
        return zzg(zzbuoVar, new zzdxn() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzdxn
            public final I3.b zza(zzbuo zzbuoVar2) {
                return zzdwt.this.zza(zzbuoVar2);
            }
        }, new zzdxn() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzdxn
            public final I3.b zza(zzbuo zzbuoVar2) {
                I3.b zzb;
                zzb = ((zzdyg) zzdxo.this.zzc.zzb()).zzb(zzbuoVar2, Binder.getCallingUid());
                return zzb;
            }
        }, zzgajVar);
    }

    public final I3.b zzf(zzbuo zzbuoVar) {
        return zzg(zzbuoVar, new zzdxn() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzdxn
            public final I3.b zza(zzbuo zzbuoVar2) {
                I3.b zzd;
                zzd = zzdxo.this.zzb.zzd(zzbuoVar2.zzh);
                return zzd;
            }
        }, new zzdxn() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzdxn
            public final I3.b zza(zzbuo zzbuoVar2) {
                I3.b zzj;
                zzj = ((zzdyg) zzdxo.this.zzc.zzb()).zzj(zzbuoVar2.zzh);
                return zzj;
            }
        }, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(null);
            }
        });
    }
}
