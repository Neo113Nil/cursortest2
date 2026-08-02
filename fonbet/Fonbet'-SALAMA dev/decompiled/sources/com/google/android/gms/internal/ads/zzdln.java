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
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import r.l;

/* loaded from: classes.dex */
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
    public final InterfaceC1506a zzh() {
        return new BinderC1507b(this.zza);
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
            l zzh = this.zzb.zzh();
            l zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.f16007c + zzi.f16007c];
            int i7 = 0;
            for (int i8 = 0; i8 < zzh.f16007c; i8++) {
                strArr[i7] = (String) zzh.h(i8);
                i7++;
            }
            for (int i9 = 0; i9 < zzi.f16007c; i9++) {
                strArr[i7] = (String) zzi.h(i9);
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
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                int i7 = J.f3546b;
                j.g("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzC)) {
                int i8 = J.f3546b;
                j.g("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdgx zzdgxVar = this.zzd;
                if (zzdgxVar != null) {
                    zzdgxVar.zzf(zzC, false);
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
    public final void zzp(InterfaceC1506a interfaceC1506a) {
        zzdgx zzdgxVar;
        Object t02 = BinderC1507b.t0(interfaceC1506a);
        if (!(t02 instanceof View) || this.zzb.zzu() == null || (zzdgxVar = this.zzd) == null) {
            return;
        }
        zzdgxVar.zzK((View) t02);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzq() {
        zzdgx zzdgxVar = this.zzd;
        return (zzdgxVar == null || zzdgxVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzr(InterfaceC1506a interfaceC1506a) {
        zzdic zzdicVar;
        Object t02 = BinderC1507b.t0(interfaceC1506a);
        if (!(t02 instanceof ViewGroup) || (zzdicVar = this.zzc) == null || !zzdicVar.zzf((ViewGroup) t02)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdlm(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzs(InterfaceC1506a interfaceC1506a) {
        zzdic zzdicVar;
        Object t02 = BinderC1507b.t0(interfaceC1506a);
        if (!(t02 instanceof ViewGroup) || (zzdicVar = this.zzc) == null || !zzdicVar.zzg((ViewGroup) t02)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdlm(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzt() {
        zzebm zzu = this.zzb.zzu();
        if (zzu == null) {
            int i7 = J.f3546b;
            j.g("Trying to start OMID session before creation.");
            return false;
        }
        o.f1952C.f1977x.zzk(zzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new r.b());
        return true;
    }
}
