package com.ironsource;

import com.ironsource.U3;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class V6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7963a;

    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;

        /* renamed from: a, reason: collision with root package name */
        public static final a f7964a = new a();
        private static final int c = W6.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public V6(JSONObject jSONObject) {
        this.f7963a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.R6
    public long a() {
        return this.f7963a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.R5
    public boolean b() {
        return this.f7963a.optBoolean(com.ironsource.mediationsdk.metadata.a.k, false);
    }

    @Override // com.ironsource.R6
    public W6 c() {
        return W6.b.a(this.f7963a.optInt(U3.f.e, a.f7964a.a()));
    }
}
