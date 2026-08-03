package com.ironsource;

/* loaded from: classes5.dex */
public final class A8 implements com.ironsource.E8 {
    public static final com.ironsource.A8.a j = new com.ironsource.A8.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5611a;
    private final com.ironsource.Tb b;
    private final com.ironsource.InterfaceC3255r8 c;
    private com.ironsource.C8 d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.Long g;
    private com.ironsource.E8.a h;
    private com.ironsource.F8 i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.A8 a() {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = com.ironsource.sdk.IronSourceNetwork.getControllerManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new com.ironsource.A8(uuid, new com.ironsource.Sb(uuid, controllerManager, null, null, 12, null), new com.ironsource.C3273s8());
        }

        private a() {
        }
    }

    public A8(java.lang.String id, com.ironsource.Tb controller, com.ironsource.InterfaceC3255r8 eventTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "controller");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f5611a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ironsource.C3238q8 d() {
        com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.x, this.f).a(com.ironsource.B5.v, this.e).a(com.ironsource.B5.w, com.ironsource.C3202o8.e.NativeAd.toString()).a(com.ironsource.B5.I, java.lang.Long.valueOf(j()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a2;
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.A8 e() {
        return j.a();
    }

    private final com.ironsource.A8.b f() {
        return new com.ironsource.A8.b();
    }

    private final com.ironsource.A8.c g() {
        return new com.ironsource.A8.c();
    }

    private final long j() {
        java.lang.Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return java.util.Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final java.lang.String h() {
        return this.e;
    }

    public final java.lang.String i() {
        return this.f;
    }

    @Override // com.ironsource.E8
    public com.ironsource.E8.a b() {
        return this.h;
    }

    @Override // com.ironsource.E8
    public com.ironsource.C8 c() {
        return this.d;
    }

    public static final class b implements com.ironsource.Tb.a {
        b() {
        }

        @Override // com.ironsource.Tb.a
        public void a(com.ironsource.C8 adData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
            com.ironsource.A8.this.d = adData;
            com.ironsource.InterfaceC3255r8 interfaceC3255r8 = com.ironsource.A8.this.c;
            com.ironsource.C3083he.a loadAdSuccess = com.ironsource.C3083he.l;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            java.util.HashMap<java.lang.String, java.lang.Object> a2 = com.ironsource.A8.this.d().a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
            interfaceC3255r8.a(loadAdSuccess, a2);
            com.ironsource.E8.a b = com.ironsource.A8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Tb.a
        public void e() {
            com.ironsource.E8.a b = com.ironsource.A8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Tb.a
        public void a(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            com.ironsource.C3238q8 a2 = com.ironsource.A8.this.d().a(com.ironsource.B5.A, reason);
            com.ironsource.InterfaceC3255r8 interfaceC3255r8 = com.ironsource.A8.this.c;
            com.ironsource.C3083he.a loadAdFailed = com.ironsource.C3083he.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            java.util.HashMap<java.lang.String, java.lang.Object> a3 = a2.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "eventParams.data");
            interfaceC3255r8.a(loadAdFailed, a3);
            com.ironsource.E8.a b = com.ironsource.A8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Tb.a
        public void a() {
            com.ironsource.E8.a b = com.ironsource.A8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.E8
    public void a(com.ironsource.E8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.E8
    public void a(android.app.Activity activity, org.json.JSONObject loadParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = java.lang.Long.valueOf(java.util.Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        com.ironsource.InterfaceC3255r8 interfaceC3255r8 = this.c;
        com.ironsource.C3083he.a loadAd = com.ironsource.C3083he.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        java.util.HashMap<java.lang.String, java.lang.Object> a2 = d().a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        interfaceC3255r8.a(loadAd, a2);
        org.json.JSONObject jSONObject = new org.json.JSONObject(loadParams.toString());
        jSONObject.put(com.ironsource.X3.i.y0, java.lang.String.valueOf(this.g));
        this.b.a(activity, jSONObject);
    }

    public static final class c implements com.ironsource.F8.a {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5614a;

            static {
                int[] iArr = new int[com.ironsource.F8.b.values().length];
                try {
                    iArr[com.ironsource.F8.b.PrivacyIcon.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                f5614a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.F8.a
        public void a(com.ironsource.F8.b viewName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (com.ironsource.A8.c.a.f5614a[viewName.ordinal()] == 1) {
                com.ironsource.A8.this.b.c();
                return;
            }
            org.json.JSONObject clickParams = new org.json.JSONObject().put("viewName", viewName.b());
            com.ironsource.Tb tb = com.ironsource.A8.this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            tb.a(clickParams);
        }

        @Override // com.ironsource.F8.a
        public void a(com.ironsource.Ag viewVisibilityParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            com.ironsource.A8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.E8
    public void a(com.ironsource.F8 viewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.HashMap<java.lang.String, java.lang.Object> a2 = d().a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        linkedHashMap.putAll(a2);
        java.lang.String jSONObject = viewHolder.t().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(com.ironsource.B5.y, jSONObject);
        com.ironsource.InterfaceC3255r8 interfaceC3255r8 = this.c;
        com.ironsource.C3083he.a registerAd = com.ironsource.C3083he.n;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC3255r8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.E8
    public void a() {
        com.ironsource.F8 f8 = this.i;
        if (f8 != null) {
            f8.a((com.ironsource.F8.a) null);
        }
        this.b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ A8(java.lang.String str, com.ironsource.Tb tb, com.ironsource.InterfaceC3255r8 interfaceC3255r8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, tb, interfaceC3255r8);
        if ((i & 1) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }
}
