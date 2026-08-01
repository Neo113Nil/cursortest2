package sg.bigo.ads.N;

import java.util.Map;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.T0.p;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12465a;
    public final String b;
    public int c;
    public int d;
    public int e;
    public long f;
    public String g;
    public final c h = new c();

    public d(String str, String str2) {
        this.f12465a = str;
        this.b = str2;
    }

    public abstract int a();

    public boolean a(int i) {
        return i != a();
    }

    public Map b() {
        return null;
    }

    public p c() {
        return null;
    }

    public final String d() {
        String str = this.f12465a;
        return str != null ? str.trim() : "";
    }

    public sg.bigo.ads.P.d e() {
        if (I.a((CharSequence) this.f12465a)) {
            return new sg.bigo.ads.P.d(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public d f() {
        return null;
    }
}
