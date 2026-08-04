package com.google.android.gms.internal.ads;

import E2.o;
import F.G;
import F.H;
import F2.C0252s;
import F2.C0254t;
import F2.InterfaceC0217a;
import H2.f;
import I2.J;
import I2.P;
import I2.z;
import J2.h;
import J2.j;
import J2.n;
import J2.p;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import io.sentry.protocol.App;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p109p.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzbjl implements zzbiz {
    private final E2.b zza;
    private final zzdqq zzb;
    private final zzbrm zzd;
    private final zzeaf zze;
    private final zzcln zzf;
    private H2.a zzg = null;
    private final zzgbn zzh = zzbza.zzg;
    private final n zzc = new n(null);

    public zzbjl(E2.b bVar, zzbrm zzbrmVar, zzeaf zzeafVar, zzdqq zzdqqVar, zzcln zzclnVar) {
        this.zza = bVar;
        this.zzd = zzbrmVar;
        this.zze = zzeafVar;
        this.zzb = zzdqqVar;
        this.zzf = zzclnVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzc(Context context, zzauo zzauoVar, Uri uri, View view, Activity activity, zzfbe zzfbeVar) {
        if (zzauoVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || zzfbeVar == null) {
                if (zzauoVar.zze(uri)) {
                    uri = zzauoVar.zza(uri, context, view, activity);
                }
            } else if (zzauoVar.zze(uri)) {
                uri = zzfbeVar.zza(uri, context, view, activity);
            }
        } catch (zzaup unused) {
        } catch (Exception e7) {
            o.f1952C.f1961g.zzw(e7, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e7) {
            String strValueOf = String.valueOf(uri.toString());
            int i7 = J.f3546b;
            j.e("Error adding click uptime parameter to url: ".concat(strValueOf), e7);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x02f0  */
    public final void zzh(String str, InterfaceC0217a interfaceC0217a, Map map, String str2) {
        String str3;
        boolean zZzb;
        HashMap map2;
        boolean z4;
        String string;
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        zzfaf zzfafVarZzD = zzcebVar.zzD();
        zzfai zzfaiVarZzR = zzcebVar.zzR();
        boolean zZzg = false;
        if (zzfafVarZzD == null || zzfaiVarZzR == null) {
            str3 = "";
            zZzb = false;
        } else {
            String str4 = zzfaiVarZzR.zzb;
            zZzb = zzfafVarZzD.zzb();
            str3 = str4;
        }
        zzbbp zzbbpVar = zzbby.zzkJ;
        C0254t c0254t = C0254t.f2723d;
        boolean z7 = (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z8 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzmI)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcebVar.zzaF()) {
                int i7 = J.f3546b;
                j.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcfl) interfaceC0217a).zzaL(zzf(map), zzb(map), z7);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z9 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzlT)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcfl) interfaceC0217a).zzaN(zzf(map), zzb(map), str, z7, z9);
                return;
            } else {
                ((zzcfl) interfaceC0217a).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z7);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcebVar.getContext();
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeQ)).booleanValue()) {
                J.k("User opt out chrome custom tab.");
                zzm(10);
            } else {
                if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzeL)).booleanValue()) {
                    zZzg = zzbcz.zzg(context);
                } else if (g.b(context, null, false) != null) {
                    zZzg = true;
                }
                if (zZzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        int i8 = J.f3546b;
                        j.g("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), Uri.parse(str), zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS()));
                    if (zZzb && this.zze != null && zzl(interfaceC0217a, zzcebVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbji(this);
                    ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, new p105o3.b(this.zzg).asBinder(), true), z7, z8, str3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(interfaceC0217a, map, zZzb, str3, z7, z8);
            return;
        }
        if (App.TYPE.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(interfaceC0217a, map, zZzb, str3, z7, z8);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzik)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    int i9 = J.f3546b;
                    j.g("Package name missing from open app action.");
                    return;
                }
                if (zZzb && this.zze != null && zzl(interfaceC0217a, zzcebVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcebVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i10 = J.f3546b;
                    j.g("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z7, z8, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e7) {
                String strValueOf = String.valueOf(str6);
                int i11 = J.f3546b;
                j.e("Error parsing the url: ".concat(strValueOf), e7);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), data, zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZzd2);
                } else {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzil)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z10 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziG)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z10) {
            map2 = map3;
            this.zzg = new zzbjj(this, z7, interfaceC0217a, map3, map);
            z4 = false;
        } else {
            map2 = map3;
            z4 = z7;
        }
        if (intent != null) {
            if (!zZzb || this.zze == null || !zzl(interfaceC0217a, zzcebVar.getContext(), intent.getData().toString(), str3)) {
                ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z4, z8, str3);
                return;
            } else {
                if (z10) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzblu) interfaceC0217a).zzd("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        boolean z11 = z8;
        if (TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), Uri.parse(str), zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS())).toString();
        }
        if (!zZzb || this.zze == null || !zzl(interfaceC0217a, zzcebVar.getContext(), string, str3)) {
            ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z4, z11, str3);
        } else if (z10) {
            map2.put((String) map.get(r5), Boolean.TRUE);
            ((zzblu) interfaceC0217a).zzd("openIntentAsync", map2);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdqq zzdqqVar = this.zzb;
        if (zzdqqVar != null) {
            zzeaq.zzp(context, zzdqqVar, this.zze, str, "dialog_not_shown", zzfwk.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
    
        if (com.google.android.gms.internal.ads.zzbjk.zzc(r2, r12, r13, r14, r15) == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(InterfaceC0217a interfaceC0217a, Map map, boolean z4, String str, boolean z7, boolean z8) {
        Object[] objArr;
        ArrayList arrayList;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        Intent intentZzb;
        zzk(true);
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        Context context = zzcebVar.getContext();
        zzauo zzauoVarZzI = zzcebVar.zzI();
        View viewZzF = zzcebVar.zzF();
        zzfbe zzfbeVarZzS = zzcebVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intentZzb2 = null;
        Uri uriBuild = null;
        if (TextUtils.isEmpty(str2)) {
            intentZzb = intentZzb2;
        } else {
            Uri uriZzd = zzd(zzc(context, zzauoVarZzI, Uri.parse(str2), viewZzF, null, zzfbeVarZzS));
            boolean z9 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z10 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                objArr = true;
            } else if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeH)).booleanValue()) {
                objArr = true;
            } else {
                objArr = false;
            }
            if ("http".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("http").build();
            }
            Uri uri = uriBuild;
            ArrayList arrayList2 = new ArrayList();
            Intent intentZza = zzbjk.zza(uriZzd, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
            Intent intentZza2 = zzbjk.zza(uri, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
            if (objArr != false) {
                o oVar = o.f1952C;
                P p5 = oVar.f1957c;
                P.E(context, intentZza);
                P p7 = oVar.f1957c;
                P.E(context, intentZza2);
            }
            intentZzb2 = intentZza;
            ArrayList arrayList3 = arrayList2;
            ResolveInfo resolveInfoZzd = zzbjk.zzd(intentZza, arrayList2, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
            if (resolveInfoZzd != null) {
                intentZzb2 = zzbjk.zzb(intentZzb2, resolveInfoZzd, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
            } else {
                if (intentZza2 != null && (resolveInfoZzc = zzbjk.zzc(intentZza2, context, zzauoVarZzI, viewZzF, zzfbeVarZzS)) != null) {
                    intentZzb = zzbjk.zzb(intentZzb2, resolveInfoZzc, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
                }
                if (!arrayList3.isEmpty()) {
                    if (!z10 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        arrayList = arrayList3;
                        if (z9) {
                            intentZzb2 = zzbjk.zzb(intentZzb2, (ResolveInfo) arrayList.get(0), context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
                        }
                    } else {
                        int size = arrayList3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size) {
                                ArrayList arrayList4 = arrayList3;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList4.get(i7);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i8 = i7 + 1;
                                    if (!it.hasNext()) {
                                        arrayList3 = arrayList4;
                                        i7 = i8;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        intentZzb2 = zzbjk.zzb(intentZzb2, resolveInfo, context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                if (z9) {
                                    intentZzb2 = zzbjk.zzb(intentZzb2, (ResolveInfo) arrayList.get(0), context, zzauoVarZzI, viewZzF, zzfbeVarZzS);
                                }
                            }
                        }
                    }
                }
            }
            intentZzb = intentZzb2;
        }
        if (!z4 || this.zze == null || intentZzb == null || !zzl(interfaceC0217a, zzcebVar.getContext(), intentZzb.getData().toString(), str)) {
            try {
                ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intentZzb, this.zzg), z7, z8, str);
            } catch (ActivityNotFoundException e7) {
                String message = e7.getMessage();
                int i9 = J.f3546b;
                j.g(message);
            }
        }
    }

    private final void zzk(boolean z4) {
        zzbrm zzbrmVar = this.zzd;
        if (zzbrmVar != null) {
            zzbrmVar.zzb(z4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zziA)).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zziv)).booleanValue() : ((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zziu)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(InterfaceC0217a interfaceC0217a, Context context, String str, String str2) {
        zzbsh zzbshVar;
        zzbsu zzbsuVar;
        p pVar;
        zzdqq zzdqqVar = this.zzb;
        if (zzdqqVar != null) {
            zzeaq.zzo(context, zzdqqVar, this.zze, str2, "offline_open");
        }
        o oVar = o.f1952C;
        if (oVar.f1961g.zzA(context)) {
            this.zze.zzh(this.zzc, str2);
            return false;
        }
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        zzfaf zzfafVarZzD = zzcebVar.zzD();
        boolean z4 = (zzfafVarZzD == null || (pVar = zzfafVarZzD.zzay) == null || ((h) pVar).f3821c) ? false : true;
        boolean z7 = (zzfafVarZzD == null || (zzbsuVar = zzfafVarZzD.zzad) == null || !zzbsuVar.zza || zzbsuVar.zzb == null || !zzbsuVar.zzc) ? false : true;
        if (!z4) {
            if (z7) {
            }
            z zVarA = P.a(context);
            boolean zA = G.a(new H(context).f2425a);
            boolean zD = oVar.f1959e.d(context);
            boolean z8 = zzcebVar.zzO().zzi() && zzcebVar.zzi() == null;
            if (!zA) {
                if (!G.a(new H(context).f2425a)) {
                }
                zzi(context, str2, "notifications_disabled");
                return false;
            }
            if (zD) {
                zzi(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zVarA == null) {
                zzi(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z8) {
                zzi(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzis)).booleanValue()) {
                zzi(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcebVar.zzL() == null || zzcebVar.zzi() == null) {
                ((zzcfl) interfaceC0217a).zzaK(str2, str, 14);
            } else {
                zzear zzearVarZze = zzeas.zze();
                zzearVarZze.zza(zzcebVar.zzi());
                zzearVarZze.zzb(null);
                zzearVarZze.zzc(str2);
                zzearVarZze.zzd(str);
                zzeas zzeasVarZze = zzearVarZze.zze();
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = zzcebVar.zzL().f3260b;
                    if (adOverlayInfoParcel == null || (zzbshVar = adOverlayInfoParcel.f10812M) == null) {
                        throw new f("noioou");
                    }
                    zzbshVar.zzg(new p105o3.b(zzeasVarZze));
                } catch (Exception e7) {
                    zzi(context, str2, e7.getMessage());
                    return false;
                }
            }
            interfaceC0217a.onAdClicked();
            return true;
        }
        zzdqq zzdqqVar2 = this.zzb;
        if (zzdqqVar2 != null) {
            zzeaq.zzo(context, zzdqqVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i7) {
        zzdqq zzdqqVar;
        String str;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeK)).booleanValue() || (zzdqqVar = this.zzb) == null) {
            return;
        }
        zzdqp zzdqpVarZza = zzdqqVar.zza();
        zzdqpVarZza.zzb("action", "cct_action");
        switch (i7) {
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
        zzdqpVarZza.zzb("cct_open_status", str);
        zzdqpVarZza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        InterfaceC0217a interfaceC0217a = (InterfaceC0217a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        if (zzcebVar.zzD() != null) {
            map2 = zzcebVar.zzD().zzaw;
        }
        String strZzc = zzbxo.zzc(str, zzcebVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i7 = J.f3546b;
            j.g("Action missing from an open GMSG.");
            return;
        }
        E2.b bVar = this.zza;
        if (bVar == null || bVar.b()) {
            zzgbc.zzr((((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && this.zzf != null && zzcln.zzj(strZzc)) ? this.zzf.zze(strZzc, C0252s.f2717f.f2722e) : zzgbc.zzh(strZzc), new zzbjh(this, map, interfaceC0217a, str2), this.zzh);
        } else {
            bVar.a(strZzc);
        }
    }
}
