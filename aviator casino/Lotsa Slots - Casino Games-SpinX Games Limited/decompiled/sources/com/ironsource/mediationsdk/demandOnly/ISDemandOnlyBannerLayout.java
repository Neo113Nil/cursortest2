package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class ISDemandOnlyBannerLayout extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private android.view.View f6411a;
    private com.ironsource.mediationsdk.ISBannerSize b;
    private java.lang.String c;
    private android.app.Activity d;
    private boolean e;
    private com.ironsource.C3339w2 f;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f6412a;
        final /* synthetic */ android.widget.FrameLayout.LayoutParams b;

        a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
            this.f6412a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.this.removeAllViews();
            android.view.ViewParent parent = this.f6412a.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f6412a);
            }
            com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.this;
            android.view.View view = this.f6412a;
            iSDemandOnlyBannerLayout.f6411a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? com.ironsource.mediationsdk.ISBannerSize.BANNER : iSBannerSize;
        this.f = new com.ironsource.C3339w2();
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.f6411a = null;
        removeBannerListener();
    }

    public android.app.Activity getActivity() {
        return this.d;
    }

    public com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public android.view.View getBannerView() {
        return this.f6411a;
    }

    public com.ironsource.C3339w2 getListener() {
        return this.f;
    }

    public java.lang.String getPlacementName() {
        return this.c;
    }

    public com.ironsource.mediationsdk.ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        this.f.b((com.ironsource.C3339w2) null);
    }

    public void setBannerDemandOnlyListener(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        this.f.b((com.ironsource.C3339w2) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(java.lang.String str) {
        this.c = str;
    }

    void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.a(view, layoutParams));
    }

    private ISDemandOnlyBannerLayout(android.content.Context context) {
        super(context);
        this.e = false;
    }
}
