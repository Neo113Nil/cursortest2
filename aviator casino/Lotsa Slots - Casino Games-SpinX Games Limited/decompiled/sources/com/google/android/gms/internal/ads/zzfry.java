package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfry {
    private final com.google.android.gms.internal.ads.zzepd zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfkr zzf;
    private final com.google.android.gms.internal.ads.zzfks zzg;
    private final com.google.android.gms.common.util.Clock zzh;
    private final com.google.android.gms.internal.ads.zzbap zzi;

    public zzfry(com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, java.lang.String str2, android.content.Context context, com.google.android.gms.internal.ads.zzfkr zzfkrVar, com.google.android.gms.internal.ads.zzfks zzfksVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzbap zzbapVar) {
        this.zza = zzepdVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfkrVar;
        this.zzg = zzfksVar;
        this.zzh = clock;
        this.zzi = zzbapVar;
    }

    public static java.lang.String zzd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (true == android.text.TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzg(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final java.util.List zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.util.List list) {
        return zzb(zzfkqVar, zzfkfVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0154, code lost:
    
        if (r5 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, boolean z, java.lang.String str, java.lang.String str2, java.util.List list, com.google.android.gms.internal.ads.zzdbn zzdbnVar, com.google.android.gms.internal.ads.zzcfe zzcfeVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            java.lang.String zzd = zzd(zzd(zzd((java.lang.String) it.next(), "@gw_adlocid@", zzfkqVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfkfVar != null) {
                java.lang.String zzd2 = zzd(zzd(zzd(zzd, "@gw_qdata@", zzfkfVar.zzy), "@gw_adnetid@", zzfkfVar.zzx), "@gw_allocid@", zzfkfVar.zzw);
                android.content.Context context = this.zze;
                zzd = com.google.android.gms.internal.ads.zzceb.zza(zzd2, context, zzfkfVar.zzW, zzfkfVar.zzaw);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoZ)).booleanValue() && zzfkfVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzd = zzd(zzd, "@gw_aps@", true == com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "1" : "0");
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpk)).booleanValue() && zzcfeVar != null) {
                    int i = zzcfeVar.zza;
                    java.lang.String zzd3 = zzd(zzd, "@gw_is@", i >= 0 ? java.lang.Integer.toString(i) : "");
                    int i2 = zzcfeVar.zzb;
                    java.lang.String zzd4 = zzd(zzd3, "@gw_fis@", i2 >= 0 ? java.lang.Integer.toString(i2) : "");
                    int i3 = zzcfeVar.zzc;
                    zzd = zzd(zzd4, "@gw_sfis@", i3 >= 0 ? java.lang.Integer.toString(i3) : "");
                }
            }
            com.google.android.gms.internal.ads.zzepd zzepdVar = this.zza;
            java.lang.String zzd5 = zzd(zzd(zzd(zzd(zzd, "@gw_adnetstatus@", zzepdVar.zzg()), "@gw_ttr@", java.lang.Long.toString(zzepdVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpi)).booleanValue()) {
                zzd5 = (zzdbnVar == null || zzdbnVar.zza() <= 0) ? zzd(zzd5, "@gw_placement_id@", "") : zzd(zzd5, "@gw_placement_id@", java.lang.Long.toString(zzdbnVar.zza(), 10));
            }
            boolean z3 = false;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzet)).booleanValue() && !android.text.TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !android.text.TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            }
            if (this.zzi.zza(android.net.Uri.parse(zzd5))) {
                android.net.Uri.Builder buildUpon = android.net.Uri.parse(zzd5).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzd5 = buildUpon.build().toString();
                arrayList.add(zzd5);
            }
            arrayList.add(zzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.util.List list, com.google.android.gms.internal.ads.zzcbp zzcbpVar) {
        com.google.android.gms.internal.ads.zzfkr zzfkrVar;
        com.google.android.gms.internal.ads.zzgth zzd;
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            java.lang.String zzb = zzcbpVar.zzb();
            java.lang.String num = java.lang.Integer.toString(zzcbpVar.zzc());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeu)).booleanValue()) {
                com.google.android.gms.internal.ads.zzfks zzfksVar = this.zzg;
                if (zzfksVar == null) {
                    zzd = com.google.android.gms.internal.ads.zzgth.zzc();
                    java.lang.String str = (java.lang.String) zzd.zzb(com.google.android.gms.internal.ads.zzfrx.zza).zza("");
                    java.lang.String str2 = (java.lang.String) zzd.zzb(com.google.android.gms.internal.ads.zzfrw.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.google.android.gms.internal.ads.zzceb.zza(zzd(zzd(zzd(zzd(zzd(zzd((java.lang.String) it.next(), "@gw_rwd_userid@", android.net.Uri.encode(str)), "@gw_rwd_custom_data@", android.net.Uri.encode(str2)), "@gw_tmstmp@", java.lang.Long.toString(currentTimeMillis)), "@gw_rwd_itm@", android.net.Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfkfVar.zzW, zzfkfVar.zzaw));
                    }
                    return arrayList;
                }
                zzfkrVar = zzfksVar.zza;
            } else {
                zzfkrVar = this.zzf;
            }
            zzd = com.google.android.gms.internal.ads.zzgth.zzd(zzfkrVar);
            java.lang.String str3 = (java.lang.String) zzd.zzb(com.google.android.gms.internal.ads.zzfrx.zza).zza("");
            java.lang.String str22 = (java.lang.String) zzd.zzb(com.google.android.gms.internal.ads.zzfrw.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
