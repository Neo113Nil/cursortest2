package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545bj extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C1135yf f7948b;

    public C0545bj(C0608e5 c0608e5) {
        this(c0608e5, C1027ua.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(w5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f7948b.b(C1058vf.a(jSONObject));
        return false;
    }

    public C0545bj(C0608e5 c0608e5, C1135yf c1135yf) {
        super(c0608e5);
        this.f7948b = c1135yf;
    }
}
