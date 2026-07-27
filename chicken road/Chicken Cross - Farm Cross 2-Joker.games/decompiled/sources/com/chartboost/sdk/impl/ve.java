package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.a;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.ironsource.Y1;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ve {

    /* renamed from: a, reason: collision with root package name */
    public final ff f5046a;
    public final o8 b;
    public final lf c;
    public final p8 d;
    public final q8 e;
    public final ih f;
    public final n8 g;
    public final String h;
    public a.b i;

    public ve(ff ffVar, o8 o8Var, lf lfVar, p8 p8Var, q8 q8Var, ih ihVar, n8 n8Var, String str) {
        this.f5046a = ffVar;
        this.b = o8Var;
        this.c = lfVar;
        this.d = p8Var;
        this.e = q8Var;
        this.f = ihVar;
        this.g = n8Var;
        this.h = str;
    }

    public void a(a.b bVar) {
        this.i = bVar;
    }

    public void b(String str) {
        lf lfVar = this.c;
        if (lfVar != null) {
            lfVar.a(str);
        }
    }

    public int c() {
        return !d().equals(Y1.f) ? 1 : 0;
    }

    public String d() {
        DataUseConsent a2 = this.b.a("gdpr");
        return a2 == null ? Y1.f : (String) a2.getConsent();
    }

    public JSONObject e() {
        List f = f();
        p8 p8Var = this.d;
        if (p8Var == null || f == null) {
            return null;
        }
        return p8Var.a(f);
    }

    public List f() {
        a.b bVar;
        q8 q8Var = this.e;
        if (q8Var == null || (bVar = this.i) == null) {
            return null;
        }
        return q8Var.a(bVar);
    }

    public we g() {
        return new we(Integer.valueOf(a()), f(), Integer.valueOf(c()), b(), e(), d(), this.f.a(), this.g.b(), this.g.a());
    }

    public void a(DataUseConsent dataUseConsent) {
        ff ffVar = this.f5046a;
        if (ffVar != null) {
            ffVar.a(dataUseConsent);
        }
    }

    public Integer b() {
        COPPA coppa = (COPPA) a(COPPA.COPPA_STANDARD);
        if (coppa == null) {
            return null;
        }
        if (coppa.getConsent().booleanValue()) {
            return 1;
        }
        return 0;
    }

    public DataUseConsent a(String str) {
        o8 o8Var = this.b;
        if (o8Var != null) {
            return o8Var.a(str);
        }
        return null;
    }

    public int a() {
        return d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }
}
