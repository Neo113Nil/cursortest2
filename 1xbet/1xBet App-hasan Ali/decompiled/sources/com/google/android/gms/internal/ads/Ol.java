package com.google.android.gms.internal.ads;

import Q2.C0379q;
import Q2.C0387u0;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ol implements Ph, InterfaceC1434pi, InterfaceC0897di {

    /* renamed from: k, reason: collision with root package name */
    public final Ul f10974k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10975l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10976m;

    /* renamed from: p, reason: collision with root package name */
    public Ih f10979p;

    /* renamed from: q, reason: collision with root package name */
    public C0387u0 f10980q;

    /* renamed from: u, reason: collision with root package name */
    public JSONObject f10984u;

    /* renamed from: v, reason: collision with root package name */
    public JSONObject f10985v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10986w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10987x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10988y;

    /* renamed from: r, reason: collision with root package name */
    public String f10981r = "";

    /* renamed from: s, reason: collision with root package name */
    public String f10982s = "";

    /* renamed from: t, reason: collision with root package name */
    public String f10983t = "";

    /* renamed from: n, reason: collision with root package name */
    public int f10977n = 0;

    /* renamed from: o, reason: collision with root package name */
    public Nl f10978o = Nl.f10809k;

    public Ol(Ul ul, Wq wq, String str) {
        this.f10974k = ul;
        this.f10976m = str;
        this.f10975l = wq.f;
    }

    public static JSONObject b(C0387u0 c0387u0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c0387u0.f5060m);
        jSONObject.put("errorCode", c0387u0.f5058k);
        jSONObject.put("errorDescription", c0387u0.f5059l);
        C0387u0 c0387u02 = c0387u0.f5061n;
        jSONObject.put("underlyingError", c0387u02 == null ? null : b(c0387u02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        if (this.f10974k.f()) {
            if (!((List) sq.f11596b.f13761l).isEmpty()) {
                this.f10977n = ((Lq) ((List) sq.f11596b.f13761l).get(0)).f10491b;
            }
            if (!TextUtils.isEmpty(((Nq) sq.f11596b.f13762m).f10831l)) {
                this.f10981r = ((Nq) sq.f11596b.f13762m).f10831l;
            }
            if (!TextUtils.isEmpty(((Nq) sq.f11596b.f13762m).f10832m)) {
                this.f10982s = ((Nq) sq.f11596b.f13762m).f10832m;
            }
            if (((Nq) sq.f11596b.f13762m).f10835p.length() > 0) {
                this.f10985v = ((Nq) sq.f11596b.f13762m).f10835p;
            }
            A7 a7 = F7.T8;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                if (this.f10974k.f11807w >= ((Long) rVar.f5056c.a(F7.U8)).longValue()) {
                    this.f10988y = true;
                    return;
                }
                if (!TextUtils.isEmpty(((Nq) sq.f11596b.f13762m).f10833n)) {
                    this.f10983t = ((Nq) sq.f11596b.f13762m).f10833n;
                }
                if (((Nq) sq.f11596b.f13762m).f10834o.length() > 0) {
                    this.f10984u = ((Nq) sq.f11596b.f13762m).f10834o;
                }
                Ul ul = this.f10974k;
                JSONObject jSONObject = this.f10984u;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f10983t)) {
                    length += this.f10983t.length();
                }
                long j5 = length;
                synchronized (ul) {
                    ul.f11807w += j5;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X8)).booleanValue()) {
            return;
        }
        Ul ul = this.f10974k;
        if (ul.f()) {
            ul.b(this.f10975l, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0897di
    public final void T0(AbstractC0762ah abstractC0762ah) {
        Ul ul = this.f10974k;
        if (ul.f()) {
            this.f10979p = abstractC0762ah.f;
            this.f10978o = Nl.f10810l;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X8)).booleanValue()) {
                ul.b(this.f10975l, this);
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f10978o);
        jSONObject2.put("format", Lq.a(this.f10977n));
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X8)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f10986w);
            if (this.f10986w) {
                jSONObject2.put("shown", this.f10987x);
            }
        }
        Ih ih = this.f10979p;
        if (ih != null) {
            jSONObject = c(ih);
        } else {
            C0387u0 c0387u0 = this.f10980q;
            JSONObject jSONObject3 = null;
            if (c0387u0 != null && (iBinder = c0387u0.f5062o) != null) {
                Ih ih2 = (Ih) iBinder;
                jSONObject3 = c(ih2);
                if (ih2.f9594o.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b(this.f10980q));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject c(Ih ih) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", ih.f9590k);
        jSONObject.put("responseSecsSinceEpoch", ih.f9595p);
        jSONObject.put("responseId", ih.f9591l);
        A7 a7 = F7.Q8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            String str = ih.f9596q;
            if (!TextUtils.isEmpty(str)) {
                U2.j.d("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f10981r)) {
            jSONObject.put("adRequestUrl", this.f10981r);
        }
        if (!TextUtils.isEmpty(this.f10982s)) {
            jSONObject.put("postBody", this.f10982s);
        }
        if (!TextUtils.isEmpty(this.f10983t)) {
            jSONObject.put("adResponseBody", this.f10983t);
        }
        Object obj = this.f10984u;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f10985v;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) rVar.f5056c.a(F7.T8)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f10988y);
        }
        JSONArray jSONArray = new JSONArray();
        for (Q2.c1 c1Var : ih.f9594o) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", c1Var.f4998k);
            jSONObject2.put("latencyMillis", c1Var.f4999l);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.R8)).booleanValue()) {
                jSONObject2.put("credentials", C0379q.f.f5048a.f(c1Var.f5001n));
            }
            C0387u0 c0387u0 = c1Var.f5000m;
            jSONObject2.put("error", c0387u0 == null ? null : b(c0387u0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        Ul ul = this.f10974k;
        if (ul.f()) {
            this.f10978o = Nl.f10811m;
            this.f10980q = c0387u0;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X8)).booleanValue()) {
                ul.b(this.f10975l, this);
            }
        }
    }
}
