package com.google.android.recaptcha.internal;

import D6.C0136t;
import D6.InterfaceC0135s;
import android.webkit.JavascriptInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import p044f6.i;

/* JADX INFO: loaded from: classes.dex */
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
        zzgv zzgvVar = this.zza;
        if (zzgvVar.zzq().zzb == null) {
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzopVarZzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zze(zzopVarZzJ);
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzqz zzqzVarZzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzqzVarZzg.zzi().name();
        if (zzqzVarZzg.zzi() != zzrc.JS_CODE_SUCCESS) {
            zzqzVarZzg.zzi().name();
            int i7 = zzbj.zza;
            zzbj zzbjVarZza = zzbi.zza(zzqzVarZzg.zzi());
            this.zza.zzu().hashCode();
            ((C0136t) this.zza.zzu()).O(zzbjVarZza);
            return;
        }
        this.zza.zzu().hashCode();
        if (((C0136t) this.zza.zzu()).C(i.f13014a)) {
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
    public final void zzscd(String str) throws IllegalAccessException, InvocationTargetException {
        zzb();
        zzpw zzpwVarZzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzpwVarZzi.toString();
        InterfaceC0135s interfaceC0135s = (InterfaceC0135s) this.zza.zzi.remove(zzpwVarZzi.zzk());
        if (interfaceC0135s != null) {
            ((C0136t) interfaceC0135s).C(zzpwVarZzi);
        }
    }
}
