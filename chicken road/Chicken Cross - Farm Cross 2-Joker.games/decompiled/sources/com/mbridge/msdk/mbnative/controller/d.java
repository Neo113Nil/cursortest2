package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.RoomMasterTable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativePreloadController.java */
/* loaded from: classes6.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {
    private static final String r = "d";
    private static Map<String, Map<Long, Object>> s = new HashMap();
    private static Map<String, Boolean> t = new HashMap();
    private static Map<String, k> u = new HashMap();
    private static Map<String, Integer> v = new HashMap();
    private static Map<String, Integer> w = new HashMap();
    private static d x = null;
    private static int y = -1;
    private static int z = -2;
    private com.mbridge.msdk.setting.k b;
    private com.mbridge.msdk.click.a c;
    private m d;
    private String e;
    private Map<String, Object> i;
    private List<Integer> j;
    protected List<Integer> k;
    private List<Integer> l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    Queue<Integer> f = null;
    Queue<Long> g = null;
    private int h = 0;
    private com.mbridge.msdk.foundation.same.task.b q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    /* compiled from: NativePreloadController.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: NativePreloadController.java */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private Runnable j;
        private com.mbridge.msdk.preload.listenter.a l;
        private List<String> h = null;
        private boolean i = false;
        private boolean k = true;

        /* compiled from: NativePreloadController.java */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f9576a;

            a(CampaignUnit campaignUnit) {
                this.f9576a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (b.this.j != null) {
                    b bVar = b.this;
                    d.this.f9570a.removeCallbacks(bVar.j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f9576a);
                }
                if (d.s.containsKey("0_" + b.this.unitId)) {
                    d.s.remove("0_" + b.this.unitId);
                }
                if (b.this.g > 0) {
                    if (this.f9576a.ads.size() > b.this.g) {
                        b bVar2 = b.this;
                        bVar2.d = bVar2.g;
                    } else {
                        b.this.d = this.f9576a.ads.size();
                    }
                } else if (b.this.g == -1) {
                    b.this.d = 0;
                } else if (b.this.g == -3) {
                    b.this.d = this.f9576a.ads.size();
                } else if (b.this.g == -2) {
                    if (this.f9576a.getTemplate() == 3) {
                        if (b.this.f != 0) {
                            b bVar3 = b.this;
                            bVar3.d = bVar3.f;
                        }
                    } else if (b.this.e != 0) {
                        b bVar4 = b.this;
                        bVar4.d = bVar4.e;
                    }
                    if (b.this.d <= 0) {
                        b.this.d = ((Integer) d.v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f9576a.ads.size() < b.this.d) {
                    b.this.d = this.f9576a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c a2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f9576a.getAds().get(0), b.this.unitId);
                for (int i = 0; i < this.f9576a.ads.size(); i++) {
                    CampaignEx campaignEx = this.f9576a.ads.get(i);
                    campaignEx.setLocalRequestId(a2.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean c = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a3 = com.mbridge.msdk.mbnative.cache.c.a(this.f9576a.getAds().get(0) != null ? this.f9576a.getAds().get(0).getType() : 1);
                if (a3 != null) {
                    a3.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) b.this.unitId, (String) arrayList);
                }
                d.a(b.this.c, b.this.unitId);
                if (Looper.myLooper() != null && z) {
                    Looper.loop();
                }
                if (this.f9576a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f9576a.getAds().get(0).getMaitve(), this.f9576a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* compiled from: NativePreloadController.java */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        class C1399b extends c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f9577a;
            final /* synthetic */ Context b;

            C1399b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f9577a = campaignEx;
                this.b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f9577a, this.b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* compiled from: NativePreloadController.java */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f9578a;
            final /* synthetic */ int b;

            c(String str, int i) {
                this.f9578a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.i) {
                    if (b.this.j != null) {
                        b bVar = b.this;
                        d.this.f9570a.removeCallbacks(bVar.j);
                    }
                    if (b.this.a() == 1 || b.this.k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f9578a;
                        int a2 = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, a2, bVar3.unitId, bVar3.placementId, bVar3.l);
                    }
                } else if (b.this.k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f9578a;
                    int a3 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, a3, bVar5.unitId, bVar5.placementId, bVar5.l);
                }
                if (this.b == -1) {
                    d.b(b.this.c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        /* compiled from: NativePreloadController.java */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        class RunnableC1400d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f9579a;

            RunnableC1400d(List list) {
                this.f9579a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.i && b.this.j != null) {
                    b bVar = b.this;
                    d.this.f9570a.removeCallbacks(bVar.j);
                }
                List list = this.f9579a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f9579a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.m, campaignEx);
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(Long.valueOf(System.currentTimeMillis()), this.f9579a);
                    if (d.s.containsKey("1_" + b.this.unitId)) {
                        d.s.remove("1_" + b.this.unitId);
                    }
                    d.s.put("1_" + b.this.unitId, hashMap);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i) {
            this.c = i;
        }

        public void b(List<String> list) {
            this.h = list;
        }

        public void c(int i) {
            this.e = i;
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(int i) {
            this.f = i;
        }

        public void b(int i) {
            this.g = i;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.l = aVar;
        }

        public void b(boolean z) {
            this.k = z;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z) {
            this.i = z;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.n = true;
            d.this.a(true, this.l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, d, cVar, new C1399b(campaignEx, d, aVar));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i, String str) {
            d.this.a(new Thread(new c(str, i)));
        }

        public void a(Runnable runnable) {
            this.j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC1400d(list)));
        }
    }

    /* compiled from: NativePreloadController.java */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f9580a;
        private com.mbridge.msdk.foundation.same.task.d b;
        private int c;
        private String d;
        private String e;
        private com.mbridge.msdk.preload.listenter.a f;
        private boolean g = false;

        public c(int i, com.mbridge.msdk.foundation.same.task.d dVar, int i2, String str, String str2) {
            this.f9580a = i;
            this.b = dVar;
            this.c = i2;
            this.d = str;
            this.e = str2;
        }

        public void a(boolean z) {
            this.g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(true);
            int i = this.f9580a;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
            } else {
                d.this.n = true;
                if (this.g || this.c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f = aVar;
        }

        public void a(String str) {
            this.d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f9570a = new a();
    }

    public static Map<String, Integer> c() {
        return v;
    }

    public static Map<String, Integer> d() {
        return w;
    }

    public static Map<String, k> e() {
        return u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return s;
    }

    public static Map<String, Boolean> g() {
        return t;
    }

    public static void b(int i, String str) {
        if (u.containsKey(str)) {
            k kVar = u.get(str);
            if (i == 1) {
                kVar.a(0);
            } else if (i == 2) {
                kVar.b(0);
            }
            u.put(str, kVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f4, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de A[Catch: Exception -> 0x03cf, TryCatch #0 {Exception -> 0x03cf, blocks: (B:3:0x001a, B:7:0x0026, B:9:0x0050, B:12:0x006e, B:15:0x0075, B:17:0x007b, B:18:0x0087, B:20:0x008b, B:21:0x009e, B:23:0x00a4, B:24:0x00b0, B:26:0x00b6, B:27:0x00be, B:29:0x00c7, B:31:0x00d5, B:33:0x0106, B:35:0x010c, B:37:0x0120, B:38:0x0128, B:40:0x0139, B:43:0x0140, B:54:0x016f, B:56:0x0181, B:58:0x0187, B:59:0x0191, B:61:0x01a7, B:63:0x01ad, B:65:0x01b5, B:66:0x01c3, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:73:0x01e8, B:76:0x01fa, B:78:0x0216, B:80:0x021c, B:81:0x0229, B:83:0x022f, B:85:0x023b, B:87:0x023f, B:89:0x0245, B:90:0x0252, B:92:0x0258, B:94:0x026f, B:110:0x02cd, B:112:0x02de, B:113:0x02e7, B:144:0x03be, B:157:0x03c9, B:162:0x0168, B:163:0x009b, B:45:0x0149, B:47:0x014f, B:49:0x015d, B:50:0x015f, B:52:0x0165, B:115:0x02f2, B:117:0x0308, B:119:0x0321, B:120:0x032a, B:122:0x0330, B:123:0x0332, B:125:0x0338, B:126:0x033e, B:128:0x0344, B:130:0x0354, B:132:0x0357, B:135:0x035a, B:137:0x0360), top: B:2:0x001a, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0308 A[Catch: all -> 0x03be, TryCatch #5 {all -> 0x03be, blocks: (B:115:0x02f2, B:117:0x0308, B:119:0x0321, B:120:0x032a, B:122:0x0330, B:123:0x0332, B:125:0x0338, B:126:0x033e, B:128:0x0344, B:130:0x0354, B:132:0x0357, B:135:0x035a, B:137:0x0360), top: B:114:0x02f2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Map<String, Object> map, int i) {
        String str;
        String str2;
        com.mbridge.msdk.preload.listenter.a aVar;
        com.mbridge.msdk.preload.listenter.a aVar2;
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        List<Campaign> a3;
        Object obj;
        try {
            this.i = map;
            this.n = false;
            if (!map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                return;
            }
            String str3 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if ((s.containsKey(((i + 1) % 2) + "_" + str3) && !s.containsKey(i + "_" + str3)) || TextUtils.isEmpty(str3)) {
                return;
            }
            if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                this.m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
            }
            com.mbridge.msdk.click.a aVar3 = this.c;
            if (aVar3 == null) {
                this.c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
            } else {
                aVar3.a(str3);
            }
            if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                this.h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
            }
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                this.e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            if (t.containsKey(str3) && t.get(str3).booleanValue()) {
                Map<String, Map<Long, Object>> f = f();
                Map<Long, Object> map2 = f.get(i + "_" + str3);
                com.mbridge.msdk.setting.g f2 = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (map2 != null && map2.size() > 0) {
                    Long next = map2.keySet().iterator().next();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (f2 == null) {
                        f2 = i.b().a();
                    }
                    if (currentTimeMillis - next.longValue() >= f2.c0() * 1000) {
                        f.remove(str3);
                    } else if (i == 1) {
                        return;
                    }
                }
            }
            t.put(str3, Boolean.TRUE);
            this.p = 1;
            try {
                if (map.containsKey("ad_num")) {
                    int intValue = ((Integer) map.get("ad_num")).intValue();
                    this.p = intValue;
                    if (intValue < 1) {
                        this.p = 1;
                    }
                    if (this.p > 10) {
                        this.p = 10;
                    }
                }
            } catch (Exception unused) {
                q0.b(r, "ADNUM MUST BE INTEGER");
            }
            v.put(str3, Integer.valueOf(this.p));
            com.mbridge.msdk.preload.listenter.a aVar4 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj);
            String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
            String c2 = com.mbridge.msdk.foundation.controller.c.n().c();
            if (map.containsKey("app_id") && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                b2 = (String) map.get("app_id");
                c2 = (String) map.get(MBridgeConstans.APP_KEY);
            }
            a(b2, c2, str3);
            m e = i.b().e(b2, str3);
            this.d = e;
            if (e == null) {
                this.d = m.i(str3);
            }
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            str = "";
            String str4 = str;
            this.j = this.d.b();
            this.k = this.d.c();
            this.l = this.d.c();
            List<Integer> list = this.j;
            if (list == null || list.size() <= 0) {
                com.mbridge.msdk.preload.listenter.a aVar5 = aVar4;
                if (aVar5 != null) {
                    aVar5.onPreloadFaild("do not have sorceList");
                    return;
                }
                return;
            }
            this.f = new LinkedList();
            Iterator<Integer> it = this.j.iterator();
            while (it.hasNext()) {
                this.f.add(it.next());
            }
            List<Integer> list2 = this.l;
            if (list2 != null && list2.size() > 0) {
                this.g = new LinkedList();
                Iterator<Integer> it2 = this.l.iterator();
                while (it2.hasNext()) {
                    this.g.add(Long.valueOf(it2.next().intValue() * 1000));
                }
            }
            try {
                if (this.j.contains(1) && i == 0) {
                    try {
                        aVar2 = aVar4;
                        try {
                            a(1, this.k.get(this.j.indexOf(1)).intValue() * 1000, i, this.d, str3, str4, false, aVar2);
                            a2 = com.mbridge.msdk.mbnative.cache.c.a(1);
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                    if (a2 != null && (a3 = a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str3, 0)) != null) {
                        if (a3.size() > 0) {
                            aVar = aVar2;
                            str2 = null;
                            try {
                                a(true, aVar, (String) null);
                            } catch (Exception unused4) {
                            }
                            a(i, this.d, str3, str4, aVar);
                            m mVar = this.d;
                            d().put(str3, Integer.valueOf(mVar != null ? mVar.y() * this.p : 1));
                            int i2 = MBMediaView.p0;
                            e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                            o0.a();
                            if (TextUtils.isEmpty(str3)) {
                                return;
                            }
                            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
                            int a4 = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : str2);
                            if (a4 <= 0) {
                                a4 = this.p;
                            }
                            List<Campaign> a5 = a(str3, a4);
                            if (a5 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < a5.size(); i3++) {
                                    CampaignEx campaignEx = (CampaignEx) a5.get(i3);
                                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                        arrayList.add(campaignEx);
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(str2, new Object[0]);
                                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.n().d(), str3, new CopyOnWriteArrayList(arrayList), 1, str2);
                                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str3);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    aVar = aVar2;
                    str2 = null;
                    a(i, this.d, str3, str4, aVar);
                    m mVar2 = this.d;
                    d().put(str3, Integer.valueOf(mVar2 != null ? mVar2.y() * this.p : 1));
                    int i22 = MBMediaView.p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                    o0.a();
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                int i222 = MBMediaView.p0;
                e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                o0.a();
                if (TextUtils.isEmpty(str3)) {
                }
            } catch (Throwable unused5) {
                q0.b(r, "init cam cache failed");
                return;
            }
            str2 = null;
            aVar = aVar4;
            a(i, this.d, str3, str4, aVar);
            m mVar22 = this.d;
            d().put(str3, Integer.valueOf(mVar22 != null ? mVar22.y() * this.p : 1));
        } catch (Exception e2) {
            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e2));
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e) {
            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
        }
        return 0;
    }

    public List<Campaign> a(String str, int i) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        m e = i.b().e("", str);
        this.d = e;
        if (e == null) {
            this.d = m.i(str);
        }
        List<Integer> b2 = this.d.b();
        this.j = b2;
        if (b2 == null || b2.size() <= 0 || !this.j.contains(1) || (a2 = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i);
    }

    public void a(int i, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int intValue = this.f.poll().intValue();
            long j = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.g;
            if (queue2 != null && queue2.size() > 0) {
                j = this.g.poll().longValue();
            }
            q0.c(r, "preload start queue adsource = " + intValue);
            a(intValue, j, str, str2, this.i, i, mVar, aVar);
        } catch (Throwable unused) {
            q0.b(r, "queue poll exception");
        }
    }

    public void a(int i, long j, String str, String str2, Map<String, Object> map, int i2, m mVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        if (i != 1 && (a2 = com.mbridge.msdk.mbnative.cache.c.a(i)) != null) {
            List<Campaign> a3 = a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, this.p);
            if (a3 != null && a3.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i == 1) {
            a(i, j, i2, mVar, str, str2, true, aVar);
        } else if (i != 2) {
            a(i, j, i2, mVar, str, str2, aVar, false);
        } else {
            a(2, j, i2, mVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a2 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b1 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d7 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0374 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0383 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0414 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0448 A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031f A[Catch: Exception -> 0x0492, TryCatch #4 {Exception -> 0x0492, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x012a, B:36:0x012f, B:43:0x0148, B:46:0x0150, B:48:0x0158, B:50:0x015e, B:53:0x0163, B:55:0x0167, B:60:0x017b, B:62:0x0183, B:64:0x0189, B:68:0x0194, B:69:0x01a8, B:71:0x01ac, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:78:0x01ed, B:83:0x01fe, B:85:0x0204, B:88:0x020c, B:90:0x0216, B:93:0x021c, B:98:0x0259, B:99:0x0266, B:101:0x0277, B:103:0x02a2, B:104:0x02a9, B:106:0x02b1, B:108:0x02c3, B:109:0x02cc, B:111:0x02d7, B:117:0x02e7, B:119:0x02f8, B:124:0x0305, B:125:0x0335, B:127:0x0374, B:128:0x0379, B:130:0x0383, B:132:0x038d, B:133:0x03af, B:135:0x03b9, B:137:0x03c3, B:138:0x03e5, B:141:0x0419, B:143:0x0448, B:144:0x047a, B:148:0x0461, B:149:0x0416, B:151:0x031f, B:153:0x02ec, B:154:0x02f1, B:159:0x0225, B:161:0x022b, B:170:0x0244, B:182:0x026a, B:186:0x0480), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031c  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, long j, int i2, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String a2;
        b bVar;
        long j2;
        k kVar;
        int a3;
        String str3;
        int i8;
        String str4;
        JSONArray jSONArray;
        List<Campaign> a4;
        List<Campaign> a5;
        try {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
            int f = this.d.f();
            int e = this.d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
            String c2 = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.i;
            if (map != null && map.containsKey("app_id") && this.i.containsKey(MBridgeConstans.APP_KEY) && this.i.containsKey(MBridgeConstans.KEY_WORD) && this.i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.i.get("app_id") instanceof String) {
                    b2 = (String) this.i.get("app_id");
                }
                if (this.i.get(MBridgeConstans.APP_KEY) instanceof String) {
                    c2 = (String) this.i.get(MBridgeConstans.APP_KEY);
                }
                String str5 = this.i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str5)) {
                    eVar.a("smart", k0.b(str5));
                }
            }
            String str6 = b2;
            String str7 = c2;
            eVar.a("app_id", str6);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.e)) {
                eVar.a("category", this.e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str6 + str7));
            eVar.a("only_impression", "1");
            String d = v0.d(str);
            if (!TextUtils.isEmpty(d)) {
                eVar.a(j.b, d);
            }
            int intValue = v.get(str).intValue();
            if (f != y && f != 0 && intValue != 0) {
                if (i2 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a6 = com.mbridge.msdk.mbnative.cache.c.a(i);
                    if (z2) {
                        if (a6 != null && (a5 = a6.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, intValue)) != null && a5.size() > 0) {
                            a(true, aVar, (String) null);
                            return;
                        } else {
                            if (this.n) {
                                a("", i2, str, str2, aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (i != 1 && a6 != null && (a4 = a6.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, intValue)) != null && a4.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    }
                }
                if (intValue != 0) {
                    eVar.a("ad_num", intValue + "");
                }
                if (this.h != 0) {
                    eVar.a("frame_num", this.h + "");
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str8 = (String) this.i.get(MBridgeConstans.NATIVE_INFO);
                    if (!TextUtils.isEmpty(str8)) {
                        q0.b(r, "nativeinfo" + str8);
                        try {
                            jSONArray = new JSONArray(str8);
                            str3 = str8;
                            if (jSONArray.length() > 0) {
                                i4 = 0;
                                i8 = 0;
                                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i9);
                                        int i10 = i4;
                                        try {
                                            int optInt = jSONObject.optInt("id", 0);
                                            if (2 == optInt) {
                                                i4 = jSONObject.optInt("ad_num");
                                                if (f > 0) {
                                                    try {
                                                        jSONObject.put("ad_num", f);
                                                    } catch (JSONException e2) {
                                                        e = e2;
                                                        q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                                                        i5 = i8;
                                                        str4 = str3;
                                                        eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                                                        i3 = i5;
                                                        f = intValue;
                                                        eVar.a("ad_num", f + "");
                                                        eVar.a("ping_mode", "1");
                                                        if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                                        }
                                                        if (!NativeController.b(this.i)) {
                                                        }
                                                        a(eVar, i);
                                                        if (u.containsKey(str)) {
                                                        }
                                                        i6 = 0;
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                                        }
                                                        if (i == i7) {
                                                        }
                                                        eVar.a("offset", i6 + "");
                                                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                                        a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                                        if (!TextUtils.isEmpty(a2)) {
                                                        }
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                        }
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                        }
                                                        eVar.a("video_version", "2.0");
                                                        bVar = new b(i);
                                                        bVar.setUnitId(str);
                                                        bVar.setPlacementId(str2);
                                                        bVar.setAdType(42);
                                                        bVar.d(intValue);
                                                        bVar.c(i4);
                                                        bVar.e(i3);
                                                        bVar.b(e);
                                                        bVar.a(aVar);
                                                        if (i == 1) {
                                                        }
                                                        bVar.b(true);
                                                        bVar.b(NativeController.a(this.i));
                                                        c cVar = new c(1, bVar, i2, str, str2);
                                                        bVar.a(cVar);
                                                        bVar.a(i2);
                                                        cVar.a(aVar);
                                                        cVar.a(z2);
                                                        cVar.a(str);
                                                        if (i2 != 0) {
                                                        }
                                                        this.f9570a.postDelayed(cVar, j2);
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                if (3 == optInt) {
                                                    i8 = jSONObject.optInt("ad_num");
                                                    if (f > 0) {
                                                        jSONObject.put("ad_num", f);
                                                    }
                                                }
                                                i4 = i10;
                                            }
                                        } catch (JSONException e3) {
                                            e = e3;
                                            i4 = i10;
                                        }
                                    } catch (JSONException e4) {
                                        e = e4;
                                    }
                                }
                                i5 = i8;
                            } else {
                                i5 = 0;
                                i4 = 0;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            str3 = str8;
                            i4 = 0;
                            i8 = 0;
                        }
                        try {
                            this.o = Math.max(i4, i5);
                            str4 = jSONArray.toString();
                        } catch (JSONException e6) {
                            e = e6;
                            i8 = i5;
                            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                            i5 = i8;
                            str4 = str3;
                            eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                            i3 = i5;
                            f = intValue;
                            eVar.a("ad_num", f + "");
                            eVar.a("ping_mode", "1");
                            if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                            }
                            if (!NativeController.b(this.i)) {
                            }
                            a(eVar, i);
                            if (u.containsKey(str)) {
                            }
                            i6 = 0;
                            if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                            }
                            if (i == i7) {
                            }
                            eVar.a("offset", i6 + "");
                            eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                            a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                            if (!TextUtils.isEmpty(a2)) {
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                            }
                            eVar.a("video_version", "2.0");
                            bVar = new b(i);
                            bVar.setUnitId(str);
                            bVar.setPlacementId(str2);
                            bVar.setAdType(42);
                            bVar.d(intValue);
                            bVar.c(i4);
                            bVar.e(i3);
                            bVar.b(e);
                            bVar.a(aVar);
                            if (i == 1) {
                            }
                            bVar.b(true);
                            bVar.b(NativeController.a(this.i));
                            c cVar2 = new c(1, bVar, i2, str, str2);
                            bVar.a(cVar2);
                            bVar.a(i2);
                            cVar2.a(aVar);
                            cVar2.a(z2);
                            cVar2.a(str);
                            if (i2 != 0) {
                            }
                            this.f9570a.postDelayed(cVar2, j2);
                            return;
                        }
                        eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                        i3 = i5;
                        f = intValue;
                        eVar.a("ad_num", f + "");
                        eVar.a("ping_mode", "1");
                        if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                            i.b().a();
                        }
                        if (!NativeController.b(this.i)) {
                            JSONArray b3 = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                            if (b3.length() > 0) {
                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, v0.a(b3));
                            }
                        }
                        a(eVar, i);
                        if (u.containsKey(str) || (kVar = u.get(str)) == null) {
                            i6 = 0;
                        } else {
                            if (i == 1) {
                                a3 = kVar.a();
                            } else if (i != 2) {
                                a3 = kVar.a();
                            } else {
                                a3 = kVar.b();
                            }
                            i6 = a3;
                        }
                        if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                            i7 = 1;
                            if (i == 1) {
                                eVar.a("tnum", this.o + "");
                                eVar.a("offset", i6 + "");
                                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                if (!TextUtils.isEmpty(a2)) {
                                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, a2);
                                }
                                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                                    eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                }
                                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                                    eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                }
                                eVar.a("video_version", "2.0");
                                bVar = new b(i);
                                bVar.setUnitId(str);
                                bVar.setPlacementId(str2);
                                bVar.setAdType(42);
                                bVar.d(intValue);
                                bVar.c(i4);
                                bVar.e(i3);
                                bVar.b(e);
                                bVar.a(aVar);
                                if (i == 1 || z2) {
                                    bVar.b(true);
                                }
                                bVar.b(NativeController.a(this.i));
                                c cVar22 = new c(1, bVar, i2, str, str2);
                                bVar.a(cVar22);
                                bVar.a(i2);
                                cVar22.a(aVar);
                                cVar22.a(z2);
                                cVar22.a(str);
                                if (i2 != 0) {
                                    j2 = j;
                                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, 30000L));
                                } else {
                                    j2 = j;
                                    if (i2 == 1) {
                                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, "campaign", com.mbridge.msdk.foundation.same.c.a(j2, 30000L));
                                    }
                                }
                                this.f9570a.postDelayed(cVar22, j2);
                                return;
                            }
                        } else {
                            i7 = 1;
                        }
                        if (i == i7) {
                            eVar.a("tnum", this.p + "");
                        }
                        eVar.a("offset", i6 + "");
                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                        a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                        if (!TextUtils.isEmpty(a2)) {
                        }
                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                            eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                            eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        eVar.a("video_version", "2.0");
                        bVar = new b(i);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.d(intValue);
                        bVar.c(i4);
                        bVar.e(i3);
                        bVar.b(e);
                        bVar.a(aVar);
                        if (i == 1) {
                        }
                        bVar.b(true);
                        bVar.b(NativeController.a(this.i));
                        c cVar222 = new c(1, bVar, i2, str, str2);
                        bVar.a(cVar222);
                        bVar.a(i2);
                        cVar222.a(aVar);
                        cVar222.a(z2);
                        cVar222.a(str);
                        if (i2 != 0) {
                        }
                        this.f9570a.postDelayed(cVar222, j2);
                        return;
                    }
                } else if (f != z && f != 0) {
                    i3 = 0;
                    i4 = 0;
                    eVar.a("ad_num", f + "");
                    eVar.a("ping_mode", "1");
                    if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    }
                    if (!NativeController.b(this.i)) {
                    }
                    a(eVar, i);
                    if (u.containsKey(str)) {
                    }
                    i6 = 0;
                    if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    }
                    if (i == i7) {
                    }
                    eVar.a("offset", i6 + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(a2)) {
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(intValue);
                    bVar.c(i4);
                    bVar.e(i3);
                    bVar.b(e);
                    bVar.a(aVar);
                    if (i == 1) {
                    }
                    bVar.b(true);
                    bVar.b(NativeController.a(this.i));
                    c cVar2222 = new c(1, bVar, i2, str, str2);
                    bVar.a(cVar2222);
                    bVar.a(i2);
                    cVar2222.a(aVar);
                    cVar2222.a(z2);
                    cVar2222.a(str);
                    if (i2 != 0) {
                    }
                    this.f9570a.postDelayed(cVar2222, j2);
                    return;
                }
                i5 = 0;
                i4 = 0;
                i3 = i5;
                f = intValue;
                eVar.a("ad_num", f + "");
                eVar.a("ping_mode", "1");
                if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                }
                if (!NativeController.b(this.i)) {
                }
                a(eVar, i);
                if (u.containsKey(str)) {
                }
                i6 = 0;
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                }
                if (i == i7) {
                }
                eVar.a("offset", i6 + "");
                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(a2)) {
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(intValue);
                bVar.c(i4);
                bVar.e(i3);
                bVar.b(e);
                bVar.a(aVar);
                if (i == 1) {
                }
                bVar.b(true);
                bVar.b(NativeController.a(this.i));
                c cVar22222 = new c(1, bVar, i2, str, str2);
                bVar.a(cVar22222);
                bVar.a(i2);
                cVar22222.a(aVar);
                cVar22222.a(z2);
                cVar22222.a(str);
                if (i2 != 0) {
                }
                this.f9570a.postDelayed(cVar22222, j2);
                return;
            }
            a("The request was refused", i2, str, str2, aVar);
        } catch (Exception e7) {
            String str9 = r;
            q0.b(str9, com.mbridge.msdk.mbnative.common.a.a(e7));
            q0.b(str9, e7.getMessage());
        }
    }

    public static void a(int i, String str) {
        k kVar;
        if (u.containsKey(str)) {
            kVar = u.get(str);
        } else {
            kVar = new k();
        }
        int intValue = v.get(str).intValue();
        int intValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i == 1) {
            int a2 = intValue + kVar.a();
            kVar.a(a2 <= intValue2 ? a2 : 0);
        } else if (i == 2) {
            int b2 = intValue + kVar.b();
            kVar.b(b2 <= intValue2 ? b2 : 0);
        }
        u.put(str, kVar);
    }

    public void a(String str, int i, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(r, str);
        try {
            Queue<Integer> queue = this.f;
            if ((queue != null && queue.size() <= 0) || this.f == null) {
                a(false, aVar, str);
            } else {
                a(i, this.d, str2, str3, aVar);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.setting.k();
        }
        this.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z2, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z2) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z2, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z2 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z2 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i = MBMediaView.p0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e) {
                q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }
}
