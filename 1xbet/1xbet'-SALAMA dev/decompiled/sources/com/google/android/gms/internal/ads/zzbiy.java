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

/* JADX INFO: loaded from: classes.dex */
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
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                map2.put(str2, boolValueOf);
                J.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzblu) zzcfiVar).zzd("openableURLs", map2);
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
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcfiVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            J.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzblu) zzcfiVar).zzd("openableApp", map2);
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
                int i7 = Integer.parseInt(str);
                int i8 = Integer.parseInt(str2);
                int i9 = Integer.parseInt(str3);
                zzauo zzauoVarZzI = zzcfoVar.zzI();
                if (zzauoVarZzI != null) {
                    zzauoVarZzI.zzc().zzl(i7, i8, i9);
                }
            } catch (NumberFormatException unused) {
                int i10 = J.f3546b;
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
        Uri uriZza = Uri.parse(str);
        try {
            zzauo zzauoVarZzI = zzcebVar.zzI();
            zzfbe zzfbeVarZzS = zzcebVar.zzS();
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || zzfbeVarZzS == null) {
                if (zzauoVarZzI != null && zzauoVarZzI.zzf(uriZza)) {
                    uriZza = zzauoVarZzI.zza(uriZza, zzcebVar.getContext(), zzcebVar.zzF(), zzcebVar.zzi());
                }
            } else if (zzauoVarZzI != null && zzauoVarZzI.zzf(uriZza)) {
                uriZza = zzfbeVarZzS.zza(uriZza, zzcebVar.getContext(), zzcebVar.zzF(), zzcebVar.zzi());
            }
        } catch (zzaup unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i7 = J.f3546b;
            j.g(strConcat);
        }
        Map map = new HashMap();
        if (zzcebVar.zzD() != null) {
            map = zzcebVar.zzD().zzaw;
        }
        final String strZzb = zzbxo.zzb(uriZza, zzcebVar.getContext(), map);
        long jLongValue = ((Long) zzbdx.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 250915000) {
            return zzgbc.zzh(strZzb);
        }
        zzgat zzgatVarZzu = zzgat.zzu(zzcebVar.zzT());
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
        return (zzgat) zzgbc.zze((zzgat) zzgbc.zzm((zzgat) zzgbc.zze(zzgatVarZzu, Throwable.class, zzfswVar, zzgbnVar), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbhu
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbiz zzbizVar = zzbiy.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbdx.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i8 = 0; i8 < 3; i8++) {
                            if (host.endsWith(strArr[i8])) {
                                str2 = (String) zzbdx.zza.zze();
                                str3 = (String) zzbdx.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbdx.zza.zze();
                        str3 = (String) zzbdx.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzgbnVar), Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbhv
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbiz zzbizVar = zzbiy.zza;
                if (((Boolean) zzbdx.zzi.zze()).booleanValue()) {
                    o.f1952C.f1961g.zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgbnVar);
    }

    public static void zzb(zzcfi zzcfiVar, Map map) {
        Intent uri;
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e7) {
                                String strValueOf = String.valueOf(strOptString7);
                                int i8 = J.f3546b;
                                j.e("Error parsing the url: ".concat(strValueOf), e7);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e8) {
                            o.f1952C.f1961g.zzw(e8, intent.toString());
                            resolveInfoResolveActivity = null;
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e9) {
                            int i9 = J.f3546b;
                            j.e("Error constructing openable urls response.", e9);
                        }
                    } catch (JSONException e10) {
                        int i10 = J.f3546b;
                        j.e("Error parsing the intent data.", e10);
                    }
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
