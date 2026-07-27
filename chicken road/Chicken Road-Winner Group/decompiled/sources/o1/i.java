package o1;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.C1172b;
import s1.C1194a;
import s1.C1195b;
import s1.C1196c;
import s1.C1199f;
import s1.C1200g;
import s1.C1201h;
import s1.C1202i;
import s1.C1203j;
import v1.AbstractC1217a;
import v1.C1218b;
import z1.C1262a;

/* loaded from: classes.dex */
public final class i extends AbstractC1150b {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f10168a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.b f10169b;

    /* renamed from: c, reason: collision with root package name */
    public final C1200g f10170c;

    /* renamed from: d, reason: collision with root package name */
    public C1262a f10171d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1217a f10172e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10173g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10174h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10175i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10176j;

    public i(V1.b bVar, s0 s0Var) {
        AbstractC1217a c1218b;
        WebViewClient webViewClient;
        String uuid = UUID.randomUUID().toString();
        this.f10170c = new C1200g();
        this.f = false;
        this.f10173g = false;
        this.f10169b = bVar;
        this.f10168a = s0Var;
        this.f10174h = uuid;
        this.f10171d = new C1262a(null);
        c cVar = c.HTML;
        c cVar2 = (c) s0Var.f9883g;
        if (cVar2 == cVar || cVar2 == c.JAVASCRIPT) {
            c1218b = new C1218b(uuid);
            WebView webView = (WebView) s0Var.f9879b;
            if (webView != null && Build.VERSION.SDK_INT >= 26 && ((ArrayList) C1172b.b(C1201h.f10330b.f10331a).a()).size() > 0) {
                webViewClient = webView.getWebViewClient();
                webView.setWebViewClient(new v1.c(webViewClient));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            c1218b.f10407b = new C1262a(webView);
        } else {
            c1218b = new v1.d(uuid, Collections.unmodifiableMap((HashMap) s0Var.f9881d), (String) s0Var.f9882e);
        }
        this.f10172e = c1218b;
        this.f10172e.h();
        C1196c.f10320c.f10321a.add(this);
        AbstractC1217a abstractC1217a = this.f10172e;
        C1202i c1202i = C1202i.f10332a;
        WebView g3 = abstractC1217a.g();
        JSONObject jSONObject = new JSONObject();
        w1.b.b(jSONObject, "impressionOwner", g.NATIVE);
        w1.b.b(jSONObject, "mediaEventsOwner", (g) bVar.f1614b);
        w1.b.b(jSONObject, "creativeType", (d) bVar.f1615c);
        w1.b.b(jSONObject, "impressionType", f.VIEWABLE);
        w1.b.b(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        c1202i.a(g3, "init", jSONObject, abstractC1217a.f10406a);
    }

    @Override // o1.AbstractC1150b
    public final void a(View view, e eVar) {
        C1199f c1199f;
        if (this.f10173g) {
            return;
        }
        C1200g c1200g = this.f10170c;
        c1200g.getClass();
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        ArrayList arrayList = c1200g.f10329a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1199f = null;
                break;
            } else {
                c1199f = (C1199f) it.next();
                if (c1199f.f10326a.get() == view) {
                    break;
                }
            }
        }
        if (c1199f == null) {
            arrayList.add(new C1199f(view, eVar));
        }
    }

    @Override // o1.AbstractC1150b
    public final void c() {
        if (this.f10173g) {
            return;
        }
        this.f10171d.clear();
        if (!this.f10173g) {
            this.f10170c.f10329a.clear();
        }
        this.f10173g = true;
        AbstractC1217a abstractC1217a = this.f10172e;
        C1202i.f10332a.a(abstractC1217a.g(), "finishSession", abstractC1217a.f10406a);
        C1196c c1196c = C1196c.f10320c;
        boolean z3 = c1196c.f10322b.size() > 0;
        c1196c.f10321a.remove(this);
        ArrayList arrayList = c1196c.f10322b;
        arrayList.remove(this);
        if (z3 && arrayList.size() <= 0) {
            C1203j b3 = C1203j.b();
            b3.getClass();
            x1.b bVar = x1.b.f10545g;
            bVar.getClass();
            Handler handler = x1.b.f10547i;
            if (handler != null) {
                handler.removeCallbacks(x1.b.f10549k);
                x1.b.f10547i = null;
            }
            bVar.f10550a.clear();
            x1.b.f10546h.post(new A.b(20, bVar));
            C1195b c1195b = C1195b.f10319d;
            c1195b.f10323a = false;
            c1195b.f10325c = null;
            r1.b bVar2 = b3.f10336c;
            bVar2.f10283b.getContentResolver().unregisterContentObserver(bVar2);
        }
        this.f10172e.f();
        this.f10172e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1.AbstractC1150b
    public final void d(View view) {
        if (this.f10173g || ((View) this.f10171d.get()) == view) {
            return;
        }
        this.f10171d = new C1262a(view);
        AbstractC1217a abstractC1217a = this.f10172e;
        abstractC1217a.getClass();
        abstractC1217a.f = System.nanoTime();
        abstractC1217a.f10410e = 1;
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(C1196c.f10320c.f10321a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (i iVar : unmodifiableCollection) {
            if (iVar != this && ((View) iVar.f10171d.get()) == view) {
                iVar.f10171d.clear();
            }
        }
    }

    @Override // o1.AbstractC1150b
    public final void e() {
        if (this.f || this.f10172e == null) {
            return;
        }
        this.f = true;
        C1196c c1196c = C1196c.f10320c;
        boolean z3 = c1196c.f10322b.size() > 0;
        c1196c.f10322b.add(this);
        if (!z3) {
            C1203j b3 = C1203j.b();
            b3.getClass();
            C1195b c1195b = C1195b.f10319d;
            c1195b.f10325c = b3;
            c1195b.f10323a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z4 = runningAppProcessInfo.importance == 100 || c1195b.b();
            c1195b.f10324b = z4;
            c1195b.a(z4);
            x1.b.f10545g.getClass();
            x1.b.b();
            r1.b bVar = b3.f10336c;
            bVar.getClass();
            bVar.f10288h.submit(new A.b(18, bVar));
            bVar.f10283b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar);
        }
        float f = C1203j.b().f10334a;
        AbstractC1217a abstractC1217a = this.f10172e;
        C1202i c1202i = C1202i.f10332a;
        c1202i.a(abstractC1217a.g(), "setDeviceVolume", Float.valueOf(f), abstractC1217a.f10406a);
        AbstractC1217a abstractC1217a2 = this.f10172e;
        Date date = C1194a.f.f10315b;
        abstractC1217a2.c(date != null ? (Date) date.clone() : null);
        AbstractC1217a abstractC1217a3 = this.f10172e;
        List a3 = C1172b.b(C1201h.f10330b.f10331a).a();
        abstractC1217a3.getClass();
        try {
            JSONArray a4 = AbstractC1217a.a(a3);
            JSONObject jSONObject = new JSONObject();
            w1.b.b(jSONObject, "supportedAttestationMechanisms", a4);
            c1202i.a(abstractC1217a3.g(), "setSupportedAttestations", jSONObject);
        } catch (JSONException unused) {
        }
        this.f10172e.d(this, this.f10168a);
    }
}
