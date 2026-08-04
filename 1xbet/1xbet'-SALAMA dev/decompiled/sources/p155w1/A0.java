package p155w1;

import A1.x0;
import B1.l;
import O1.c;
import android.content.Context;
import io.flutter.view.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;
import p136t.e;
import p145u1.b;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static boolean f17277G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static HashSet f17278H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0 f17279A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final x0 f17280B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f17281C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final r f17282D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public l f17283E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final B f17284F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1049x0 f17285z;

    public A0(C0 c0, x0 x0Var, c cVar, r rVar) {
        super(AbstractC1044v1.a(EnumC1038t1.f17874f), false);
        this.f17279A = c0;
        this.f17280B = x0Var;
        this.f17281C = cVar;
        this.f17282D = rVar;
        this.f17284F = new B(this, 7);
    }

    public final synchronized void h() {
        JSONObject jSONObjectB;
        ArrayList arrayListA;
        try {
            AbstractC0997i0.o(3, "Fetching Config data.");
            this.f17279A.run();
            C1049x0 c1049x0 = this.f17279A.f17312b;
            this.f17285z = c1049x0;
            C1049x0 c1049x1 = C1049x0.f17924d;
            if (c1049x0 != c1049x1) {
                if (c1049x0 == C1049x0.f17925e) {
                    AbstractC0998i1.f("lastFetch", System.currentTimeMillis());
                    this.f17281C.a();
                    this.f17280B.m(this.f17285z, false);
                    return;
                } else {
                    c1049x0.toString();
                    if (this.f17283E == null) {
                        C1049x0 c1049x2 = this.f17285z;
                        if (c1049x2.f17927b == 6) {
                            b.b("FlurryUnknownCertificate", (String) c1049x2.f17928c, "ConfigFetcher");
                        }
                    }
                    i();
                    return;
                }
            }
            AbstractC0997i0.o(3, "Processing Config fetched data.");
            try {
                try {
                    String string = this.f17279A.f17318y;
                    AbstractC0997i0.o(3, "JSON body: ".concat(String.valueOf(string)));
                    JSONObject jSONObject = new JSONObject(string);
                    String str = this.f17279A.f17313c;
                    String str2 = H2.a().f17410h.f17889A;
                    String strOptString = jSONObject.optString("requestGuid");
                    String strOptString2 = jSONObject.optString("apiKey");
                    if (str.equals(strOptString) && str2.equals(strOptString2)) {
                        ArrayList arrayListE = AbstractC0997i0.e(jSONObject);
                        long jOptLong = jSONObject.optLong("refreshInSeconds");
                        this.f17282D.f14356a = jOptLong;
                        String strK = AbstractC0998i1.k("lastKeyId", null);
                        Charset charset = D0.f17325a;
                        if (("com.flurry.configkey.prod.ec.2".equals(strK) || "com.flurry.configkey.prod.rot.7".equals(strK) || "com.flurry.configkey.prod.fs.0".equals(strK)) && this.f17279A.d() && !this.f17282D.j(arrayListE)) {
                            this.f17285z = C1049x0.f17925e;
                        } else {
                            r rVar = this.f17282D;
                            this.f17279A.getClass();
                            this.f17279A.getClass();
                            rVar.f(arrayListE, this.f17279A.d());
                            this.f17285z = c1049x1;
                            r rVar2 = this.f17282D;
                            Context context = AbstractC0998i1.f17749c;
                            if (!this.f17279A.d()) {
                                string = null;
                            }
                            if (string == null && (jSONObjectB = rVar2.b((HashMap) rVar2.f14357b, (HashMap) rVar2.f14359d, false)) != null) {
                                string = jSONObjectB.toString();
                            }
                            if (string != null) {
                                D0.a(context, string);
                            }
                            AbstractC0998i1.g("lastETag", this.f17279A.f17317x);
                            AbstractC0998i1.g("lastKeyId", this.f17279A.f17314d);
                            AbstractC0998i1.g("lastRSA", this.f17279A.f17316f);
                        }
                        f17277G = true;
                        r rVar3 = this.f17282D;
                        synchronized (rVar3) {
                            try {
                                arrayListA = rVar3.a((HashMap) rVar3.f14357b);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        R1.e(arrayListA);
                        String strK2 = this.f17282D.k();
                        AbstractC0997i0.o(3, "Save serialized variant IDs: ".concat(String.valueOf(strK2)));
                        AbstractC0998i1.g("variant_ids", strK2);
                        AbstractC0998i1.f("appVersion", this.f17281C.f4933a);
                        AbstractC0998i1.f("lastFetch", System.currentTimeMillis());
                        c cVar = this.f17281C;
                        long j = jOptLong * 1000;
                        if (j == 0) {
                            cVar.f4934b = 0L;
                        } else if (j > 604800000) {
                            cVar.f4934b = 604800000L;
                        } else if (j < 60000) {
                            cVar.f4934b = 60000L;
                        } else {
                            cVar.f4934b = j;
                        }
                        AbstractC0998i1.f("refreshFetch", cVar.f4934b);
                        this.f17281C.a();
                        this.f17280B.m(this.f17285z, false);
                        return;
                    }
                    this.f17285z = new C1049x0(5, "Guid: " + str + ", payload: " + strOptString + " APIKey: " + str2 + ", payload: " + strOptString2, 0);
                    StringBuilder sb = new StringBuilder("Authentication error: ");
                    sb.append(this.f17285z);
                    AbstractC0997i0.q(sb.toString());
                    i();
                } catch (JSONException e7) {
                    AbstractC0997i0.r("Json parse error", e7);
                    this.f17285z = new C1049x0(4, e7.toString(), 0);
                }
            } catch (Exception e8) {
                AbstractC0997i0.r("Fetch result error", e8);
                this.f17285z = new C1049x0(7, e8.toString(), 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i() {
        int i7;
        AbstractC0997i0.o(3, "Retry fetching Config data.");
        l lVar = this.f17283E;
        if (lVar == null) {
            this.f17283E = new l(e.f(4)[0]);
        } else {
            int i8 = lVar.f1011b;
            if (e.e(i8) != e.f(4).length - 1) {
                i8 = e.f(4)[e.e(i8) + 1];
            }
            this.f17283E = new l(i8);
        }
        if (this.f17283E.f1011b == 4) {
            this.f17280B.m(this.f17285z, false);
            return;
        }
        this.f17280B.m(this.f17285z, true);
        C1037t0 c1037t0 = new C1037t0(this, 0);
        l lVar2 = this.f17283E;
        int i9 = lVar2.f1011b;
        if (i9 == 1) {
            i7 = 10;
        } else if (i9 == 2) {
            i7 = 30;
        } else if (i9 == 3) {
            i7 = 180;
        } else {
            if (i9 != 4) {
                throw null;
            }
            i7 = 0;
        }
        long jCurrentTimeMillis = ((long) ((i7 + lVar2.f1012c) - ((int) (System.currentTimeMillis() / 1000)))) * 1000;
        c cVar = this.f17281C;
        synchronized (cVar) {
            synchronized (cVar.f4936d) {
                AbstractC0997i0.o(3, "Record retry after " + jCurrentTimeMillis + " msecs.");
                Timer timer = new Timer("retry-scheduler");
                cVar.f4935c = timer;
                timer.schedule(c1037t0, jCurrentTimeMillis);
            }
        }
    }
}
