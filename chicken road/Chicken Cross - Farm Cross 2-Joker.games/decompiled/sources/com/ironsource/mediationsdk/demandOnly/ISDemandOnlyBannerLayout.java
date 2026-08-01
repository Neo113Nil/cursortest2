package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4668u2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes6.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f8383a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private C4668u2 f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8384a;
        final /* synthetic */ FrameLayout.LayoutParams b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f8384a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f8384a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8384a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f8384a;
            iSDemandOnlyBannerLayout.f8383a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f = new C4668u2();
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.f8383a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public View getBannerView() {
        return this.f8383a;
    }

    public C4668u2 getListener() {
        return this.f;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f.b((C4668u2) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f.b((C4668u2) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }

    void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.e = false;
    }
}
