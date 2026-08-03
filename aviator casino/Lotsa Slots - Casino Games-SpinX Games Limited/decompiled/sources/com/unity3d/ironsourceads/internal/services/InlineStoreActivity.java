package com.unity3d.ironsourceads.internal.services;

/* loaded from: classes5.dex */
public class InlineStoreActivity extends android.app.Activity {
    private static final java.lang.String c = "InlineStoreActivity";
    private static final int d = 1001;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.v f8016a;
    private boolean b = false;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final java.lang.String f8017a = "inline_store_intent";
        static final java.lang.String b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.InterfaceC3068h f8018a;
        private android.content.Intent b;

        public b(com.ironsource.InterfaceC3068h interfaceC3068h) {
            this.f8018a = interfaceC3068h;
        }

        public com.unity3d.ironsourceads.internal.services.InlineStoreActivity.b a(android.content.Intent intent) {
            this.b = intent;
            return this;
        }

        public android.content.Intent a(android.content.Context context) {
            android.content.Intent a2 = this.f8018a.a(context);
            a2.putExtra("inline_store_intent", this.b);
            return a2;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    private void b() {
        requestWindowFeature(1);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            com.ironsource.sdk.controller.v vVar = this.f8016a;
            if (vVar != null) {
                vVar.a(i2, this.b);
            }
            java.util.Map<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
            java.lang.String str = "resultCode:" + i2;
            if (this.b) {
                str = str + ",destroyCalled:true";
            }
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
            a(com.ironsource.EnumC3378y5.INLINE_STORE_CLOSED, hashMap);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(c, "onCreate()");
        try {
            this.f8016a = (com.ironsource.sdk.controller.v) com.ironsource.O9.b((android.content.Context) this).a().k();
            b();
            a();
            a((android.content.Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            com.ironsource.sdk.controller.v vVar = this.f8016a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(com.ironsource.EnumC3378y5.INLINE_STORE_ACTIVITY_FAILED, (java.util.Map<java.lang.String, java.lang.Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.ironsource.sdk.controller.v vVar = this.f8016a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.b = true;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ironsource.sdk.controller.v vVar = this.f8016a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void a(android.content.Intent intent) {
        startActivityForResult(intent, 1001);
        com.ironsource.sdk.controller.v vVar = this.f8016a;
        if (vVar != null) {
            vVar.z();
        }
        a(com.ironsource.EnumC3378y5.INLINE_STORE_LAUNCHED, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    private void a(final com.ironsource.EnumC3378y5 enumC3378y5, final java.util.Map<java.lang.String, java.lang.Object> map) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ironsourceads.internal.services.InlineStoreActivity.a(map, enumC3378y5);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.util.Map map, com.ironsource.EnumC3378y5 enumC3378y5) {
        try {
            java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
            java.lang.String str = "strategy:" + com.ironsource.EnumC3131k9.APP_ACTIVITY.b();
            java.lang.Object obj = hashMap.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.String) obj)) {
                hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            } else {
                hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
            }
            com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(enumC3378y5, new org.json.JSONObject(hashMap)));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }
}
