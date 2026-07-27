package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C4761z5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: CommonClickControl.java */
/* loaded from: classes6.dex */
public class a {
    public static boolean n = false;
    public static Map<String, Long> o = new HashMap();
    public static Set<String> p = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private String f8864a;
    private long b;
    private com.mbridge.msdk.foundation.db.g c;
    private Context d;
    private com.mbridge.msdk.click.e e;
    private final com.mbridge.msdk.foundation.same.report.h g;
    private com.mbridge.msdk.setting.g h;
    private final boolean i;
    private boolean l;
    private j m;
    private NativeListener.NativeTrackingListener f = null;
    private boolean j = false;
    private boolean k = true;

    /* compiled from: CommonClickControl.java */
    class b implements g {
        b() {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    /* compiled from: CommonClickControl.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8866a;
        final /* synthetic */ boolean b;
        final /* synthetic */ CampaignEx c;

        c(boolean z, boolean z2, CampaignEx campaignEx) {
            this.f8866a = z;
            this.b = z2;
            this.c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8866a && !a.n && !a.this.l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.b) {
                a.this.d(this.c);
            }
            if (this.f8866a || a.this.f == null || a.n || a.this.l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f.onShowLoading(this.c);
        }
    }

    /* compiled from: CommonClickControl.java */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8868a;
        final /* synthetic */ Campaign b;

        e(boolean z, Campaign campaign) {
            this.f8868a = z;
            this.b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8868a && !a.n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f == null || a.n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f.onDismissLoading(this.b);
        }
    }

    public a(Context context, String str) {
        this.c = null;
        this.d = null;
        com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(str);
        this.h = f;
        if (f == null) {
            this.h = com.mbridge.msdk.setting.i.b().a();
        }
        this.i = this.h.P0();
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f8864a = str;
        if (this.c == null) {
            this.c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.g = new com.mbridge.msdk.foundation.same.report.h(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "2000138" : "2000139" : "2000137" : "2000136";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.d.startActivity(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e2);
            }
        }
    }

    public void c() {
        try {
            this.f = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c b2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (b2 != null) {
                        b2.a(b2.t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    q0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c b3 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            b3.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", b3);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z, z2, com.mbridge.msdk.click.retry.a.l);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2, int i) {
        if (context == null) {
            return;
        }
        int i2 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        a(i, campaignEx, i2);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C1353a(i2, str2, i, campaignEx), str2, z, z2, i);
    }

    private static void a(int i, CampaignEx campaignEx, int i2) {
        if (campaignEx != null) {
            try {
                String b2 = b(i);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i2));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(b2, campaignEx, eVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public boolean b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            Map<String, Long> map = o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id) && (l = o.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e2.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z, z2, com.mbridge.msdk.click.retry.a.l);
        }
    }

    /* compiled from: CommonClickControl.java */
    /* renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    class C1353a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8865a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ CampaignEx d;

        C1353a(int i, String str, int i2, CampaignEx campaignEx) {
            this.f8865a = i;
            this.b = str;
            this.c = i2;
            this.d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f8865a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith("2")) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str;
                        }
                        eVar.a("failingURL", c1.d(this.b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String b = a.b(this.c);
                if (this.d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(b, this.d, eVar);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String b = a.b(this.c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "");
                eVar.a("failingURL", c1.d(this.b));
                eVar.a("net_ty", String.valueOf(this.f8865a));
                if (this.d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(b, this.d, eVar);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e.getMessage());
                }
            }
        }
    }

    public void a(String str) {
        this.f8864a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.m = jVar;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.h;
            if (gVar != null) {
                return gVar.X();
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02b1 A[Catch: all -> 0x039f, TryCatch #1 {all -> 0x039f, blocks: (B:6:0x0009, B:9:0x0010, B:11:0x0036, B:13:0x003c, B:14:0x003f, B:15:0x0047, B:18:0x0061, B:20:0x0079, B:22:0x007d, B:23:0x0084, B:25:0x00a3, B:26:0x00aa, B:28:0x00ae, B:29:0x00c6, B:31:0x00cf, B:33:0x00d3, B:34:0x00da, B:36:0x00ea, B:40:0x00f4, B:42:0x00fa, B:44:0x0100, B:46:0x010c, B:48:0x0110, B:49:0x0117, B:51:0x011b, B:53:0x0125, B:56:0x012c, B:58:0x0130, B:59:0x0137, B:61:0x0156, B:64:0x015e, B:65:0x0170, B:67:0x0176, B:69:0x017a, B:70:0x0181, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x01a1, B:79:0x01a9, B:81:0x01ad, B:82:0x01b4, B:84:0x01be, B:86:0x01c4, B:87:0x01cb, B:89:0x01d1, B:91:0x01dd, B:93:0x01ec, B:94:0x01f5, B:96:0x01f9, B:97:0x0200, B:99:0x0206, B:100:0x020f, B:102:0x0213, B:105:0x020c, B:106:0x0220, B:109:0x0230, B:116:0x0247, B:118:0x0251, B:120:0x0259, B:122:0x0261, B:124:0x026a, B:125:0x0271, B:127:0x027f, B:129:0x0286, B:130:0x028d, B:132:0x0291, B:134:0x02a6, B:139:0x02b1, B:141:0x02b9, B:142:0x02bc, B:144:0x02c2, B:146:0x02c6, B:147:0x02c9, B:150:0x02cf, B:152:0x02d5, B:154:0x02df, B:156:0x02e3, B:158:0x02e7, B:159:0x02ea, B:160:0x0303, B:162:0x02f5, B:164:0x0300, B:166:0x0309, B:168:0x0317, B:173:0x031f, B:174:0x0327, B:175:0x032e, B:177:0x0332, B:178:0x0335, B:181:0x033c, B:183:0x0342, B:185:0x0348, B:189:0x034f, B:191:0x035a, B:193:0x0363, B:195:0x0367, B:197:0x036f, B:198:0x0372, B:200:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0383, B:207:0x0387, B:208:0x038a, B:210:0x0397, B:212:0x039b), top: B:5:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(CampaignEx campaignEx) {
        boolean z;
        String clickURL;
        if (campaignEx == null) {
            return;
        }
        try {
            if (!b(campaignEx)) {
                return;
            }
            c(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", campaignEx);
            String noticeUrl = campaignEx.getNoticeUrl();
            com.mbridge.msdk.foundation.db.d a2 = com.mbridge.msdk.foundation.db.d.a(this.c);
            a2.d();
            JumpLoaderResult b2 = a2.b(campaignEx.getId(), this.f8864a);
            if (b2 != null) {
                if (b2.getNoticeurl() != null) {
                    b2.setNoticeurl(null);
                }
                campaignEx.setJumpResult(b2);
                com.mbridge.msdk.click.b.a(a2, campaignEx, this.f8864a);
            }
            ArrayList arrayList = new ArrayList();
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (v0.b(campaignEx)) {
                MIMManager.b().a(campaignEx);
                arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                if (com.mbridge.msdk.click.c.d(this.d, campaignEx.getDeepLinkURL())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener = this.f;
                    if (nativeTrackingListener != null) {
                        nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, noticeUrl + "&opdptype=1", -1);
                    com.mbridge.msdk.click.b.a(campaignEx);
                    NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f;
                    if (nativeTrackingListener2 != null) {
                        nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    a(campaignEx, 3, 1, arrayList);
                    return;
                }
                noticeUrl = noticeUrl + "&opdptype=0";
                MIMManager.b().b(campaignEx);
            }
            String str = noticeUrl;
            if (campaignEx.getLinkType() == 12) {
                NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f;
                if (nativeTrackingListener3 != null) {
                    nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                }
                com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, str, -1);
                a(this.d, campaignEx, arrayList);
                NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f;
                if (nativeTrackingListener4 != null) {
                    nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    return;
                }
                return;
            }
            if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                if (appletsModel.isRequestSuccess()) {
                    if (com.mbridge.msdk.click.c.d(this.d, appletsModel.getDeepLink())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f;
                        if (nativeTrackingListener5 != null) {
                            nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        if (this.d != null) {
                            Intent intent = new Intent();
                            intent.setAction("mb_dp_close_broadcast_receiver");
                            try {
                                this.d.sendBroadcast(intent);
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CommonClickControl", e2.getMessage());
                                }
                            }
                        }
                        com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, str + "&opdptype=1", -1);
                        com.mbridge.msdk.click.b.a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f;
                        if (nativeTrackingListener6 != null) {
                            nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                            return;
                        }
                        return;
                    }
                    str = str + "&opdptype=0";
                } else {
                    if (appletsModel.isRequesting()) {
                        NativeListener.NativeTrackingListener nativeTrackingListener7 = this.f;
                        if (nativeTrackingListener7 != null) {
                            nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        appletsModel.setAppletSchemeCallBack(a(this.f, campaignEx, appletsModel, this));
                        return;
                    }
                    if (appletsModel.can(1)) {
                        if (appletsModel.isRequestTimesMaxPerDay()) {
                            if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                            }
                        } else {
                            NativeListener.NativeTrackingListener nativeTrackingListener8 = this.f;
                            if (nativeTrackingListener8 != null) {
                                nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.requestWxAppletsScheme(1, a(this.f, campaignEx, appletsModel, this));
                            return;
                        }
                    }
                }
            }
            if (com.mbridge.msdk.util.b.b()) {
                com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, str, -1);
            }
            if (!campaignEx.getUserActivation() && com.mbridge.msdk.click.c.a(this.d, campaignEx.getPackageName())) {
                com.mbridge.msdk.click.c.b(this.d, campaignEx.getPackageName());
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, str, com.mbridge.msdk.foundation.same.a.N);
                }
                NativeListener.NativeTrackingListener nativeTrackingListener9 = this.f;
                if (nativeTrackingListener9 != null) {
                    nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                }
                if (com.mbridge.msdk.util.b.a()) {
                    a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                } else {
                    a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                }
                NativeListener.NativeTrackingListener nativeTrackingListener10 = this.f;
                if (nativeTrackingListener10 != null) {
                    nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    u0.a(this.f);
                    return;
                }
                return;
            }
            int linkType = campaignEx.getLinkType();
            int b3 = b();
            if (com.mbridge.msdk.util.b.a() && linkType != 3) {
                com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, str, -1);
            }
            if (linkType != 8 && linkType != 9 && linkType != 4) {
                z = false;
                clickURL = campaignEx.getClickURL();
                if (TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = this.f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (u0.a.a(this.d, campaignEx.getClickURL(), this.f)) {
                        a(b2, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = this.f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    a(b3, campaignEx.getClickURL(), campaignEx, this.f, arrayList);
                    a(b2, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = this.f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (z) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.util.b.a()) {
                            a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.util.b.a()) {
                            a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = this.f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = this.f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        a(b2, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = this.f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    u0.a(this.d, clickURL2, this.f, campaignEx, arrayList);
                    if (com.mbridge.msdk.util.b.a()) {
                        a(b2, campaignEx, false);
                        return;
                    } else {
                        a(b2, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = this.f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = this.f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    a(b2, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = this.f;
                        if (baseTrackingListener == null && (baseTrackingListener = this.m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        u0.a(this.d, clickURL3, campaignEx, this, baseTrackingListener, arrayList);
                    } else {
                        u0.a(this.d, clickURL3, campaignEx, this.f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = this.f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    a(b2, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    u0.a(this.d, clickURL3, this.f, campaignEx, arrayList);
                    a(b2, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = this.f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (b3 == 2) {
                        u0.a(this.d, clickURL3, campaignEx, this.f, arrayList);
                    } else {
                        u0.a(this.d, clickURL3, this.f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = this.f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                a(b2, campaignEx, false);
                return;
            }
            z = true;
            clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
            }
            if (z) {
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    /* compiled from: CommonClickControl.java */
    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f8867a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Boolean c;
        final /* synthetic */ List d;
        final /* synthetic */ boolean e;

        d(CampaignEx campaignEx, boolean z, Boolean bool, List list, boolean z2) {
            this.f8867a = campaignEx;
            this.b = z;
            this.c = bool;
            this.d = list;
            this.e = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x00a8, TryCatch #2 {all -> 0x00a8, blocks: (B:23:0x0062, B:25:0x0070, B:26:0x007d, B:28:0x0081, B:30:0x008b, B:31:0x0093), top: B:22:0x0062 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: all -> 0x00a8, TryCatch #2 {all -> 0x00a8, blocks: (B:23:0x0062, B:25:0x0070, B:26:0x007d, B:28:0x0081, B:30:0x008b, B:31:0x0093), top: B:22:0x0062 }] */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(Object obj) {
            CampaignEx campaignEx;
            ?? r1;
            Throwable th;
            JumpLoaderResult jumpLoaderResult;
            Set<String> set = a.p;
            if (set != null) {
                set.remove(this.f8867a.getId());
            }
            JumpLoaderResult jumpLoaderResult2 = null;
            if (obj != null) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    jumpLoaderResult = null;
                }
                if (obj instanceof JumpLoaderResult) {
                    jumpLoaderResult = (JumpLoaderResult) obj;
                    try {
                        this.f8867a.setJumpResult(jumpLoaderResult);
                        a aVar = a.this;
                        aVar.a(this.f8867a, jumpLoaderResult, this.b, aVar.j, this.c, (List<String>) this.d);
                        if (jumpLoaderResult.isjumpDone()) {
                            com.mbridge.msdk.click.b.a(com.mbridge.msdk.foundation.db.d.a(a.this.c), this.f8867a, a.this.f8864a);
                        }
                        a.this.a(this.e, this.f8867a);
                    } catch (Throwable th3) {
                        th = th3;
                        q0.b("CommonClickControl", th.getMessage());
                        jumpLoaderResult2 = jumpLoaderResult;
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("result", "1");
                        if (jumpLoaderResult2 != null) {
                        }
                        campaignEx = this.f8867a;
                        if (campaignEx != null) {
                        }
                        r1 = -1;
                        eVar.a("net_ty", Integer.valueOf((int) r1));
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar);
                    }
                    jumpLoaderResult2 = jumpLoaderResult;
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("result", "1");
                if (jumpLoaderResult2 != null) {
                    eVar2.a("status_code", Integer.valueOf(jumpLoaderResult2.getStatusCode()));
                }
                campaignEx = this.f8867a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (!TextUtils.isEmpty(clickURL)) {
                        r1 = clickURL.startsWith("tcp");
                        eVar2.a("net_ty", Integer.valueOf((int) r1));
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar2);
                    }
                }
                r1 = -1;
                eVar2.a("net_ty", Integer.valueOf((int) r1));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar2);
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th4.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:11:0x004d, B:13:0x0051, B:15:0x005b, B:16:0x0063, B:18:0x007a, B:19:0x0087), top: B:10:0x004d }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:11:0x004d, B:13:0x0051, B:15:0x005b, B:16:0x0063, B:18:0x007a, B:19:0x0087), top: B:10:0x004d }] */
        /* JADX WARN: Type inference failed for: r6v10, types: [int] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(Object obj, String str) {
            CampaignEx campaignEx;
            ?? r6;
            Set<String> set = a.p;
            if (set != null) {
                set.remove(this.f8867a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            a.this.a((JumpLoaderResult) obj, this.f8867a, true);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th) {
                            th = th;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th.getMessage());
                            campaignEx = this.f8867a;
                            if (campaignEx != null) {
                            }
                            r6 = -1;
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("result", "2");
                            eVar.a("net_ty", Integer.valueOf((int) r6));
                            if (jumpLoaderResult != null) {
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a.this.f != null) {
                a.this.f.onRedirectionFailed(this.f8867a, str);
            }
            a.this.a(this.e, this.f8867a);
            try {
                campaignEx = this.f8867a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (!TextUtils.isEmpty(clickURL)) {
                        r6 = clickURL.startsWith("tcp");
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar2.a("result", "2");
                        eVar2.a("net_ty", Integer.valueOf((int) r6));
                        if (jumpLoaderResult != null) {
                            eVar2.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                        }
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar2);
                    }
                }
                r6 = -1;
                com.mbridge.msdk.foundation.same.report.metrics.e eVar22 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar22.a("result", "2");
                eVar22.a("net_ty", Integer.valueOf((int) r6));
                if (jumpLoaderResult != null) {
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f8867a, eVar22);
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th3.getMessage());
                }
            }
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, 2, "context is null", this.f8864a);
            return;
        }
        boolean z = m0.G() == 1;
        boolean z2 = m0.E(context) == 1;
        if (z && z2) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String j = com.mbridge.msdk.foundation.controller.c.n().j();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(j)) {
                        bindId = j;
                    }
                    Object d2 = m0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object newInstance = cls.newInstance();
                    cls.getField("userName").set(newInstance, ghId);
                    cls.getField("path").set(newInstance, ghPath);
                    cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(d2, newInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f8864a);
                    return;
                } catch (Throwable th) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th.getMessage(), this.f8864a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f8864a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z + "-hasWx:" + z2, this.f8864a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            u0.a(this.d, campaignEx.getClickURL(), campaignEx, this.f, list);
        } else {
            u0.a(this.d, campaignEx.getClickURL(), this.f, campaignEx, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff A[Catch: Exception -> 0x0149, TryCatch #0 {Exception -> 0x0149, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x0027, B:10:0x0033, B:11:0x0043, B:12:0x0048, B:14:0x005a, B:18:0x0060, B:21:0x0077, B:23:0x007c, B:25:0x00ea, B:27:0x00ff, B:28:0x0102, B:30:0x0106, B:32:0x0110, B:34:0x0114, B:37:0x0121, B:39:0x0125, B:40:0x012c, B:42:0x008d, B:44:0x0099, B:46:0x00a3, B:49:0x00ac, B:51:0x00c7, B:53:0x00ce, B:54:0x00d1, B:57:0x00d7, B:58:0x00e0, B:60:0x00e5), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125 A[Catch: Exception -> 0x0149, TryCatch #0 {Exception -> 0x0149, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x0027, B:10:0x0033, B:11:0x0043, B:12:0x0048, B:14:0x005a, B:18:0x0060, B:21:0x0077, B:23:0x007c, B:25:0x00ea, B:27:0x00ff, B:28:0x0102, B:30:0x0106, B:32:0x0110, B:34:0x0114, B:37:0x0121, B:39:0x0125, B:40:0x012c, B:42:0x008d, B:44:0x0099, B:46:0x00a3, B:49:0x00ac, B:51:0x00c7, B:53:0x00ce, B:54:0x00d1, B:57:0x00d7, B:58:0x00e0, B:60:0x00e5), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(CampaignEx campaignEx, boolean z, Boolean bool, List<String> list) {
        boolean z2;
        com.mbridge.msdk.click.e eVar;
        Set<String> set;
        Set<String> set2;
        try {
            this.b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f;
            if (nativeTrackingListener == null || z) {
                z2 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z2 = !this.f.onInterceptDefaultLoadingDialog();
            }
            this.l = false;
            boolean z3 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.j, bool, list);
                }
                this.l = true;
                this.j = false;
                z3 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.c).c(campaignEx.getId(), this.f8864a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d a2 = com.mbridge.msdk.foundation.db.d.a(this.c);
                a2.d();
                JumpLoaderResult b2 = a2.b(campaignEx.getId(), this.f8864a);
                if (b2 != null && !z) {
                    campaignEx.setJumpResult(b2);
                    if (z3) {
                        a(campaignEx, b2, z3, this.j, bool, list);
                        this.l = true;
                        this.j = false;
                        z3 = false;
                    }
                    new Handler(Looper.getMainLooper()).post(new c(z2, z, campaignEx));
                    eVar = this.e;
                    if (eVar != null) {
                    }
                    set = p;
                    if (set == null) {
                    }
                    set2 = p;
                    if (set2 != null) {
                    }
                    com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.d);
                    this.e = eVar2;
                    eVar2.a(this.f8864a, campaignEx, new d(campaignEx, z3, bool, list, z2));
                }
                if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z) {
                    boolean a3 = u0.a.a(this.d, "market://details?id=" + campaignEx.getPackageName(), this.f);
                    if (list != null) {
                        list.add("google_play");
                    }
                    if (a3) {
                        a(campaignEx, 1, 1, list);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f;
                    if (nativeTrackingListener2 != null && z3) {
                        nativeTrackingListener2.onDismissLoading(campaignEx);
                        this.f.onFinishRedirection(campaignEx, null);
                    }
                    this.l = true;
                    z3 = false;
                }
                if (z) {
                    this.l = true;
                    this.j = false;
                    z3 = false;
                }
                new Handler(Looper.getMainLooper()).post(new c(z2, z, campaignEx));
                eVar = this.e;
                if (eVar != null) {
                    eVar.a();
                }
                set = p;
                if (set == null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                set2 = p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar22 = new com.mbridge.msdk.click.e(this.d);
                this.e = eVar22;
                eVar22.a(this.f8864a, campaignEx, new d(campaignEx, z3, bool, list, z2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int s = m0.s(this.d);
            eVar.e(s);
            eVar.h(m0.a(this.d, s));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i);
            eVar.c(currentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), C4761z5.O));
            }
            eVar.b((this.b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f8864a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), C4761z5.O));
            }
            if (this.i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), C4761z5.O));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), C4761z5.O));
                }
            }
            if (z) {
                this.g.a("click_jump_error", eVar, this.f8864a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> a2 = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = a2.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(it.next());
            }
        } catch (Throwable th) {
            q0.b("CommonClickControl", th.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.d, this.f8864a, campaignEx, this.f);
                    return;
                }
                if (u0.a.a(this.d, str, this.f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    u0.a.a(this.d, "market://details?id=" + campaignEx.getPackageName(), this.f);
                } else if (b() == 2) {
                    u0.a(this.d, campaignEx.getClickURL(), campaignEx, this.f, new ArrayList());
                } else {
                    u0.a(this.d, campaignEx.getClickURL(), this.f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        a(jumpLoaderResult, campaignEx, 1, z);
    }

    private void a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i == 2) {
                    u0.a(this.d, str, campaignEx, nativeTrackingListener, list);
                } else {
                    u0.a(this.d, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, int i, List<String> list) {
        boolean z2 = true;
        boolean z3 = false;
        if (z) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    u0.a(this.d, jumpLoaderResult.getUrl(), this.f, campaignEx, list);
                } else if (parseInt == 2) {
                    u0.a(this.d, jumpLoaderResult.getUrl(), campaignEx, this.f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (u0.a.a(this.d, "market://details?id=" + campaignEx.getPackageName(), this.f)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th) {
                                th = th;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z2;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i, jumpLoaderResult.getUrl(), campaignEx, this.f, list);
                    }
                } else {
                    a(i, jumpLoaderResult.getUrl(), campaignEx, this.f, list);
                }
                z3 = true;
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
            }
        }
        if (z3) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f;
            if (nativeTrackingListener == null) {
                return z3;
            }
            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            return z3;
        }
        a(jumpLoaderResult, campaignEx, true);
        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f;
        if (nativeTrackingListener2 == null || !z) {
            return z3;
        }
        nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        return z3;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, List<String> list) {
        boolean z2 = false;
        if (z) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.d, this.f8864a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                u0.a(this.d, campaignEx.getClickURL(), this.f, campaignEx, list);
                z2 = true;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th.getMessage(), th);
                }
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z2) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            if (com.mbridge.msdk.util.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, boolean z2, Boolean bool, List<String> list) {
        boolean z3;
        boolean z4;
        try {
            if (this.k) {
                com.mbridge.msdk.click.b.a();
                if (campaignEx != null && jumpLoaderResult != null) {
                    int b2 = b();
                    int code = jumpLoaderResult.getCode();
                    if (bool != null && !bool.booleanValue()) {
                        com.mbridge.msdk.click.b.a(jumpLoaderResult, this.d, this.f8864a, campaignEx, Boolean.FALSE, this.f, list);
                        return;
                    }
                    if (TextUtils.isEmpty(jumpLoaderResult.getUrl()) && z) {
                        int linkType = campaignEx.getLinkType();
                        if (linkType == 2) {
                            a(campaignEx, jumpLoaderResult, z, b(), list);
                            return;
                        }
                        if (linkType == 3) {
                            a(campaignEx, jumpLoaderResult, z, list);
                            return;
                        }
                        u0.a(this.d, campaignEx.getClickURL(), this.f, campaignEx, list);
                        a(jumpLoaderResult, campaignEx, true);
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            return;
                        }
                        return;
                    }
                    if (code == 1) {
                        if (!TextUtils.isEmpty(campaignEx.getPackageName()) && !TextUtils.isEmpty(jumpLoaderResult.getUrl()) && jumpLoaderResult.getUrl().contains(campaignEx.getPackageName()) && z) {
                            if (!u0.a.a(this.d, jumpLoaderResult.getUrl(), this.f)) {
                                a(b2, jumpLoaderResult.getUrl(), campaignEx, this.f, list);
                            }
                        } else if (z && (TextUtils.isEmpty(campaignEx.getPackageName()) || !u0.a.a(this.d, "market://details?id=" + campaignEx.getPackageName(), this.f))) {
                            a(b2, jumpLoaderResult.getUrl(), campaignEx, this.f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f;
                        if (nativeTrackingListener2 != null && z) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                        z3 = true;
                        z4 = z;
                    } else if (code == 3) {
                        if (z) {
                            z3 = true;
                            z4 = z;
                            com.mbridge.msdk.click.b.a(this.d, campaignEx, this.f8864a, jumpLoaderResult, bool, this.f, list);
                        } else {
                            z3 = true;
                            z4 = z;
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f;
                        if (nativeTrackingListener3 != null && z4) {
                            nativeTrackingListener3.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else {
                        z3 = true;
                        z4 = z;
                        if (z4) {
                            if (3 == campaignEx.getLinkType()) {
                                a(campaignEx, jumpLoaderResult, z4, list);
                                return;
                            } else {
                                if (2 == campaignEx.getLinkType()) {
                                    a(campaignEx, jumpLoaderResult, z, b(), list);
                                    return;
                                }
                                u0.a(this.d, jumpLoaderResult.getUrl(), this.f, campaignEx, list);
                                NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f;
                                if (nativeTrackingListener4 != null) {
                                    nativeTrackingListener4.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                                }
                            }
                        }
                    }
                    if (a(campaignEx.getLinkType(), jumpLoaderResult.getUrl())) {
                        a(jumpLoaderResult, campaignEx, false);
                    } else {
                        a(jumpLoaderResult, campaignEx, z3);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f;
                    if (nativeTrackingListener5 == null || z4 || !z2) {
                        return;
                    }
                    nativeTrackingListener5.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    return;
                }
                if (z) {
                    a(jumpLoaderResult, campaignEx, true);
                    NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f;
                    if (nativeTrackingListener6 != null) {
                        nativeTrackingListener6.onRedirectionFailed(null, null);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean a(int i, String str) {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (i == 2) {
            if (u0.a.b(str)) {
            }
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.d.sendBroadcast(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e2);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i, int i2, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i));
            if (i == 1 || i == 2) {
                eVar.a("url", campaignEx.getClickURL());
            } else if (i == 3) {
                eVar.a("url", campaignEx.getDeepLinkURL());
            }
            eVar.a("result", Integer.valueOf(i2));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", e2.getMessage());
            }
        }
    }
}
