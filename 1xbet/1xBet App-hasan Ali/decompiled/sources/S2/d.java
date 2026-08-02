package S2;

import A0.C;
import Q2.C0375o;
import Q2.InterfaceC0347a;
import T2.G;
import T2.H;
import T2.L;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractBinderC0625Kb;
import com.google.android.gms.internal.ads.C1028gf;
import com.google.android.gms.internal.ads.C1125in;
import com.google.android.gms.internal.ads.C1169jn;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1586t;
import com.google.android.gms.internal.ads.C1773x6;
import com.google.android.gms.internal.ads.C1893zs;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.EnumC1848ys;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.InterfaceC1462q9;
import com.google.android.gms.internal.ads.Oi;
import com.google.android.gms.internal.ads.RunnableC0902dn;
import com.google.android.gms.internal.ads.RunnableC1081hn;
import com.google.android.gms.internal.ads.RunnableC1437pl;
import com.google.android.gms.internal.ads.Sh;
import com.google.android.gms.internal.ads.V9;
import com.google.android.gms.internal.ads.Vi;
import com.google.android.gms.internal.ads.Wm;
import com.google.android.gms.internal.ads.Z1;
import e2.C1930k;
import game.betting133.sports1xbet.R;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class d extends AbstractBinderC0625Kb {

    /* renamed from: I, reason: collision with root package name */
    public static final int f5289I = Color.argb(0, 0, 0, 0);

    /* renamed from: A, reason: collision with root package name */
    public boolean f5290A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5291B;

    /* renamed from: F, reason: collision with root package name */
    public Toolbar f5295F;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ int f5297H;

    /* renamed from: l, reason: collision with root package name */
    public final Activity f5298l;

    /* renamed from: m, reason: collision with root package name */
    public AdOverlayInfoParcel f5299m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0677Re f5300n;

    /* renamed from: o, reason: collision with root package name */
    public J2.b f5301o;

    /* renamed from: p, reason: collision with root package name */
    public p f5302p;

    /* renamed from: r, reason: collision with root package name */
    public FrameLayout f5304r;

    /* renamed from: s, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f5305s;

    /* renamed from: v, reason: collision with root package name */
    public h f5308v;

    /* renamed from: z, reason: collision with root package name */
    public C f5312z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5303q = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5306t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5307u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5309w = false;

    /* renamed from: G, reason: collision with root package name */
    public int f5296G = 1;

    /* renamed from: x, reason: collision with root package name */
    public final Object f5310x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final f f5311y = new f(0, this);

    /* renamed from: C, reason: collision with root package name */
    public boolean f5292C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5293D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5294E = true;

    public d(Activity activity, int i) {
        this.f5297H = i;
        this.f5298l = activity;
    }

    public static final void y3(View view, C1169jn c1169jn) {
        if (c1169jn == null || view == null) {
            return;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.S4)).booleanValue()) {
            Z1 z12 = c1169jn.f14143b;
            if (((EnumC1848ys) z12.f12444q) == EnumC1848ys.f16493l) {
                return;
            }
        }
        Oi oi = P2.o.f4767B.f4789w;
        C1893zs c1893zs = c1169jn.f14142a;
        oi.getClass();
        Oi.h(c1893zs, view);
    }

    public final void A3(boolean z3, boolean z5) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        P2.h hVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        P2.h hVar2;
        A7 a7 = F7.f8787Y0;
        Q2.r rVar = Q2.r.f5053d;
        boolean z6 = true;
        boolean z7 = ((Boolean) rVar.f5056c.a(a7)).booleanValue() && (adOverlayInfoParcel2 = this.f5299m) != null && (hVar2 = adOverlayInfoParcel2.f7460y) != null && hVar2.f4749r;
        A7 a72 = F7.f8792Z0;
        D7 d7 = rVar.f5056c;
        boolean z8 = ((Boolean) d7.a(a72)).booleanValue() && (adOverlayInfoParcel = this.f5299m) != null && (hVar = adOverlayInfoParcel.f7460y) != null && hVar.f4750s;
        if (z3 && z5 && z7 && !z8) {
            InterfaceC0677Re interfaceC0677Re = this.f5300n;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (interfaceC0677Re != null) {
                    interfaceC0677Re.k("onError", put);
                }
            } catch (JSONException e3) {
                U2.j.g("Error occurred while dispatching error event.", e3);
            }
        }
        p pVar = this.f5302p;
        if (pVar != null) {
            if (!z8 && (!z5 || z7)) {
                z6 = false;
            }
            ImageButton imageButton = pVar.f5344k;
            if (!z6) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) d7.a(F7.f8809c1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void I2(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f5298l;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
            try {
                adOverlayInfoParcel.f7443F.e3(strArr, iArr, new BinderC2361b(new Wm(activity, adOverlayInfoParcel.f7456u == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void J() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel == null || (mVar = adOverlayInfoParcel.f7448m) == null) {
            return;
        }
        mVar.h1();
    }

    public final void K() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        m mVar;
        if (!this.f5298l.isFinishing() || this.f5292C) {
            return;
        }
        this.f5292C = true;
        InterfaceC0677Re interfaceC0677Re = this.f5300n;
        if (interfaceC0677Re != null) {
            interfaceC0677Re.x0(this.f5296G - 1);
            synchronized (this.f5310x) {
                try {
                    if (!this.f5290A && this.f5300n.y0()) {
                        A7 a7 = F7.f8681E4;
                        Q2.r rVar = Q2.r.f5053d;
                        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && !this.f5293D && (adOverlayInfoParcel = this.f5299m) != null && (mVar = adOverlayInfoParcel.f7448m) != null) {
                            mVar.Q1();
                        }
                        C c5 = new C(8, this);
                        this.f5312z = c5;
                        L.f5672l.postDelayed(c5, ((Long) rVar.f5056c.a(F7.f8782X0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Y0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5306t);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Z1(int i, int i5, Intent intent) {
        C1482ql c1482ql;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            A7 a7 = F7.Gc;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                G.m("Callback from intent launch with requestCode: 236 and resultCode: " + i5);
                InterfaceC0677Re interfaceC0677Re = this.f5300n;
                if (interfaceC0677Re == null || interfaceC0677Re.I() == null || (c1482ql = interfaceC0677Re.I().J) == null || (adOverlayInfoParcel = this.f5299m) == null || !((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    return;
                }
                C1390oj a5 = c1482ql.a();
                a5.k("action", "hilca");
                String str = adOverlayInfoParcel.f7438A;
                if (str == null) {
                    str = "";
                }
                a5.k("gqi", str);
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                a5.k("hilr", sb.toString());
                if (i5 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a5.k("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a5.k("hills", stringExtra2);
                    }
                }
                ((C1482ql) a5.f14828m).f15166b.execute(new RunnableC1437pl(a5, 2));
            }
        }
    }

    public final void a() {
        this.f5296G = 3;
        Activity activity = this.f5298l;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f7456u != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC0677Re interfaceC0677Re = this.f5300n;
        if (interfaceC0677Re != null) {
            interfaceC0677Re.q0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void e() {
        this.f5296G = 1;
    }

    public final void f() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel != null && this.f5303q) {
            u3(adOverlayInfoParcel.f7455t);
        }
        if (this.f5304r != null) {
            this.f5298l.setContentView(this.f5308v);
            this.f5291B = true;
            this.f5304r.removeAllViews();
            this.f5304r = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f5305s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f5305s = null;
        }
        this.f5303q = false;
    }

    public final void k1() {
        synchronized (this.f5310x) {
            try {
                this.f5290A = true;
                C c5 = this.f5312z;
                if (c5 != null) {
                    H h3 = L.f5672l;
                    h3.removeCallbacks(c5);
                    h3.post(this.f5312z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void l() {
        InterfaceC0677Re interfaceC0677Re = this.f5300n;
        if (interfaceC0677Re != null) {
            try {
                this.f5308v.removeView(interfaceC0677Re.K());
            } catch (NullPointerException unused) {
            }
        }
        K();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void m2(InterfaceC2360a interfaceC2360a) {
        x3((Configuration) BinderC2361b.t1(interfaceC2360a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void n() {
        m mVar;
        f();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f7448m) != null) {
            mVar.t1();
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8693G4)).booleanValue() && this.f5300n != null && (!this.f5298l.isFinishing() || this.f5301o == null)) {
            this.f5300n.onPause();
        }
        K();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final boolean n2() {
        this.f5296G = 1;
        if (this.f5300n == null) {
            return true;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue() && this.f5300n.canGoBack()) {
            this.f5300n.goBack();
            return false;
        }
        boolean V02 = this.f5300n.V0();
        if (!V02) {
            this.f5300n.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return V02;
    }

    public final void p() {
        InterfaceC0677Re interfaceC0677Re;
        m mVar;
        if (this.f5293D) {
            return;
        }
        this.f5293D = true;
        InterfaceC0677Re interfaceC0677Re2 = this.f5300n;
        if (interfaceC0677Re2 != null) {
            this.f5308v.removeView(interfaceC0677Re2.K());
            J2.b bVar = this.f5301o;
            if (bVar != null) {
                this.f5300n.h0((Context) bVar.f2698e);
                this.f5300n.p0(false);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.kc)).booleanValue() && this.f5300n.getParent() != null) {
                    ((ViewGroup) this.f5300n.getParent()).removeView(this.f5300n.K());
                }
                ViewGroup viewGroup = (ViewGroup) this.f5301o.f2697d;
                View K = this.f5300n.K();
                J2.b bVar2 = this.f5301o;
                viewGroup.addView(K, bVar2.f2695b, (ViewGroup.LayoutParams) bVar2.f2696c);
                this.f5301o = null;
            } else {
                Activity activity = this.f5298l;
                if (activity.getApplicationContext() != null) {
                    this.f5300n.h0(activity.getApplicationContext());
                }
            }
            this.f5300n = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f7448m) != null) {
            mVar.d1(this.f5296G);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5299m;
        if (adOverlayInfoParcel2 == null || (interfaceC0677Re = adOverlayInfoParcel2.f7449n) == null) {
            return;
        }
        y3(this.f5299m.f7449n.K(), interfaceC0677Re.Z());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void t() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f7448m) != null) {
            mVar.Z2();
        }
        x3(this.f5298l.getResources().getConfiguration());
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8693G4)).booleanValue()) {
            return;
        }
        InterfaceC0677Re interfaceC0677Re = this.f5300n;
        if (interfaceC0677Re == null || interfaceC0677Re.S()) {
            U2.j.i("The webview does not exist. Ignoring action.");
        } else {
            this.f5300n.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void u() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8693G4)).booleanValue() && this.f5300n != null && (!this.f5298l.isFinishing() || this.f5301o == null)) {
            this.f5300n.onPause();
        }
        K();
    }

    public final void u3(int i) {
        int i5;
        Activity activity = this.f5298l;
        int i6 = activity.getApplicationInfo().targetSdkVersion;
        A7 a7 = F7.E5;
        Q2.r rVar = Q2.r.f5053d;
        if (i6 >= ((Integer) rVar.f5056c.a(a7)).intValue()) {
            int i7 = activity.getApplicationInfo().targetSdkVersion;
            A7 a72 = F7.F5;
            D7 d7 = rVar.f5056c;
            if (i7 <= ((Integer) d7.a(a72)).intValue() && (i5 = Build.VERSION.SDK_INT) >= ((Integer) d7.a(F7.G5)).intValue() && i5 <= ((Integer) d7.a(F7.H5)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.h("AdOverlay.setRequestedOrientation", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void v() {
        this.f5291B = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v3(boolean z3) {
        boolean z5;
        boolean z6;
        InterfaceC0677Re interfaceC0677Re;
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z7 = this.f5291B;
        Activity activity = this.f5298l;
        if (!z7) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new g("Invalid activity, no window available.");
        }
        InterfaceC0677Re interfaceC0677Re2 = this.f5299m.f7449n;
        C1028gf I5 = interfaceC0677Re2 != null ? interfaceC0677Re2.I() : null;
        boolean z8 = I5 != null && I5.p();
        this.f5309w = false;
        if (z8) {
            int i = this.f5299m.f7455t;
            if (i == 6) {
                z5 = activity.getResources().getConfiguration().orientation == 1;
                this.f5309w = z5;
            } else if (i == 7) {
                z5 = activity.getResources().getConfiguration().orientation == 2;
                this.f5309w = z5;
            }
            U2.j.d("Delay onShow to next orientation change: " + z5);
            u3(this.f5299m.f7455t);
            window.setFlags(16777216, 16777216);
            U2.j.d("Hardware acceleration on the AdActivity window enabled.");
            if (this.f5307u) {
                this.f5308v.setBackgroundColor(-16777216);
            } else {
                this.f5308v.setBackgroundColor(f5289I);
            }
            activity.setContentView(this.f5308v);
            this.f5291B = true;
            if (z3) {
                z6 = z8;
                InterfaceC0677Re interfaceC0677Re3 = this.f5299m.f7449n;
                this.f5300n = interfaceC0677Re3;
                interfaceC0677Re3.h0(activity);
            } else {
                try {
                    V9 v9 = P2.o.f4767B.f4772d;
                    Activity activity2 = this.f5298l;
                    InterfaceC0677Re interfaceC0677Re4 = this.f5299m.f7449n;
                    C1586t M5 = interfaceC0677Re4 != null ? interfaceC0677Re4.M() : null;
                    InterfaceC0677Re interfaceC0677Re5 = this.f5299m.f7449n;
                    String G02 = interfaceC0677Re5 != null ? interfaceC0677Re5.G0() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5299m;
                    U2.a aVar = adOverlayInfoParcel2.f7458w;
                    InterfaceC0677Re interfaceC0677Re6 = adOverlayInfoParcel2.f7449n;
                    InterfaceC0677Re f = V9.f(interfaceC0677Re6 != null ? interfaceC0677Re6.h() : null, aVar, activity2, M5, null, new C1773x6(), null, null, null, null, null, null, G02, true, z8);
                    z6 = z8;
                    this.f5300n = f;
                    C1028gf I6 = f.I();
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f5299m;
                    InterfaceC1462q9 interfaceC1462q9 = adOverlayInfoParcel3.f7461z;
                    InterfaceC0677Re interfaceC0677Re7 = adOverlayInfoParcel3.f7449n;
                    I6.w(null, interfaceC1462q9, null, adOverlayInfoParcel3.f7450o, adOverlayInfoParcel3.f7454s, true, null, interfaceC0677Re7 != null ? interfaceC0677Re7.I().f13604G : null, null, null, null, null, null, null, null, null, null, null, null);
                    this.f5300n.I().f13619q = new C1930k(16, this);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f5299m;
                    String str = adOverlayInfoParcel4.f7457v;
                    if (str != null) {
                        this.f5300n.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel4.f7453r;
                        if (str2 == null) {
                            throw new g("No URL or HTML to display in ad overlay.");
                        }
                        this.f5300n.loadDataWithBaseURL(adOverlayInfoParcel4.f7451p, str2, "text/html", "UTF-8", null);
                    }
                    InterfaceC0677Re interfaceC0677Re8 = this.f5299m.f7449n;
                    if (interfaceC0677Re8 != null) {
                        interfaceC0677Re8.I0(this);
                    }
                } catch (Exception e3) {
                    U2.j.g("Error obtaining webview.", e3);
                    throw new g("Could not obtain webview for the overlay.", e3);
                }
            }
            if (this.f5299m.f7444G) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f5300n.m0(), false);
            }
            this.f5300n.q0(this);
            interfaceC0677Re = this.f5299m.f7449n;
            if (interfaceC0677Re != null) {
                y3(this.f5308v, interfaceC0677Re.Z());
            }
            if (this.f5299m.f7456u != 5) {
                ViewParent parent = this.f5300n.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f5300n.K());
                }
                if (this.f5307u) {
                    this.f5300n.e0();
                }
                if (!this.f5299m.f7444G || Build.VERSION.SDK_INT < 24) {
                    this.f5308v.addView(this.f5300n.K(), -1, -1);
                } else {
                    Toolbar toolbar = new Toolbar(activity);
                    this.f5295F = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.f5300n.K().setId(View.generateViewId());
                    this.f5295F.setBackgroundColor(-12303292);
                    this.f5295F.setVisibility(0);
                    try {
                        this.f5295F.setNavigationIcon(P2.o.f4767B.f4774g.b().getDrawable(R.drawable.admob_close_button_white_cross, null));
                    } catch (Resources.NotFoundException | NullPointerException e5) {
                        G.n("Error obtaining close icon.", e5);
                    }
                    this.f5295F.setNavigationOnClickListener(this.f5311y);
                    this.f5295F.setTitleMarginStart(0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.f5308v.addView(this.f5295F, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.f5295F.getId());
                    layoutParams2.addRule(12);
                    this.f5308v.addView(this.f5300n.K(), layoutParams2);
                    w3(this.f5295F);
                }
            }
            if (!z3 && !this.f5309w) {
                this.f5300n.X();
            }
            adOverlayInfoParcel = this.f5299m;
            if (adOverlayInfoParcel.f7456u == 5) {
                z3(z6);
                if (this.f5300n.k0()) {
                    A3(z6, true);
                    return;
                }
                return;
            }
            Wm wm = new Wm(activity, this, adOverlayInfoParcel.f7438A, adOverlayInfoParcel.f7439B);
            if (adOverlayInfoParcel != null) {
                try {
                    InterfaceC0590Fb interfaceC0590Fb = adOverlayInfoParcel.f7443F;
                    if (interfaceC0590Fb != null) {
                        interfaceC0590Fb.x2(new BinderC2361b(wm));
                        return;
                    }
                } catch (g | RemoteException e6) {
                    throw new g(e6.getMessage(), e6);
                }
            }
            throw new g("noioou");
        }
        z5 = false;
        U2.j.d("Delay onShow to next orientation change: " + z5);
        u3(this.f5299m.f7455t);
        window.setFlags(16777216, 16777216);
        U2.j.d("Hardware acceleration on the AdActivity window enabled.");
        if (this.f5307u) {
        }
        activity.setContentView(this.f5308v);
        this.f5291B = true;
        if (z3) {
        }
        if (this.f5299m.f7444G) {
        }
        this.f5300n.q0(this);
        interfaceC0677Re = this.f5299m.f7449n;
        if (interfaceC0677Re != null) {
        }
        if (this.f5299m.f7456u != 5) {
        }
        if (!z3) {
            this.f5300n.X();
        }
        adOverlayInfoParcel = this.f5299m;
        if (adOverlayInfoParcel.f7456u == 5) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void w() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8693G4)).booleanValue()) {
            InterfaceC0677Re interfaceC0677Re = this.f5300n;
            if (interfaceC0677Re == null || interfaceC0677Re.S()) {
                U2.j.i("The webview does not exist. Ignoring action.");
            } else {
                this.f5300n.onResume();
            }
        }
    }

    public final void w3(View view) {
        C1169jn Z4;
        C1125in U4;
        InterfaceC0677Re interfaceC0677Re = this.f5300n;
        if (interfaceC0677Re == null) {
            return;
        }
        A7 a7 = F7.T4;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && (U4 = interfaceC0677Re.U()) != null) {
            synchronized (U4) {
                C0375o c0375o = U4.f;
                if (c0375o != null) {
                    P2.o.f4767B.f4789w.getClass();
                    Oi.p(new RunnableC1081hn(0, c0375o, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f5056c.a(F7.S4)).booleanValue() && (Z4 = interfaceC0677Re.Z()) != null && ((EnumC1848ys) Z4.f14143b.f12444q) == EnumC1848ys.f16493l) {
            Oi oi = P2.o.f4767B.f4789w;
            C1893zs c1893zs = Z4.f14142a;
            oi.getClass();
            Oi.p(new RunnableC0902dn(c1893zs, view, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8695H0)).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8689G0)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x3(Configuration configuration) {
        P2.h hVar;
        P2.h hVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
        boolean z3 = true;
        boolean z5 = false;
        boolean z6 = (adOverlayInfoParcel == null || (hVar2 = adOverlayInfoParcel.f7460y) == null || !hVar2.f4743l) ? false : true;
        Q1.j jVar = P2.o.f4767B.f4773e;
        Activity activity = this.f5298l;
        boolean j5 = jVar.j(activity, configuration);
        if (this.f5307u && !z6) {
        }
        if (j5) {
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5299m;
        if (adOverlayInfoParcel2 != null && (hVar = adOverlayInfoParcel2.f7460y) != null && hVar.f4748q) {
            z5 = true;
        }
        Window window = activity.getWindow();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.e1)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z3 ? z5 ? 5894 : 5380 : 256);
            return;
        }
        if (!z3) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z5) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: g -> 0x003e, TryCatch #0 {g -> 0x003e, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x0041, B:21:0x004c, B:23:0x0057, B:24:0x0059, B:26:0x0061, B:27:0x006f, B:29:0x0076, B:32:0x0083, B:34:0x0087, B:36:0x008c, B:38:0x009a, B:40:0x009e, B:42:0x00a4, B:48:0x00ac, B:51:0x00b0, B:53:0x00b1, B:55:0x00b7, B:56:0x00ba, B:58:0x00c0, B:60:0x00c4, B:61:0x00c7, B:63:0x00cd, B:64:0x00d0, B:71:0x00ff, B:73:0x0103, B:74:0x010a, B:75:0x010b, B:77:0x010f, B:79:0x011c, B:81:0x007d, B:83:0x0081, B:84:0x0096, B:85:0x0120, B:86:0x0127, B:44:0x00a5, B:46:0x00a9), top: B:12:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c A[Catch: g -> 0x003e, TryCatch #0 {g -> 0x003e, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x0041, B:21:0x004c, B:23:0x0057, B:24:0x0059, B:26:0x0061, B:27:0x006f, B:29:0x0076, B:32:0x0083, B:34:0x0087, B:36:0x008c, B:38:0x009a, B:40:0x009e, B:42:0x00a4, B:48:0x00ac, B:51:0x00b0, B:53:0x00b1, B:55:0x00b7, B:56:0x00ba, B:58:0x00c0, B:60:0x00c4, B:61:0x00c7, B:63:0x00cd, B:64:0x00d0, B:71:0x00ff, B:73:0x0103, B:74:0x010a, B:75:0x010b, B:77:0x010f, B:79:0x011c, B:81:0x007d, B:83:0x0081, B:84:0x0096, B:85:0x0120, B:86:0x0127, B:44:0x00a5, B:46:0x00a9), top: B:12:0x0020, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z0(Bundle bundle) {
        AdOverlayInfoParcel a5;
        int i;
        switch (this.f5297H) {
            case 4:
                G.m("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f5296G = 4;
                this.f5298l.finish();
                return;
            default:
                if (!this.f5291B) {
                    this.f5298l.requestWindowFeature(1);
                }
                this.f5306t = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    a5 = AdOverlayInfoParcel.a(this.f5298l.getIntent());
                    this.f5299m = a5;
                } catch (g e3) {
                    U2.j.i(e3.getMessage());
                    this.f5296G = 4;
                    this.f5298l.finish();
                    return;
                }
                if (a5 == null) {
                    throw new g("Could not get info for ad overlay.");
                }
                if (a5.f7444G) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.f5298l.setShowWhenLocked(true);
                    } else {
                        this.f5298l.getWindow().addFlags(524288);
                    }
                }
                if (this.f5299m.f7458w.f5854m > 7500000) {
                    this.f5296G = 4;
                }
                if (this.f5298l.getIntent() != null) {
                    this.f5294E = this.f5298l.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.f5299m;
                P2.h hVar = adOverlayInfoParcel.f7460y;
                if (hVar != null) {
                    boolean z3 = hVar.f4742k;
                    this.f5307u = z3;
                    if (z3) {
                        if (adOverlayInfoParcel.f7456u != 5 && hVar.f4747p != -1) {
                            new i(0, this).l();
                        }
                    }
                    if (bundle == null) {
                        if (this.f5294E) {
                            Sh sh = this.f5299m.f7441D;
                            if (sh != null) {
                                synchronized (sh) {
                                    ScheduledFuture scheduledFuture = sh.f11575n;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            m mVar = this.f5299m.f7448m;
                            if (mVar != null) {
                                mVar.N2();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5299m;
                        if (adOverlayInfoParcel2.f7456u != 1) {
                            InterfaceC0347a interfaceC0347a = adOverlayInfoParcel2.f7447l;
                            if (interfaceC0347a != null) {
                                interfaceC0347a.z();
                            }
                            Vi vi = this.f5299m.f7442E;
                            if (vi != null) {
                                vi.E();
                            }
                        }
                    }
                    Activity activity = this.f5298l;
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f5299m;
                    h hVar2 = new h(activity, adOverlayInfoParcel3.f7459x, adOverlayInfoParcel3.f7458w.f5852k, adOverlayInfoParcel3.f7440C);
                    this.f5308v = hVar2;
                    hVar2.setId(1000);
                    P2.o.f4767B.f4773e.q(this.f5298l);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f5299m;
                    i = adOverlayInfoParcel4.f7456u;
                    if (i == 1) {
                        v3(false);
                        return;
                    }
                    if (i == 2) {
                        this.f5301o = new J2.b(adOverlayInfoParcel4.f7449n);
                        v3(false);
                        return;
                    } else if (i == 3) {
                        v3(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new g("Could not determine ad overlay type.");
                        }
                        v3(false);
                        return;
                    }
                }
                if (adOverlayInfoParcel.f7456u == 5) {
                    this.f5307u = true;
                    if (adOverlayInfoParcel.f7456u != 5) {
                        new i(0, this).l();
                    }
                    if (bundle == null) {
                    }
                    Activity activity2 = this.f5298l;
                    AdOverlayInfoParcel adOverlayInfoParcel32 = this.f5299m;
                    h hVar22 = new h(activity2, adOverlayInfoParcel32.f7459x, adOverlayInfoParcel32.f7458w.f5852k, adOverlayInfoParcel32.f7440C);
                    this.f5308v = hVar22;
                    hVar22.setId(1000);
                    P2.o.f4767B.f4773e.q(this.f5298l);
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.f5299m;
                    i = adOverlayInfoParcel42.f7456u;
                    if (i == 1) {
                    }
                } else {
                    this.f5307u = false;
                    if (bundle == null) {
                    }
                    Activity activity22 = this.f5298l;
                    AdOverlayInfoParcel adOverlayInfoParcel322 = this.f5299m;
                    h hVar222 = new h(activity22, adOverlayInfoParcel322.f7459x, adOverlayInfoParcel322.f7458w.f5852k, adOverlayInfoParcel322.f7440C);
                    this.f5308v = hVar222;
                    hVar222.setId(1000);
                    P2.o.f4767B.f4773e.q(this.f5298l);
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.f5299m;
                    i = adOverlayInfoParcel422.f7456u;
                    if (i == 1) {
                    }
                }
                U2.j.i(e3.getMessage());
                this.f5296G = 4;
                this.f5298l.finish();
                return;
        }
    }

    public final void z3(boolean z3) {
        if (this.f5299m.f7444G) {
            return;
        }
        A7 a7 = F7.J4;
        Q2.r rVar = Q2.r.f5053d;
        int intValue = ((Integer) rVar.f5056c.a(a7)).intValue();
        boolean z5 = ((Boolean) rVar.f5056c.a(F7.f8798a1)).booleanValue() || z3;
        o oVar = new o();
        oVar.f5340a = 0;
        oVar.f5341b = 0;
        oVar.f5342c = 0;
        oVar.f5343d = 50;
        oVar.f5340a = true != z5 ? 0 : intValue;
        oVar.f5341b = true != z5 ? intValue : 0;
        oVar.f5342c = intValue;
        this.f5302p = new p(this.f5298l, oVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z5 ? 9 : 11);
        A3(z3, this.f5299m.f7452q);
        this.f5308v.addView(this.f5302p, layoutParams);
        w3(this.f5302p);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void s() {
    }
}
