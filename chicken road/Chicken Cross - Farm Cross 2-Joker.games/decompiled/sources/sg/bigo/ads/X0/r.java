package sg.bigo.ads.X0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.C4761z5;
import com.ironsource.L6;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.ktor.http.ContentType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.AbstractC4955l;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.a1.InterfaceC5020a;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.b1.C5033f;
import sg.bigo.ads.b1.C5034g;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.y0.AbstractRunnableC5522h;
import sg.bigo.ads.y0.C5517c;

/* loaded from: classes3.dex */
public final class r implements sg.bigo.ads.P0.d, InterfaceC5020a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12613a;
    public final sg.bigo.ads.T0.g b;
    public final sg.bigo.ads.T0.n c;
    public final sg.bigo.ads.Q0.n d;
    public final u e;
    public final z f;
    public A g;
    public final LinkedList h;
    public final SparseArray i;
    public long j;
    public Context m;
    public final q p;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public boolean l = true;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final AtomicBoolean o = new AtomicBoolean(false);

    public r(Context context, AdConfig adConfig) {
        C5010e c5010e = new C5010e();
        this.f12613a = context;
        sg.bigo.ads.T0.g gVar = new sg.bigo.ads.T0.g(context);
        this.b = gVar;
        sg.bigo.ads.O.g.f12472a = gVar;
        sg.bigo.ads.T0.n nVar = new sg.bigo.ads.T0.n(context);
        this.c = nVar;
        u uVar = new u(context, adConfig, gVar);
        this.e = uVar;
        sg.bigo.ads.Q0.n nVar2 = new sg.bigo.ads.Q0.n(context, uVar, gVar);
        this.d = nVar2;
        nVar2.j = c5010e;
        AbstractRunnableC5522h.e = nVar2.f12510a.p;
        AbstractC5507g.c = uVar;
        AbstractC5507g.f13384a = new C5517c(uVar);
        this.f = new z(context, gVar, nVar, uVar, nVar2);
        sg.bigo.ads.T0.g gVar2 = sg.bigo.ads.O.g.f12472a;
        if (gVar2 != null) {
            sg.bigo.ads.T0.c cVar = gVar2.L;
            if (cVar instanceof sg.bigo.ads.T0.c) {
                cVar.f12549a = nVar;
            }
        }
        this.h = new LinkedList();
        this.i = new SparseArray();
        this.p = new q(this);
    }

    public static void a(r rVar, o oVar) {
        if (rVar.b.j) {
            AbstractC5446j.a(3, null, new n(rVar, oVar), 0L);
        } else {
            AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1005, GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13."), 0L);
        }
    }

    public final Context b() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.f12613a;
            }
            Context context = this.m;
            if (context != null) {
                return context;
            }
            Context createWindowContext = this.f12613a.createDisplayContext(((DisplayManager) this.f12613a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.m = createWindowContext;
            return createWindowContext;
        } catch (Throwable unused) {
            return this.f12613a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        o oVar;
        sg.bigo.ads.T0.p pVar;
        int i;
        sg.bigo.ads.b1.m c5034g;
        boolean z;
        sg.bigo.ads.U0.b bVar;
        sg.bigo.ads.T0.g gVar;
        sg.bigo.ads.T0.g gVar2;
        if (this.i.size() >= this.b.x || (oVar = (o) this.h.poll()) == null) {
            return;
        }
        sg.bigo.ads.T0.n nVar = this.c;
        sg.bigo.ads.N.d dVar = (sg.bigo.ads.N.d) oVar.f12610a;
        nVar.getClass();
        sg.bigo.ads.T0.p c = dVar.c();
        if (c == null) {
            String d = dVar.d();
            HashMap hashMap = nVar.e;
            if (hashMap == null || d == null) {
                pVar = null;
                sg.bigo.ads.N.d dVar2 = (sg.bigo.ads.N.d) oVar.f12610a;
                String str = dVar2.b;
                if (pVar != null) {
                    AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "scheduleRequest error, slot is empty, slot id=" + ((sg.bigo.ads.N.d) oVar.f12610a).d());
                    AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1014, GamesActivityResultCodes.RESULT_NETWORK_FAILURE, "The slot id is inactive or invalid, please make sure the id is aligned with app id. If ids are correct, please wait for at least 30 minutes then try again"), 0L);
                    c();
                    return;
                }
                if (!pVar.m) {
                    AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "schedule next request, slot is disable, slot id=" + ((sg.bigo.ads.N.d) oVar.f12610a).d());
                    AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1015, 10005, "The switch of the slot is turned off. Please check slot setup."), 0L);
                    c();
                    return;
                }
                if (dVar2.a(pVar.b)) {
                    AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "schedule next request, this slot id is ad type " + pVar.b + ", request as type " + ((sg.bigo.ads.N.d) oVar.f12610a).a());
                    AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1016, 10007, "The ad type of this slot isn't consistent with the method to querying an ad."), 0L);
                    c();
                    return;
                }
                boolean z2 = pVar.v == 3;
                if (!z2 && !TextUtils.isEmpty(str)) {
                    AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "requsting an ordinary ad with server bidding payload.");
                }
                if (oVar.c && (gVar2 = sg.bigo.ads.O.g.f12472a) != null) {
                    sg.bigo.ads.T0.b a2 = gVar2.L.a(pVar.l);
                    if ((a2 != null ? a2.f : 0) > 1) {
                        AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "schedule next request, slot is timeout, slot id=" + ((sg.bigo.ads.N.d) oVar.f12610a).d());
                        AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1011, 10207, "no fill"), 0L);
                        c();
                        return;
                    }
                }
                if (oVar.d && (gVar = sg.bigo.ads.O.g.f12472a) != null) {
                    sg.bigo.ads.T0.b a3 = gVar.L.a(pVar.l);
                    if ((a3 != null ? a3.g : 0) > 1) {
                        AbstractC5496a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "schedule next request, slot is loaded with cache, slot id=" + ((sg.bigo.ads.N.d) oVar.f12610a).d());
                        AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1011, 10208, "no fill"), 0L);
                        c();
                        return;
                    }
                }
                if (sg.bigo.ads.P.a.b(pVar.b)) {
                    sg.bigo.ads.F0.a.a(pVar.l);
                    if (pVar.r == null) {
                        pVar.r = new sg.bigo.ads.T0.q(new JSONObject());
                    }
                    Integer a4 = sg.bigo.ads.K0.z.a(pVar.r.a("splash_impression_limit"));
                    int intValue = a4 != null ? a4.intValue() : 0;
                    if (intValue <= 0) {
                        z = true;
                    } else {
                        z = ((Integer) sg.bigo.ads.F0.b.a("sp_ads", new StringBuilder("impression_num_").append(pVar.l).toString(), (Object) 0, 0)).intValue() < intValue;
                        if (!z) {
                            AbstractC5496a.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "The maximum number of ad impressions for the day (" + intValue + ") has been reached.");
                        }
                    }
                    if (!z) {
                        AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1017, 10008, "The impressions of the ad has reached the limit. You can change this setup on bigo's console"), 0L);
                        c();
                        return;
                    }
                    if (!z2) {
                        sg.bigo.ads.N.c cVar = ((sg.bigo.ads.N.d) oVar.f12610a).h;
                        Cursor a5 = AbstractC5025b.a("tb_addata", new String[]{"slot"}[0] + "=? ", new String[]{String.valueOf(pVar.l)}, null, 1);
                        if (a5 != null) {
                            if (a5.moveToNext()) {
                                long j = a5.getLong(a5.getColumnIndex("log_id"));
                                String string = a5.getString(a5.getColumnIndex("ad_data"));
                                long j2 = a5.getLong(a5.getColumnIndex(SDKConstants.PARAM_TOURNAMENTS_END_TIME));
                                sg.bigo.ads.U0.b a6 = sg.bigo.ads.U0.b.a(j, cVar, pVar, string);
                                if (a6 != null) {
                                    a6.G = true;
                                    a6.H = j2;
                                    bVar = a6;
                                    if (bVar != null) {
                                        if (!bVar.a()) {
                                            sg.bigo.ads.N.d dVar3 = (sg.bigo.ads.N.d) oVar.f12610a;
                                            Context context = this.f12613a;
                                            Context b = b();
                                            u uVar = this.e;
                                            sg.bigo.ads.P.j jVar = new sg.bigo.ads.P.j(bVar, pVar, dVar3, context, b);
                                            jVar.d = uVar;
                                            oVar.b.a(-1, (sg.bigo.ads.N.d) oVar.f12610a, jVar);
                                            c();
                                            return;
                                        }
                                        sg.bigo.ads.U0.a.a(pVar.l);
                                    }
                                }
                            }
                            a5.close();
                        }
                        bVar = null;
                        if (bVar != null) {
                        }
                    }
                }
                sg.bigo.ads.T0.g gVar3 = sg.bigo.ads.O.g.f12472a;
                if (gVar3 != null) {
                    if ((gVar3.N == 1) && !this.l) {
                        AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1003, 3006, "no network connection"), 0L);
                        return;
                    }
                }
                sg.bigo.ads.T0.g gVar4 = this.b;
                u uVar2 = this.e;
                sg.bigo.ads.Q0.n nVar2 = this.d;
                sg.bigo.ads.N.d dVar4 = (sg.bigo.ads.N.d) oVar.f12610a;
                dVar4.getClass();
                if (dVar4 instanceof IconAdsRequest) {
                    i = 1;
                    c5034g = new sg.bigo.ads.b1.n(gVar4, uVar2, nVar2, dVar4, pVar, this);
                } else {
                    i = 1;
                    c5034g = pVar.v == 3 ? new C5034g(uVar2, dVar4, pVar, this) : new C5033f(gVar4, uVar2, nVar2, dVar4, pVar, this);
                }
                this.i.put(c5034g.a(), new o(c5034g, oVar.b));
                sg.bigo.ads.N.c cVar2 = ((sg.bigo.ads.N.d) oVar.f12610a).h;
                if (cVar2.k == 0) {
                    cVar2.k = System.currentTimeMillis();
                }
                oVar.e = 2;
                if (c5034g instanceof C5033f) {
                    oVar.g = ((C5033f) c5034g).h;
                }
                c5034g.b();
                HashMap a7 = sg.bigo.ads.f1.a.a("load", pVar, (sg.bigo.ads.N.d) oVar.f12610a, null, Integer.valueOf(pVar.v));
                a7.put("is_server_request", Integer.valueOf(i));
                sg.bigo.ads.f1.b.i.a("load", a7);
                return;
            }
            c = (sg.bigo.ads.T0.p) hashMap.get(d);
        }
        pVar = c;
        sg.bigo.ads.N.d dVar22 = (sg.bigo.ads.N.d) oVar.f12610a;
        String str2 = dVar22.b;
        if (pVar != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:9|10|11|(2:12|13)|(1:15)(1:87)|16|17|(3:81|82|83)|19|20|(3:74|75|(18:77|23|(3:67|68|(15:70|26|27|(13:61|62|63|30|31|32|33|34|(1:36)(1:56)|37|(1:39)(1:55)|40|(1:53)(5:42|(1:44)(2:49|(1:51)(3:52|46|47))|45|46|47))|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)))|25|26|27|(0)|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)))|22|23|(0)|25|26|27|(0)|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:9|10|11|12|13|(1:15)(1:87)|16|17|(3:81|82|83)|19|20|(3:74|75|(18:77|23|(3:67|68|(15:70|26|27|(13:61|62|63|30|31|32|33|34|(1:36)(1:56)|37|(1:39)(1:55)|40|(1:53)(5:42|(1:44)(2:49|(1:51)(3:52|46|47))|45|46|47))|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)))|25|26|27|(0)|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)))|22|23|(0)|25|26|27|(0)|29|30|31|32|33|34|(0)(0)|37|(0)(0)|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d3, code lost:
    
        java.lang.Class.forName("androidx.media3.exoplayer.ExoPlayer");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e8 A[Catch: Exception -> 0x01ff, TryCatch #0 {Exception -> 0x01ff, blocks: (B:11:0x0024, B:16:0x0075, B:83:0x009d, B:19:0x00a3, B:23:0x00f9, B:26:0x012f, B:30:0x01b5, B:34:0x01d9, B:36:0x01e8, B:40:0x01f7, B:55:0x01f3, B:66:0x019e, B:73:0x0117, B:80:0x00e2, B:86:0x0094, B:87:0x006e, B:82:0x008c, B:68:0x0109, B:70:0x0113, B:62:0x0196, B:75:0x00d2, B:77:0x00dc), top: B:10:0x0024, inners: #2, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3 A[Catch: Exception -> 0x01ff, TryCatch #0 {Exception -> 0x01ff, blocks: (B:11:0x0024, B:16:0x0075, B:83:0x009d, B:19:0x00a3, B:23:0x00f9, B:26:0x012f, B:30:0x01b5, B:34:0x01d9, B:36:0x01e8, B:40:0x01f7, B:55:0x01f3, B:66:0x019e, B:73:0x0117, B:80:0x00e2, B:86:0x0094, B:87:0x006e, B:82:0x008c, B:68:0x0109, B:70:0x0113, B:62:0x0196, B:75:0x00d2, B:77:0x00dc), top: B:10:0x0024, inners: #2, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        u uVar;
        String str;
        String str2;
        ActivityManager.MemoryInfo memoryInfo;
        Context context;
        int i;
        AudioManager audioManager;
        int ringerMode;
        Context context2;
        Configuration configuration;
        float f;
        int i2;
        if (!this.o.get() || !this.n.get() || (uVar = this.e) == null || sg.bigo.ads.F0.a.f()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = null;
        try {
            jSONObject.putOpt("gg_service_ver", uVar.n);
            jSONObject.putOpt("webkit_ver", uVar.o);
            jSONObject.putOpt("cpu_core_num", Integer.valueOf(uVar.p));
            jSONObject.putOpt("cpu_clock_speed", Long.valueOf(uVar.q));
            jSONObject.putOpt("total_memory", Long.valueOf(uVar.r));
            try {
                ActivityManager activityManager = (ActivityManager) uVar.b.getSystemService("activity");
                memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
            } catch (Exception unused) {
                memoryInfo = null;
            }
            jSONObject.putOpt("free_memory", Long.valueOf(memoryInfo == null ? 0L : AbstractC4964v.a(3, memoryInfo.availMem)));
            if (System.currentTimeMillis() - H.d > 60000) {
                try {
                    H.c = H.b();
                } catch (Throwable th) {
                    AbstractC5496a.a("StorageUtils", th.toString());
                }
                H.d = System.currentTimeMillis();
            }
            jSONObject.putOpt("rom_free_in", Long.valueOf(H.c));
            jSONObject.putOpt("rom_free_ext", Long.valueOf(H.a()));
            jSONObject.putOpt(L6.i0, Float.valueOf(uVar.k()));
            context = uVar.b;
            int i3 = sg.bigo.ads.I0.f.f12337a;
            i = 0;
        } catch (Exception unused2) {
            str = null;
        }
        if (context != null) {
            try {
                audioManager = (AudioManager) context.getSystemService("audio");
            } catch (Exception e) {
                AbstractC5496a.a("DeviceUtil", "getNotificationMode exception: " + e.getMessage());
            }
            if (audioManager != null) {
                ringerMode = audioManager.getRingerMode();
                jSONObject.putOpt("note", Integer.valueOf(ringerMode));
                context2 = uVar.b;
                int i4 = sg.bigo.ads.I0.f.f12337a;
                if (context2 != null) {
                    try {
                        configuration = context2.getResources().getConfiguration();
                    } catch (Exception e2) {
                        AbstractC5496a.a("DeviceUtil", "getFontScale exception: " + e2.getMessage());
                    }
                    if (configuration != null) {
                        f = configuration.fontScale;
                        jSONObject.putOpt(ContentType.Font.TYPE, Float.valueOf(f));
                        jSONObject.putOpt("scale", Integer.valueOf(sg.bigo.ads.I0.f.c(uVar.b)));
                        jSONObject.putOpt("theme", Integer.valueOf(sg.bigo.ads.I0.f.g(uVar.b)));
                        jSONObject.putOpt("gg_service", Integer.valueOf(sg.bigo.ads.I0.f.e(uVar.b) ? 1 : 0));
                        jSONObject.putOpt("tsdk", String.valueOf(sg.bigo.ads.I0.f.f(uVar.b)));
                        jSONObject.putOpt("msdk", String.valueOf(sg.bigo.ads.I0.f.d(uVar.b)));
                        jSONObject.putOpt("apks", Long.valueOf(uVar.b()));
                        if (uVar.b != null) {
                            try {
                                Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                                i2 = 1;
                            } catch (Throwable th2) {
                                AbstractC5496a.a("DeviceUtil", "isUnityEnvironment exception: " + th2.getMessage());
                            }
                            jSONObject.putOpt("unity", Integer.valueOf(i2));
                            jSONObject.putOpt("ace", Integer.valueOf(sg.bigo.ads.I0.f.i(uVar.b) ? 1 : 0));
                            Class.forName("com.google.android.exoplayer2.SimpleExoPlayer");
                            i = 1;
                            jSONObject.putOpt("exo", Integer.valueOf(i));
                            C5055a a2 = BigoAdSdk.a(uVar.b);
                            JSONObject jSONObject2 = a2 == null ? a2.f : null;
                            jSONObject.putOpt("anti_info_full", jSONObject2 != null ? "" : jSONObject2.toString());
                            str = jSONObject.toString();
                            if (str != null) {
                                return;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str2 = "data error with empty.";
                            } else {
                                if (!TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                                    str3 = F.a(str);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("data", str3);
                                    sg.bigo.ads.s1.b.a("06002068", hashMap);
                                    return;
                                }
                                str2 = "cip error with empty.";
                            }
                            AbstractC5496a.a("a", str2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("data", str3);
                            sg.bigo.ads.s1.b.a("06002068", hashMap2);
                            return;
                        }
                        i2 = 0;
                        jSONObject.putOpt("unity", Integer.valueOf(i2));
                        jSONObject.putOpt("ace", Integer.valueOf(sg.bigo.ads.I0.f.i(uVar.b) ? 1 : 0));
                        Class.forName("com.google.android.exoplayer2.SimpleExoPlayer");
                        i = 1;
                        jSONObject.putOpt("exo", Integer.valueOf(i));
                        C5055a a22 = BigoAdSdk.a(uVar.b);
                        if (a22 == null) {
                        }
                        jSONObject.putOpt("anti_info_full", jSONObject2 != null ? "" : jSONObject2.toString());
                        str = jSONObject.toString();
                        if (str != null) {
                        }
                    }
                }
                f = 1.0f;
                jSONObject.putOpt(ContentType.Font.TYPE, Float.valueOf(f));
                jSONObject.putOpt("scale", Integer.valueOf(sg.bigo.ads.I0.f.c(uVar.b)));
                jSONObject.putOpt("theme", Integer.valueOf(sg.bigo.ads.I0.f.g(uVar.b)));
                jSONObject.putOpt("gg_service", Integer.valueOf(sg.bigo.ads.I0.f.e(uVar.b) ? 1 : 0));
                jSONObject.putOpt("tsdk", String.valueOf(sg.bigo.ads.I0.f.f(uVar.b)));
                jSONObject.putOpt("msdk", String.valueOf(sg.bigo.ads.I0.f.d(uVar.b)));
                jSONObject.putOpt("apks", Long.valueOf(uVar.b()));
                if (uVar.b != null) {
                }
                i2 = 0;
                jSONObject.putOpt("unity", Integer.valueOf(i2));
                jSONObject.putOpt("ace", Integer.valueOf(sg.bigo.ads.I0.f.i(uVar.b) ? 1 : 0));
                Class.forName("com.google.android.exoplayer2.SimpleExoPlayer");
                i = 1;
                jSONObject.putOpt("exo", Integer.valueOf(i));
                C5055a a222 = BigoAdSdk.a(uVar.b);
                if (a222 == null) {
                }
                jSONObject.putOpt("anti_info_full", jSONObject2 != null ? "" : jSONObject2.toString());
                str = jSONObject.toString();
                if (str != null) {
                }
            }
        }
        ringerMode = 0;
        jSONObject.putOpt("note", Integer.valueOf(ringerMode));
        context2 = uVar.b;
        int i42 = sg.bigo.ads.I0.f.f12337a;
        if (context2 != null) {
        }
        f = 1.0f;
        jSONObject.putOpt(ContentType.Font.TYPE, Float.valueOf(f));
        jSONObject.putOpt("scale", Integer.valueOf(sg.bigo.ads.I0.f.c(uVar.b)));
        jSONObject.putOpt("theme", Integer.valueOf(sg.bigo.ads.I0.f.g(uVar.b)));
        jSONObject.putOpt("gg_service", Integer.valueOf(sg.bigo.ads.I0.f.e(uVar.b) ? 1 : 0));
        jSONObject.putOpt("tsdk", String.valueOf(sg.bigo.ads.I0.f.f(uVar.b)));
        jSONObject.putOpt("msdk", String.valueOf(sg.bigo.ads.I0.f.d(uVar.b)));
        jSONObject.putOpt("apks", Long.valueOf(uVar.b()));
        if (uVar.b != null) {
        }
        i2 = 0;
        jSONObject.putOpt("unity", Integer.valueOf(i2));
        jSONObject.putOpt("ace", Integer.valueOf(sg.bigo.ads.I0.f.i(uVar.b) ? 1 : 0));
        Class.forName("com.google.android.exoplayer2.SimpleExoPlayer");
        i = 1;
        jSONObject.putOpt("exo", Integer.valueOf(i));
        C5055a a2222 = BigoAdSdk.a(uVar.b);
        if (a2222 == null) {
        }
        jSONObject.putOpt("anti_info_full", jSONObject2 != null ? "" : jSONObject2.toString());
        str = jSONObject.toString();
        if (str != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:10|(1:12)|13|(11:32|33|16|(1:18)|19|20|21|(2:22|(1:24)(1:25))|26|27|28)|15|16|(0)|19|20|21|(3:22|(0)(0)|24)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[Catch: all -> 0x010c, LOOP:0: B:22:0x00f6->B:24:0x00fc, LOOP_END, TryCatch #1 {all -> 0x010c, blocks: (B:21:0x00ce, B:22:0x00f6, B:24:0x00fc, B:26:0x0100), top: B:20:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100 A[EDGE_INSN: B:25:0x0100->B:26:0x0100 BREAK  A[LOOP:0: B:22:0x00f6->B:24:0x00fc], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(r rVar, int i, HashMap hashMap) {
        String jSONObject;
        StringBuilder sb;
        BufferedReader bufferedReader;
        String readLine;
        if (I.a((CharSequence) rVar.e.c.w) || rVar.k.getAndSet(true)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "last_stat_init_time", (Object) 0, 1)).longValue();
        long elapsedRealtime = rVar.j == 0 ? -1L : SystemClock.elapsedRealtime() - rVar.j;
        if (currentTimeMillis - longValue >= 300000) {
            rVar.e.getClass();
            String e = sg.bigo.ads.F0.a.e();
            String b = AbstractC5429c.b();
            sg.bigo.ads.u1.j jVar = new sg.bigo.ads.u1.j("06002001");
            jVar.a("states", "success");
            jVar.f13342a.put("cost", String.valueOf(elapsedRealtime));
            jVar.f13342a.put("status", String.valueOf(i));
            jVar.f13342a.put("cur_in_fg", String.valueOf(sg.bigo.ads.a0.o.b()));
            if (!TextUtils.isEmpty(e)) {
                jVar.a("uuid", e);
            }
            jVar.a("tc_string", b);
            if (!sg.bigo.ads.K0.A.a(hashMap)) {
                try {
                    jSONObject = new JSONObject(hashMap).toString();
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(jSONObject)) {
                    jVar.a("cost_map", jSONObject);
                }
                sg.bigo.ads.s1.b.a(jVar);
                sg.bigo.ads.F0.b.b("sp_ads", "last_stat_init_time", Long.valueOf(currentTimeMillis), 1);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(InAppPurchaseConstants.METHOD_BUILD, sg.bigo.ads.H0.a.b());
                Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
                sb = new StringBuilder();
                bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), C4761z5.O));
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                }
                bufferedReader.close();
                String str = sb.toString().toLowerCase();
                hashMap2.put("cpu_info", str);
                sg.bigo.ads.s1.b.a("06002059", hashMap2);
                rVar.n.set(true);
                rVar.d();
            }
            jSONObject = null;
            if (!TextUtils.isEmpty(jSONObject)) {
            }
            sg.bigo.ads.s1.b.a(jVar);
            sg.bigo.ads.F0.b.b("sp_ads", "last_stat_init_time", Long.valueOf(currentTimeMillis), 1);
            HashMap hashMap22 = new HashMap();
            hashMap22.put(InAppPurchaseConstants.METHOD_BUILD, sg.bigo.ads.H0.a.b());
            Process start2 = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(start2.getInputStream(), C4761z5.O));
            while (true) {
                readLine = bufferedReader.readLine();
                if (readLine != null) {
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String str2 = sb.toString().toLowerCase();
            hashMap22.put("cpu_info", str2);
            sg.bigo.ads.s1.b.a("06002059", hashMap22);
            rVar.n.set(true);
            rVar.d();
        }
    }

    public final void a(String str, String str2) {
        sg.bigo.ads.Q0.n nVar = this.d;
        nVar.getClass();
        if (AbstractC4955l.a(str2)) {
            if (I.a((CharSequence) str)) {
                str = "all";
            }
            nVar.i.put(str, str2);
            sg.bigo.ads.Q0.b bVar = nVar.f12510a;
            if (bVar.l.a(str, str2) || (bVar.j.a(str, str2) | bVar.k.a(str, str2))) {
                nVar.f12510a.a(10L);
            }
        }
    }

    public final String a() {
        String a2;
        u uVar = this.e;
        if (uVar == null) {
            return null;
        }
        A a3 = this.g;
        if (a3 == null) {
            a3 = new A();
            this.g = a3;
        }
        A.c = true;
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        int i = gVar != null ? gVar.V : 0;
        if (i == 1) {
            return a3.b(uVar);
        }
        if (i != 2) {
            return a3.c(uVar);
        }
        if (a3.f12595a != null && a3.b != 0 && System.currentTimeMillis() - a3.b <= 300000) {
            return a3.c(uVar);
        }
        synchronized (a3) {
            a2 = a3.a(uVar);
            a3.f12595a = a2;
        }
        return a2;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        AbstractC5446j.a(3, new RunnableC5008c(this, i, i2, str, i3, (sg.bigo.ads.T0.p) obj));
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, sg.bigo.ads.N.d dVar, Object[] objArr) {
        AbstractC5446j.a(3, null, new RunnableC5007b(this, i, (sg.bigo.ads.P.c[]) objArr, dVar), 0L);
    }
}
