package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4370d8 extends FrameLayout implements E8 {
    private static final String b = "IronSourceAdContainer";

    /* renamed from: a, reason: collision with root package name */
    private C4460i8 f8138a;

    /* renamed from: com.ironsource.d8$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8139a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.f8139a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4370d8 c4370d8 = C4370d8.this;
            c4370d8.removeView(c4370d8.f8138a.getPresentingView());
            C4370d8.this.f8138a.a(this.f8139a, this.b);
            C4370d8.this.f8138a = null;
        }
    }

    public C4370d8(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f8138a.b().a().getJSONObject(C4352c8.p).getJSONObject(C4352c8.s);
        } catch (Exception e) {
            C4491k4.d().a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f8138a.a());
        this.f8138a.b().a(U3.h.S, jSONObject);
    }

    public void a() throws Exception {
        C4460i8 c4460i8 = this.f8138a;
        if (c4460i8 == null || c4460i8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.E8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f8138a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.E8
    public WebView getPresentingView() {
        return this.f8138a.getPresentingView();
    }

    public C4334b8 getSize() {
        C4460i8 c4460i8 = this.f8138a;
        return c4460i8 != null ? c4460i8.c() : new C4334b8();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C4460i8 c4460i8 = this.f8138a;
        if (c4460i8 == null) {
            return;
        }
        try {
            c4460i8.b().a(C4352c8.k, i, isShown());
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C4460i8 c4460i8 = this.f8138a;
        if (c4460i8 == null) {
            return;
        }
        try {
            c4460i8.b().a(C4352c8.l, i, isShown());
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C4370d8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4370d8(C4460i8 c4460i8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4460i8.c().c(), c4460i8.c().a()));
        this.f8138a = c4460i8;
        addView(c4460i8.getPresentingView());
    }

    @Override // com.ironsource.E8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f8138a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.E8
    public synchronized void a(String str, String str2) {
        C4460i8 c4460i8 = this.f8138a;
        if (c4460i8 != null && c4460i8.b() != null && this.f8138a.getPresentingView() != null) {
            this.f8138a.b().e();
            O7.f7826a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.E8
    public void a(String str, String str2, String str3) {
        C4460i8 c4460i8 = this.f8138a;
        if (c4460i8 == null) {
            return;
        }
        c4460i8.a(str, str2, str3);
    }

    @Override // com.ironsource.E8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f8138a.b(jSONObject, str, str2);
    }
}
