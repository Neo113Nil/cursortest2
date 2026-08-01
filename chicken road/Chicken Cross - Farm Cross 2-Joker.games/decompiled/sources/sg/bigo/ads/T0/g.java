package sg.bigo.ads.T0;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.u;
import sg.bigo.ads.P.v;
import sg.bigo.ads.P.w;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.v0.C5494a;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g extends sg.bigo.ads.U.e {
    public String A;
    public final sg.bigo.ads.P.q B;
    public final sg.bigo.ads.P.p C;
    public final v D;
    public final w E;
    public String F;
    public HashMap G;
    public String H;
    public String I;
    public final e J;
    public final f K;
    public final c L;
    public int M;
    public int N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public String W;
    public final u X;
    public final C5123a Y;
    public final sg.bigo.ads.t1.b Z;
    public final sg.bigo.ads.g1.a a0;
    public sg.bigo.ads.U.a e;
    public sg.bigo.ads.U.a f;
    public C5494a g;
    public sg.bigo.ads.U.a h;
    public long i;
    public boolean j;
    public long k;
    public int l;
    public String m;
    public String n;
    public int o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public int x;
    public boolean y;
    public String z;

    public g(Context context) {
        super(context);
        this.o = 1;
        this.B = new sg.bigo.ads.P.q();
        this.C = new sg.bigo.ads.P.p();
        this.D = new v();
        this.E = new w();
        this.G = new HashMap();
        this.J = new e();
        this.K = new f();
        this.L = new c();
        this.U = 0;
        this.V = 0;
        this.X = new u();
        this.Y = new C5123a();
        this.Z = new sg.bigo.ads.t1.b();
        this.a0 = new sg.bigo.ads.g1.a();
    }

    @Override // sg.bigo.ads.U.e
    public final String a() {
        return "bigoad_config.dat";
    }

    @Override // sg.bigo.ads.U.e
    public final String b() {
        return "GlobalConfigData";
    }

    public final sg.bigo.ads.U.a c() {
        if (this.h == null) {
            this.h = sg.bigo.ads.U.a.d;
        }
        if (this.h.a()) {
            AbstractC5446j.a(0, new j(this));
        }
        return this.h;
    }

    public final sg.bigo.ads.U.a d() {
        if (this.f == null) {
            this.f = sg.bigo.ads.U.a.d;
        }
        if (this.f.a()) {
            AbstractC5446j.a(0, new i(this));
        }
        return this.f;
    }

    public final sg.bigo.ads.U.a e() {
        if (this.e == null) {
            this.e = sg.bigo.ads.U.a.d;
        }
        if (this.e.a()) {
            AbstractC5446j.a(0, new h(this));
        }
        return this.e;
    }

    public final String toString() {
        return "GlobalConfigData{huaweiAdIdInfo=" + this.e + ", googleAdIdInfo=" + this.f + ", location=" + this.g + ", state=" + this.j + ", configId=" + this.k + ", interval=" + this.l + ", token='" + this.m + "', antiBan='" + this.n + "', strategy=" + this.o + ", abflags='" + this.p + "', country='" + this.q + "', creatives='" + this.r + "', trackConfig='" + this.s + "', callbackConfig='" + this.t + "', reportConfig='" + this.u + "', appCheckConfig='" + this.v + "', uid='" + this.w + "', maxRequestNum=" + this.x + ", negFeedbackState=" + this.y + ", omUrl='" + this.z + "', globalSwitch=" + this.B.f12489a + ", bannerJsUrl='" + this.A + "', reqCountry='" + this.I + "', appFlag='" + this.M + "'}";
    }

    public final void a(JSONObject jSONObject) {
        sg.bigo.ads.g1.a aVar = this.a0;
        if (jSONObject == null) {
            aVar.f12797a = 10;
            aVar.b = 900000;
            aVar.c = 259200000;
            return;
        }
        aVar.getClass();
        aVar.f12797a = jSONObject.optInt("num", 10);
        int optInt = jSONObject.optInt("interval") * 1000;
        aVar.b = optInt;
        if (optInt == 0) {
            aVar.b = 900000;
        }
        aVar.c = jSONObject.optInt("expired") * 1000;
        aVar.d = jSONObject.optInt("imp_clk_independent", 0) == 1;
        aVar.e = jSONObject.optInt("imp_clk_independent_num", 1);
    }

    @Override // sg.bigo.ads.U.e
    public final void b(Context context) {
        this.b = true;
        toString();
        if (!TextUtils.isEmpty(this.t)) {
            try {
                a(new JSONObject(this.t));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.s)) {
            try {
                JSONObject jSONObject = new JSONObject(this.s);
                u uVar = this.X;
                uVar.f12493a = true;
                uVar.b = jSONObject.optString("http_succ_code");
                uVar.c = jSONObject.optInt("retry_cnt", 3);
                int optInt = jSONObject.optInt("retry_interval") * 1000;
                uVar.d = optInt;
                if (optInt < 20000) {
                    uVar.d = 20000;
                }
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.r)) {
            try {
                b(new JSONObject(this.r));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.u)) {
            return;
        }
        try {
            c(new JSONObject(this.u));
        } catch (JSONException unused4) {
        }
    }

    public final void c(JSONObject jSONObject) {
        sg.bigo.ads.t1.b bVar = this.Z;
        if (jSONObject == null) {
            bVar.f13324a = 10;
            bVar.b = 900000;
            bVar.c.clear();
            return;
        }
        bVar.getClass();
        bVar.f13324a = jSONObject.optInt("delay_num", 10);
        int optInt = jSONObject.optInt("delay_interval") * 1000;
        bVar.b = optInt;
        if (optInt == 0) {
            bVar.b = 900000;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("event_config");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            sg.bigo.ads.t1.a aVar = new sg.bigo.ads.t1.a();
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                AbstractC5496a.a("Stats", "eventConfig is null.");
            } else {
                aVar.f13323a = optJSONObject.optString("event_id");
                aVar.b = optJSONObject.optInt("status") == 1;
                aVar.c = optJSONObject.optInt("delay") == 1;
                int optInt2 = optJSONObject.optInt("expired") * 1000;
                aVar.d = optInt2;
                if (optInt2 == 0) {
                    aVar.d = 86400000;
                }
            }
            if (!I.a((CharSequence) aVar.f13323a)) {
                bVar.c.put(aVar.f13323a, aVar);
            }
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.Q = jSONObject.optInt("host_retry", 0);
            this.R = jSONObject.optInt("retry_times", 3);
            this.S = jSONObject.optInt("retry_interval", 60);
            this.T = jSONObject.optInt("next_retry_interval", 7);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        String readString;
        this.e = new sg.bigo.ads.U.a(parcel);
        this.f = new sg.bigo.ads.U.a(parcel);
        this.g = new C5494a(parcel);
        this.j = parcel.readInt() != 0;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = parcel.readInt() != 0;
        this.z = parcel.readString();
        this.i = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            sg.bigo.ads.P.q qVar = this.B;
            qVar.getClass();
            qVar.f12489a = parcel.readLong();
        }
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.C.a(parcel);
        }
        this.F = parcel.dataAvail() > 0 ? parcel.readString() : "";
        HashMap hashMap = new HashMap();
        if (parcel.dataAvail() > 0) {
            hashMap = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                    sg.bigo.ads.O.b bVar = new sg.bigo.ads.O.b();
                    if (sg.bigo.ads.U.n.a(parcel, bVar) && (readString = parcel.readString()) != null) {
                        hashMap.put(readString, bVar);
                    }
                }
            }
        }
        this.G = hashMap;
        this.H = parcel.dataAvail() > 0 ? parcel.readString() : "";
        if (parcel.dataAvail() > 0) {
            this.D.a(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.E.a(parcel);
        }
        this.I = parcel.dataAvail() > 0 ? parcel.readString() : "";
        sg.bigo.ads.U.n.a(parcel, this.J);
        this.M = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        sg.bigo.ads.U.n.a(parcel, this.L);
        this.N = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.O = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.h = new sg.bigo.ads.U.a(parcel);
        this.U = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.V = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        String readString2 = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.P = readString2;
        a(readString2);
        sg.bigo.ads.U.n.a(parcel, this.K);
        this.W = parcel.dataAvail() > 0 ? parcel.readString() : "";
    }

    public final void b(JSONObject jSONObject) {
        C5123a c5123a = this.Y;
        if (jSONObject == null) {
            c5123a.f12796a = 3;
            c5123a.b = 20;
            c5123a.c = 40;
            c5123a.d = 432000000L;
            c5123a.e = false;
            return;
        }
        c5123a.getClass();
        c5123a.e = jSONObject.optInt("retry", 0) == 1;
        c5123a.f12796a = jSONObject.optInt("download_parallel_num", 3);
        int optInt = jSONObject.optInt("num", 20);
        c5123a.b = optInt;
        c5123a.c = optInt * 2;
        long optInt2 = jSONObject.optInt("valid_period") * 1000;
        c5123a.d = optInt2 != 0 ? optInt2 : 432000000L;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        if (this.e == null) {
            this.e = sg.bigo.ads.U.a.d;
        }
        this.e.b(parcel);
        if (this.f == null) {
            this.f = sg.bigo.ads.U.a.d;
        }
        sg.bigo.ads.U.a aVar = this.f;
        parcel.writeString(aVar.f12559a);
        parcel.writeInt(aVar.b ? 1 : 0);
        parcel.writeLong(aVar.c);
        if (this.g == null) {
            this.g = new C5494a();
        }
        this.g.b(parcel);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeString(this.z);
        parcel.writeLong(this.i);
        parcel.writeLong(this.B.f12489a);
        parcel.writeString(this.A);
        this.C.b(parcel);
        parcel.writeString(this.F);
        HashMap hashMap = this.G;
        int size = hashMap == null ? 0 : hashMap.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                sg.bigo.ads.U.g gVar = (sg.bigo.ads.U.g) entry.getValue();
                if (str == null || gVar == null) {
                    parcel.writeInt(0);
                } else {
                    sg.bigo.ads.U.n.b(parcel, gVar);
                    parcel.writeString(str);
                }
            }
        }
        parcel.writeString(this.H);
        this.D.b(parcel);
        parcel.writeString(String.valueOf(this.E.f12495a));
        parcel.writeString(this.I);
        sg.bigo.ads.U.n.b(parcel, this.J);
        parcel.writeInt(this.M);
        sg.bigo.ads.U.n.b(parcel, this.L);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        if (this.h == null) {
            this.h = sg.bigo.ads.U.a.d;
        }
        sg.bigo.ads.U.a aVar2 = this.h;
        parcel.writeString(aVar2.f12559a);
        parcel.writeInt(aVar2.b ? 1 : 0);
        parcel.writeLong(aVar2.c);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeString(this.P);
        sg.bigo.ads.U.n.b(parcel, this.K);
        parcel.writeString(this.W);
    }
}
