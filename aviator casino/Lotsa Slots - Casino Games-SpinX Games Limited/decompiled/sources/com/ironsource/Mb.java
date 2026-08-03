package com.ironsource;

/* loaded from: classes5.dex */
public final class Mb {
    public static final com.ironsource.Mb.a d = new com.ironsource.Mb.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5827a;
    private final java.lang.String b;
    private final org.json.JSONObject c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.Mb a(java.lang.String jsonStr) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String adId = jSONObject.getString(com.ironsource.sdk.controller.f.b.c);
            java.lang.String command = jSONObject.getString(com.ironsource.sdk.controller.f.b.g);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(command, "command");
            return new com.ironsource.Mb(adId, command, optJSONObject);
        }

        private a() {
        }
    }

    public Mb(java.lang.String adId, java.lang.String command, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        this.f5827a = adId;
        this.b = command;
        this.c = jSONObject;
    }

    public final java.lang.String a() {
        return this.f5827a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final org.json.JSONObject c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.f5827a;
    }

    public final java.lang.String e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Mb)) {
            return false;
        }
        com.ironsource.Mb mb = (com.ironsource.Mb) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5827a, mb.f5827a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, mb.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, mb.c);
    }

    public final org.json.JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((this.f5827a.hashCode() * 31) + this.b.hashCode()) * 31;
        org.json.JSONObject jSONObject = this.c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public java.lang.String toString() {
        return "MessageToNative(adId=" + this.f5827a + ", command=" + this.b + ", params=" + this.c + ")";
    }

    public final com.ironsource.Mb a(java.lang.String adId, java.lang.String command, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        return new com.ironsource.Mb(adId, command, jSONObject);
    }

    public static /* synthetic */ com.ironsource.Mb a(com.ironsource.Mb mb, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mb.f5827a;
        }
        if ((i & 2) != 0) {
            str2 = mb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = mb.c;
        }
        return mb.a(str, str2, jSONObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.Mb a(java.lang.String str) throws org.json.JSONException {
        return d.a(str);
    }
}
