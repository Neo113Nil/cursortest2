package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzddi extends com.google.android.gms.ads.internal.client.zzdw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzemv zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzddi(zzfld zzfldVar, String str, zzemv zzemvVar, zzflg zzflgVar, String str2) {
        String str3 = null;
        this.zzb = zzfldVar == null ? null : zzfldVar.zzab;
        this.zzc = str2;
        this.zzd = zzflgVar == null ? null : zzflgVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfldVar != null) {
            try {
                str3 = zzfldVar.zzv.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzemvVar.zzh();
        this.zzh = zzemvVar;
        this.zzj = zzfldVar == null ? 0.0d : zzfldVar.zzaz;
        this.zzk = zzfldVar == null ? 2 : zzfldVar.zzaI;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzw)).booleanValue()) {
            Bundle bundle = new Bundle();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhQ)).booleanValue() && zzflgVar != null) {
                bundle.putAll(zzflgVar.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhR)).booleanValue() && zzfldVar != null) {
                bundle.putAll(zzfldVar.zzaF);
            }
            this.zzi = bundle;
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhQ)).booleanValue() || zzflgVar == null) {
                this.zzi = new Bundle();
            } else {
                this.zzi = zzflgVar.zzk;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhR)).booleanValue() && zzfldVar != null) {
                Bundle bundle2 = zzfldVar.zzaF;
                Bundle bundle3 = this.zzi;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                }
            }
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkM)).booleanValue() || zzflgVar == null || TextUtils.isEmpty(zzflgVar.zzi)) ? "" : zzflgVar.zzi;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzemv zzemvVar = this.zzh;
        if (zzemvVar != null) {
            return zzemvVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.zzc;
    }

    public final double zzk() {
        return this.zzj;
    }

    public final int zzl() {
        return this.zzk;
    }
}
