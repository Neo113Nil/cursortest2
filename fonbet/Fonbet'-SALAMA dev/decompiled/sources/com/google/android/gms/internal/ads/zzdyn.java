package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import android.text.TextUtils;
import io.sentry.util.HttpUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdyn implements zzfei {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzffn zzc;
    private final zzffy zzd;

    public zzdyn(String str, zzffy zzffyVar, zzffn zzffnVar) {
        this.zzb = str;
        this.zzd = zzffyVar;
        this.zzc = zzffnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        r0 = r12.zza;
     */
    @Override // com.google.android.gms.internal.ads.zzfei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj) {
        JSONObject jSONObject;
        zzbuq zzbuqVar;
        zzdus zzdusVar;
        zzbuq zzbuqVar2;
        zzbuq zzbuqVar3;
        zzbuq zzbuqVar4;
        zzbuq zzbuqVar5;
        zzbuq zzbuqVar6;
        zzbuq zzbuqVar7;
        zzbuq zzbuqVar8;
        JSONObject jSONObject2;
        String str;
        zzdym zzdymVar = (zzdym) obj;
        jSONObject = zzdymVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbuqVar = zzdymVar.zzb;
        String str2 = "";
        if (zzbuqVar.zza() != -2) {
            if (zzbuqVar.zza() == 1) {
                if (zzbuqVar.zzh() != null) {
                    str2 = TextUtils.join(", ", zzbuqVar.zzh());
                    int i7 = J.f3546b;
                    j.d(str2);
                }
                zzdusVar = new zzdus(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdusVar = new zzdus(1);
            }
            zzffy zzffyVar = this.zzd;
            zzffn zzffnVar = this.zzc;
            zzffnVar.zzh(zzdusVar);
            zzffnVar.zzg(false);
            zzffyVar.zza(zzffnVar);
            throw zzdusVar;
        }
        HashMap hashMap = new HashMap();
        zzbuqVar2 = zzdymVar.zzb;
        if (zzbuqVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbc)).booleanValue()) {
                String str3 = this.zzb;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = zza.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            Locale locale = Locale.ROOT;
                            if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(HttpUtils.COOKIE_HEADER_NAME, str);
                }
            } else {
                hashMap.put(HttpUtils.COOKIE_HEADER_NAME, this.zzb);
            }
        }
        zzbuqVar3 = zzdymVar.zzb;
        if (zzbuqVar3.zzk() && jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                J.k("DSID signal does not exist.");
            }
        }
        zzbuqVar4 = zzdymVar.zzb;
        if (zzbuqVar4 != null) {
            zzbuqVar7 = zzdymVar.zzb;
            if (!TextUtils.isEmpty(zzbuqVar7.zzf())) {
                zzbuqVar8 = zzdymVar.zzb;
                str2 = zzbuqVar8.zzf();
            }
        }
        zzffy zzffyVar2 = this.zzd;
        zzffn zzffnVar2 = this.zzc;
        zzffnVar2.zzg(true);
        zzffyVar2.zza(zzffnVar2);
        zzbuqVar5 = zzdymVar.zzb;
        String zzg = zzbuqVar5.zzg();
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        zzbuqVar6 = zzdymVar.zzb;
        return new zzdyi(zzg, optInt, hashMap, bytes, "", zzbuqVar6.zzk());
    }
}
