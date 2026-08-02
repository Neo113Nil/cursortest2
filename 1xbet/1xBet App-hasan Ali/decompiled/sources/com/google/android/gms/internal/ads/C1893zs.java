package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893zs {

    /* renamed from: a, reason: collision with root package name */
    public final Z1 f16775a;

    /* renamed from: d, reason: collision with root package name */
    public Rs f16778d;

    /* renamed from: g, reason: collision with root package name */
    public final String f16780g;

    /* renamed from: b, reason: collision with root package name */
    public final Ls f16776b = new Ls();

    /* renamed from: e, reason: collision with root package name */
    public boolean f16779e = false;
    public boolean f = false;

    /* renamed from: c, reason: collision with root package name */
    public X.m f16777c = new X.m(null);

    public C1893zs(C1894zt c1894zt, Z1 z12, String str) {
        this.f16775a = z12;
        this.f16780g = str;
        EnumC1848ys enumC1848ys = EnumC1848ys.f16493l;
        EnumC1848ys enumC1848ys2 = (EnumC1848ys) z12.f12444q;
        if (enumC1848ys2 == enumC1848ys || enumC1848ys2 == EnumC1848ys.f16494m) {
            Ss ss = new Ss(str);
            WebView webView = (WebView) z12.f12439l;
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            ss.f11461b = new X.m(webView);
            this.f16778d = ss;
        } else {
            this.f16778d = new Ts(str, Collections.unmodifiableMap((HashMap) z12.f12441n));
        }
        this.f16778d.f();
        Hs.f9492c.f9493a.add(this);
        Rs rs = this.f16778d;
        WebView a5 = rs.a();
        JSONObject jSONObject = new JSONObject();
        Us.c(jSONObject, "impressionOwner", (Ds) c1894zt.f16783l);
        Us.c(jSONObject, "mediaEventsOwner", (Ds) c1894zt.f16784m);
        Us.c(jSONObject, "creativeType", (As) c1894zt.f16785n);
        Us.c(jSONObject, "impressionType", (Cs) c1894zt.f16786o);
        Us.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(c1894zt.f16782k));
        AbstractC1668us.E(a5, "init", jSONObject, rs.f11460a);
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f16777c.clear();
        if (!this.f) {
            this.f16776b.f10552a.clear();
        }
        this.f = true;
        Rs rs = this.f16778d;
        AbstractC1668us.E(rs.a(), "finishSession", rs.f11460a);
        Hs hs = Hs.f9492c;
        ArrayList arrayList = hs.f9493a;
        ArrayList arrayList2 = hs.f9494b;
        boolean z3 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z3 && arrayList2.size() <= 0) {
            Ns a5 = Ns.a();
            a5.getClass();
            Ws ws = Ws.f12113g;
            ws.getClass();
            Handler handler = Ws.i;
            if (handler != null) {
                handler.removeCallbacks(Ws.f12116k);
                Ws.i = null;
            }
            ws.f12117a.clear();
            Ws.f12114h.post(new RunnableC1303mm(13, ws));
            Gs gs = Gs.f9282n;
            gs.f10075k = false;
            gs.f10077m = null;
            Es es = a5.f10854b;
            es.f8619a.getContentResolver().unregisterContentObserver(es);
        }
        this.f16778d.b();
        this.f16778d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f || ((View) this.f16777c.get()) == view) {
            return;
        }
        this.f16777c = new X.m(view);
        Rs rs = this.f16778d;
        rs.getClass();
        rs.f11462c = System.nanoTime();
        rs.f11463d = 1;
        Collection<C1893zs> unmodifiableCollection = Collections.unmodifiableCollection(Hs.f9492c.f9493a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (C1893zs c1893zs : unmodifiableCollection) {
            if (c1893zs != this && ((View) c1893zs.f16777c.get()) == view) {
                c1893zs.f16777c.clear();
            }
        }
    }

    public final void c() {
        if (this.f16779e || this.f16778d == null) {
            return;
        }
        this.f16779e = true;
        ArrayList arrayList = Hs.f9492c.f9494b;
        boolean z3 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z3) {
            Ns a5 = Ns.a();
            a5.getClass();
            Gs gs = Gs.f9282n;
            gs.f10077m = a5;
            gs.f10075k = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z5 = runningAppProcessInfo.importance == 100 || gs.b();
            gs.f10076l = z5;
            gs.a(z5);
            Ws.f12113g.getClass();
            Ws.b();
            Es es = a5.f10854b;
            es.f8621c = es.a();
            es.b();
            es.f8619a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, es);
        }
        float f = Ns.a().f10853a;
        Rs rs = this.f16778d;
        AbstractC1668us.E(rs.a(), "setDeviceVolume", Float.valueOf(f), rs.f11460a);
        Rs rs2 = this.f16778d;
        Date date = (Date) Fs.f9134e.f9137c;
        rs2.c(date != null ? (Date) date.clone() : null);
        this.f16778d.d(this, this.f16775a);
    }
}
