package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeip implements com.google.android.gms.internal.ads.zzfok {
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzfpw zzb;
    private final com.google.android.gms.internal.ads.zzfqg zzc;

    public zzeip(java.lang.String str, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zza = str;
        this.zzc = zzfqgVar;
        this.zzb = zzfpwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    @Override // com.google.android.gms.internal.ads.zzfok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzeed zzeedVar;
        byte[] bArr;
        byte[] bArr2;
        org.json.JSONObject zza;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzeio zzeioVar = (com.google.android.gms.internal.ads.zzeio) obj;
        int optInt = zzeioVar.zza().optInt("http_timeout_millis", 60000);
        com.google.android.gms.internal.ads.zzcbf zzb = zzeioVar.zzb();
        java.lang.String str2 = "";
        if (zzb.zza() != -2) {
            if (zzb.zza() == 1) {
                if (zzb.zzb() != null) {
                    str2 = android.text.TextUtils.join(", ", zzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(str2);
                }
                java.lang.String.valueOf(str2);
                zzeedVar = new com.google.android.gms.internal.ads.zzeed(2, "Error building request URL: ".concat(java.lang.String.valueOf(str2)));
            } else {
                zzeedVar = new com.google.android.gms.internal.ads.zzeed(1);
            }
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zzc;
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
            zzfpwVar.zzj(zzeedVar);
            zzfpwVar.zzd(false);
            zzfqgVar.zza(zzfpwVar);
            throw zzeedVar;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (zzeioVar.zzb().zzg()) {
            java.lang.String str3 = this.zza;
            if (!android.text.TextUtils.isEmpty(str3)) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbA)).booleanValue()) {
                    if (android.text.TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        java.util.regex.Matcher matcher = zzd.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            java.lang.String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(java.util.Locale.ROOT).startsWith("id=") || group.toLowerCase(java.util.Locale.ROOT).startsWith("ide="))) {
                                if (!android.text.TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str)) {
                        hashMap.put(com.google.common.net.HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(com.google.common.net.HttpHeaders.COOKIE, str3);
                }
            }
        }
        if (zzeioVar.zzb().zzf() && (zza = zzeioVar.zza()) != null) {
            org.json.JSONObject optJSONObject = zza.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!android.text.TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!android.text.TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] bArr3 = new byte[0];
        if (!android.text.TextUtils.isEmpty(zzeioVar.zzb().zzd())) {
            bArr3 = zzeioVar.zzb().zzd().getBytes(java.nio.charset.StandardCharsets.UTF_8);
            if (zzeioVar.zzb().zzm()) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr3);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (java.io.IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                    bArr = bArr2;
                    java.lang.String zzl = android.text.TextUtils.isEmpty(zzeioVar.zzb().zzl()) ? zzeioVar.zzb().zzl() : "";
                    com.google.android.gms.internal.ads.zzfqg zzfqgVar2 = this.zzc;
                    com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzb;
                    zzfpwVar2.zzd(true);
                    zzfqgVar2.zza(zzfpwVar2);
                    return new com.google.android.gms.internal.ads.zzeik(zzeioVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeioVar.zzb().zzf());
                }
            }
        }
        bArr = bArr3;
        if (android.text.TextUtils.isEmpty(zzeioVar.zzb().zzl())) {
        }
        com.google.android.gms.internal.ads.zzfqg zzfqgVar22 = this.zzc;
        com.google.android.gms.internal.ads.zzfpw zzfpwVar22 = this.zzb;
        zzfpwVar22.zzd(true);
        zzfqgVar22.zza(zzfpwVar22);
        return new com.google.android.gms.internal.ads.zzeik(zzeioVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeioVar.zzb().zzf());
    }
}
