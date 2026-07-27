package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4491k4;
import com.ironsource.C4531m8;
import com.ironsource.InterfaceC4581p4;
import com.ironsource.InterfaceC4599q4;
import com.ironsource.InterfaceC4616r4;
import com.ironsource.O7;
import com.ironsource.Q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class n implements l {

    /* renamed from: a, reason: collision with root package name */
    private final O7 f8584a;
    private final String b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f8585a;
        final /* synthetic */ f.c b;

        a(l.a aVar, f.c cVar) {
            this.f8585a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f8585a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.b);
                this.f8585a.a(new f.a(this.b.f(), jSONObject));
            } catch (JSONException e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4616r4 f8586a;
        final /* synthetic */ Q4 b;

        b(InterfaceC4616r4 interfaceC4616r4, Q4 q4) {
            this.f8586a = interfaceC4616r4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8586a.a(C4531m8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4616r4 f8587a;
        final /* synthetic */ JSONObject b;

        c(InterfaceC4616r4 interfaceC4616r4, JSONObject jSONObject) {
            this.f8587a = interfaceC4616r4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8587a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4599q4 f8588a;
        final /* synthetic */ Q4 b;

        d(InterfaceC4599q4 interfaceC4599q4, Q4 q4) {
            this.f8588a = interfaceC4599q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8588a.a(C4531m8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4599q4 f8589a;
        final /* synthetic */ String b;

        e(InterfaceC4599q4 interfaceC4599q4, String str) {
            this.f8589a = interfaceC4599q4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8589a.a(this.b, n.this.b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4599q4 f8590a;
        final /* synthetic */ Q4 b;

        f(InterfaceC4599q4 interfaceC4599q4, Q4 q4) {
            this.f8590a = interfaceC4599q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8590a.a(this.b.h(), n.this.b);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4599q4 f8591a;
        final /* synthetic */ JSONObject b;

        g(InterfaceC4599q4 interfaceC4599q4, JSONObject jSONObject) {
            this.f8591a = interfaceC4599q4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8591a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4599q4 f8592a;
        final /* synthetic */ Q4 b;

        h(InterfaceC4599q4 interfaceC4599q4, Q4 q4) {
            this.f8592a = interfaceC4599q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8592a.d(this.b.h(), n.this.b);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4581p4 f8593a;
        final /* synthetic */ Map b;

        i(InterfaceC4581p4 interfaceC4581p4, Map map) {
            this.f8593a = interfaceC4581p4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8593a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4581p4 f8594a;
        final /* synthetic */ JSONObject b;

        j(InterfaceC4581p4 interfaceC4581p4, JSONObject jSONObject) {
            this.f8594a = interfaceC4581p4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8594a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    n(String str, O7 o7) {
        this.f8584a = o7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C4531m8.c h() {
        return C4531m8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4) {
        if (interfaceC4599q4 != null) {
            a(new f(interfaceC4599q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4616r4 interfaceC4616r4) {
        if (interfaceC4616r4 != null) {
            a(new b(interfaceC4616r4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4616r4 interfaceC4616r4) {
        if (interfaceC4616r4 != null) {
            a(new c(interfaceC4616r4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4599q4 interfaceC4599q4) {
        if (interfaceC4599q4 != null) {
            a(new d(interfaceC4599q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4599q4 interfaceC4599q4) {
        if (interfaceC4599q4 != null) {
            a(new e(interfaceC4599q4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4599q4 interfaceC4599q4) {
        if (interfaceC4599q4 != null) {
            a(new g(interfaceC4599q4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4) {
        if (interfaceC4599q4 != null) {
            a(new h(interfaceC4599q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4581p4 interfaceC4581p4) {
        if (interfaceC4581p4 != null) {
            interfaceC4581p4.a(C4531m8.e.Banner, q4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4581p4 interfaceC4581p4) {
        if (interfaceC4581p4 != null) {
            a(new i(interfaceC4581p4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4581p4 interfaceC4581p4) {
        if (interfaceC4581p4 != null) {
            a(new j(interfaceC4581p4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    void a(Runnable runnable) {
        O7 o7 = this.f8584a;
        if (o7 != null) {
            o7.c(runnable);
        }
    }
}
