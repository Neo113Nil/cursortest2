package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdve extends zzbnl {
    private final Context zza;
    private final zzdqr zzb;
    private zzdrq zzc;
    private zzdqm zzd;

    public zzdve(Context context, zzdqr zzdqrVar, zzdrq zzdrqVar, zzdqm zzdqmVar) {
        this.zza = context;
        this.zzb = zzdqrVar;
        this.zzc = zzdrqVar;
        this.zzd = zzdqmVar;
    }

    final /* synthetic */ zzdqm zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbmv zzf(String str) {
        return (zzbmv) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final List zzg() {
        try {
            zzdqr zzdqrVar = this.zzb;
            SimpleArrayMap zzaa = zzdqrVar.zzaa();
            SimpleArrayMap zzad = zzdqrVar.zzad();
            String[] strArr = new String[zzaa.size() + zzad.size()];
            int i = 0;
            for (int i2 = 0; i2 < zzaa.size(); i2++) {
                strArr[i] = (String) zzaa.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzad.size(); i3++) {
                strArr[i] = (String) zzad.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzi(String str) {
        zzdqm zzdqmVar = this.zzd;
        if (zzdqmVar != null) {
            zzdqmVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzj() {
        zzdqm zzdqmVar = this.zzd;
        if (zzdqmVar != null) {
            zzdqmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzl() {
        zzdqm zzdqmVar = this.zzd;
        if (zzdqmVar != null) {
            zzdqmVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdrq zzdrqVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdrqVar = this.zzc) == null || !zzdrqVar.zzd((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdvd(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzo() {
        zzdqm zzdqmVar = this.zzd;
        if (zzdqmVar != null && !zzdqmVar.zzM()) {
            return false;
        }
        zzdqr zzdqrVar = this.zzb;
        return zzdqrVar.zzW() != null && zzdqrVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzp() {
        zzdqr zzdqrVar = this.zzb;
        zzeml zzZ = zzdqrVar.zzZ();
        if (zzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzZ.zza());
        if (zzdqrVar.zzW() == null) {
            return true;
        }
        zzdqrVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdqm zzdqmVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzZ() == null || (zzdqmVar = this.zzd) == null) {
            return;
        }
        zzdqmVar.zzN((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzr() {
        try {
            String zzac = this.zzb.zzac();
            if (Objects.equals(zzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzac)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdqm zzdqmVar = this.zzd;
                if (zzdqmVar != null) {
                    zzdqmVar.zzL(zzac, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbms zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdrq zzdrqVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdrqVar = this.zzc) == null || !zzdrqVar.zze((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdvd(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
