package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class InneractiveFullscreenAdActivity extends com.fyber.inneractive.sdk.activities.InneractiveBaseActivity implements com.fyber.inneractive.sdk.interfaces.e {
    public static final java.lang.String EXTRA_KEY_SPOT_ID = "spotId";
    public android.view.ViewGroup b;
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot c;
    public com.fyber.inneractive.sdk.interfaces.f d;
    public com.fyber.inneractive.sdk.ui.CloseButtonFlowManager i;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    protected final java.lang.Runnable mHideNavigationBarTask = new com.fyber.inneractive.sdk.activities.c(this);

    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void destroy() {
        if (isFinishing() || this.b == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void disableCloseButton() {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.c.setVisibility(8);
        closeButtonFlowManager.f4269a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void dismissAd(boolean z) {
        this.h = z;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            fVar.b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public android.view.View getCloseButton() {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager != null) {
            return closeButtonFlowManager.e;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public android.view.ViewGroup getLayout() {
        return this.b;
    }

    public void hideNavigationBar() {
        android.view.View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new com.fyber.inneractive.sdk.activities.e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.f fVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (fVar != 0 && (((com.fyber.inneractive.sdk.flow.b0) fVar) instanceof com.fyber.inneractive.sdk.renderers.v)) {
            setTheme(android.R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) this.c.getAdContent().d;
        if (r0Var.f != null) {
            com.fyber.inneractive.sdk.config.enums.Orientation orientation = r0Var.f.e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean isCloseButtonDisplay() {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        return closeButtonFlowManager != null && closeButtonFlowManager.d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar == null || !fVar.u()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            int i = configuration.orientation;
            if (i != this.e) {
                this.e = i;
                fVar.a();
                return;
            }
            int i2 = this.f;
            int i3 = configuration.screenHeightDp;
            if (i2 == i3 && this.g == configuration.screenWidthDp) {
                return;
            }
            this.f = i3;
            this.g = configuration.screenWidthDp;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("spotId");
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = null;
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", com.fyber.inneractive.sdk.util.IAlog.a(this));
        } else {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot spot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                com.fyber.inneractive.sdk.util.IAlog.b("%sSpot id %s cannot be found in spot manager!", com.fyber.inneractive.sdk.util.IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sSpot does not have a content. Cannot start activity", com.fyber.inneractive.sdk.util.IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.c.getAdContent().d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = this.c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sno appropriate unit controller found for full screen ad. Aborting", com.fyber.inneractive.sdk.util.IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fullscreenRenderer = ((com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        com.fyber.inneractive.sdk.util.IAlog.a("%sInterstitial for spot id %s created", com.fyber.inneractive.sdk.util.IAlog.a(this), this.c.getLocalUniqueId());
        this.e = getResources().getConfiguration().orientation;
        this.f = getResources().getConfiguration().screenHeightDp;
        this.g = getResources().getConfiguration().screenWidthDp;
        if (this.d == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new java.lang.Object[0]);
            finish();
            return;
        }
        try {
            setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_fullscreen_activity);
            this.b = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_ad_content);
            this.i = new com.fyber.inneractive.sdk.ui.CloseButtonFlowManager(this, new com.fyber.inneractive.sdk.activities.d(this));
            ((com.fyber.inneractive.sdk.flow.p0) this.d).initialize(this.c);
            try {
                this.d.a(this, this);
                com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
                if (closeButtonFlowManager != null) {
                    this.d.b(closeButtonFlowManager);
                }
                this.c.getAdContent().e = true;
                com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.c;
                if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof com.fyber.inneractive.sdk.flow.h0) && (this.d instanceof com.fyber.inneractive.sdk.rtb.watermark.a)) {
                    com.fyber.inneractive.sdk.rtb.watermark.b bVar = ((com.fyber.inneractive.sdk.flow.h0) inneractiveAdSpot2).m;
                    if (bVar == null || bVar.f4262a == null || this.b == null) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%sCouldn't add watermark. %s is null", com.fyber.inneractive.sdk.util.IAlog.a(this), bVar == null ? "Watermark" : bVar.f4262a == null ? "Watermark ImageView" : "mContentLayout");
                        return;
                    }
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
                    frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setClickable(false);
                    frameLayout.addView(bVar.f4262a);
                    this.b.addView(frameLayout);
                    ((com.fyber.inneractive.sdk.rtb.watermark.a) this.d).a(frameLayout);
                }
            } catch (android.content.res.Resources.NotFoundException e) {
                com.fyber.inneractive.sdk.util.IAlog.f("Interstitial Activity: %s", e.getMessage());
                finish();
            } catch (com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError e2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Interstitial Activity: %s", e2.getMessage());
                finish();
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.network.z.a(th, this.c.getAdContent().f3765a, this.c.getAdContent().b);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar;
        com.fyber.inneractive.sdk.util.n0 n0Var = com.fyber.inneractive.sdk.util.l0.f4298a;
        n0Var.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%scleanupForDestroyedActivity called for: %s", "IAVisibilityTracker: ", this);
        android.content.Context applicationContext = getApplicationContext();
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) n0Var.b.remove(applicationContext);
        if (weakHashMap != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sRemoved tracking entries for destroyed activity", "IAVisibilityTracker: ");
            weakHashMap.clear();
        }
        n0Var.a(applicationContext);
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager != null) {
            closeButtonFlowManager.c.setOnClickListener(null);
            this.i = null;
        }
        android.view.ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.b = null;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.c;
        com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener)) {
            ((com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        if (!isFinishing() && (fVar = this.d) != null) {
            com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager2 = this.i;
            if (closeButtonFlowManager2 != null) {
                fVar.a(closeButtonFlowManager2);
            }
            this.d.k();
            this.d.destroy();
            this.d = null;
        }
        super.onDestroy();
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
            if (fVar != null) {
                fVar.r();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.d;
        if (fVar2 != null) {
            com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
            if (closeButtonFlowManager != null) {
                fVar2.a(closeButtonFlowManager);
            }
            this.d.k();
            this.d.destroy();
            this.d = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            fVar.m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
            if (fVar != null) {
                fVar.r();
                return;
            }
            return;
        }
        hideNavigationBar();
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.d;
        if (fVar2 != null) {
            fVar2.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void secondEndCardWasDisplayed() {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void setActivityOrientation(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
        if (z && orientation.equals(com.fyber.inneractive.sdk.config.enums.Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z && orientation.equals(com.fyber.inneractive.sdk.config.enums.Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(com.fyber.inneractive.sdk.config.enums.Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(com.fyber.inneractive.sdk.config.enums.Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            setRequestedOrientation(7);
        } else if (i == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseButton(boolean z, int i, int i2) {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        com.fyber.inneractive.sdk.ui.CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.g;
        closeButtonConfiguration.c = z;
        closeButtonConfiguration.d = i;
        closeButtonConfiguration.e = i2;
        closeButtonConfiguration.b = true;
        closeButtonConfiguration.f4268a = false;
        closeButtonConfiguration.g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseCountdown() {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.b.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_round_overlay_bg);
        com.fyber.inneractive.sdk.ui.CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.g;
        closeButtonConfiguration.f4268a = true;
        closeButtonConfiguration.b = false;
        closeButtonConfiguration.g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void updateCloseCountdown(int i) {
        com.fyber.inneractive.sdk.ui.CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        if (i > 0) {
            closeButtonFlowManager.b.setText(java.lang.Integer.toString(i));
        } else {
            closeButtonFlowManager.getClass();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean wasDismissedByUser() {
        return this.h;
    }
}
