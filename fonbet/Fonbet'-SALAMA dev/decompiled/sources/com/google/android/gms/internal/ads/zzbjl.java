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
import o3.BinderC1507b;
import p.AbstractC1520g;

/* loaded from: classes.dex */
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
            String valueOf = String.valueOf(uri.toString());
            int i7 = J.f3546b;
            j.e("Error adding click uptime parameter to url: ".concat(valueOf), e7);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, InterfaceC0217a interfaceC0217a, Map map, String str2) {
        String str3;
        boolean z4;
        boolean z7;
        Object obj;
        HashMap hashMap;
        Object obj2;
        boolean z8;
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        zzfaf zzD = zzcebVar.zzD();
        zzfai zzR = zzcebVar.zzR();
        boolean z9 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z4 = false;
        } else {
            String str4 = zzR.zzb;
            z4 = zzD.zzb();
            str3 = str4;
        }
        zzbbp zzbbpVar = zzbby.zzkJ;
        C0254t c0254t = C0254t.f2723d;
        boolean z10 = (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z11 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzmI)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcebVar.zzaF()) {
                int i7 = J.f3546b;
                j.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcfl) interfaceC0217a).zzaL(zzf(map), zzb(map), z10);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z12 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzlT)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcfl) interfaceC0217a).zzaN(zzf(map), zzb(map), str, z10, z12);
                return;
            } else {
                ((zzcfl) interfaceC0217a).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z10);
                return;
            }
        }
        Intent intent = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcebVar.getContext();
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeQ)).booleanValue()) {
                J.k("User opt out chrome custom tab.");
                zzm(10);
            } else {
                if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzeL)).booleanValue()) {
                    z9 = zzbcz.zzg(context);
                } else if (AbstractC1520g.b(context, null, false) != null) {
                    z9 = true;
                }
                if (z9) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        int i8 = J.f3546b;
                        j.g("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), Uri.parse(str), zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS()));
                    if (z4 && this.zze != null && zzl(interfaceC0217a, zzcebVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbji(this);
                    ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, new BinderC1507b(this.zzg).asBinder(), true), z10, z11, str3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(interfaceC0217a, map, z4, str3, z10, z11);
            return;
        }
        if (App.TYPE.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(interfaceC0217a, map, z4, str3, z10, z11);
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
                if (z4 && this.zze != null && zzl(interfaceC0217a, zzcebVar.getContext(), str5, str3)) {
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
                        ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z10, z11, str3);
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
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e7) {
                String valueOf = String.valueOf(str6);
                int i11 = J.f3546b;
                j.e("Error parsing the url: ".concat(valueOf), e7);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), data, zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzil)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z13 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziG)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z13) {
            obj = "p";
            obj2 = "event_id";
            z7 = z11;
            hashMap = hashMap2;
            this.zzg = new zzbjj(this, z10, interfaceC0217a, hashMap2, map);
            z8 = false;
        } else {
            z7 = z11;
            obj = "p";
            hashMap = hashMap2;
            obj2 = "event_id";
            z8 = z10;
        }
        if (intent2 != null) {
            if (!z4 || this.zze == null || !zzl(interfaceC0217a, zzcebVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z8, z7, str3);
                return;
            } else {
                if (z13) {
                    hashMap.put((String) map.get(obj2), Boolean.TRUE);
                    ((zzblu) interfaceC0217a).zzd("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        boolean z14 = z7;
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcebVar.getContext(), zzcebVar.zzI(), Uri.parse(str), zzcebVar.zzF(), zzcebVar.zzi(), zzcebVar.zzS())).toString() : str;
        if (!z4 || this.zze == null || !zzl(interfaceC0217a, zzcebVar.getContext(), uri, str3)) {
            ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z8, z14, str3);
        } else if (z13) {
            hashMap.put((String) map.get(obj2), Boolean.TRUE);
            ((zzblu) interfaceC0217a).zzd("openIntentAsync", hashMap);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdqq zzdqqVar = this.zzb;
        if (zzdqqVar != null) {
            zzeaq.zzp(context, zzdqqVar, this.zze, str, "dialog_not_shown", zzfwk.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (com.google.android.gms.internal.ads.zzbjk.zzc(r2, r12, r13, r14, r15) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        r22 = r7;
        r11 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(InterfaceC0217a interfaceC0217a, Map map, boolean z4, String str, boolean z7, boolean z8) {
        Object[] objArr;
        ResolveInfo zzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        Intent zzb;
        zzk(true);
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        Context context = zzcebVar.getContext();
        zzauo zzI = zzcebVar.zzI();
        View zzF = zzcebVar.zzF();
        zzfbe zzS = zzcebVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri zzd2 = zzd(zzc(context, zzI, Uri.parse(str2), zzF, null, zzS));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeH)).booleanValue()) {
                    objArr = false;
                    if (!"http".equalsIgnoreCase(zzd2.getScheme())) {
                        build = zzd2.buildUpon().scheme("https").build();
                    } else if ("https".equalsIgnoreCase(zzd2.getScheme())) {
                        build = zzd2.buildUpon().scheme("http").build();
                    }
                    Uri uri = build;
                    ArrayList arrayList = new ArrayList();
                    Intent zza = zzbjk.zza(zzd2, context, zzI, zzF, zzS);
                    Intent zza2 = zzbjk.zza(uri, context, zzI, zzF, zzS);
                    if (objArr != false) {
                        o oVar = o.f1952C;
                        P p5 = oVar.f1957c;
                        P.E(context, zza);
                        P p7 = oVar.f1957c;
                        P.E(context, zza2);
                    }
                    intent = zza;
                    ArrayList arrayList2 = arrayList;
                    zzd = zzbjk.zzd(zza, arrayList, context, zzI, zzF, zzS);
                    if (zzd == null) {
                        intent = zzbjk.zzb(intent, zzd, context, zzI, zzF, zzS);
                    } else {
                        if (zza2 != null && (zzc = zzbjk.zzc(zza2, context, zzI, zzF, zzS)) != null) {
                            zzb = zzbjk.zzb(intent, zzc, context, zzI, zzF, zzS);
                        }
                        if (!arrayList2.isEmpty()) {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList2.size();
                                int i7 = 0;
                                loop0: while (i7 < size) {
                                    ArrayList arrayList3 = arrayList2;
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList3.get(i7);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    do {
                                        int i8 = i7 + 1;
                                        if (it.hasNext()) {
                                        }
                                    } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                    intent = zzbjk.zzb(intent, resolveInfo, context, zzI, zzF, zzS);
                                    break loop0;
                                }
                            }
                            ArrayList arrayList4 = arrayList2;
                            if (parseBoolean) {
                                intent = zzbjk.zzb(intent, (ResolveInfo) arrayList4.get(0), context, zzI, zzF, zzS);
                            }
                        }
                    }
                }
            }
            objArr = true;
            if (!"http".equalsIgnoreCase(zzd2.getScheme())) {
            }
            Uri uri2 = build;
            ArrayList arrayList5 = new ArrayList();
            Intent zza3 = zzbjk.zza(zzd2, context, zzI, zzF, zzS);
            Intent zza22 = zzbjk.zza(uri2, context, zzI, zzF, zzS);
            if (objArr != false) {
            }
            intent = zza3;
            ArrayList arrayList22 = arrayList5;
            zzd = zzbjk.zzd(zza3, arrayList5, context, zzI, zzF, zzS);
            if (zzd == null) {
            }
        }
        zzb = intent;
        if (!z4 || this.zze == null || zzb == null || !zzl(interfaceC0217a, zzcebVar.getContext(), zzb.getData().toString(), str)) {
            try {
                ((zzcfl) interfaceC0217a).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(zzb, this.zzg), z7, z8, str);
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zziA)).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
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
        zzfaf zzD = zzcebVar.zzD();
        boolean z4 = (zzD == null || (pVar = zzD.zzay) == null || ((h) pVar).f3821c) ? false : true;
        boolean z7 = (zzD == null || (zzbsuVar = zzD.zzad) == null || !zzbsuVar.zza || zzbsuVar.zzb == null || !zzbsuVar.zzc) ? false : true;
        if (!z4) {
            if (z7) {
            }
            z a2 = P.a(context);
            boolean a4 = G.a(new H(context).f2425a);
            boolean d7 = oVar.f1959e.d(context);
            boolean z8 = zzcebVar.zzO().zzi() && zzcebVar.zzi() == null;
            if (!a4) {
                if (!G.a(new H(context).f2425a)) {
                }
                zzi(context, str2, "notifications_disabled");
                return false;
            }
            if (d7) {
                zzi(context, str2, "notification_channel_disabled");
                return false;
            }
            if (a2 == null) {
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
                zzear zze = zzeas.zze();
                zze.zza(zzcebVar.zzi());
                zze.zzb(null);
                zze.zzc(str2);
                zze.zzd(str);
                zzeas zze2 = zze.zze();
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = zzcebVar.zzL().f3260b;
                    if (adOverlayInfoParcel == null || (zzbshVar = adOverlayInfoParcel.f10812M) == null) {
                        throw new f("noioou");
                    }
                    zzbshVar.zzg(new BinderC1507b(zze2));
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
        zzdqp zza = zzdqqVar.zza();
        zza.zzb("action", "cct_action");
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
        zza.zzb("cct_open_status", str);
        zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        InterfaceC0217a interfaceC0217a = (InterfaceC0217a) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzceb zzcebVar = (zzceb) interfaceC0217a;
        if (zzcebVar.zzD() != null) {
            hashMap = zzcebVar.zzD().zzaw;
        }
        String zzc = zzbxo.zzc(str, zzcebVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i7 = J.f3546b;
            j.g("Action missing from an open GMSG.");
            return;
        }
        E2.b bVar = this.zza;
        if (bVar == null || bVar.b()) {
            zzgbc.zzr((((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && this.zzf != null && zzcln.zzj(zzc)) ? this.zzf.zze(zzc, C0252s.f2717f.f2722e) : zzgbc.zzh(zzc), new zzbjh(this, map, interfaceC0217a, str2), this.zzh);
        } else {
            bVar.a(zzc);
        }
    }
}
