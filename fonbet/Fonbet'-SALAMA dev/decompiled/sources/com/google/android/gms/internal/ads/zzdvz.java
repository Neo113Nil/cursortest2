package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdvz implements zzdxb {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdva zzb;
    private final zzgbn zzc;
    private final zzfba zzd;
    private final ScheduledExecutorService zze;
    private final zzdzb zzf;
    private final zzffy zzg;
    private final Context zzh;

    public zzdvz(Context context, zzfba zzfbaVar, zzdva zzdvaVar, zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, zzdzb zzdzbVar, zzffy zzffyVar) {
        this.zzh = context;
        this.zzd = zzfbaVar;
        this.zzb = zzdvaVar;
        this.zzc = zzgbnVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzbVar;
        this.zzg = zzffyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxb
    public final I3.b zzc(zzbuo zzbuoVar) {
        Context context = this.zzh;
        I3.b zzc = this.zzb.zzc(zzbuoVar);
        zzffn zza2 = zzffm.zza(context, 11);
        zzffx.zzd(zzc, zza2);
        I3.b zzn = zzgbc.zzn(zzc, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdvw
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                I3.b zzh;
                zzh = zzgbc.zzh(new zzfar(new zzfao(zzdvz.this.zzd), zzfaq.zza(new InputStreamReader(r2.zzb()), ((zzdxd) obj).zza())));
                return zzh;
            }
        }, this.zzc);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfC)).booleanValue()) {
            zzn = zzgbc.zzf(zzgbc.zzo(zzn, ((Integer) r2.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdvx
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzgbc.zzg(new zzdus(5));
                }
            }, zzbza.zzg);
        }
        zzffx.zza(zzn, this.zzg, zza2);
        zzgbc.zzr(zzn, new zzdvy(this), zzbza.zzg);
        return zzn;
    }
}
