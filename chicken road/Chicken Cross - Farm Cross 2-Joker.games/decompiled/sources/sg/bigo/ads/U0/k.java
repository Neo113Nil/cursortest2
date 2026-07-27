package sg.bigo.ads.U0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.x;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class k extends b implements InterfaceC5087a {
    public static final AtomicInteger g1 = new AtomicInteger();
    public final s A0;
    public final i B0;
    public final t C0;
    public sg.bigo.ads.z1.p D0;
    public sg.bigo.ads.P.r E0;
    public int F0;
    public boolean G0;
    public String H0;
    public final g I0;
    public int J0;
    public int K0;
    public long L0;
    public sg.bigo.ads.z1.a M0;
    public sg.bigo.ads.z1.a N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public Pair V0;
    public boolean W0;
    public final String X0;
    public boolean Y0;
    public x Z0;
    public int a1;
    public final AtomicInteger b1;
    public final AtomicInteger c1;
    public int d1;
    public boolean e1;
    public y f1;
    public final String x0;
    public final h y0;
    public final h[] z0;

    public k(long j, sg.bigo.ads.N.c cVar, sg.bigo.ads.T0.p pVar, JSONObject jSONObject) {
        super(j, cVar, pVar, jSONObject);
        this.F0 = 0;
        this.G0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = 4;
        this.S0 = 6;
        this.T0 = 4;
        this.U0 = 0;
        this.W0 = false;
        this.b1 = new AtomicInteger(0);
        this.c1 = new AtomicInteger(0);
        this.e1 = true;
        this.x0 = jSONObject.optString("iurl");
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject != null) {
            this.y0 = new h(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new h(optJSONObject2));
                }
            }
            h[] hVarArr = new h[arrayList.size()];
            this.z0 = hVarArr;
            this.z0 = (h[]) arrayList.toArray(hVarArr);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video");
        if (optJSONObject3 != null) {
            this.A0 = new s(optJSONObject3);
        }
        this.B0 = new i(jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_play_cfg");
        if (optJSONObject4 != null) {
            this.C0 = new t(optJSONObject4);
        }
        jSONObject.optInt("immersive_ad_type", 0);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("display");
        if (optJSONObject5 != null) {
            this.I0 = new g(optJSONObject5);
        }
        this.X0 = this.o + "_" + this.f + "_" + g1.addAndGet(1);
    }

    public final String a(Context context) {
        String sb;
        String sb2;
        Pair pair;
        if (!n()) {
            this.F0 = 0;
            StringBuilder sb3 = new StringBuilder();
            if (o()) {
                StringBuilder sb4 = new StringBuilder();
                StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                String str = File.separator;
                sb = sg.bigo.ads.U.p.a(append, str, "video", sb4, str).append("vpaid").toString();
            } else {
                StringBuilder sb5 = new StringBuilder();
                StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                String str2 = File.separator;
                sb = sg.bigo.ads.U.p.a(append2, str2, "video", sb5, str2).append("files").toString();
            }
            return sb3.append(sb).append(File.separator).append(d()).toString();
        }
        sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
        sg.bigo.ads.o1.e eVar = nVar.k;
        if (eVar == null) {
            eVar = new sg.bigo.ads.o1.e();
            nVar.k = eVar;
        }
        String k = k();
        if (o()) {
            StringBuilder sb6 = new StringBuilder();
            StringBuilder append3 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
            String str3 = File.separator;
            sb2 = sg.bigo.ads.U.p.a(append3, str3, "video", sb6, str3).append("vpaid").toString();
        } else {
            StringBuilder sb7 = new StringBuilder();
            StringBuilder append4 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
            String str4 = File.separator;
            sb2 = sg.bigo.ads.U.p.a(append4, str4, "video", sb7, str4).append("files").toString();
        }
        String d = d();
        File file = new File(sb2, d);
        if (file.exists()) {
            pair = new Pair(Uri.fromFile(file).toString(), 1);
        } else if (eVar.b()) {
            StringBuilder sb8 = new StringBuilder(k);
            if (k.contains("?")) {
                sb8.append(U3.j.c);
            } else {
                sb8.append("?");
            }
            sb8.append("path=").append(sb2).append("&name=");
            sb8.append(d);
            Locale locale = Locale.US;
            int i = eVar.e;
            String sb9 = sb8.toString();
            try {
                sb9 = URLEncoder.encode(sb9, C4761z5.O);
            } catch (UnsupportedEncodingException e) {
                AbstractC5496a.a("StringUtils", "Error encoding url, error message is : " + e.toString());
            }
            pair = new Pair("http://127.0.0.1:" + i + "/" + sb9, 2);
        } else {
            pair = new Pair(k, 3);
        }
        this.F0 = ((Integer) pair.second).intValue();
        return (String) pair.first;
    }

    public final String c() {
        sg.bigo.ads.z1.p pVar = this.D0;
        if (pVar != null && !I.a((CharSequence) pVar.r)) {
            return this.D0.r;
        }
        if (!I.a((CharSequence) this.h)) {
            return this.h;
        }
        m mVar = this.X;
        return (mVar == null || I.a((CharSequence) mVar.c)) ? this.h : this.X.c;
    }

    public final String d() {
        String j = j();
        return I.a((CharSequence) j) ? "" + hashCode() : j;
    }

    public final String e() {
        h hVar;
        h[] hVarArr = this.z0;
        if (hVarArr == null || hVarArr.length <= 0 || (hVar = hVarArr[0]) == null) {
            return null;
        }
        return hVar.c;
    }

    public final String f() {
        String e;
        if (!I.a((CharSequence) this.H0)) {
            return this.H0;
        }
        if (p()) {
            sg.bigo.ads.z1.p pVar = this.D0;
            sg.bigo.ads.z1.c cVar = pVar != null ? pVar.o : null;
            if (cVar != null) {
                this.H0 = cVar.d;
            }
            if (!I.a((CharSequence) this.H0)) {
                return this.H0;
            }
            e = k();
        } else {
            e = e();
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(e));
        this.H0 = mimeTypeFromExtension;
        return mimeTypeFromExtension;
    }

    public final String g() {
        sg.bigo.ads.z1.p pVar = this.D0;
        if (pVar != null && !I.a((CharSequence) pVar.q)) {
            return this.D0.q;
        }
        if (!I.a((CharSequence) this.g)) {
            return this.g;
        }
        m mVar = this.X;
        return (mVar == null || I.a((CharSequence) mVar.b)) ? this.g : this.X.b;
    }

    public final String h() {
        return !TextUtils.isEmpty(this.X0) ? this.X0 : String.valueOf(this.m);
    }

    public final long i() {
        sg.bigo.ads.z1.p pVar = this.D0;
        if (pVar != null) {
            return pVar.s;
        }
        return 0L;
    }

    public final String j() {
        sg.bigo.ads.z1.p pVar = this.D0;
        sg.bigo.ads.z1.c cVar = pVar != null ? pVar.o : null;
        String str = cVar != null ? cVar.e : null;
        if (!I.a((CharSequence) str)) {
            return str;
        }
        sg.bigo.ads.z1.p pVar2 = this.D0;
        if (pVar2 != null) {
            return pVar2.p;
        }
        return null;
    }

    public final String k() {
        sg.bigo.ads.z1.p pVar = this.D0;
        sg.bigo.ads.z1.c cVar = pVar != null ? pVar.o : null;
        if (cVar != null) {
            return cVar.c;
        }
        return null;
    }

    public final boolean l() {
        sg.bigo.ads.z1.a aVar = this.N0;
        return aVar != null && aVar.a();
    }

    public final boolean m() {
        sg.bigo.ads.z1.a aVar = this.M0;
        return aVar != null && aVar.a();
    }

    public final boolean n() {
        t tVar;
        if (o() || (tVar = this.C0) == null || !tVar.f12582a || tVar.a() >= 100) {
            return false;
        }
        sg.bigo.ads.z1.p pVar = this.D0;
        sg.bigo.ads.z1.c cVar = pVar != null ? pVar.o : null;
        return cVar != null ? "video/mp4".equals(cVar.d) : false;
    }

    public final boolean o() {
        sg.bigo.ads.z1.p pVar = this.D0;
        sg.bigo.ads.z1.c cVar = pVar != null ? pVar.o : null;
        return cVar != null && TextUtils.equals(cVar.d, "application/javascript");
    }

    public final boolean p() {
        return this.k == 2;
    }

    public final void a(sg.bigo.ads.P.r rVar) {
        sg.bigo.ads.P.r rVar2 = this.E0;
        if (rVar2 == null || rVar2.c <= 0 || rVar.c != 0) {
            this.E0 = rVar;
        }
    }

    public final void a(String str) {
        if ("video/mp4".equals(this.H0) || I.a((CharSequence) str)) {
            return;
        }
        this.H0 = str;
    }
}
