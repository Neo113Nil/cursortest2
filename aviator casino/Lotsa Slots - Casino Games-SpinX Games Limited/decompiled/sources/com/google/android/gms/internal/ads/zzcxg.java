package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxg implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzddl {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcku zzb;
    private final com.google.android.gms.internal.ads.zzfkf zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private com.google.android.gms.internal.ads.zzeln zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzell zzg;

    public zzcxg(android.content.Context context, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzell zzellVar) {
        this.zza = context;
        this.zzb = zzckuVar;
        this.zzc = zzfkfVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzellVar;
    }

    private final synchronized void zza() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzelk zzelkVar;
        com.google.android.gms.internal.ads.zzelj zzeljVar;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
        if (zzfkfVar.zzT && (zzckuVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
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
                    int i3 = zzfkfVar.zze;
                    com.google.android.gms.internal.ads.zzelj zzeljVar2 = com.google.android.gms.internal.ads.zzelj.HTML_DISPLAY;
                    zzelkVar = i3 == 1 ? com.google.android.gms.internal.ads.zzelk.ONE_PIXEL : com.google.android.gms.internal.ads.zzelk.BEGIN_TO_RENDER;
                    zzeljVar = zzeljVar2;
                }
                com.google.android.gms.internal.ads.zzeln zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzckuVar.zzD(), "", "javascript", zza, zzelkVar, zzeljVar, zzfkfVar.zzal);
                this.zze = zzc;
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
                    zzckuVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                    this.zzf = true;
                    zzckuVar.zze("onSdkLoaded", new androidx.collection.ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final synchronized void zzdr() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzckuVar = this.zzb) == null) {
            return;
        }
        zzckuVar.zze("onSdkImpression", new androidx.collection.ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
