package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzejn implements zzfpi {
    private static final Pattern zze = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfqw zzb;
    private final zzfrg zzc;
    private final zzcny zzd;

    public zzejn(String str, zzfrg zzfrgVar, zzfqw zzfqwVar, zzcny zzcnyVar) {
        this.zza = str;
        this.zzc = zzfrgVar;
        this.zzb = zzfqwVar;
        this.zzd = zzcnyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    @Override // com.google.android.gms.internal.ads.zzfpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzefb zzefbVar;
        byte[] bArr;
        byte[] bArr2;
        JSONObject zza;
        String str;
        zzejm zzejmVar = (zzejm) obj;
        int optInt = zzejmVar.zza().optInt("http_timeout_millis", 60000);
        zzcbx zzb = zzejmVar.zzb();
        String str2 = "";
        if (zzb.zza() != -2) {
            if (zzb.zza() == 1) {
                if (zzb.zzb() != null) {
                    str2 = TextUtils.join(", ", zzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(str2);
                }
                String.valueOf(str2);
                zzefbVar = new zzefb(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzefbVar = new zzefb(1);
            }
            zzfrg zzfrgVar = this.zzc;
            zzfqw zzfqwVar = this.zzb;
            zzfqwVar.zzj(zzefbVar);
            zzfqwVar.zzd(false);
            zzfrgVar.zza(zzfqwVar);
            throw zzefbVar;
        }
        HashMap hashMap = new HashMap();
        if (zzejmVar.zzb().zzg()) {
            String str3 = this.zza;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbF)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zze.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, str3);
                }
            }
        }
        if (zzejmVar.zzb().zzf() && (zza = zzejmVar.zza()) != null) {
            JSONObject optJSONObject = zza.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (((Boolean) zzbks.zza.zze()).booleanValue()) {
            zzcny zzcnyVar = this.zzd;
            zzcnyVar.zza();
            String zzb2 = zzcnyVar.zzb();
            if (!TextUtils.isEmpty(zzb2)) {
                hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkp), zzb2);
            }
        }
        byte[] bArr3 = new byte[0];
        if (!TextUtils.isEmpty(zzejmVar.zzb().zzd())) {
            bArr3 = zzejmVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzejmVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr3);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PrepareRequestFunction.apply");
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                    bArr = bArr2;
                    String zzl = TextUtils.isEmpty(zzejmVar.zzb().zzl()) ? zzejmVar.zzb().zzl() : "";
                    zzfrg zzfrgVar2 = this.zzc;
                    zzfqw zzfqwVar2 = this.zzb;
                    zzfqwVar2.zzd(true);
                    zzfrgVar2.zza(zzfqwVar2);
                    return new zzeji(zzejmVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzejmVar.zzb().zzf());
                }
            }
        }
        bArr = bArr3;
        if (TextUtils.isEmpty(zzejmVar.zzb().zzl())) {
        }
        zzfrg zzfrgVar22 = this.zzc;
        zzfqw zzfqwVar22 = this.zzb;
        zzfqwVar22.zzd(true);
        zzfrgVar22.zza(zzfqwVar22);
        return new zzeji(zzejmVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzejmVar.zzb().zzf());
    }
}
