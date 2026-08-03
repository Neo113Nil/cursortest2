package com.ironsource;

/* loaded from: classes5.dex */
public final class Ze {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.Y5 f6121a;

    private final class a extends com.ironsource.Ye {
        public a() {
        }

        @Override // com.ironsource.Ye, java.lang.Runnable
        public void run() {
            org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(false);
            try {
                b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, a());
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.ironsource.C3010dd.P.a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(com.ironsource.InterfaceC3129k7 applicationLifecycleService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f6121a = new com.ironsource.Y5(applicationLifecycleService, new com.ironsource.Ze.a());
    }
}
