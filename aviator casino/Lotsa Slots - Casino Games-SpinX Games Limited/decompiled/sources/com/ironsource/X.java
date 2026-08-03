package com.ironsource;

/* loaded from: classes5.dex */
public interface X {

    public static final class a implements com.ironsource.X {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f6051a;
        private final com.ironsource.InterfaceC3398z7 b;

        public a(org.json.JSONObject applicationConfig, com.ironsource.InterfaceC3398z7 epService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(epService, "epService");
            this.f6051a = applicationConfig;
            this.b = epService;
        }

        @Override // com.ironsource.X
        public java.lang.String a() {
            java.lang.String a2 = this.b.a();
            if (kotlin.text.StringsKt.isBlank(a2)) {
                a2 = null;
            }
            if (a2 != null) {
                return a2;
            }
            java.lang.String it = this.f6051a.optString("controllerUrl");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.lang.String str = kotlin.text.StringsKt.isBlank(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        public org.json.JSONObject b() {
            org.json.JSONObject optJSONObject = this.f6051a.optJSONObject("controllerConfig");
            return optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        }

        @Override // com.ironsource.X
        public int c() {
            int optInt = this.f6051a.optInt("debugMode", 0);
            if (this.f6051a.optBoolean(com.ironsource.X.b.e, false)) {
                return 3;
            }
            return optInt;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.X.b f6052a = new com.ironsource.X.b();
        public static final java.lang.String b = "controllerUrl";
        public static final java.lang.String c = "controllerConfig";
        public static final java.lang.String d = "debugMode";
        public static final java.lang.String e = "adptDebugMode";

        private b() {
        }
    }

    java.lang.String a();

    org.json.JSONObject b();

    int c();
}
