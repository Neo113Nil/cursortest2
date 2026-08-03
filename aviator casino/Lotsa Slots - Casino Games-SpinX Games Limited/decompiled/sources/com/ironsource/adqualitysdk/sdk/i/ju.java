package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ju {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jx f2932;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2930 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private android.os.Handler f2929 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jr f2931 = new com.ironsource.adqualitysdk.sdk.i.js() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.4
        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8299(com.ironsource.adqualitysdk.sdk.i.ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8299(com.ironsource.adqualitysdk.sdk.i.ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8303(com.ironsource.adqualitysdk.sdk.i.ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8302(com.ironsource.adqualitysdk.sdk.i.ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8299(com.ironsource.adqualitysdk.sdk.i.ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8299(com.ironsource.adqualitysdk.sdk.i.ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            com.ironsource.adqualitysdk.sdk.i.ju.m8299(com.ironsource.adqualitysdk.sdk.i.ju.this);
        }
    };

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8301(com.ironsource.adqualitysdk.sdk.i.ju juVar) {
        juVar.f2930 = true;
        return true;
    }

    public ju(com.ironsource.adqualitysdk.sdk.i.jx jxVar) {
        this.f2932 = jxVar;
        com.ironsource.adqualitysdk.sdk.i.jt.m8287().m8292(this.f2931);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8304() {
        this.f2929.removeCallbacksAndMessages(null);
        if (this.f2931 != null) {
            com.ironsource.adqualitysdk.sdk.i.jt.m8287().m8288(this.f2931);
            this.f2931 = null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m8299(com.ironsource.adqualitysdk.sdk.i.ju juVar) {
        juVar.f2929.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8303(com.ironsource.adqualitysdk.sdk.i.ju juVar, android.app.Activity activity) {
        if (juVar.f2930) {
            juVar.f2930 = false;
            com.ironsource.adqualitysdk.sdk.i.jx jxVar = juVar.f2932;
            if (jxVar != null) {
                jxVar.mo5963(activity);
            }
        }
        juVar.f2929.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8302(com.ironsource.adqualitysdk.sdk.i.ju juVar, final android.app.Activity activity) {
        juVar.f2929.postDelayed(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.ju.m8301(com.ironsource.adqualitysdk.sdk.i.ju.this);
                if (com.ironsource.adqualitysdk.sdk.i.ju.this.f2932 != null) {
                    com.ironsource.adqualitysdk.sdk.i.ju.this.f2932.mo5964(activity);
                }
            }
        }, 500L);
    }
}
