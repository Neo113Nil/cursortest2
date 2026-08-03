package com.ironsource;

/* loaded from: classes5.dex */
public final class Y6 implements com.ironsource.U6 {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f6090a;

    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Y6.a f6091a = new com.ironsource.Y6.a();
        private static final int c = com.ironsource.Z6.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public Y6(org.json.JSONObject jSONObject) {
        this.f6090a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U6
    public long a() {
        return this.f6090a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.f6090a.optBoolean(com.ironsource.mediationsdk.metadata.a.j, false);
    }

    @Override // com.ironsource.U6
    public com.ironsource.Z6 c() {
        return com.ironsource.Z6.b.a(this.f6090a.optInt(com.ironsource.X3.f.e, com.ironsource.Y6.a.f6091a.a()));
    }
}
