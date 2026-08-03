package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class o extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.ISBannerSize f6454a;
    private java.lang.String b;
    private boolean c;
    private com.ironsource.mediationsdk.o.a d;

    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public o(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.f6454a = iSBannerSize == null ? com.ironsource.mediationsdk.ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.c = true;
        this.f6454a = null;
        this.b = null;
        this.d = null;
        com.ironsource.C3357x2.a().a((com.ironsource.Aa) null);
    }

    public boolean b() {
        return this.c;
    }

    protected com.ironsource.mediationsdk.o c() {
        com.ironsource.mediationsdk.o oVar = new com.ironsource.mediationsdk.o(getContext(), this.f6454a);
        oVar.b = this.b;
        return oVar;
    }

    public com.ironsource.mediationsdk.ISBannerSize getSize() {
        return this.f6454a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.ironsource.mediationsdk.o.a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        this.f6454a = iSBannerSize;
    }

    public o(android.content.Context context, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.f6454a = iSBannerSize == null ? com.ironsource.mediationsdk.ISBannerSize.BANNER : iSBannerSize;
    }

    public o(android.content.Context context) {
        super(context);
        this.c = false;
    }
}
