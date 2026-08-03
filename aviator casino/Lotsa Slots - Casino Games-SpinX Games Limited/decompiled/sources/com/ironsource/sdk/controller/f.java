package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public interface f {

    public static final class a {
        public static final com.ironsource.sdk.controller.f.a.C0163a c = new com.ironsource.sdk.controller.f.a.C0163a(null);

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6632a;
        private final org.json.JSONObject b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0163a {
            public /* synthetic */ C0163a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.jvm.JvmStatic
            public final com.ironsource.sdk.controller.f.a a(java.lang.String jsonStr) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
                java.lang.String id = jSONObject.getString(com.ironsource.sdk.controller.f.b.b);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "id");
                return new com.ironsource.sdk.controller.f.a(id, optJSONObject);
            }

            private C0163a() {
            }
        }

        public a(java.lang.String msgId, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f6632a = msgId;
            this.b = jSONObject;
        }

        public final java.lang.String a() {
            return this.f6632a;
        }

        public final org.json.JSONObject b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.f6632a;
        }

        public final org.json.JSONObject d() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.sdk.controller.f.a)) {
                return false;
            }
            com.ironsource.sdk.controller.f.a aVar = (com.ironsource.sdk.controller.f.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f6632a, aVar.f6632a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.f6632a.hashCode() * 31;
            org.json.JSONObject jSONObject = this.b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public java.lang.String toString() {
            return "CallbackToNative(msgId=" + this.f6632a + ", params=" + this.b + ")";
        }

        public final com.ironsource.sdk.controller.f.a a(java.lang.String msgId, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new com.ironsource.sdk.controller.f.a(msgId, jSONObject);
        }

        public static /* synthetic */ com.ironsource.sdk.controller.f.a a(com.ironsource.sdk.controller.f.a aVar, java.lang.String str, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f6632a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.b;
            }
            return aVar.a(str, jSONObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.ironsource.sdk.controller.f.a a(java.lang.String str) throws org.json.JSONException {
            return c.a(str);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.sdk.controller.f.b f6633a = new com.ironsource.sdk.controller.f.b();
        public static final java.lang.String b = "msgId";
        public static final java.lang.String c = "adId";
        public static final java.lang.String d = "params";
        public static final java.lang.String e = "success";
        public static final java.lang.String f = "reason";
        public static final java.lang.String g = "command";

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6634a;
        private final java.lang.String b;
        private final org.json.JSONObject c;
        private java.lang.String d;

        public c(java.lang.String adId, java.lang.String command, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            this.f6634a = adId;
            this.b = command;
            this.c = params;
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.d = uuid;
        }

        public final java.lang.String a() {
            return this.f6634a;
        }

        public final java.lang.String b() {
            return this.b;
        }

        public final org.json.JSONObject c() {
            return this.c;
        }

        public final java.lang.String d() {
            return this.f6634a;
        }

        public final java.lang.String e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            com.ironsource.sdk.controller.f.c cVar = obj instanceof com.ironsource.sdk.controller.f.c ? (com.ironsource.sdk.controller.f.c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.d, cVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6634a, cVar.f6634a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c.toString(), cVar.c.toString());
        }

        public final java.lang.String f() {
            return this.d;
        }

        public final org.json.JSONObject g() {
            return this.c;
        }

        public final java.lang.String h() {
            java.lang.String jSONObject = new org.json.JSONObject().put(com.ironsource.sdk.controller.f.b.b, this.d).put(com.ironsource.sdk.controller.f.b.c, this.f6634a).put("params", this.c).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n          .…ms)\n          .toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public java.lang.String toString() {
            return "MessageToController(adId=" + this.f6634a + ", command=" + this.b + ", params=" + this.c + ")";
        }

        public final com.ironsource.sdk.controller.f.c a(java.lang.String adId, java.lang.String command, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            return new com.ironsource.sdk.controller.f.c(adId, command, params);
        }

        public static /* synthetic */ com.ironsource.sdk.controller.f.c a(com.ironsource.sdk.controller.f.c cVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f6634a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.d = str;
        }
    }
}
