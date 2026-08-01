package com.applovin.impl;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class l7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4281a;
    private boolean b;
    private List c;

    public l7(com.applovin.impl.sdk.l lVar) {
        this.f4281a = lVar;
        e5 e5Var = e5.I;
        this.b = ((Boolean) lVar.a(e5Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.l.p()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || lVar.B().U();
        lVar.c(e5Var);
    }

    private void e() {
        com.applovin.impl.sdk.k u = this.f4281a.u();
        if (this.b) {
            u.b(this.c);
        } else {
            u.a(this.c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        List list = this.c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.c == null) {
            return;
        }
        if (list == null || !list.equals(this.c)) {
            this.c = list;
            e();
        }
    }

    public void a() {
        this.f4281a.b(e5.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.m B = this.f4281a.B();
        boolean U = B.U();
        String a2 = B.f().a();
        m.b I = B.I();
        this.b = U || JsonUtils.containsCaseInsensitiveString(a2, jSONArray) || JsonUtils.containsCaseInsensitiveString(I != null ? I.f4481a : null, jSONArray);
    }
}
