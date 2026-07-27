package sg.bigo.ads.Y0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class i implements sg.bigo.ads.Q.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f12635a;
    public final sg.bigo.ads.P.c b;
    public final sg.bigo.ads.e.h c;
    public final g d;
    public String e;
    public String f;
    public String g;
    public final int j;
    public final long k;
    public int h = 0;
    public boolean i = false;
    public final ArrayList l = new ArrayList();
    public final AtomicBoolean m = new AtomicBoolean(true);
    public final AtomicBoolean n = new AtomicBoolean(true);
    public boolean o = false;

    public i(String str, sg.bigo.ads.P.c cVar, sg.bigo.ads.e.h hVar, g gVar) {
        long currentTimeMillis;
        this.f12635a = str;
        this.b = cVar;
        this.c = hVar;
        this.d = gVar;
        if (hVar != null) {
            this.j = hVar.M != ((sg.bigo.ads.U0.b) hVar.e()).m ? -1 : hVar.K;
            currentTimeMillis = hVar.M != ((sg.bigo.ads.U0.b) hVar.e()).m ? 0L : hVar.L;
        } else {
            this.j = 0;
            currentTimeMillis = System.currentTimeMillis();
        }
        this.k = currentTimeMillis;
    }

    @Override // sg.bigo.ads.Q.g
    public final String a() {
        return this.f12635a;
    }

    @Override // sg.bigo.ads.Q.g
    public final int c() {
        return 0;
    }

    @Override // sg.bigo.ads.Q.g
    public final int f() {
        return 2;
    }

    @Override // sg.bigo.ads.Q.g
    public final boolean g() {
        g gVar = this.d;
        return gVar != null && gVar.d;
    }

    @Override // sg.bigo.ads.Q.g
    public final int h() {
        return this.j;
    }

    @Override // sg.bigo.ads.Q.g
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.Q.g
    public final Map l() {
        if (!this.i && TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.f)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (this.i) {
            hashMap.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put("chrome_pkg", this.e);
        }
        if (!TextUtils.isEmpty(this.g)) {
            hashMap.put("is_chrome_def", TextUtils.equals(this.e, this.g) ? "1" : "0");
        }
        if (TextUtils.isEmpty(this.f)) {
            return hashMap;
        }
        hashMap.put("chrome_ver", this.f);
        return hashMap;
    }

    @Override // sg.bigo.ads.Q.g
    public final int m() {
        return 0;
    }

    @Override // sg.bigo.ads.Q.g
    public final int n() {
        return this.o ? 100 : 0;
    }

    public final void a(int i) {
        h hVar = new h(i, this.k);
        this.l.add(0, hVar);
        sg.bigo.ads.s1.b.a(this, hVar, this.b, this.c, (String) null);
    }
}
