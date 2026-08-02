package w1;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A0 extends AbstractC1765z1 {

    /* renamed from: G, reason: collision with root package name */
    public static boolean f17271G = false;

    /* renamed from: H, reason: collision with root package name */
    public static HashSet f17272H;

    /* renamed from: A, reason: collision with root package name */
    public final C0 f17273A;

    /* renamed from: B, reason: collision with root package name */
    public final A1.x0 f17274B;

    /* renamed from: C, reason: collision with root package name */
    public final O1.c f17275C;

    /* renamed from: D, reason: collision with root package name */
    public final io.flutter.view.r f17276D;

    /* renamed from: E, reason: collision with root package name */
    public B1.l f17277E;

    /* renamed from: F, reason: collision with root package name */
    public final B f17278F;

    /* renamed from: z, reason: collision with root package name */
    public C1758x0 f17279z;

    public A0(C0 c0, A1.x0 x0Var, O1.c cVar, io.flutter.view.r rVar) {
        super(AbstractC1753v1.a(EnumC1747t1.f17868f), false);
        this.f17273A = c0;
        this.f17274B = x0Var;
        this.f17275C = cVar;
        this.f17276D = rVar;
        this.f17278F = new B(this, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7 A[Catch: all -> 0x00a3, Exception -> 0x00a6, JSONException -> 0x00a9, Merged into TryCatch #0 {all -> 0x00a3, JSONException -> 0x00a9, Exception -> 0x00a6, blocks: (B:4:0x0002, B:6:0x0017, B:8:0x001c, B:10:0x0050, B:13:0x0058, B:15:0x0078, B:17:0x0080, B:22:0x008e, B:24:0x0096, B:26:0x009e, B:27:0x0105, B:28:0x0109, B:31:0x0112, B:32:0x0113, B:34:0x014b, B:35:0x0164, B:36:0x01d9, B:42:0x0155, B:45:0x015f, B:46:0x0162, B:51:0x016d, B:52:0x00ac, B:56:0x00d3, B:58:0x00e1, B:60:0x00e7, B:61:0x00ea, B:64:0x0170, B:72:0x01b6, B:69:0x01c8, B:73:0x01e7, B:75:0x01eb, B:78:0x0202, B:80:0x0209, B:82:0x0210, B:83:0x021b), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h() {
        C1758x0 c1758x0;
        C1758x0 c1758x02;
        boolean z4;
        JSONObject b7;
        io.flutter.view.r rVar;
        ArrayList a2;
        try {
            AbstractC1706i0.o(3, "Fetching Config data.");
            this.f17273A.run();
            c1758x0 = this.f17273A.f17306b;
            this.f17279z = c1758x0;
            c1758x02 = C1758x0.f17918d;
        } catch (JSONException e7) {
            AbstractC1706i0.r("Json parse error", e7);
            this.f17279z = new C1758x0(4, e7.toString(), 0);
        } catch (Exception e8) {
            AbstractC1706i0.r("Fetch result error", e8);
            this.f17279z = new C1758x0(7, e8.toString(), 0);
        } finally {
        }
        if (c1758x0 != c1758x02) {
            if (c1758x0 == C1758x0.f17919e) {
                AbstractC1707i1.f("lastFetch", System.currentTimeMillis());
                this.f17275C.a();
                this.f17274B.m(this.f17279z, false);
                return;
            } else {
                c1758x0.toString();
                if (this.f17277E == null) {
                    C1758x0 c1758x03 = this.f17279z;
                    if (c1758x03.f17921b == 6) {
                        u1.b.b("FlurryUnknownCertificate", (String) c1758x03.f17922c, "ConfigFetcher");
                    }
                }
                i();
                return;
            }
        }
        AbstractC1706i0.o(3, "Processing Config fetched data.");
        String str = this.f17273A.f17312y;
        AbstractC1706i0.o(3, "JSON body: ".concat(String.valueOf(str)));
        JSONObject jSONObject = new JSONObject(str);
        String str2 = this.f17273A.f17307c;
        String str3 = H2.a().f17404h.f17883A;
        String optString = jSONObject.optString("requestGuid");
        String optString2 = jSONObject.optString("apiKey");
        if (str2.equals(optString) && str3.equals(optString2)) {
            ArrayList e9 = AbstractC1706i0.e(jSONObject);
            long optLong = jSONObject.optLong("refreshInSeconds");
            this.f17276D.f14350a = optLong;
            String k7 = AbstractC1707i1.k("lastKeyId", null);
            Charset charset = D0.f17319a;
            if (!"com.flurry.configkey.prod.ec.2".equals(k7) && !"com.flurry.configkey.prod.rot.7".equals(k7) && !"com.flurry.configkey.prod.fs.0".equals(k7)) {
                z4 = false;
                if (z4 || !this.f17273A.d() || this.f17276D.j(e9)) {
                    io.flutter.view.r rVar2 = this.f17276D;
                    this.f17273A.getClass();
                    this.f17273A.getClass();
                    rVar2.f(e9, this.f17273A.d());
                    this.f17279z = c1758x02;
                    io.flutter.view.r rVar3 = this.f17276D;
                    Context context = AbstractC1707i1.f17743c;
                    if (this.f17273A.d()) {
                        str = null;
                    }
                    if (str == null && (b7 = rVar3.b((HashMap) rVar3.f14351b, (HashMap) rVar3.f14353d, false)) != null) {
                        str = b7.toString();
                    }
                    if (str != null) {
                        D0.a(context, str);
                    }
                    AbstractC1707i1.g("lastETag", this.f17273A.f17311x);
                    AbstractC1707i1.g("lastKeyId", this.f17273A.f17308d);
                    AbstractC1707i1.g("lastRSA", this.f17273A.f17310f);
                } else {
                    this.f17279z = C1758x0.f17919e;
                }
                f17271G = true;
                rVar = this.f17276D;
                synchronized (rVar) {
                    try {
                        a2 = rVar.a((HashMap) rVar.f14351b);
                    } finally {
                    }
                }
                R1.e(a2);
                String k8 = this.f17276D.k();
                AbstractC1706i0.o(3, "Save serialized variant IDs: ".concat(String.valueOf(k8)));
                AbstractC1707i1.g("variant_ids", k8);
                AbstractC1707i1.f("appVersion", this.f17275C.f4933a);
                AbstractC1707i1.f("lastFetch", System.currentTimeMillis());
                O1.c cVar = this.f17275C;
                long j = optLong * 1000;
                if (j == 0) {
                    cVar.f4934b = 0L;
                } else if (j > 604800000) {
                    cVar.f4934b = 604800000L;
                } else if (j < 60000) {
                    cVar.f4934b = 60000L;
                } else {
                    cVar.f4934b = j;
                }
                AbstractC1707i1.f("refreshFetch", cVar.f4934b);
                this.f17275C.a();
                this.f17274B.m(this.f17279z, false);
                return;
            }
            z4 = true;
            if (z4) {
            }
            io.flutter.view.r rVar22 = this.f17276D;
            this.f17273A.getClass();
            this.f17273A.getClass();
            rVar22.f(e9, this.f17273A.d());
            this.f17279z = c1758x02;
            io.flutter.view.r rVar32 = this.f17276D;
            Context context2 = AbstractC1707i1.f17743c;
            if (this.f17273A.d()) {
            }
            if (str == null) {
                str = b7.toString();
            }
            if (str != null) {
            }
            AbstractC1707i1.g("lastETag", this.f17273A.f17311x);
            AbstractC1707i1.g("lastKeyId", this.f17273A.f17308d);
            AbstractC1707i1.g("lastRSA", this.f17273A.f17310f);
            f17271G = true;
            rVar = this.f17276D;
            synchronized (rVar) {
            }
        }
        this.f17279z = new C1758x0(5, "Guid: " + str2 + ", payload: " + optString + " APIKey: " + str3 + ", payload: " + optString2, 0);
        StringBuilder sb = new StringBuilder("Authentication error: ");
        sb.append(this.f17279z);
        AbstractC1706i0.q(sb.toString());
        i();
    }

    public final void i() {
        int i7;
        AbstractC1706i0.o(3, "Retry fetching Config data.");
        B1.l lVar = this.f17277E;
        if (lVar == null) {
            this.f17277E = new B1.l(t.e.f(4)[0]);
        } else {
            int i8 = lVar.f1011b;
            if (t.e.e(i8) != t.e.f(4).length - 1) {
                i8 = t.e.f(4)[t.e.e(i8) + 1];
            }
            this.f17277E = new B1.l(i8);
        }
        if (this.f17277E.f1011b == 4) {
            this.f17274B.m(this.f17279z, false);
            return;
        }
        this.f17274B.m(this.f17279z, true);
        C1746t0 c1746t0 = new C1746t0(this, 0);
        int i9 = this.f17277E.f1011b;
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
        long currentTimeMillis = ((i7 + r2.f1012c) - ((int) (System.currentTimeMillis() / 1000))) * 1000;
        O1.c cVar = this.f17275C;
        synchronized (cVar) {
            synchronized (cVar.f4936d) {
                AbstractC1706i0.o(3, "Record retry after " + currentTimeMillis + " msecs.");
                Timer timer = new Timer("retry-scheduler");
                cVar.f4935c = timer;
                timer.schedule(c1746t0, currentTimeMillis);
            }
        }
    }
}
