package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbqv implements zzbqh {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzeaj zzb;
    private final zzbys zzd;
    private final zzele zze;
    private final zzcub zzf;
    private final zzdcq zzg;
    private final zzdcg zzh;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzi = null;
    private final zzhdi zzj = zzcgj.zzh;

    public zzbqv(com.google.android.gms.ads.internal.zzb zzbVar, zzbys zzbysVar, zzele zzeleVar, zzeaj zzeajVar, zzcub zzcubVar, zzdcq zzdcqVar, zzdcg zzdcgVar) {
        this.zza = zzbVar;
        this.zzd = zzbysVar;
        this.zze = zzeleVar;
        this.zzb = zzeajVar;
        this.zzf = zzcubVar;
        this.zzg = zzdcqVar;
        this.zzh = zzdcgVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdData.Factory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzd(Context context, zzbbd zzbbdVar, Uri uri, View view, Activity activity, zzfma zzfmaVar) {
        if (zzbbdVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || zzfmaVar == null) {
                if (zzbbdVar.zze(uri)) {
                    uri = zzbbdVar.zzd(uri, context, view, activity);
                }
            } else if (zzbbdVar.zze(uri)) {
                uri = zzfmaVar.zza(uri, context, view, activity);
            }
        } catch (zzbbe unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String uri2 = uri.toString();
            String.valueOf(uri2);
            String valueOf = String.valueOf(uri2);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(valueOf), e);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0410 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a0  */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        Intent parseUri;
        boolean z2;
        Object obj;
        boolean z3;
        String str4;
        String str5;
        String str6;
        boolean equals;
        Bundle zzl;
        zzdcq zzdcqVar;
        Uri data;
        zzclm zzclmVar = (zzclm) zzaVar;
        zzfld zzC = zzclmVar.zzC();
        zzflg zzaC = zzclmVar.zzaC();
        boolean z4 = false;
        if (zzC == null || zzaC == null) {
            str3 = "";
            z = false;
        } else {
            String str7 = zzaC.zzb;
            z = zzC.zzb();
            str3 = str7;
        }
        boolean z5 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmq)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z6 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzov)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if (n.e.equalsIgnoreCase(str2)) {
            if (zzclmVar.zzW()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzm(false);
                ((zzcnc) zzaVar).zzaI(zzb(map), zzc(map), z5);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzm(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznD)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z4 = true;
            }
            if (str != null) {
                ((zzcnc) zzaVar).zzaJ(zzb(map), zzc(map), str, z5, z4);
                return;
            } else {
                ((zzcnc) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get("html"), (String) map.get("baseurl"), z5);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzclmVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfP)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzh(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfI)).booleanValue()) {
                    int i2 = zzbkf.zza;
                    String packageName = CustomTabsClient.getPackageName(context, null);
                    if (packageName != null && !context.getPackageName().equals(packageName)) {
                        z4 = true;
                    }
                } else {
                    z4 = zzbkh.zza(context);
                }
                if (z4) {
                    zzm(true);
                    if (TextUtils.isEmpty(str)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzh(7);
                        return;
                    }
                    Uri zze = zze(zzd(zzclmVar.getContext(), zzclmVar.zzS(), Uri.parse(str), zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT()));
                    if (z && this.zze != null && zzj(zzaVar, zzclmVar.getContext(), zze.toString(), str3)) {
                        return;
                    }
                    this.zzi = new zzbqr(this);
                    zzcnc zzcncVar = (zzcnc) zzaVar;
                    String uri = zze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzi;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfO)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e);
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e2) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzcncVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, uri, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z5, z6, str3);
                    return;
                }
                zzh(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzl(zzaVar, map, z, str3, z5, z6);
            return;
        }
        if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzl(zzaVar, map, z, str3, z5, z6);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjE)).booleanValue()) {
                zzm(true);
                String str8 = (String) map.get("p");
                if (str8 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z && this.zze != null && zzj(zzaVar, zzclmVar.getContext(), str8, str3)) {
                    return;
                }
                PackageManager packageManager = zzclmVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str8);
                    if (launchIntentForPackage != null) {
                        ((zzcnc) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzi), z5, z6, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzm(true);
        String str9 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str9)) {
            try {
                parseUri = Intent.parseUri(str9, 0);
            } catch (URISyntaxException e3) {
                String.valueOf(str9);
                String valueOf = String.valueOf(str9);
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e3);
            }
            if (parseUri != null && parseUri.getData() != null) {
                data = parseUri.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zze2 = zze(zzd(zzclmVar.getContext(), zzclmVar.zzS(), data, zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT()));
                    if (!TextUtils.isEmpty(parseUri.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjF)).booleanValue()) {
                            parseUri.setDataAndType(zze2, parseUri.getType());
                        }
                    }
                    parseUri.setData(zze2);
                }
            }
            z2 = !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzka)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoA)).booleanValue() && (zzdcqVar = this.zzg) != null) {
                zzdcqVar.zzl();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoC)).booleanValue() && this.zzh != null && map.get("hf") != null && ((String) map.get("hf")).equals("2") && map.get("hstp") != null) {
                try {
                    str4 = (String) map.get("hstp");
                    str5 = (String) map.get("hsr");
                    str6 = (String) map.get("hseqp");
                    equals = ((String) map.getOrDefault("hsat", "false")).equals("true");
                    if (str5 != null && str6 != null) {
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                zzl = com.google.android.gms.ads.internal.util.zzbp.zzl(new JSONObject(str6));
                            } catch (JSONException e4) {
                                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                if (com.google.android.gms.ads.internal.util.client.zzo.zzm(4)) {
                                    Log.i("Ads", "Failed to parse extra query params", e4);
                                }
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "OpenGmsgHandler.parseHsdpExtraQueryParams");
                            }
                            this.zzh.zzc(((zzclm) zzaVar).getContext(), str4, str5, zzl, equals, new zzbqs(this, str3));
                            return;
                        }
                        zzl = null;
                        this.zzh.zzc(((zzclm) zzaVar).getContext(), str4, str5, zzl, equals, new zzbqs(this, str3));
                        return;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("HSDP service parameters missing.");
                } catch (Throwable th) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoF)).booleanValue()) {
                        zzcaq.zzc(zzclmVar.getContext()).zzh(th, "HsdpServiceUnsampled.invokeOpen");
                    } else {
                        zzcaq.zza(zzclmVar.getContext()).zzh(th, "HsdpService.invokeOpen");
                    }
                }
            }
            HashMap hashMap = new HashMap();
            if (z2) {
                obj = "p";
                z3 = z6;
            } else {
                obj = "p";
                z3 = z6;
                this.zzi = new zzbqt(this, z5, zzaVar, hashMap, map);
                z5 = false;
            }
            if (parseUri == null) {
                if (!z || this.zze == null || !zzj(zzaVar, zzclmVar.getContext(), parseUri.getData().toString(), str3)) {
                    ((zzcnc) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(parseUri, this.zzi), z5, z3, str3);
                    return;
                } else {
                    if (z2) {
                        hashMap.put((String) map.get("event_id"), true);
                        ((zzbte) zzaVar).zze("openIntentAsync", hashMap);
                        return;
                    }
                    return;
                }
            }
            boolean z7 = z3;
            String uri2 = !TextUtils.isEmpty(str) ? zze(zzd(zzclmVar.getContext(), zzclmVar.zzS(), Uri.parse(str), zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT())).toString() : str;
            if (!z || this.zze == null || !zzj(zzaVar, zzclmVar.getContext(), uri2, str3)) {
                ((zzcnc) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri2, (String) map.get(InneractiveMediationDefs.GENDER_MALE), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzi), z5, z7, str3);
                return;
            } else {
                if (z2) {
                    hashMap.put((String) map.get("event_id"), true);
                    ((zzbte) zzaVar).zze("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        parseUri = null;
        if (parseUri != null) {
            data = parseUri.getData();
            if (!Uri.EMPTY.equals(data)) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzka)).booleanValue()) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoA)).booleanValue()) {
            zzdcqVar.zzl();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoC)).booleanValue()) {
            str4 = (String) map.get("hstp");
            str5 = (String) map.get("hsr");
            str6 = (String) map.get("hseqp");
            equals = ((String) map.getOrDefault("hsat", "false")).equals("true");
            if (str5 != null) {
                if (!TextUtils.isEmpty(str6)) {
                }
                zzl = null;
                this.zzh.zzc(((zzclm) zzaVar).getContext(), str4, str5, zzl, equals, new zzbqs(this, str3));
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("HSDP service parameters missing.");
        }
        HashMap hashMap2 = new HashMap();
        if (z2) {
        }
        if (parseUri == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjU)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjP)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzjO)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzbzz zzbzzVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzeaj zzeajVar = this.zzb;
        if (zzeajVar != null) {
            zzelp.zzc(context, zzeajVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().zzt(context)) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.ads.internal.util.client.zzu(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        zzclm zzclmVar = (zzclm) zzaVar;
        zzfld zzC = zzclmVar.zzC();
        boolean z = (zzC == null || (zzwVar = zzC.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z2 = (zzC == null || (zzbzzVar = zzC.zzad) == null || !zzbzzVar.zza || zzbzzVar.zzb == null || !zzbzzVar.zzc) ? false : true;
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzC2 = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
            boolean zzf = com.google.android.gms.ads.internal.zzt.zzf().zzf(context, "offline_notification_channel");
            boolean z3 = zzclmVar.zzN().zzg() && zzclmVar.zzj() == null;
            if (!areNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                }
                zzk(context, str2, "notifications_disabled");
                return false;
            }
            if (zzf) {
                zzk(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzC2 == null) {
                zzk(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z3) {
                zzk(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjM)).booleanValue()) {
                zzk(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzclmVar.zzL() == null || zzclmVar.zzj() == null) {
                ((zzcnc) zzaVar).zzaL(str2, str, 14);
            } else {
                zzelq zze = zzelr.zze();
                zze.zza(zzclmVar.zzj());
                zze.zzb(null);
                zze.zzc(str2);
                zze.zzd(str);
                try {
                    zzclmVar.zzL().zzF(zze.zze());
                } catch (Exception e) {
                    zzk(context, str2, e.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        zzeaj zzeajVar2 = this.zzb;
        if (zzeajVar2 != null) {
            zzelp.zzc(context, zzeajVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzk(Context context, String str, String str2) {
        zzele zzeleVar = this.zze;
        zzeleVar.zzd(str);
        zzeaj zzeajVar = this.zzb;
        if (zzeajVar != null) {
            zzelp.zzd(context, zzeajVar, zzeleVar, str, "dialog_not_shown", zzgxp.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        if (com.google.android.gms.internal.ads.zzbqu.zzb(r2, r12, r13, r14, r15) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r22 = r7;
        r11 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Intent intent;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzm(true);
        zzclm zzclmVar = (zzclm) zzaVar;
        Context context = zzclmVar.getContext();
        zzbbd zzS = zzclmVar.zzS();
        View zzE = zzclmVar.zzE();
        zzfma zzT = zzclmVar.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent2 = null;
        Uri build = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                Uri zze = zze(zzd(context, zzS, Uri.parse(str2), zzE, null, zzT));
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
                boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
                if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfE)).booleanValue()) {
                        z4 = false;
                    }
                }
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(zze.getScheme())) {
                    build = zze.buildUpon().scheme("https").build();
                } else if ("https".equalsIgnoreCase(zze.getScheme())) {
                    build = zze.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build();
                }
                Uri uri = build;
                ArrayList arrayList = new ArrayList();
                Intent zza = zzbqu.zza(zze, context, zzS, zzE, zzT);
                Intent zza2 = zzbqu.zza(uri, context, zzS, zzE, zzT);
                if (z4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzq(context, zza);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzq(context, zza2);
                }
                ArrayList arrayList2 = arrayList;
                ResolveInfo zzc = zzbqu.zzc(zza, arrayList, context, zzS, zzE, zzT);
                if (zzc == null) {
                    if (zza2 != null && (zzb = zzbqu.zzb(zza2, context, zzS, zzE, zzT)) != null) {
                        intent = zzbqu.zzd(zza, zzb, context, zzS, zzE, zzT);
                    }
                    if (!arrayList2.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList2.size();
                            int i = 0;
                            loop0: while (i < size) {
                                ArrayList arrayList3 = arrayList2;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList3.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                do {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                    }
                                } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                intent2 = zzbqu.zzd(zza, resolveInfo, context, zzS, zzE, zzT);
                                break loop0;
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        if (parseBoolean) {
                            intent2 = zzbqu.zzd(zza, (ResolveInfo) arrayList4.get(0), context, zzS, zzE, zzT);
                        }
                    }
                    intent = zza;
                    if (z || this.zze == null || intent == null) {
                        zzaVar2 = zzaVar;
                    } else {
                        zzaVar2 = zzaVar;
                        if (zzj(zzaVar2, zzclmVar.getContext(), intent.getData().toString(), str)) {
                            return;
                        }
                    }
                    ((zzcnc) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzi), z2, z3, str);
                    return;
                }
                intent2 = zzbqu.zzd(zza, zzc, context, zzS, zzE, zzT);
            }
            ((zzcnc) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzi), z2, z3, str);
            return;
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            return;
        }
        intent = intent2;
        if (z) {
        }
        zzaVar2 = zzaVar;
    }

    private final void zzm(boolean z) {
        zzbys zzbysVar = this.zzd;
        if (zzbysVar != null) {
            zzbysVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(int i) {
        zzeaj zzeajVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfH)).booleanValue() || (zzeajVar = this.zzb) == null) {
            return;
        }
        zzeai zza = zzeajVar.zza();
        zza.zzc("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzc("cct_open_status", str);
        zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcub zzcubVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzclm zzclmVar = (zzclm) zzaVar;
        if (zzclmVar.zzC() != null) {
            hashMap = zzclmVar.zzC().zzaw;
        }
        String zza = zzcet.zza(str, zzclmVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzhcy.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && (zzcubVar = this.zzf) != null && zzcub.zzc(zza)) ? zzcubVar.zzb(zza, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.zza(zza), new zzbqq(this, map, zzaVar, str2), this.zzj);
        } else {
            zzbVar.zzc(zza);
        }
    }

    final /* synthetic */ void zzg(String str, String str2, Bundle bundle) {
        zzeaj zzeajVar = this.zzb;
        if (zzeajVar == null) {
            return;
        }
        String encodeToString = bundle != null ? Base64.encodeToString(com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            zzeai zza = zzeajVar.zza();
            zza.zzc("action", str);
            if (str2 != null) {
                zza.zzc("gqi", str2);
            }
            if (encodeToString != null) {
                zza.zzc("hsoe", encodeToString);
            }
            zza.zzf();
        }
    }
}
