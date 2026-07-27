package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.Aa;
import com.ironsource.C4686v2;

/* loaded from: classes6.dex */
public class o extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ISBannerSize f8426a;
    private String b;
    private boolean c;
    private a d;

    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.f8426a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.c = true;
        this.f8426a = null;
        this.b = null;
        this.d = null;
        C4686v2.a().a((Aa) null);
    }

    public boolean b() {
        return this.c;
    }

    protected o c() {
        o oVar = new o(getContext(), this.f8426a);
        oVar.b = this.b;
        return oVar;
    }

    public ISBannerSize getSize() {
        return this.f8426a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f8426a = iSBannerSize;
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.f8426a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.c = false;
    }
}
