package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class m extends w2 {
    private final n e;
    private final o f;
    private final n8 g;
    private final String h;
    private final List i;
    private final List j;
    private final List k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends e4 {
        private final n8 p;

        b(n8 n8Var, String str, boolean z) {
            super(n8Var.b().d(), m.this.f4544a);
            this.p = n8Var;
            this.c = StringUtils.createSpannedString(n8Var.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.b = z;
        }

        @Override // com.applovin.impl.v2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public boolean o() {
            return this.b;
        }

        public n8 v() {
            return this.p;
        }
    }

    m(n nVar, o oVar, n8 n8Var, Context context) {
        super(context);
        this.e = nVar;
        this.g = n8Var;
        this.f = oVar != null ? oVar : nVar.f();
        this.h = oVar != null ? oVar.c() : nVar.d();
        this.i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private v2 f() {
        return v2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private v2 g() {
        return v2.a().d("ID").c(this.e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private v2 i() {
        return v2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        n8 n8Var = this.g;
        if (n8Var != null && n8Var.d()) {
            return new ArrayList();
        }
        List<n8> e = this.f.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (n8 n8Var2 : e) {
            n8 n8Var3 = this.g;
            if (n8Var3 == null || n8Var3.b().c().equals(n8Var2.b().c())) {
                arrayList.add(new b(n8Var2, null, this.g == null));
                for (f4 f4Var : n8Var2.c()) {
                    arrayList.add(v2.a().d(f4Var.a()).c(f4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.w2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.w2
    protected List c(int i) {
        return i == a.INFO.ordinal() ? this.i : i == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    @Override // com.applovin.impl.w2
    protected int d(int i) {
        return i == a.INFO.ordinal() ? this.i.size() : i == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    @Override // com.applovin.impl.w2
    protected v2 e(int i) {
        return i == a.INFO.ordinal() ? new a5("INFO") : i == a.BIDDERS.ordinal() ? new a5("BIDDERS") : new a5("WATERFALL");
    }

    public o j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    private v2 d() {
        return v2.a().d("Ad Format").c(this.e.b()).a();
    }

    private List e() {
        n8 n8Var = this.g;
        if (n8Var != null && !n8Var.d()) {
            return new ArrayList();
        }
        List<n8> a2 = this.f.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (n8 n8Var2 : a2) {
            n8 n8Var3 = this.g;
            if (n8Var3 == null || n8Var3.b().c().equals(n8Var2.b().c())) {
                arrayList.add(new b(n8Var2, n8Var2.a() != null ? n8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }
}
