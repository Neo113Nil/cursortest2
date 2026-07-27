package sg.bigo.ads.j1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.E1.k;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class h extends BaseAdActivityImpl implements View.OnClickListener {
    public TextView d;
    public ProgressBar e;
    public ImageView f;
    public ImageView g;
    public WebView h;
    public String i;
    public long j;
    public boolean k;
    public boolean l;
    public final AtomicBoolean m;
    public final boolean n;
    public final String o;
    public sg.bigo.ads.P.f p;
    public final boolean q;
    public boolean r;
    public a s;
    public final c t;
    public final g u;

    public h(Activity activity) {
        super(activity);
        this.j = -1L;
        this.k = false;
        this.l = false;
        this.m = new AtomicBoolean(true);
        this.n = false;
        this.o = null;
        this.t = new c(this);
        this.u = new g(this);
        Intent intent = activity.getIntent();
        if (intent == null) {
            this.i = "";
            return;
        }
        this.i = intent.getStringExtra("url");
        this.n = intent.getBooleanExtra("try_gp_inline", false);
        this.o = intent.getStringExtra("gp_inline_ad_bundle");
        this.q = intent.getBooleanExtra("gp_inline_real_launch", false);
    }

    public int A() {
        return R.layout.bigo_ad_activity_webview;
    }

    public void B() {
        View findViewById = this.f12687a.findViewById(R.id.inter_webview_back);
        X.a(findViewById, new d(this, findViewById));
    }

    public void C() {
        this.e = (ProgressBar) this.f12687a.findViewById(R.id.inter_webview_progress_bar);
        this.d = (TextView) this.f12687a.findViewById(R.id.inter_webview_title);
        this.g = (ImageView) this.f12687a.findViewById(R.id.inter_webview_back);
        this.f = (ImageView) this.f12687a.findViewById(R.id.inter_webview_close);
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        D();
    }

    public void D() {
        k G = G();
        this.h = G;
        if (G == null) {
            return;
        }
        G.setWebViewClient(new f(this));
        this.h.setWebChromeClient(new e(this));
        X.a(this.h, (ViewGroup) this.f12687a.findViewById(R.id.inter_webview_container), new ViewGroup.LayoutParams(-1, -1), -1);
        WebView webView = this.h;
        if (webView instanceof k) {
            ((k) webView).setOnWebViewTouchListener(this.u);
        } else {
            webView.setOnTouchListener(this.u);
        }
        sg.bigo.ads.Z.c.a(this.h, this.t);
    }

    public void E() {
        WebView webView = this.h;
        if (webView != null) {
            webView.loadUrl(this.i);
        }
    }

    public boolean F() {
        return false;
    }

    public k G() {
        return k.a(this.f12687a);
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
        WebView webView = this.h;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void K() {
        WebView webView = this.h;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i, int i2, Intent intent) {
        a aVar = this.s;
        if (aVar != null) {
            aVar.a(i, i2, intent);
        }
    }

    public void a(int i, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, boolean z) {
    }

    public void a(sg.bigo.ads.P.f fVar) {
    }

    public void b(String str) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void b(boolean z) {
    }

    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    public void c(String str) {
    }

    public String d(String str) {
        return str;
    }

    public void e(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void f(int i) {
        g(i);
    }

    public void f(String str) {
    }

    public void g(int i) {
        this.k = true;
        H();
        WebView webView = this.h;
        if (webView != null) {
            webView.stopLoading();
        }
        this.f12687a.finish();
    }

    public void h(int i) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            if (tag.equals(AbstractC4944a.a(this.f12687a, R.string.bigo_ad_tag_close, new Object[0]))) {
                f(3);
                return;
            }
            if (tag.equals(AbstractC4944a.a(this.f12687a, R.string.bigo_ad_tag_back, new Object[0]))) {
                if (this.h == null || !z()) {
                    f(2);
                } else {
                    this.h.goBack();
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void t() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void u() {
        if (this.h == null || !z()) {
            f(1);
        } else {
            this.h.goBack();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void v() {
        if (TextUtils.isEmpty(this.i)) {
            AbstractC5496a.a("WebView", "url is null.");
            g(0);
            return;
        }
        q();
        this.f12687a.setContentView(AbstractC4944a.a(this.f12687a, A(), null, false));
        try {
            C();
        } catch (RuntimeException unused) {
        }
        I();
        B();
        if (I.a((CharSequence) this.i) || a(Uri.parse(this.i), false)) {
            g(0);
        } else {
            E();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        WebView webView = this.h;
        if (webView != null) {
            sg.bigo.ads.Z.c.b(webView, this.t);
            WebView webView2 = this.h;
            if (webView2 instanceof k) {
                ((k) webView2).setOnWebViewTouchListener(null);
            } else {
                webView2.setOnTouchListener(null);
            }
            this.h.destroy();
            this.h = null;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void x() {
        if (this.m.compareAndSet(false, true)) {
            J();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void y() {
        if (this.m.compareAndSet(true, false)) {
            K();
        }
    }

    public boolean z() {
        WebView webView = this.h;
        return webView != null && webView.canGoBack();
    }

    public final boolean a(Uri uri, boolean z) {
        sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
        this.p = fVar;
        boolean z2 = this.q;
        fVar.e = z2;
        Activity activity = this.f12687a;
        boolean a2 = b.a(uri, activity, activity, fVar, "", this.n, this.o, 1, z2);
        sg.bigo.ads.P.f fVar2 = this.p;
        boolean z3 = (fVar2.b == 0 && fVar2.c == 0 && fVar2.a() <= -1) ? false : true;
        if (z) {
            this.p.p = uri.toString();
        }
        if (z3) {
            a(this.p);
        }
        return a2;
    }
}
