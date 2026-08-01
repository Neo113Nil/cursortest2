package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.moloco.sdk.BidRequest;
import com.pgl.ssdk.a4;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.av;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f11627a = null;
    private static boolean b = false;
    private static Map<String, Object> c = null;
    private static int d = 1;
    private static av.a e;
    public Context f;
    private String g;
    private int h;
    private String i;
    private String j = null;
    private String k = null;
    public int l = 1;
    public int m = 0;
    public boolean n = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    class RunnableC1625b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11629a;

        RunnableC1625b(String str) {
            this.f11629a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f11629a) && this.f11629a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                ab.b(b.this.f);
            }
            al.a(b.this.f).a();
            aa.b(b.this.f);
        }
    }

    private b(Context context, String str) {
        this.f = context;
        this.g = str;
    }

    public static b a(Context context, String str, int i, int i2, String str2) {
        if (f11627a == null) {
            synchronized (b.class) {
                if (f11627a == null) {
                    if (context == null) {
                        context = ab.a().getApplicationContext();
                    }
                    if (context == null) {
                        d = 4;
                        return null;
                    }
                    a(i);
                    av.a b2 = av.b(context, "nms");
                    if (b2 != null) {
                        d = b2.f11623a;
                        e = b2;
                        return null;
                    }
                    b bVar = new b(context, str);
                    f11627a = bVar;
                    bVar.h = i2;
                    f11627a.i = str2;
                    f11627a.b(context);
                    f11627a.e(a(context));
                    z.a(context);
                    d = 0;
                }
            }
        }
        return f11627a;
    }

    public static String a() {
        if (e() != null) {
            return e().g;
        }
        return null;
    }

    private static String a(Context context) {
        String a2 = aw.a(context, "iid");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String uuid = UUID.randomUUID().toString();
        aw.b(context, "iid", uuid);
        return uuid;
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public static void a(int i) {
        an.a(i);
    }

    public static String b() {
        if (e() != null) {
            return e().j;
        }
        return null;
    }

    private void b(Context context) {
        if (context == null || b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.g);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.h));
            com.pgl.ssdk.ces.a.meta(105, null, new StringBuilder().append(ab.h(context)).toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.i);
            b = true;
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        char c2;
        int intValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (next.equals("touch_trace_enabled")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -257777372:
                        if (next.equals("init_prob")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -93508180:
                        if (next.equals("autoctl_detect_enable")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 449342513:
                        if (next.equals("craw_ratio")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 944591168:
                        if (next.equals("report_ratio")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1286849298:
                        if (next.equals("app_switch")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 == 5 && (obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= 0 && intValue <= 100) {
                                        this.m = intValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    y.g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                f.b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.n = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.l = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    ak.b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static String c() {
        b e2 = e();
        if (e2 == null || TextUtils.isEmpty(e2.k)) {
            return null;
        }
        return e2.k;
    }

    public static int d() {
        return d;
    }

    public static b e() {
        return f11627a;
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public static av.a f() {
        return e;
    }

    public Object a(int i, Object obj) {
        int a2;
        boolean a3;
        if (i == 123) {
            return af.a(this.f);
        }
        if (i == 121) {
            return ad.a();
        }
        if (i == 122) {
            return ad.b();
        }
        if (i == 126) {
            return ad.b(this.f);
        }
        if (i == 128) {
            return ad.c(this.f);
        }
        if (i == 120) {
            return ac.c();
        }
        if (i == 124) {
            return ag.c(this.f);
        }
        if (i == 130) {
            return ag.a(this.f);
        }
        if (i == 145) {
            return ah.c(this.f);
        }
        if (i == 125) {
            return ag.b(this.f);
        }
        if (i == 129) {
            return ae.f(this.f);
        }
        if (i == 141) {
            return ae.e(this.f);
        }
        if (i == 134) {
            return ak.a(this.f).b();
        }
        if (i == 140) {
            return al.a(this.f).e();
        }
        if (i == 144) {
            return al.a(this.f).d();
        }
        if (i == 133) {
            return a(obj);
        }
        if (i == 135) {
            return v.g();
        }
        if (i == 201) {
            return ad.a(this.f);
        }
        if (i == 202) {
            return ad.c();
        }
        if (i == 236) {
            return ax.a((String) obj);
        }
        if (i == 142) {
            return ab.g(this.f);
        }
        if (i == 143) {
            return ah.a(this.f);
        }
        if (i == 146) {
            return v.c();
        }
        if (i != 147) {
            if (i == 148) {
                return u.b(this.f);
            }
            if (i == 149) {
                return w.a(this.f);
            }
            if (i == 150) {
                a2 = x.a(this.f);
            } else {
                if (i == 151) {
                    return w.a();
                }
                if (i == 161) {
                    a3 = v.h();
                } else {
                    if (i == 163) {
                        return aj.a();
                    }
                    if (i == 169) {
                        a3 = aa.a(this.f);
                    } else if (i == 170) {
                        a2 = y.b((String) obj);
                    } else {
                        if (i == 203) {
                            return ab.b();
                        }
                        if (i == 205) {
                            a2 = ab.k(this.f);
                        } else {
                            if (i != 204) {
                                if (i == 206) {
                                    return ah.b(this.f);
                                }
                                return null;
                            }
                            a2 = ae.a(this.f);
                        }
                    }
                }
            }
            return Integer.valueOf(a2);
        }
        a3 = ab.j(this.f);
        return Boolean.valueOf(a3);
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("X-Armors", str2);
        }
        return hashMap;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f);
    }

    public void a(String str) {
        ar.b(new RunnableC1625b(str));
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Map<String, Object> map, long j) {
        try {
            ar.a(new ao(this.f, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), j);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(Map<String, Object> map) {
        char c2;
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 897152865:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP)) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    if (obj instanceof String) {
                                        String a2 = ai.a((String) obj);
                                        if (TextUtils.isEmpty(a2)) {
                                            break;
                                        } else {
                                            com.pgl.ssdk.ces.a.meta(159, null, a2);
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 1:
                                    if (obj instanceof String) {
                                        String str2 = (String) obj;
                                        if (TextUtils.isEmpty(str2)) {
                                            break;
                                        } else {
                                            am.a(str2);
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 2:
                                    if (obj instanceof String) {
                                        an.a((String) obj);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 3:
                                    if (obj instanceof Set) {
                                        an.a((Set<String>) obj);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 4:
                                    if (obj instanceof Set) {
                                        try {
                                            Set set = (Set) obj;
                                            com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                            com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                            com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                            break;
                                        } catch (Throwable unused) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 5:
                                    if (obj instanceof String) {
                                        an.b((String) obj);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 6:
                                    if (obj instanceof String) {
                                        b((String) obj);
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                    if (c == null) {
                        c = new HashMap();
                    }
                    c.putAll(map);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.j)) {
            this.j = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.k)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.k = str;
            a4.b();
        }
    }

    public String g() {
        return a4.a();
    }

    public void h() {
        a4.a(this.f, this.g);
        long currentTimeMillis = System.currentTimeMillis();
        if (ay.a(aw.a(this.f, "pgl_init_report", 0L), currentTimeMillis)) {
            int i = f11627a.m;
            if ((i > 0 && i < 100 && Math.random() * 100.0d < i) || i == 100) {
                a("Start", null, TextUtils.isEmpty(a4.a()) ? 10000L : 0L);
            }
        } else {
            a("Start", null, TextUtils.isEmpty(a4.a()) ? 10000L : 0L);
            aw.b(this.f, "pgl_init_report", currentTimeMillis);
        }
        a("Start");
        if (this.n) {
            ar.a(new a(), 20000L);
        }
    }
}
