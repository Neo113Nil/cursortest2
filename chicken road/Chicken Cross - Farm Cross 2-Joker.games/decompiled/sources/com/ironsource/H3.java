package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class H3 implements R5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7653a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7654a = new a();
        public static final boolean b = false;

        private a() {
        }
    }

    public H3(JSONObject jSONObject) {
        this.f7653a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.R5
    public boolean b() {
        return this.f7653a.optBoolean("clickCheck", false);
    }
}
