package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class G3 implements R5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7634a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7635a = new a();
        public static final boolean b = false;
        public static final String c = "curlError";

        private a() {
        }
    }

    public G3(JSONObject jSONObject) {
        this.f7634a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.R5
    public boolean b() {
        return this.f7634a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f7634a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f7634a.optBoolean("reportController", true);
    }
}
