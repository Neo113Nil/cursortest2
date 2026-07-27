package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C4349c5;
import com.ironsource.C4430ge;
import com.ironsource.C4491k4;
import com.ironsource.C4531m8;
import com.ironsource.C4549n8;
import com.ironsource.C4553nc;
import com.ironsource.C4567o8;
import com.ironsource.C4631s1;
import com.ironsource.C4652t4;
import com.ironsource.C4656t8;
import com.ironsource.C4670u4;
import com.ironsource.C4674u8;
import com.ironsource.C4761z5;
import com.ironsource.I3;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4581p4;
import com.ironsource.InterfaceC4599q4;
import com.ironsource.InterfaceC4616r4;
import com.ironsource.Lb;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.O7;
import com.ironsource.Q4;
import com.ironsource.R4;
import com.ironsource.T5;
import com.ironsource.U3;
import com.ironsource.U5;
import com.ironsource.U6;
import com.ironsource.W6;
import com.ironsource.X3;
import com.ironsource.ch;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final O7 g;
    private final ch h;
    private final C4553nc k;

    /* renamed from: a, reason: collision with root package name */
    private final String f8551a = "e";
    private C4531m8.b c = C4531m8.b.None;
    private final I3 e = new I3("NativeCommandExecutor");
    private final I3 f = new I3("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f8552a;
        final /* synthetic */ InterfaceC4599q4 b;

        a(JSONObject jSONObject, InterfaceC4599q4 interfaceC4599q4) {
            this.f8552a = jSONObject;
            this.b = interfaceC4599q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8552a, this.b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q4 f8553a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4599q4 c;

        b(Q4 q4, Map map, InterfaceC4599q4 interfaceC4599q4) {
            this.f8553a = q4;
            this.b = map;
            this.c = interfaceC4599q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8553a, this.b, this.c);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8554a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4581p4 d;

        c(String str, String str2, Q4 q4, InterfaceC4581p4 interfaceC4581p4) {
            this.f8554a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4581p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8554a, this.b, this.c, this.d);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f8555a;
        final /* synthetic */ InterfaceC4581p4 b;

        d(JSONObject jSONObject, InterfaceC4581p4 interfaceC4581p4) {
            this.f8555a = jSONObject;
            this.b = interfaceC4581p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8555a, this.b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC1337e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q4 f8556a;

        RunnableC1337e(Q4 q4) {
            this.f8556a = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8556a);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q4 f8557a;

        f(Q4 q4) {
            this.f8557a = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.f8557a);
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q4 f8558a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4581p4 c;

        g(Q4 q4, Map map, InterfaceC4581p4 interfaceC4581p4) {
            this.f8558a = q4;
            this.b = map;
            this.c = interfaceC4581p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8558a, this.b, this.c);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f8559a;
        final /* synthetic */ f.c b;

        h(l.a aVar, f.c cVar) {
            this.f8559a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.b != null) {
                if (this.f8559a != null) {
                    eVar.i.put(this.b.f(), this.f8559a);
                }
                e.this.b.a(this.b, this.f8559a);
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f8560a;

        i(JSONObject jSONObject) {
            this.f8560a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.f8560a);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a();
                e.this.b = null;
            }
        }
    }

    class k extends CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f8551a, "Global Controller Timer Finish");
            e.this.d(U3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8564a;
        final /* synthetic */ String b;

        m(String str, String str2) {
            this.f8564a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.f8564a, this.b);
                e.this.b.b();
            } catch (Throwable th) {
                C4491k4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f8551a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(U3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8566a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4616r4 d;

        o(String str, String str2, Q4 q4, InterfaceC4616r4 interfaceC4616r4) {
            this.f8566a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4616r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8566a, this.b, this.c, this.d);
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f8567a;
        final /* synthetic */ InterfaceC4616r4 b;

        p(JSONObject jSONObject, InterfaceC4616r4 interfaceC4616r4) {
            this.f8567a = jSONObject;
            this.b = interfaceC4616r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8567a, this.b);
            }
        }
    }

    class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8568a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4599q4 d;

        q(String str, String str2, Q4 q4, InterfaceC4599q4 interfaceC4599q4) {
            this.f8568a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4599q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8568a, this.b, this.c, this.d);
            }
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8569a;
        final /* synthetic */ InterfaceC4599q4 b;

        r(String str, InterfaceC4599q4 interfaceC4599q4) {
            this.f8569a = str;
            this.b = interfaceC4599q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.f8569a, this.b);
            }
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q4 f8570a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4599q4 c;

        s(Q4 q4, Map map, InterfaceC4599q4 interfaceC4599q4) {
            this.f8570a = q4;
            this.b = map;
            this.c = interfaceC4599q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4656t8.a(C4430ge.j, new C4567o8().a(C4761z5.v, this.f8570a.f()).a(C4761z5.w, C4674u8.a(this.f8570a, C4531m8.e.Interstitial)).a(C4761z5.x, Boolean.valueOf(C4674u8.a(this.f8570a))).a(C4761z5.I, Long.valueOf(N.f7799a.b(this.f8570a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.f8570a, this.b, this.c);
            }
        }
    }

    public e(Context context, X3 x3, R4 r4, O7 o7, int i2, JSONObject jSONObject, String str, String str2, C4553nc c4553nc) {
        this.k = c4553nc;
        this.g = o7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4349c5 a2 = C4349c5.a(networkStorageDir, o7, jSONObject);
        this.h = new ch(context, x3, r4, i2, a2, networkStorageDir);
        a(context, x3, r4, i2, a2, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, X3 x3, R4 r4, int i2, C4349c5 c4349c5, String str, String str2, String str3) {
        try {
            this.d = new k(200000L, 1000L).start();
            v b2 = b(context, x3, r4, i2, c4349c5, str, str2, str3);
            this.b = b2;
            b2.b();
        } catch (Throwable th) {
            C4491k4.d().a(th);
            d(Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C4656t8.a(C4430ge.d, new C4567o8().a(C4761z5.A, str).a());
        this.c = C4531m8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        O7 o7 = this.g;
        if (o7 != null) {
            o7.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4549n8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                e.this.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Lb lb) {
                e.this.a(lb);
            }
        };
    }

    private void l() {
        Logger.i(this.f8551a, "handleReadyState");
        this.c = C4531m8.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C4531m8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4531m8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C4531m8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a remove = this.i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, X3 x3, R4 r4, int i2, C4349c5 c4349c5, String str, String str2, String str3) throws Throwable {
        C4656t8.a(C4430ge.c, new C4567o8().a(C4761z5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, r4, x3, this, this.g, i2, c4349c5, str, i(), j(), str2, str3);
        U5 u5 = new U5(context, c4349c5, new T5(this.g.a()), new Nb(c4349c5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4349c5.a(), u5));
        vVar.a(new C4631s1());
        vVar.a(new C4670u4(context, new C4652t4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Lb lb) {
        l.b bVar = this.j.get(lb.d());
        if (bVar != null) {
            bVar.a(lb);
        }
    }

    private void a(Runnable runnable, long j2) {
        O7 o7 = this.g;
        if (o7 != null) {
            o7.d(runnable, j2);
        } else {
            Logger.e(this.f8551a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final X3 x3, final R4 r4, final int i2, final C4349c5 c4349c5, final String str, final String str2, final String str3) {
        int C = Ib.a0().h().C();
        if (C > 0) {
            C4656t8.a(C4430ge.B, new C4567o8().a(C4761z5.y, String.valueOf(C)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(context, x3, r4, i2, c4349c5, str, str2, str3);
            }
        };
        if (Ib.a0().h().t()) {
            this.g.b(runnable, C);
        } else {
            a(runnable, C);
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f8551a, "handleControllerReady ");
        this.k.a(h());
        if (C4531m8.c.Web.equals(h())) {
            C4656t8.a(C4430ge.e, new C4567o8().a(C4761z5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f8551a, "handleControllerLoaded");
        this.c = C4531m8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f8551a, "handleControllerFailed ");
        C4567o8 c4567o8 = new C4567o8();
        c4567o8.a(C4761z5.A, str);
        c4567o8.a(C4761z5.y, String.valueOf(this.h.l()));
        C4656t8.a(C4430ge.o, c4567o8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.f8551a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C4656t8.a(C4430ge.y, new C4567o8().a(C4761z5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4) {
        this.f.a(new s(q4, map, interfaceC4599q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4) {
        this.f.a(new f(q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.Y6
    public void a(U6 u6) {
        W6 b2 = u6.b();
        if (b2 == W6.SendEvent) {
            C4656t8.a(C4430ge.A, new C4567o8().a(C4761z5.y, u6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == W6.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(u6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C4656t8.a(C4430ge.d, new C4567o8().a(C4761z5.A, u6.a() + " : strategy: " + b2).a());
            C4656t8.a(C4430ge.A, new C4567o8().a(C4761z5.y, u6.a() + " : strategy: " + b2).a());
        }
    }

    private void a(C4531m8.e eVar, Q4 q4, String str, String str2) {
        Logger.i(this.f8551a, "recoverWebController for product: " + eVar.toString());
        C4567o8 c4567o8 = new C4567o8();
        c4567o8.a(C4761z5.w, eVar.toString());
        c4567o8.a(C4761z5.v, q4.f());
        C4656t8.a(C4430ge.b, c4567o8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Ib.a0().h().t()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4616r4 interfaceC4616r4) {
        if (this.h.a(h(), this.c)) {
            a(C4531m8.e.RewardedVideo, q4, str, str2);
        }
        this.f.a(new o(str, str2, q4, interfaceC4616r4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4616r4 interfaceC4616r4) {
        this.f.a(new p(jSONObject, interfaceC4616r4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4599q4 interfaceC4599q4) {
        if (this.h.a(h(), this.c)) {
            a(C4531m8.e.Interstitial, q4, str, str2);
        }
        this.f.a(new q(str, str2, q4, interfaceC4599q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4599q4 interfaceC4599q4) {
        Logger.i(this.f8551a, "load interstitial");
        this.f.a(new r(str, interfaceC4599q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4599q4 interfaceC4599q4) {
        this.f.a(new a(jSONObject, interfaceC4599q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4599q4 interfaceC4599q4) {
        this.f.a(new b(q4, map, interfaceC4599q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4581p4 interfaceC4581p4) {
        if (this.h.a(h(), this.c)) {
            a(C4531m8.e.Banner, q4, str, str2);
        }
        this.f.a(new c(str, str2, q4, interfaceC4581p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4581p4 interfaceC4581p4) {
        this.f.a(new d(jSONObject, interfaceC4581p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4) {
        this.f.a(new RunnableC1337e(q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4581p4 interfaceC4581p4) {
        this.f.a(new g(q4, map, interfaceC4581p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    public void a(String str, l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f8551a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        I3 i3 = this.f;
        if (i3 != null) {
            i3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
