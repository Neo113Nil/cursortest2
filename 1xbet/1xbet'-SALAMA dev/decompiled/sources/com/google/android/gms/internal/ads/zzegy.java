package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzegy implements zzebr {
    private final zzebt zza;
    private final zzebx zzb;
    private final zzffe zzc;
    private final zzgbn zzd;

    public zzegy(zzffe zzffeVar, zzgbn zzgbnVar, zzebt zzebtVar, zzebx zzebxVar) {
        this.zzc = zzffeVar;
        this.zzd = zzgbnVar;
        this.zzb = zzebxVar;
        this.zza = zzebtVar;
    }

    public static final String zze(String str, int i7) {
        return "Error from: " + str + ", code: " + i7;
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        final zzebu zzebuVarZza;
        Iterator it = zzfafVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzebuVarZza = null;
                break;
            }
            try {
                zzebuVarZza = this.zza.zza((String) it.next(), zzfafVar.zzv);
                break;
            } catch (zzfbh unused) {
            }
        }
        if (zzebuVarZza == null) {
            return zzgbc.zzg(new zzeeo("Unable to instantiate mediation adapter class."));
        }
        zzbzf zzbzfVar = new zzbzf();
        zzebuVarZza.zzc.zza(new zzegx(this, zzebuVarZza, zzbzfVar));
        if (zzfafVar.zzM) {
            Bundle bundle = zzfarVar.zza.zza.zzd.f10742D;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzffe zzffeVar = this.zzc;
        return zzfeo.zzd(new zzfej() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // com.google.android.gms.internal.ads.zzfej
            public final void zza() {
                this.zza.zzb.zzb(zzfarVar, zzfafVar, zzebuVarZza);
            }
        }, this.zzd, zzfey.ADAPTER_LOAD_AD_SYN, zzffeVar).zzb(zzfey.ADAPTER_LOAD_AD_ACK).zzd(zzbzfVar).zzb(zzfey.ADAPTER_WRAP_ADAPTER).zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                return this.zza.zzb.zza(zzfarVar, zzfafVar, zzebuVarZza);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        return !zzfafVar.zzt.isEmpty();
    }
}
