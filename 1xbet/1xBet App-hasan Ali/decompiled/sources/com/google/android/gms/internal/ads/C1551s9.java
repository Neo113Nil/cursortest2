package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551s9 implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15427k;

    public /* synthetic */ C1551s9(int i) {
        this.f15427k = i;
    }

    private final void a(Object obj, Map map) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        try {
            String str = (String) map.get("enabled");
            if (!AbstractC0952et.Q(str, "true") && !AbstractC0952et.Q(str, "false")) {
                return;
            }
            Mt b3 = Mt.b(interfaceC0677Re.getContext());
            boolean parseBoolean = Boolean.parseBoolean(str);
            b3.getClass();
            synchronized (Mt.class) {
                ((C1667ur) b3.f10741l).g("paidv2_user_option", Boolean.valueOf(parseBoolean));
            }
        } catch (IOException e3) {
            P2.o.f4767B.f4774g.i("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e3);
        }
    }

    private final void c(Object obj, Map map) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        if (map.keySet().contains("start")) {
            C1028gf I5 = interfaceC0677Re.I();
            synchronized (I5.f13616n) {
            }
            I5.f13608M++;
            I5.v0();
            return;
        }
        if (map.keySet().contains("stop")) {
            r4.f13608M--;
            interfaceC0677Re.I().v0();
        } else if (map.keySet().contains("cancel")) {
            C1028gf I6 = interfaceC0677Re.I();
            C1773x6 c1773x6 = I6.f13614l;
            if (c1773x6 != null) {
                c1773x6.b(10005);
            }
            I6.f13607L = true;
            I6.f13626x = 10004;
            I6.f13627y = "Page loaded delay cancel.";
            I6.v0();
            I6.f13613k.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ae, code lost:
    
        if (r3.setExecutable(true, false) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d(Object obj, Map map) {
        AbstractC1744we abstractC1744we;
        C1340ne c1340ne;
        AbstractC1744we abstractC1744we2;
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        if (U2.j.l(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            U2.j.d("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C1385oe c1385oe = P2.o.f4767B.f4792z;
        if (map.containsKey("abort")) {
            if (c1385oe.c(interfaceC0677Re)) {
                return;
            }
            U2.j.i("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer e3 = e("periodicReportIntervalMs", map);
        e("exoPlayerRenderingIntervalMs", map);
        e("exoPlayerIdleIntervalMs", map);
        C0804be c0804be = new C0804be((String) map.get("flags"));
        C1340ne c1340ne2 = null;
        int i = 0;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        strArr2[i5] = jSONArray.getString(i5);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    U2.j.i("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (c0804be.f12844k) {
                ArrayList arrayList = c1385oe.f14808k;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    c1340ne = (C1340ne) obj2;
                    if (c1340ne.f14661b == interfaceC0677Re && str.equals(c1340ne.f14663d)) {
                        break;
                    }
                }
                c1340ne = null;
                if (c1340ne == null) {
                    U2.j.i("Precache task is already running.");
                    return;
                }
                if (interfaceC0677Re.h() == null) {
                    U2.j.i("Precache requires a dependency provider.");
                    return;
                }
                Integer e5 = e("player", map);
                if (e5 == null) {
                    e5 = 0;
                }
                if (e3 != null) {
                    interfaceC0677Re.H0(e3.intValue());
                }
                int intValue = e5.intValue();
                Object obj3 = interfaceC0677Re.h().f1750m;
                if (intValue > 0) {
                    int i7 = C0614Ie.f9546F.get();
                    if (i7 < c0804be.f12841g) {
                        C0553Ae c0553Ae = new C0553Ae(interfaceC0677Re);
                        C0614Ie c0614Ie = new C0614Ie(interfaceC0677Re.getContext(), c0804be, (InterfaceC0677Re) c0553Ae.f16125m.get(), null);
                        U2.j.h("ExoPlayerAdapter initialized.");
                        c0553Ae.f7602n = c0614Ie;
                        c0614Ie.f9560t = c0553Ae;
                        abstractC1744we2 = c0553Ae;
                    } else {
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8865n)).booleanValue()) {
                            i7 = C1879ze.f16619y.get();
                        }
                        abstractC1744we2 = i7 < c0804be.f12837b ? new C1879ze(interfaceC0677Re, c0804be) : new C1834ye(interfaceC0677Re);
                    }
                } else {
                    C1789xe c1789xe = new C1789xe(interfaceC0677Re);
                    File cacheDir = c1789xe.f16123k.getCacheDir();
                    if (cacheDir == null) {
                        U2.j.i("Context.getCacheDir() returned null");
                        abstractC1744we2 = c1789xe;
                    } else {
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        c1789xe.f16311n = file;
                        if (file.isDirectory() || file.mkdirs()) {
                            if (file.setReadable(true, false)) {
                                abstractC1744we2 = c1789xe;
                            }
                            U2.j.i("Could not set cache file permissions at ".concat(String.valueOf(file.getAbsolutePath())));
                            c1789xe.f16311n = null;
                            abstractC1744we2 = c1789xe;
                        } else {
                            U2.j.i("Could not create preload cache directory at ".concat(String.valueOf(file.getAbsolutePath())));
                            c1789xe.f16311n = null;
                            abstractC1744we2 = c1789xe;
                        }
                    }
                }
                new C1340ne(interfaceC0677Re, abstractC1744we2, str, strArr).l();
                abstractC1744we = abstractC1744we2;
            } else {
                ArrayList arrayList2 = c1385oe.f14808k;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj4 = arrayList2.get(i8);
                    i8++;
                    c1340ne = (C1340ne) obj4;
                    if (c1340ne.f14661b == interfaceC0677Re) {
                        break;
                    }
                }
                c1340ne = null;
                if (c1340ne == null) {
                }
            }
        } else {
            ArrayList arrayList3 = c1385oe.f14808k;
            int size3 = arrayList3.size();
            while (true) {
                if (i >= size3) {
                    break;
                }
                Object obj5 = arrayList3.get(i);
                i++;
                C1340ne c1340ne3 = (C1340ne) obj5;
                if (c1340ne3.f14661b == interfaceC0677Re) {
                    c1340ne2 = c1340ne3;
                    break;
                }
            }
            if (c1340ne2 == null) {
                U2.j.i("Precache must specify a source.");
                return;
            }
            abstractC1744we = c1340ne2.f14662c;
        }
        Integer e6 = e("minBufferMs", map);
        if (e6 != null) {
            abstractC1744we.p(e6.intValue());
        }
        Integer e7 = e("maxBufferMs", map);
        if (e7 != null) {
            abstractC1744we.o(e7.intValue());
        }
        Integer e8 = e("bufferForPlaybackMs", map);
        if (e8 != null) {
            abstractC1744we.m(e8.intValue());
        }
        Integer e9 = e("bufferForPlaybackAfterRebufferMs", map);
        if (e9 != null) {
            abstractC1744we.n(e9.intValue());
        }
    }

    public static final Integer e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            U2.j.i("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:269|270|271)|(12:310|311|312|(10:276|(1:278)|279|(1:281)|282|(1:284)|285|(1:287)|288|(2:290|(1:292)))|293|294|295|(1:297)(1:306)|298|299|301|302)(1:273)|274|(0)|293|294|295|(0)(0)|298|299|301|302|267) */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0682, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0683, code lost:
    
        U2.j.g("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x066a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x066b, code lost:
    
        P2.o.f4767B.f4774g.i(r1.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x067c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        int i;
        boolean z3;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        JSONObject mo17a;
        JSONObject d5;
        Qs qs;
        Qs qs2;
        Qs qs3;
        String str;
        String str2;
        C0802bc c0802bc;
        int i5 = 0;
        boolean z5 = true;
        switch (this.f15427k) {
            case 0:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                String str3 = (String) map.get("action");
                if (!"tick".equals(str3)) {
                    if ("experiment".equals(str3)) {
                        String str4 = (String) map.get("value");
                        if (TextUtils.isEmpty(str4)) {
                            U2.j.i("No value given for CSI experiment.");
                            return;
                        } else {
                            ((L7) interfaceC0677Re.l().f14828m).b("e", str4);
                            return;
                        }
                    }
                    if ("extra".equals(str3)) {
                        String str5 = (String) map.get("name");
                        String str6 = (String) map.get("value");
                        if (TextUtils.isEmpty(str6)) {
                            U2.j.i("No value given for CSI extra.");
                            return;
                        } else if (TextUtils.isEmpty(str5)) {
                            U2.j.i("No name given for CSI extra.");
                            return;
                        } else {
                            ((L7) interfaceC0677Re.l().f14828m).b(str5, str6);
                            return;
                        }
                    }
                    return;
                }
                String str7 = (String) map.get("label");
                String str8 = (String) map.get("start_label");
                String str9 = (String) map.get("timestamp");
                if (TextUtils.isEmpty(str7)) {
                    U2.j.i("No label given for CSI tick.");
                    return;
                }
                if (TextUtils.isEmpty(str9)) {
                    U2.j.i("No timestamp given for CSI tick.");
                    return;
                }
                try {
                    long parseLong = Long.parseLong(str9);
                    P2.o oVar = P2.o.f4767B;
                    oVar.f4776j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    oVar.f4776j.getClass();
                    long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                    if (true == TextUtils.isEmpty(str8)) {
                        str8 = "native:view_load";
                    }
                    C1390oj l5 = interfaceC0677Re.l();
                    HashMap hashMap = (HashMap) l5.f14827l;
                    I7 i7 = (I7) hashMap.get(str8);
                    String[] strArr = {str7};
                    if (i7 != null) {
                        ((L7) l5.f14828m).c(i7, elapsedRealtime, strArr);
                    }
                    hashMap.put(str7, new I7(elapsedRealtime, null, null));
                    return;
                } catch (NumberFormatException e3) {
                    U2.j.j("Malformed timestamp for CSI tick.", e3);
                    return;
                }
            case 1:
                int i6 = 1;
                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) obj;
                C1551s9 c1551s9 = AbstractC1776x9.f16242a;
                String str10 = (String) map.get("urls");
                if (TextUtils.isEmpty(str10)) {
                    U2.j.i("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split = str10.split(",");
                HashMap hashMap2 = new HashMap();
                PackageManager packageManager = interfaceC0677Re2.getContext().getPackageManager();
                int length = split.length;
                int i8 = 0;
                while (i8 < length) {
                    String str11 = split[i8];
                    String[] split2 = str11.split(";", 2);
                    int i9 = i6;
                    Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > i9 ? split2[i9].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
                    hashMap2.put(str11, valueOf);
                    T2.G.m("/canOpenURLs;" + str11 + ";" + valueOf);
                    i8++;
                    i6 = 1;
                }
                interfaceC0677Re2.a("openableURLs", hashMap2);
                return;
            case 2:
                InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) obj;
                C1551s9 c1551s92 = AbstractC1776x9.f16242a;
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.P7)).booleanValue()) {
                    U2.j.i("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str12 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str12)) {
                    U2.j.i("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap3 = new HashMap();
                Boolean valueOf2 = Boolean.valueOf(interfaceC0677Re3.getContext().getPackageManager().getLaunchIntentForPackage(str12) != null);
                hashMap3.put(str12, valueOf2);
                T2.G.m("/canOpenApp;" + str12 + ";" + valueOf2);
                interfaceC0677Re3.a("openableApp", hashMap3);
                return;
            case 3:
                InterfaceC0677Re interfaceC0677Re4 = (InterfaceC0677Re) obj;
                C1551s9 c1551s93 = AbstractC1776x9.f16242a;
                String str13 = (String) map.get("tx");
                String str14 = (String) map.get("ty");
                String str15 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str13);
                    int parseInt2 = Integer.parseInt(str14);
                    int parseInt3 = Integer.parseInt(str15);
                    Q4 b02 = interfaceC0677Re4.b0();
                    if (b02 != null) {
                        b02.f11167b.i(parseInt, parseInt2, parseInt3);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    U2.j.i("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 4:
                InterfaceC0677Re interfaceC0677Re5 = (InterfaceC0677Re) obj;
                PackageManager packageManager2 = interfaceC0677Re5.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject = new JSONObject();
                        int i10 = 0;
                        while (i10 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                optString = jSONObject2.optString("id");
                                optString2 = jSONObject2.optString("u");
                                optString3 = jSONObject2.optString("i");
                                optString4 = jSONObject2.optString("m");
                                z3 = z5;
                                optString5 = jSONObject2.optString("p");
                                optString6 = jSONObject2.optString("c");
                                optString7 = jSONObject2.optString("intent_url");
                            } catch (JSONException e5) {
                                i = i5;
                                z3 = z5;
                                U2.j.g("Error parsing the intent data.", e5);
                            }
                            if (TextUtils.isEmpty(optString7)) {
                                i = i5;
                            } else {
                                try {
                                    parseUri = Intent.parseUri(optString7, i5);
                                    i = i5;
                                } catch (URISyntaxException e6) {
                                    i = i5;
                                    U2.j.g("Error parsing the url: ".concat(String.valueOf(optString7)), e6);
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
                                        String[] split3 = optString6.split("/", 2);
                                        if (split3.length == 2) {
                                            parseUri.setComponent(new ComponentName(split3[i], split3[z3 ? 1 : 0]));
                                        }
                                    }
                                }
                                Intent intent = parseUri;
                                ResolveInfo resolveInfo = packageManager2.resolveActivity(intent, 65536);
                                jSONObject.put(optString, resolveInfo == null ? z3 ? 1 : 0 : i);
                                i10++;
                                z5 = z3;
                                i5 = i;
                            }
                            parseUri = null;
                            if (parseUri == null) {
                            }
                            Intent intent2 = parseUri;
                            ResolveInfo resolveInfo2 = packageManager2.resolveActivity(intent2, 65536);
                            jSONObject.put(optString, resolveInfo2 == null ? z3 ? 1 : 0 : i);
                            i10++;
                            z5 = z3;
                            i5 = i;
                        }
                        interfaceC0677Re5.k("openableIntents", jSONObject);
                        return;
                    } catch (JSONException unused2) {
                        interfaceC0677Re5.k("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused3) {
                    interfaceC0677Re5.k("openableIntents", new JSONObject());
                    return;
                }
            case 5:
                InterfaceC0677Re interfaceC0677Re6 = (InterfaceC0677Re) obj;
                C1551s9 c1551s94 = AbstractC1776x9.f16242a;
                String str16 = (String) map.get("u");
                if (str16 == null) {
                    U2.j.i("URL missing from httpTrack GMSG.");
                    return;
                } else {
                    new T2.y(interfaceC0677Re6.getContext(), interfaceC0677Re6.m().f5852k, str16, interfaceC0677Re6.v() != null ? interfaceC0677Re6.v().f10534x0 : null).l();
                    return;
                }
            case 6:
                InterfaceC0677Re interfaceC0677Re7 = (InterfaceC0677Re) obj;
                WindowManager windowManager = (WindowManager) interfaceC0677Re7.getContext().getSystemService("window");
                T2.L l6 = P2.o.f4767B.f4771c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i11 = displayMetrics.widthPixels;
                int i12 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                HashMap hashMap4 = new HashMap();
                ((View) interfaceC0677Re7).getLocationInWindow(iArr);
                hashMap4.put("xInPixels", Integer.valueOf(iArr[0]));
                AbstractC0467k.z(iArr[1], hashMap4, "yInPixels", i11, "windowWidthInPixels");
                hashMap4.put("windowHeightInPixels", Integer.valueOf(i12));
                interfaceC0677Re7.a("locationReady", hashMap4);
                U2.j.i("GET LOCATION COMPILED");
                return;
            case 7:
                InterfaceC0677Re interfaceC0677Re8 = (InterfaceC0677Re) obj;
                A8 P5 = interfaceC0677Re8.P();
                if (P5 == null || (mo17a = P5.mo17a()) == null) {
                    interfaceC0677Re8.k("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    interfaceC0677Re8.k("nativeAdViewSignalsReady", mo17a);
                    return;
                }
            case 8:
                InterfaceC0677Re interfaceC0677Re9 = (InterfaceC0677Re) obj;
                A8 P6 = interfaceC0677Re9.P();
                if (P6 == null || (d5 = P6.d()) == null) {
                    interfaceC0677Re9.k("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    interfaceC0677Re9.k("nativeClickMetaReady", d5);
                    return;
                }
            case 9:
                InterfaceC0677Re interfaceC0677Re10 = (InterfaceC0677Re) obj;
                S2.r rVar = P2.o.f4767B.f4784r;
                Context context = interfaceC0677Re10.getContext();
                synchronized (rVar) {
                    rVar.f5353n = interfaceC0677Re10;
                    if (!rVar.f(context)) {
                        rVar.d("Unable to bind", "on_play_store_bind");
                        return;
                    }
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("action", "fetch_completed");
                    rVar.c("on_play_store_bind", hashMap5);
                    return;
                }
            case 10:
                InterfaceC0677Re interfaceC0677Re11 = (InterfaceC0677Re) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    T2.G.m("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                Xt xt = new Xt();
                xt.f12254c = 8388691;
                byte b3 = (byte) (xt.f12257g | 1);
                xt.f12255d = -1.0f;
                xt.f12257g = (byte) (((byte) (((byte) (b3 | 2)) | 4)) | 8);
                xt.f12253b = (String) map.get("appId");
                xt.f12256e = interfaceC0677Re11.getWidth();
                xt.f12257g = (byte) (xt.f12257g | 16);
                IBinder windowToken = interfaceC0677Re11.K().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                xt.f12252a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    xt.f12254c = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                    xt.f12257g = (byte) (xt.f12257g | 1);
                } else {
                    xt.f12254c = 81;
                    xt.f12257g = (byte) (xt.f12257g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    xt.f12255d = Float.parseFloat((String) map.get("verticalMargin"));
                    xt.f12257g = (byte) (xt.f12257g | 2);
                } else {
                    xt.f12255d = 0.02f;
                    xt.f12257g = (byte) (xt.f12257g | 2);
                }
                if (map.containsKey("enifd")) {
                    xt.f = (String) map.get("enifd");
                }
                try {
                    P2.o.f4767B.f4784r.e(interfaceC0677Re11, xt.a());
                    return;
                } catch (NullPointerException e7) {
                    P2.o.f4767B.f4774g.i("DefaultGmsgHandlers.ShowLMDOverlay", e7);
                    T2.G.m("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 11:
                S2.r rVar2 = P2.o.f4767B.f4784r;
                if (!rVar2.f5350k || (qs = (Qs) rVar2.f5354o) == null) {
                    T2.G.m("LastMileDelivery not connected");
                    return;
                } else {
                    ((C0908du) qs.f11279l).a(rVar2.g(), (A0.J0) rVar2.f5355p, 1);
                    rVar2.c("onLMDOverlayExpand", new HashMap());
                    return;
                }
            case 12:
                S2.r rVar3 = P2.o.f4767B.f4784r;
                if (!rVar3.f5350k || (qs2 = (Qs) rVar3.f5354o) == null) {
                    T2.G.m("LastMileDelivery not connected");
                    return;
                } else {
                    ((C0908du) qs2.f11279l).a(rVar3.g(), (A0.J0) rVar3.f5355p, 2);
                    rVar3.c("onLMDOverlayCollapse", new HashMap());
                    return;
                }
            case 13:
                S2.r rVar4 = P2.o.f4767B.f4784r;
                if (!rVar4.f5350k || (qs3 = (Qs) rVar4.f5354o) == null) {
                    T2.G.m("LastMileDelivery not connected");
                    return;
                }
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.bb)).booleanValue() || TextUtils.isEmpty((String) rVar4.f5352m)) {
                    String str17 = (String) rVar4.f5351l;
                    if (str17 != null) {
                        str2 = str17;
                        str = null;
                        Wt wt = new Wt(str2, str);
                        A0.J0 j02 = (A0.J0) rVar4.f5355p;
                        C0908du c0908du = (C0908du) qs3.f11279l;
                        c0802bc = c0908du.f13200a;
                        if (c0802bc != null) {
                            C0908du.f13198c.a("error: %s", "Play Store not found.");
                            return;
                        } else {
                            if (C0908du.c(j02, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                                c0802bc.l(new RunnableC1043gu(c0802bc, new RunnableC1362o(c0908du, wt, j02, 7), 1));
                                return;
                            }
                            return;
                        }
                    }
                    rVar4.d("Missing session token and/or appId", "onLMDupdate");
                    str = null;
                } else {
                    str = (String) rVar4.f5352m;
                }
                str2 = null;
                Wt wt2 = new Wt(str2, str);
                A0.J0 j022 = (A0.J0) rVar4.f5355p;
                C0908du c0908du2 = (C0908du) qs3.f11279l;
                c0802bc = c0908du2.f13200a;
                if (c0802bc != null) {
                }
                break;
            case 14:
                InterfaceC0677Re interfaceC0677Re12 = (InterfaceC0677Re) obj;
                try {
                    Ot.g(interfaceC0677Re12.getContext()).h();
                    Pt.g(interfaceC0677Re12.getContext()).h();
                    Qt.d(interfaceC0677Re12.getContext()).n();
                    return;
                } catch (IOException e8) {
                    P2.o.f4767B.f4774g.i("DefaultGmsgHandlers.ResetPaid", e8);
                    return;
                }
            case 15:
                a(obj, map);
                return;
            case 16:
                InterfaceC0677Re interfaceC0677Re13 = (InterfaceC0677Re) obj;
                try {
                    JSONObject jSONObject3 = new JSONObject((String) map.get("args"));
                    Iterator<String> keys = jSONObject3.keys();
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(interfaceC0677Re13.getContext()).edit();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj2 = jSONObject3.get(next);
                        if (obj2 instanceof Integer) {
                            edit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            edit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            edit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            edit.putString(next, (String) obj2);
                        }
                    }
                    edit.apply();
                    return;
                } catch (JSONException e9) {
                    P2.o.f4767B.f4774g.i("GMSG write local storage KV pairs handler", e9);
                    return;
                }
            case 17:
                InterfaceC0677Re interfaceC0677Re14 = (InterfaceC0677Re) obj;
                try {
                    JSONArray jSONArray2 = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(interfaceC0677Re14.getContext()).edit();
                    while (i5 < jSONArray2.length()) {
                        edit2.remove(jSONArray2.getString(i5));
                        i5++;
                    }
                    edit2.apply();
                    return;
                } catch (JSONException e10) {
                    P2.o.f4767B.f4774g.i("GMSG clear local storage keys handler", e10);
                    return;
                }
            case 18:
                InterfaceC0677Re interfaceC0677Re15 = (InterfaceC0677Re) obj;
                if (interfaceC0677Re15.B() != null) {
                    ((BinderC1084hq) interfaceC0677Re15.B()).u3(3);
                }
                S2.d V4 = interfaceC0677Re15.V();
                if (V4 != null) {
                    V4.a();
                    return;
                }
                S2.d G5 = interfaceC0677Re15.G();
                if (G5 != null) {
                    G5.a();
                    return;
                } else {
                    U2.j.i("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 19:
                ((InterfaceC0677Re) obj).Q0("1".equals(map.get("custom_close")));
                return;
            case 20:
                U2.j.h("Received log message: ".concat(String.valueOf((String) map.get("string"))));
                return;
            case C1639u7.zzm /* 21 */:
                A8 P7 = ((InterfaceC0677Re) obj).P();
                if (P7 != null) {
                    P7.i();
                    return;
                }
                return;
            case 22:
                ((InterfaceC0677Re) obj).J(!Boolean.parseBoolean((String) map.get("disabled")));
                return;
            case 23:
                InterfaceC0677Re interfaceC0677Re16 = (InterfaceC0677Re) obj;
                String str18 = (String) map.get("action");
                if ("pause".equals(str18)) {
                    interfaceC0677Re16.q();
                    return;
                } else {
                    if ("resume".equals(str18)) {
                        interfaceC0677Re16.y();
                        return;
                    }
                    return;
                }
            case 24:
                c(obj, map);
                return;
            case 25:
                InterfaceC0677Re interfaceC0677Re17 = (InterfaceC0677Re) obj;
                if (map.keySet().contains("start")) {
                    interfaceC0677Re17.J0(true);
                }
                if (map.keySet().contains("stop")) {
                    interfaceC0677Re17.J0(false);
                    return;
                }
                return;
            case 26:
                InterfaceC0677Re interfaceC0677Re18 = (InterfaceC0677Re) obj;
                BinderC0894df s2 = interfaceC0677Re18.s();
                if (s2 == null) {
                    try {
                        BinderC0894df binderC0894df = new BinderC0894df(interfaceC0677Re18, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        interfaceC0677Re18.R0(binderC0894df);
                        s2 = binderC0894df;
                    } catch (NullPointerException e11) {
                        e = e11;
                        U2.j.g("Unable to parse videoMeta message.", e);
                        P2.o.f4767B.f4774g.i("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    } catch (NumberFormatException e12) {
                        e = e12;
                        U2.j.g("Unable to parse videoMeta message.", e);
                        P2.o.f4767B.f4774g.i("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    }
                }
                float parseFloat = Float.parseFloat((String) map.get("duration"));
                boolean equals = "1".equals(map.get("muted"));
                float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
                int parseInt4 = Integer.parseInt((String) map.get("playbackState"));
                if (parseInt4 >= 0 && parseInt4 <= 3) {
                    i5 = parseInt4;
                }
                String str19 = (String) map.get("aspectRatio");
                float parseFloat3 = TextUtils.isEmpty(str19) ? 0.0f : Float.parseFloat(str19);
                if (U2.j.l(3)) {
                    U2.j.d("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i5 + " , aspectRatio : " + str19);
                }
                s2.v3(parseFloat2, parseFloat, i5, equals, parseFloat3);
                return;
            case 27:
                d(obj, map);
                return;
            default:
                U2.j.d("Show native ad policy validator overlay.");
                ((InterfaceC0677Re) obj).K().setVisibility(0);
                return;
        }
    }
}
