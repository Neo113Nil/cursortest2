package com.google.android.recaptcha.internal;

import D6.C0136t;
import D6.InterfaceC0135s;
import android.webkit.JavascriptInterface;
import f6.C1116i;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzgo {
    final /* synthetic */ zzgv zza;
    private Long zzb;
    private final zzgz zzc = zzgz.zzb();

    public zzgo(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzdc zzdcVar;
        zzdf zzdfVar;
        zzgv zzgvVar = this.zza;
        if (zzgvVar.zzq().zzb == null) {
            zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzi = zzre.zzi();
        zzi.zze(zzJ);
        zzre zzreVar = (zzre) zzi.zzj();
        zzdcVar = this.zza.zzl;
        zzdcVar.zze(zzreVar);
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzdc zzdcVar;
        zzb();
        zzrd zzi = zzre.zzi();
        zzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        zzre zzreVar = (zzre) zzi.zzj();
        zzdcVar = this.zza.zzl;
        zzdcVar.zze(zzreVar);
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzqz zzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() != zzrc.JS_CODE_SUCCESS) {
            zzg.zzi().name();
            int i7 = zzbj.zza;
            zzbj zza = zzbi.zza(zzg.zzi());
            this.zza.zzu().hashCode();
            ((C0136t) this.zza.zzu()).O(zza);
            return;
        }
        this.zza.zzu().hashCode();
        if (((C0136t) this.zza.zzu()).C(C1116i.f13008a)) {
            return;
        }
        this.zza.zzu().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzdv zzdvVar = this.zza.zzb;
        if (zzdvVar == null) {
            zzdvVar = null;
        }
        zzdvVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzpw zzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzi.toString();
        map = this.zza.zzi;
        InterfaceC0135s interfaceC0135s = (InterfaceC0135s) map.remove(zzi.zzk());
        if (interfaceC0135s != null) {
            ((C0136t) interfaceC0135s).C(zzi);
        }
    }
}
