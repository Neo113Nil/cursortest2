package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S7 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11501a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.F f11502b;

    /* renamed from: c, reason: collision with root package name */
    public final a3.A f11503c;

    /* renamed from: d, reason: collision with root package name */
    public final C1616tl f11504d;

    /* renamed from: e, reason: collision with root package name */
    public K4 f11505e;
    public R7 f;

    /* renamed from: g, reason: collision with root package name */
    public m2.g f11506g;

    /* renamed from: h, reason: collision with root package name */
    public String f11507h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f11508j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f11509k;

    /* renamed from: l, reason: collision with root package name */
    public Context f11510l;

    public S7(ScheduledExecutorService scheduledExecutorService, a3.F f, a3.A a5, C1616tl c1616tl) {
        this.f11501a = scheduledExecutorService;
        this.f11502b = f;
        this.f11503c = a5;
        this.f11504d = c1616tl;
    }

    public final JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1281m8.f14476c.s()).booleanValue() ? ((Long) AbstractC1281m8.f.s()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
            jSONObject.put("as", this.f11503c.a());
        }
        return jSONObject;
    }

    public final JSONObject b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1281m8.f14476c.s()).booleanValue() ? ((Long) AbstractC1281m8.f.s()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
            jSONObject.put("as", this.f11503c.a());
        }
        return jSONObject;
    }

    public final void c(String str) {
        try {
            m2.g gVar = this.f11506g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f11508j).toString());
            e(jSONObject);
            if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
                jSONObject.put("as", this.f11503c.a());
            }
            gVar.j(jSONObject.toString());
            a3.x xVar = new a3.x(1, this, str);
            if (((Boolean) AbstractC1281m8.f14476c.s()).booleanValue()) {
                this.f11502b.b(this.f11506g, xVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            A0.J0.p(this.f11510l, new J2.h((J2.g) new J2.g(0).a(bundle)), xVar);
        } catch (JSONException e3) {
            U2.j.g("Error creating JSON: ", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r6.i) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r1 = r6.f11506g;
        r2 = android.net.Uri.parse(r6.f11507h);
        r1.getClass();
        r3 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r4 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r4.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r5 = (q.BinderC2290e) r1.f17996n;
        r1 = (b.InterfaceC0499d) r1.f17995m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r3.putAll(r4);
        ((b.C0497b) r1).d1(r5, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        ((b.C0497b) r1).Y(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.v9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        R7 r7 = this.f;
        if (r7 == null) {
            U2.j.f("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (r7.f11337a.get()) {
            return;
        }
        if (this.f11507h != null && this.f11506g != null && (scheduledExecutorService = this.f11501a) != null) {
            if (this.i != 0) {
                P2.o.f4767B.f4776j.getClass();
            }
        }
        T2.G.m("PACT max retry connection duration timed out");
        return;
        scheduledExecutorService.schedule(this.f11505e, ((Long) Q2.r.f5053d.f5056c.a(F7.w9)).longValue(), TimeUnit.MILLISECONDS);
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f11509k == null) {
                this.f11509k = new JSONArray((String) Q2.r.f5053d.f5056c.a(F7.y9));
            }
            jSONObject.put("eids", this.f11509k);
        } catch (JSONException e3) {
            U2.j.g("Error fetching the PACT active eids JSON: ", e3);
        }
    }
}
