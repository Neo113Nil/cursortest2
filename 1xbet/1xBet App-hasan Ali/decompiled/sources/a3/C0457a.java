package a3;

import A0.J0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1281m8;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.Xq;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6517a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f6518b;

    /* renamed from: c, reason: collision with root package name */
    public final Q4 f6519c;

    /* renamed from: d, reason: collision with root package name */
    public final Xq f6520d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6521e;
    public final C1616tl f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6522g;

    /* renamed from: h, reason: collision with root package name */
    public final C0606Hd f6523h = AbstractC0613Id.f;
    public final C1041gs i;

    /* renamed from: j, reason: collision with root package name */
    public final F f6524j;

    /* renamed from: k, reason: collision with root package name */
    public final A f6525k;

    /* renamed from: l, reason: collision with root package name */
    public final D f6526l;

    public C0457a(WebView webView, Q4 q42, C1616tl c1616tl, C1041gs c1041gs, Xq xq, F f, A a5, D d5) {
        this.f6518b = webView;
        Context context = webView.getContext();
        this.f6517a = context;
        this.f6519c = q42;
        this.f = c1616tl;
        F7.a(context);
        A7 a7 = F7.h9;
        Q2.r rVar = Q2.r.f5053d;
        this.f6521e = ((Integer) rVar.f5056c.a(a7)).intValue();
        this.f6522g = ((Boolean) rVar.f5056c.a(F7.i9)).booleanValue();
        this.i = c1041gs;
        this.f6520d = xq;
        this.f6524j = f;
        this.f6525k = a5;
        this.f6526l = d5;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            P2.o oVar = P2.o.f4767B;
            oVar.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String g5 = this.f6519c.f11167b.g(this.f6517a, str, this.f6518b);
            if (!this.f6522g) {
                return g5;
            }
            oVar.f4776j.getClass();
            G4.d.R(this.f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return g5;
        } catch (RuntimeException e3) {
            U2.j.g("Exception getting click signals. ", e3);
            P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.getClickSignals", e3);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            U2.j.f("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC0613Id.f9539a.d(new P2.e(3, this, str)).get(Math.min(i, this.f6521e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            U2.j.g("Exception getting click signals with timeout. ", e3);
            P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e3);
            return e3 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        T2.L l5 = P2.o.f4767B.f4771c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        x xVar = new x(0, this, uuid);
        if (((Boolean) AbstractC1281m8.f14476c.s()).booleanValue()) {
            this.f6524j.b(this.f6518b, xVar);
            return uuid;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.k9)).booleanValue()) {
            this.f6523h.execute(new S2.q(this, bundle, xVar, 1));
            return uuid;
        }
        J0.p(this.f6517a, new J2.h((J2.g) new J2.g(0).a(bundle)), xVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            P2.o oVar = P2.o.f4767B;
            oVar.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String e3 = this.f6519c.f11167b.e(this.f6517a, this.f6518b, null);
            if (!this.f6522g) {
                return e3;
            }
            oVar.f4776j.getClass();
            G4.d.R(this.f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return e3;
        } catch (RuntimeException e5) {
            U2.j.g("Exception getting view signals. ", e5);
            P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.getViewSignals", e5);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            U2.j.f("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC0613Id.f9539a.d(new P2.l(2, this)).get(Math.min(i, this.f6521e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            U2.j.g("Exception getting view signals with timeout. ", e3);
            P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e3);
            return e3 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.m9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0613Id.f9539a.execute(new D3.h(15, this, str, false));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i5 = jSONObject.getInt("x");
            int i6 = jSONObject.getInt("y");
            int i7 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i8 = jSONObject.getInt("type");
            if (i8 != 0) {
                i = 1;
                if (i8 != 1) {
                    i = 2;
                    if (i8 != 2) {
                        i = 3;
                        if (i8 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f6519c.f11167b.a(MotionEvent.obtain(0L, i7, i, i5, i6, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e3) {
                e = e3;
                U2.j.g("Failed to parse the touch string. ", e);
                P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e5) {
                e = e5;
                U2.j.g("Failed to parse the touch string. ", e);
                P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e6) {
            e = e6;
        }
    }
}
