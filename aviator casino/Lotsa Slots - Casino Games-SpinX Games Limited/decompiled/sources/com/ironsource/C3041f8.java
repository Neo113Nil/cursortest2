package com.ironsource;

/* renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3041f8 extends android.widget.FrameLayout implements com.ironsource.G8 {
    private static final java.lang.String b = "IronSourceAdContainer";

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C3130k8 f6255a;

    /* renamed from: com.ironsource.f8$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6256a;
        final /* synthetic */ java.lang.String b;

        a(java.lang.String str, java.lang.String str2) {
            this.f6256a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3041f8 c3041f8 = com.ironsource.C3041f8.this;
            c3041f8.removeView(c3041f8.f6255a.getPresentingView());
            com.ironsource.C3041f8.this.f6255a.a(this.f6256a, this.b);
            com.ironsource.C3041f8.this.f6255a = null;
        }
    }

    public C3041f8(android.content.Context context) {
        super(context);
    }

    private void b() throws java.lang.Exception {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = this.f6255a.b().a().getJSONObject(com.ironsource.C3023e8.p).getJSONObject(com.ironsource.C3023e8.s);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("adViewId", this.f6255a.a());
        this.f6255a.b().a(com.ironsource.X3.h.S, jSONObject);
    }

    public void a() throws java.lang.Exception {
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        if (c3130k8 == null || c3130k8.b() == null) {
            throw new java.lang.Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.G8
    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        this.f6255a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.G8
    public android.webkit.WebView getPresentingView() {
        return this.f6255a.getPresentingView();
    }

    public com.ironsource.C3005d8 getSize() {
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        return c3130k8 != null ? c3130k8.c() : new com.ironsource.C3005d8();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        com.ironsource.sdk.utils.Logger.i(b, "onVisibilityChanged: " + i);
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        if (c3130k8 == null) {
            return;
        }
        try {
            c3130k8.b().a(com.ironsource.C3023e8.k, i, isShown());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        com.ironsource.sdk.utils.Logger.i(b, "onWindowVisibilityChanged: " + i);
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        if (c3130k8 == null) {
            return;
        }
        try {
            c3130k8.b().a(com.ironsource.C3023e8.l, i, isShown());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public C3041f8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3041f8(com.ironsource.C3130k8 c3130k8, android.content.Context context) {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(c3130k8.c().c(), c3130k8.c().a()));
        this.f6255a = c3130k8;
        addView(c3130k8.getPresentingView());
    }

    @Override // com.ironsource.G8
    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        this.f6255a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.G8
    public synchronized void a(java.lang.String str, java.lang.String str2) {
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        if (c3130k8 != null && c3130k8.b() != null && this.f6255a.getPresentingView() != null) {
            this.f6255a.b().e();
            com.ironsource.Q7.f5934a.d(new com.ironsource.C3041f8.a(str, str2));
        }
    }

    @Override // com.ironsource.G8
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.ironsource.C3130k8 c3130k8 = this.f6255a;
        if (c3130k8 == null) {
            return;
        }
        c3130k8.a(str, str2, str3);
    }

    @Override // com.ironsource.G8
    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        this.f6255a.b(jSONObject, str, str2);
    }
}
