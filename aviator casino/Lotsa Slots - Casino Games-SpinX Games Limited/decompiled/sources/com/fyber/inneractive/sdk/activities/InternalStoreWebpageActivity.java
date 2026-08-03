package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class InternalStoreWebpageActivity extends com.fyber.inneractive.sdk.activities.InneractiveBaseActivity {
    public static final java.lang.String EXTRA_KEY_SPOT_ID = "spotId";
    public android.view.ViewGroup b;
    public com.fyber.inneractive.sdk.web.v0 c;
    public com.fyber.inneractive.sdk.config.global.features.q d = com.fyber.inneractive.sdk.config.global.features.q.FullScreen;

    public static void startActivity(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity.class);
        intent.putExtra("spotId", str);
        if (!(context instanceof android.app.Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
        if (v0Var != null) {
            v0Var.C = false;
            com.fyber.inneractive.sdk.web.t0 t0Var = v0Var.i;
            if (t0Var != null) {
                com.fyber.inneractive.sdk.flow.b0 b0Var = (com.fyber.inneractive.sdk.flow.b0) t0Var;
                com.fyber.inneractive.sdk.util.IAlog.a("onInternalStoreWebpageDismissed callback called", new java.lang.Object[0]);
                if (b0Var.c != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", com.fyber.inneractive.sdk.util.IAlog.a(b0Var));
                    b0Var.c.onAdWillCloseInternalBrowser(b0Var.f3675a);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
        if (v0Var != null) {
            if (v0Var.x) {
                return;
            }
            if (v0Var.w) {
                v0Var.d("navigateBack();");
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.width == com.fyber.inneractive.sdk.util.o.e() || this.d != com.fyber.inneractive.sdk.config.global.features.q.Modal) {
            return;
        }
        attributes.gravity = 83;
        attributes.height = (int) (com.fyber.inneractive.sdk.util.o.d() * 0.8f);
        attributes.width = com.fyber.inneractive.sdk.util.o.e();
        getWindow().setAttributes(attributes);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot spot;
        java.lang.String stringExtra = getIntent().getStringExtra("spotId");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sSpot id is empty", com.fyber.inneractive.sdk.util.IAlog.a(this));
            spot = null;
        } else {
            spot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.config.global.features.r rVar = (com.fyber.inneractive.sdk.config.global.features.r) spot.getAdContent().c.a(com.fyber.inneractive.sdk.config.global.features.r.class);
        com.fyber.inneractive.sdk.config.global.features.q c = rVar != null ? rVar.c() : com.fyber.inneractive.sdk.config.global.features.q.FullScreen;
        this.d = c;
        if (c == com.fyber.inneractive.sdk.config.global.features.q.Modal) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 83;
            attributes.height = (int) (com.fyber.inneractive.sdk.util.o.d() * 0.8f);
            attributes.width = com.fyber.inneractive.sdk.util.o.e();
            attributes.dimAmount = 0.3f;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setBackgroundColor(0);
            getWindow().addFlags(514);
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        } else {
            setTheme(android.R.style.Theme.NoTitleBar.Fullscreen);
        }
        super.onCreate(bundle);
        setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_activity_internal_store_webpage);
        this.b = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.internal_store_content);
        com.fyber.inneractive.sdk.web.v0 a2 = spot.getAdContent().a();
        this.c = a2;
        if (a2 != null) {
            a2.q = new java.lang.ref.WeakReference(this);
            com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.h;
            if (vVar != null) {
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_STORE_PAGE_OPENED, v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP);
            }
            this.c.t.set(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot spot;
        com.fyber.inneractive.sdk.web.v0 v0Var;
        super.onDestroy();
        java.lang.String stringExtra = getIntent().getStringExtra("spotId");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sSpot id is empty", com.fyber.inneractive.sdk.util.IAlog.a(this));
            spot = null;
        } else {
            spot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null || spot.getAdContent().b() || (v0Var = this.c) == null) {
            return;
        }
        v0Var.y = true;
        v0Var.D = false;
        v0Var.b.h.remove(v0Var);
        v0Var.i = null;
        com.fyber.inneractive.sdk.util.IAlog.a("destroy internalStoreWebpageController", new java.lang.Object[0]);
        this.c = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        android.view.ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
        if (v0Var != null) {
            this.b.addView(v0Var.f4361a, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }
}
