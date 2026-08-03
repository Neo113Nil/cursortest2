package com.ironsource;

/* loaded from: classes5.dex */
public interface X1 {

    public static final class a implements com.ironsource.X1 {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f6055a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.X1
        public com.ironsource.mediationsdk.demandOnly.p a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            org.json.JSONObject jSONObject = this.f6055a;
            org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new com.ironsource.mediationsdk.demandOnly.p.a(optString) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(org.json.JSONObject jSONObject) {
            this.f6055a = jSONObject;
        }

        public /* synthetic */ a(org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new org.json.JSONObject() : jSONObject);
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(java.lang.String str);
}
