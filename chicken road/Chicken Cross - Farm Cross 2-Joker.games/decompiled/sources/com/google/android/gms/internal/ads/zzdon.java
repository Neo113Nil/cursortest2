package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdon implements zzdfd, com.google.android.gms.ads.internal.overlay.zzr, zzdej {
    zzeml zza;
    private final Context zzb;
    private final zzclm zzc;
    private final zzfld zzd;
    private final VersionInfoParcel zze;
    private final zzemj zzf;

    public zzdon(Context context, zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.zzb = context;
        this.zzc = zzclmVar;
        this.zzd = zzfldVar;
        this.zze = versionInfoParcel;
        this.zzf = zzemjVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzclm zzclmVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzclmVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgw)).booleanValue()) {
                zzclmVar.zze("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        zzfld zzfldVar = this.zzd;
        if (!zzfldVar.zzT || (zzclmVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i = versionInfoParcel.buddyApkVersion;
            int i2 = versionInfoParcel.clientJarVersion;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            zzflz zzflzVar = zzfldVar.zzV;
            String zza = zzflzVar.zza();
            if (zzflzVar.zzc() == 1) {
                zzemhVar = zzemh.VIDEO;
                zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
            } else {
                zzemiVar = zzfldVar.zzY == 2 ? zzemi.UNSPECIFIED : zzemi.BEGIN_TO_RENDER;
                zzemhVar = zzemh.HTML_DISPLAY;
            }
            zzeml zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzclmVar.zzD(), "", "javascript", zza, zzemiVar, zzemhVar, zzfldVar.zzal);
            this.zza = zzc;
            if (zzc != null) {
                zzfvm zza2 = zzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgs)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzclmVar.zzD());
                    Iterator it = zzclmVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zza2, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzclmVar.zzE());
                }
                zzclmVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                zzclmVar.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzclm zzclmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgw)).booleanValue() || (zzclmVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzclmVar.zze("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
