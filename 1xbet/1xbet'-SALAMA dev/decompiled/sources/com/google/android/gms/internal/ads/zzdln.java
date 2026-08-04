package com.google.android.gms.internal.ads;

import E2.o;
import F2.I0;
import I2.J;
import J2.j;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p122r.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzdln extends zzbgc {
    private final Context zza;
    private final zzdhc zzb;
    private zzdic zzc;
    private zzdgx zzd;

    public zzdln(Context context, zzdhc zzdhcVar, zzdic zzdicVar, zzdgx zzdgxVar) {
        this.zza = context;
        this.zzb = zzdhcVar;
        this.zzc = zzdicVar;
        this.zzd = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final I0 zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfg zzf() {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfj zzg(String str) {
        return (zzbfj) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final p105o3.a zzh() {
        return new p105o3.b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final List zzk() {
        try {
            l lVarZzh = this.zzb.zzh();
            l lVarZzi = this.zzb.zzi();
            String[] strArr = new String[lVarZzh.f16013c + lVarZzi.f16013c];
            int i7 = 0;
            for (int i8 = 0; i8 < lVarZzh.f16013c; i8++) {
                strArr[i7] = (String) lVarZzh.h(i8);
                i7++;
            }
            for (int i9 = 0; i9 < lVarZzi.f16013c; i9++) {
                strArr[i7] = (String) lVarZzi.h(i9);
                i7++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzl() {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                int i7 = J.f3546b;
                j.g("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzC)) {
                int i8 = J.f3546b;
                j.g("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdgx zzdgxVar = this.zzd;
                if (zzdgxVar != null) {
                    zzdgxVar.zzf(strZzC, false);
                }
            }
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzn(String str) {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzo() {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzp(p105o3.a aVar) {
        zzdgx zzdgxVar;
        Object objT0 = p105o3.b.t0(aVar);
        if (!(objT0 instanceof View) || this.zzb.zzu() == null || (zzdgxVar = this.zzd) == null) {
            return;
        }
        zzdgxVar.zzK((View) objT0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzq() {
        zzdgx zzdgxVar = this.zzd;
        return (zzdgxVar == null || zzdgxVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzr(p105o3.a aVar) {
        zzdic zzdicVar;
        Object objT0 = p105o3.b.t0(aVar);
        if (!(objT0 instanceof ViewGroup) || (zzdicVar = this.zzc) == null || !zzdicVar.zzf((ViewGroup) objT0)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdlm(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzs(p105o3.a aVar) {
        zzdic zzdicVar;
        Object objT0 = p105o3.b.t0(aVar);
        if (!(objT0 instanceof ViewGroup) || (zzdicVar = this.zzc) == null || !zzdicVar.zzg((ViewGroup) objT0)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdlm(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzt() {
        zzebm zzebmVarZzu = this.zzb.zzu();
        if (zzebmVarZzu == null) {
            int i7 = J.f3546b;
            j.g("Trying to start OMID session before creation.");
            return false;
        }
        o.f1952C.f1977x.zzk(zzebmVarZzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new p122r.b());
        return true;
    }
}
