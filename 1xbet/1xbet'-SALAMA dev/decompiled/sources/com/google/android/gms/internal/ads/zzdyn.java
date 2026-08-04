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

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object zza(Object obj) throws zzdus {
        zzdus zzdusVar;
        JSONObject jSONObject;
        String strConcat;
        zzdym zzdymVar = (zzdym) obj;
        int iOptInt = zzdymVar.zza.optInt("http_timeout_millis", 60000);
        zzbuq zzbuqVar = zzdymVar.zzb;
        String strJoin = "";
        if (zzbuqVar.zza() != -2) {
            if (zzbuqVar.zza() == 1) {
                if (zzbuqVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbuqVar.zzh());
                    int i7 = J.f3546b;
                    j.d(strJoin);
                }
                zzdusVar = new zzdus(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
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
        HashMap map = new HashMap();
        if (zzdymVar.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbc)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpUtils.COOKIE_HEADER_NAME, strConcat);
                }
            } else {
                map.put(HttpUtils.COOKIE_HEADER_NAME, this.zzb);
            }
        }
        if (zzdymVar.zzb.zzk() && (jSONObject = zzdymVar.zza) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                J.k("DSID signal does not exist.");
            }
        }
        if (zzdymVar.zzb != null && !TextUtils.isEmpty(zzdymVar.zzb.zzf())) {
            strJoin = zzdymVar.zzb.zzf();
        }
        zzffy zzffyVar2 = this.zzd;
        zzffn zzffnVar2 = this.zzc;
        zzffnVar2.zzg(true);
        zzffyVar2.zza(zzffnVar2);
        return new zzdyi(zzdymVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", zzdymVar.zzb.zzk());
    }
}
