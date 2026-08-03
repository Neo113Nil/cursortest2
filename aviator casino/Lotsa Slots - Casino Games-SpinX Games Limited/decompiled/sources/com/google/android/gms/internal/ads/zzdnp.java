package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdnp implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzddl {
    com.google.android.gms.internal.ads.zzeln zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcku zzc;
    private final com.google.android.gms.internal.ads.zzfkf zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzell zzf;

    public zzdnp(android.content.Context context, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzell zzellVar) {
        this.zzb = context;
        this.zzc = zzckuVar;
        this.zzd = zzfkfVar;
        this.zze = versionInfoParcel;
        this.zzf = zzellVar;
    }

    private final boolean zzl() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
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

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzckuVar = this.zzc) == null) {
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgq)).booleanValue()) {
                zzckuVar.zze("onSdkImpression", new androidx.collection.ArrayMap());
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

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzelk zzelkVar;
        com.google.android.gms.internal.ads.zzelj zzeljVar;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzd;
        if (!zzfkfVar.zzT || (zzckuVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zze;
            int i = versionInfoParcel.buddyApkVersion;
            int i2 = versionInfoParcel.clientJarVersion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            java.lang.String sb2 = sb.toString();
            com.google.android.gms.internal.ads.zzflb zzflbVar = zzfkfVar.zzV;
            java.lang.String zza = zzflbVar.zza();
            if (zzflbVar.zzc() == 1) {
                zzeljVar = com.google.android.gms.internal.ads.zzelj.VIDEO;
                zzelkVar = com.google.android.gms.internal.ads.zzelk.DEFINED_BY_JAVASCRIPT;
            } else {
                zzelkVar = zzfkfVar.zzY == 2 ? com.google.android.gms.internal.ads.zzelk.UNSPECIFIED : com.google.android.gms.internal.ads.zzelk.BEGIN_TO_RENDER;
                zzeljVar = com.google.android.gms.internal.ads.zzelj.HTML_DISPLAY;
            }
            com.google.android.gms.internal.ads.zzeln zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzckuVar.zzD(), "", "javascript", zza, zzelkVar, zzeljVar, zzfkfVar.zzal);
            this.zza = zzc;
            if (zzc != null) {
                com.google.android.gms.internal.ads.zzfuk zza2 = zzc.zza();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgm)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzckuVar.zzD());
                    java.util.Iterator it = zzckuVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zza2, (android.view.View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzckuVar.zzE());
                }
                zzckuVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                zzckuVar.zze("onSdkLoaded", new androidx.collection.ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgq)).booleanValue() || (zzckuVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzckuVar.zze("onSdkImpression", new androidx.collection.ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
