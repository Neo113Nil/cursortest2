package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzot extends com.google.android.gms.measurement.internal.zzok {
    zzot(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
    }

    private final java.lang.String zzd(java.lang.String str) {
        java.lang.String zzc = this.zzg.zzh().zzc(str);
        if (android.text.TextUtils.isEmpty(zzc)) {
            return (java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzq.zzb(null);
        }
        android.net.Uri parse = android.net.Uri.parse((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzq.zzb(null));
        android.net.Uri.Builder buildUpon = parse.buildUpon();
        java.lang.String authority = parse.getAuthority();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 1 + java.lang.String.valueOf(authority).length());
        sb.append(zzc);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }

    private static final boolean zzf(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzs.zzb(null);
        if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        for (java.lang.String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzos zza(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzh zzu;
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
        com.google.android.gms.measurement.internal.zzh zzu2 = zzpfVar.zzj().zzu(str);
        com.google.android.gms.measurement.internal.zzos zzosVar = null;
        if (zzu2 == null || !zzu2.zzai()) {
            return new com.google.android.gms.measurement.internal.zzos(zzd(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzlr.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.zzil zzb = com.google.android.gms.internal.measurement.zzis.zzb();
        zzb.zzb(2);
        zzb.zza((com.google.android.gms.internal.measurement.zzin) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.internal.measurement.zzin.zzb(zzu2.zzaL())));
        java.lang.String zzd = zzu2.zzd();
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzpfVar.zzh().zzb(str);
        if (zzb2 == null || (zzu = zzpfVar.zzj().zzu(str)) == null || ((!zzb2.zzp() || zzb2.zzq().zzc() != 100) && !this.zzu.zzk().zzaa(str, zzu.zzay()) && (android.text.TextUtils.isEmpty(zzd) || java.lang.Math.abs(zzd.hashCode() % 100) >= zzb2.zzq().zzc()))) {
            zzb.zzc(3);
            return new com.google.android.gms.measurement.internal.zzos(zzd(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzlr.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzb.zzbc());
        }
        java.lang.String zzc = zzu2.zzc();
        zzb.zzb(2);
        com.google.android.gms.internal.measurement.zzgl zzb3 = zzpfVar.zzh().zzb(zzu2.zzc());
        if (zzb3 == null || !zzb3.zzp()) {
            this.zzu.zzaV().zzk().zzb("[sgtm] Missing sgtm_setting in remote config. appId", zzc);
            zzb.zzc(4);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(zzu2.zzay())) {
                hashMap.put("x-gtm-server-preview", zzu2.zzay());
            }
            java.lang.String zzd2 = zzb3.zzq().zzd();
            com.google.android.gms.internal.measurement.zzin zzb4 = com.google.android.gms.internal.measurement.zzin.zzb(zzu2.zzaL());
            if (zzb4 != null && zzb4 != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
                zzb.zza(zzb4);
            } else if (zzf(zzu2.zzc())) {
                zzb.zza(com.google.android.gms.internal.measurement.zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (android.text.TextUtils.isEmpty(zzd2)) {
                zzb.zza(com.google.android.gms.internal.measurement.zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.zzu.zzaV().zzk().zzb("[sgtm] Eligible for client side upload. appId", zzc);
                zzb.zzb(3);
                zzb.zza(com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE);
                zzosVar = new com.google.android.gms.measurement.internal.zzos(zzd2, hashMap, com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT, (com.google.android.gms.internal.measurement.zzis) zzb.zzbc());
            }
            zzb3.zzq().zza();
            zzb3.zzq().zzb();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaU();
            if (android.text.TextUtils.isEmpty(zzd2)) {
                zzb.zzc(6);
                zzibVar.zzaV().zzk().zzb("[sgtm] Local service, missing sgtm_server_url", zzu2.zzc());
            } else {
                zzibVar.zzaV().zzk().zzb("[sgtm] Eligible for local service direct upload. appId", zzc);
                zzb.zzb(5);
                zzb.zzc(2);
                zzosVar = new com.google.android.gms.measurement.internal.zzos(zzd2, hashMap, com.google.android.gms.measurement.internal.zzlr.SGTM, (com.google.android.gms.internal.measurement.zzis) zzb.zzbc());
            }
        }
        return zzosVar != null ? zzosVar : new com.google.android.gms.measurement.internal.zzos(zzd(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzlr.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzb.zzbc());
    }

    final boolean zzc(java.lang.String str, com.google.android.gms.internal.measurement.zzin zzinVar) {
        com.google.android.gms.internal.measurement.zzgl zzb;
        zzg();
        return (zzinVar != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE || zzf(str) || (zzb = this.zzg.zzh().zzb(str)) == null || !zzb.zzp() || zzb.zzq().zzd().isEmpty()) ? false : true;
    }
}
