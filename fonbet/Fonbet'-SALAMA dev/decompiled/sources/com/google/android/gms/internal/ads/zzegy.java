package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes.dex */
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
        final zzebu zzebuVar;
        Iterator it = zzfafVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzebuVar = null;
                break;
            }
            try {
                zzebuVar = this.zza.zza((String) it.next(), zzfafVar.zzv);
                break;
            } catch (zzfbh unused) {
            }
        }
        if (zzebuVar == null) {
            return zzgbc.zzg(new zzeeo("Unable to instantiate mediation adapter class."));
        }
        zzbzf zzbzfVar = new zzbzf();
        zzebuVar.zzc.zza(new zzegx(this, zzebuVar, zzbzfVar));
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
                zzegy.this.zzb.zzb(zzfarVar, zzfafVar, zzebuVar);
            }
        }, this.zzd, zzfey.ADAPTER_LOAD_AD_SYN, zzffeVar).zzb(zzfey.ADAPTER_LOAD_AD_ACK).zzd(zzbzfVar).zzb(zzfey.ADAPTER_WRAP_ADAPTER).zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                Object zza;
                zza = zzegy.this.zzb.zza(zzfarVar, zzfafVar, zzebuVar);
                return zza;
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        return !zzfafVar.zzt.isEmpty();
    }
}
