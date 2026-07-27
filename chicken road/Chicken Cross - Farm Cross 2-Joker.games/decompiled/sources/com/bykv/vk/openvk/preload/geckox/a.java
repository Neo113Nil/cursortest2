package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* compiled from: GeckoClient.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.falconx.a.a f4621a;
    private Queue<String> b;
    private b c;
    private File d;

    private a(b bVar) {
        new ArrayList();
        this.f4621a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.b = new LinkedBlockingQueue();
        this.c = bVar;
        File n = bVar.n();
        this.d = n;
        n.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.c);
    }

    public static a a(b bVar) {
        List<String> e = bVar.e();
        if (e == null || e.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        bVar.a();
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> e = this.c.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = e.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        List<String> d = this.c.d();
        List<String> e = this.c.e();
        if (d == null || d.isEmpty() || e == null || e.isEmpty()) {
            return false;
        }
        for (String str : e) {
            Iterator<String> it = d.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.a.b.a aVar) {
        this.f4621a.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = BuildConfig.FLAVOR;
        if (TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            throw new IllegalArgumentException("groupType == null");
        }
        if (!a()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        if (!b(map)) {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
        final com.bykv.vk.openvk.preload.geckox.d.a aVar = null;
        final Map map2 = null;
        b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.a.a.b bVar;
                GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                if (a.this.c.b() != null) {
                    bVar = a.this.c.b().a();
                    bVar.a(a.this.c.b(), a.this.c.n(), a.this.c.e());
                } else {
                    bVar = null;
                }
                try {
                    try {
                        a.this.c.a(new JSONObject());
                        GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(aVar, a.this.d, a.this.c, a.this.f4621a, map2, map, str).a((com.bykv.vk.openvk.preload.a.b<Object>) str));
                        if (bVar != null) {
                            bVar.a();
                        }
                        JSONObject f = a.this.c.f();
                        if (f == null) {
                            f = new JSONObject();
                        }
                        try {
                            f.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                        } catch (Throwable unused) {
                        }
                        a.this.c.q().upload("download_gecko_end", f);
                        GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    } catch (Exception e) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("success", false);
                            jSONObject.put("msg", e.toString());
                            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 2);
                            a.this.c.a(jSONObject);
                        } catch (Throwable unused2) {
                        }
                        GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e);
                        if (bVar != null) {
                            bVar.a();
                        }
                        JSONObject f2 = a.this.c.f();
                        if (f2 == null) {
                            f2 = new JSONObject();
                        }
                        try {
                            f2.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                        } catch (Throwable unused3) {
                        }
                        a.this.c.q().upload("download_gecko_end", f2);
                        GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    }
                    a.d(a.this);
                } catch (Throwable th) {
                    if (bVar != null) {
                        bVar.a();
                    }
                    JSONObject f3 = a.this.c.f();
                    if (f3 == null) {
                        f3 = new JSONObject();
                    }
                    try {
                        f3.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                    } catch (Throwable unused4) {
                    }
                    a.this.c.q().upload("download_gecko_end", f3);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    throw th;
                }
            }
        });
    }

    static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.c.e());
        try {
            String a2 = new com.bykv.vk.openvk.preload.geckox.a.a(arrayList).a();
            if (aVar.c.p() != null && aVar.c.p().a()) {
                aVar.c.p();
            } else if (aVar.b.size() < 10) {
                aVar.b.add(a2);
            }
        } catch (Throwable unused) {
        }
    }
}
