package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface X {

    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f8000a;
        private final InterfaceC4709w7 b;

        public a(JSONObject applicationConfig, InterfaceC4709w7 epService) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            Intrinsics.checkNotNullParameter(epService, "epService");
            this.f8000a = applicationConfig;
            this.b = epService;
        }

        @Override // com.ironsource.X
        public String a() {
            String a2 = this.b.a();
            if (StringsKt.isBlank(a2)) {
                a2 = null;
            }
            if (a2 != null) {
                return a2;
            }
            String it = this.f8000a.optString("controllerUrl");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String str = StringsKt.isBlank(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        public JSONObject b() {
            JSONObject optJSONObject = this.f8000a.optJSONObject("controllerConfig");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        @Override // com.ironsource.X
        public int c() {
            int optInt = this.f8000a.optInt("debugMode", 0);
            if (this.f8000a.optBoolean(b.e, false)) {
                return 3;
            }
            return optInt;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8001a = new b();
        public static final String b = "controllerUrl";
        public static final String c = "controllerConfig";
        public static final String d = "debugMode";
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    String a();

    JSONObject b();

    int c();
}
