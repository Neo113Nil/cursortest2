package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdck extends com.google.android.gms.ads.internal.client.zzdw {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzelx zzh;
    private final android.os.Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzdck(com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.lang.String str, com.google.android.gms.internal.ads.zzelx zzelxVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, java.lang.String str2) {
        java.lang.String str3 = null;
        this.zzb = zzfkfVar == null ? null : zzfkfVar.zzab;
        this.zzc = str2;
        this.zzd = zzfkiVar == null ? null : zzfkiVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfkfVar != null) {
            try {
                str3 = zzfkfVar.zzv.getString("class_name");
            } catch (org.json.JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzelxVar.zzh();
        this.zzh = zzelxVar;
        this.zzj = zzfkfVar == null ? 0.0d : zzfkfVar.zzaz;
        this.zzk = zzfkfVar == null ? 2 : zzfkfVar.zzaI;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhK)).booleanValue() || zzfkiVar == null) {
            this.zzi = new android.os.Bundle();
        } else {
            this.zzi = zzfkiVar.zzk;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhL)).booleanValue() && zzfkfVar != null) {
            android.os.Bundle bundle = zzfkfVar.zzaF;
            android.os.Bundle bundle2 = this.zzi;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
        this.zzg = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkF)).booleanValue() || zzfkiVar == null || android.text.TextUtils.isEmpty(zzfkiVar.zzi)) ? "" : zzfkiVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final java.lang.String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final java.lang.String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final java.lang.String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final java.util.List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        com.google.android.gms.internal.ads.zzelx zzelxVar = this.zzh;
        if (zzelxVar != null) {
            return zzelxVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final android.os.Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final java.lang.String zzj() {
        return this.zzc;
    }

    public final java.lang.String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}
