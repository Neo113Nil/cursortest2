package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.A;
import I2.J;
import J2.j;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.SentryLockReason;
import io.sentry.SentryReplayEvent;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbiy {
    public static final zzbiz zza = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzbhw
        @Override // com.google.android.gms.internal.ads.zzbiz
        public final void zza(Object obj, Map map) {
            zzcfi zzcfiVar = (zzcfi) obj;
            zzbiz zzbizVar = zzbiy.zza;
            String str = (String) map.get(SentryReplayEvent.JsonKeys.URLS);
            if (TextUtils.isEmpty(str)) {
                int i7 = J.f3546b;
                j.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
                hashMap.put(str2, valueOf);
                J.k("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzblu) zzcfiVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbiz zzb = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzbhy
        @Override // com.google.android.gms.internal.ads.zzbiz
        public final void zza(Object obj, Map map) {
            zzcfi zzcfiVar = (zzcfi) obj;
            zzbiz zzbizVar = zzbiy.zza;
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzik)).booleanValue()) {
                int i7 = J.f3546b;
                j.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get(SentryLockReason.JsonKeys.PACKAGE_NAME);
            if (TextUtils.isEmpty(str)) {
                int i8 = J.f3546b;
                j.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcfiVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            J.k("/canOpenApp;" + str + ";" + valueOf);
            ((zzblu) zzcfiVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbiz zzc = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzbib
        @Override // com.google.android.gms.internal.ads.zzbiz
        public final void zza(Object obj, Map map) {
            zzbiy.zzb((zzcfi) obj, map);
        }
    };
    public static final zzbiz zzd = new zzbiq();
    public static final zzbiz zze = new zzbir();
    public static final zzbiz zzf = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzbic
        @Override // com.google.android.gms.internal.ads.zzbiz
        public final void zza(Object obj, Map map) {
            zzcfi zzcfiVar = (zzcfi) obj;
            zzbiz zzbizVar = zzbiy.zza;
            String str = (String) map.get("u");
            if (str == null) {
                int i7 = J.f3546b;
                j.g("URL missing from httpTrack GMSG.");
            } else {
                zzcds zzcdsVar = (zzcds) zzcfiVar;
                new A(zzcfiVar.getContext(), ((zzcfp) zzcfiVar).zzm().f10834a, str, zzcdsVar.zzD() != null ? zzcdsVar.zzD().zzax : null).zzb();
            }
        }
    };
    public static final zzbiz zzg = new zzbis();
    public static final zzbiz zzh = new zzbit();
    public static final zzbiz zzi = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzbhz
        @Override // com.google.android.gms.internal.ads.zzbiz
        public final void zza(Object obj, Map map) {
            zzcfo zzcfoVar = (zzcfo) obj;
            zzbiz zzbizVar = zzbiy.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzauo zzI = zzcfoVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                int i7 = J.f3546b;
                j.g("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbiz zzj = new zzbiu();
    public static final zzbiz zzk = new zzbiv();
    public static final zzbiz zzl = new zzcbw();
    public static final zzbiz zzm = new zzcbx();
    public static final zzbiz zzn = new zzbhs();
    public static final zzbjp zzo = new zzbjp();
    public static final zzbiz zzp = new zzbiw();
    public static final zzbiz zzq = new zzbix();
    public static final zzbiz zzr = new zzbid();
    public static final zzbiz zzs = new zzbie();
    public static final zzbiz zzt = new zzbif();
    public static final zzbiz zzu = new zzbig();
    public static final zzbiz zzv = new zzbih();
    public static final zzbiz zzw = new zzbii();
    public static final zzbiz zzx = new zzbij();
    public static final zzbiz zzy = new zzbik();
    public static final zzbiz zzz = new zzbil();
    public static final zzbiz zzA = new zzbim();
    public static final zzbiz zzB = new zzbio();
    public static final zzbiz zzC = new zzbip();

    public static I3.b zza(zzceb zzcebVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzauo zzI = zzcebVar.zzI();
            zzfbe zzS = zzcebVar.zzS();
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || zzS == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcebVar.getContext(), zzcebVar.zzF(), zzcebVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzS.zza(parse, zzcebVar.getContext(), zzcebVar.zzF(), zzcebVar.zzi());
            }
        } catch (zzaup unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i7 = J.f3546b;
            j.g(concat);
        }
        Map hashMap = new HashMap();
        if (zzcebVar.zzD() != null) {
            hashMap = zzcebVar.zzD().zzaw;
        }
        final String zzb2 = zzbxo.zzb(parse, zzcebVar.getContext(), hashMap);
        long longValue = ((Long) zzbdx.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 250915000) {
            return zzgbc.zzh(zzb2);
        }
        zzgat zzu2 = zzgat.zzu(zzcebVar.zzT());
        zzfsw zzfswVar = new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbht
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbiz zzbizVar = zzbiy.zza;
                if (!((Boolean) zzbdx.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                o.f1952C.f1961g.zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzgbn zzgbnVar = zzbza.zzg;
        return (zzgat) zzgbc.zze((zzgat) zzgbc.zzm((zzgat) zzgbc.zze(zzu2, Throwable.class, zzfswVar, zzgbnVar), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbhu
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbiz zzbizVar = zzbiy.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbdx.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i8 = 0; i8 < 3; i8++) {
                            if (!host.endsWith(strArr[i8])) {
                            }
                        }
                    }
                    String str4 = (String) zzbdx.zza.zze();
                    String str5 = (String) zzbdx.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzgbnVar), Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbhv
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbiz zzbizVar = zzbiy.zza;
                if (((Boolean) zzbdx.zzi.zze()).booleanValue()) {
                    o.f1952C.f1961g.zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzgbnVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:10|11|12)|(11:50|51|(10:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(2:30|(1:32)))|33|34|35|(1:37)(1:46)|38|39|41|42)|14|(0)|33|34|35|(0)(0)|38|39|41|42|8) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r0 = I2.J.f3546b;
        J2.j.e("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        E2.o.f1952C.f1961g.zzw(r0, r9.toString());
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(zzcfi zzcfiVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                    } catch (JSONException e7) {
                        int i8 = J.f3546b;
                        j.e("Error parsing the intent data.", e7);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e8) {
                            String valueOf = String.valueOf(optString7);
                            int i9 = J.f3546b;
                            j.e("Error parsing the url: ".concat(valueOf), e8);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        ResolveInfo resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo == null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo2 == null);
                }
                ((zzblu) zzcfiVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzblu) zzcfiVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzblu) zzcfiVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdcp zzdcpVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkK)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdcpVar != null) {
            zzdcpVar.zzdd();
        }
    }
}
