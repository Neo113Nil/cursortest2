package live.football.scorerepublic;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0005a4;
import p000.C0042ay;
import p000.C0135de;
import p000.C0270h1;
import p000.c50;
import p000.c60;
import p000.f50;
import p000.fb1;
import p000.gu0;
import p000.l50;
import p000.rx0;
import p000.tg0;
import p000.vi1;
import p000.yi1;
import p000.zi1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewFragment extends c50 {

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ tg0[] f4810k0 = {new rx0(C0135de.f1631j, WebViewFragment.class, "binding", "getBinding()Llive/football/scorerepublic/databinding/WebviewFragmentBinding;", 0)};

    /* JADX INFO: renamed from: f0 */
    public final f50 f4811f0;

    /* JADX INFO: renamed from: g0 */
    public final AtomicBoolean f4812g0;

    /* JADX INFO: renamed from: h0 */
    public WebView f4813h0;

    /* JADX INFO: renamed from: i0 */
    public final l50 f4814i0;

    /* JADX INFO: renamed from: j0 */
    public Bundle f4815j0;

    public WebViewFragment() {
        this.f1124b0 = R.layout.webview_fragment;
        vi1 vi1Var = vi1.f8197q;
        this.f4811f0 = new f50(this);
        this.f4812g0 = new AtomicBoolean(false);
        this.f4814i0 = new l50(1, this);
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: q */
    public final void mo875q(Context context) {
        context.getClass();
        super.mo875q(context);
        if (context instanceof MainActivity) {
            ((MainActivity) context).f4806J.set(this.f4812g0.get());
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: r */
    public final void mo876r(Bundle bundle) {
        super.mo876r(bundle);
        if (bundle != null) {
            this.f4815j0 = bundle.getBundle("currentWebViewState");
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: v */
    public final void mo880v() {
        this.f1110N = true;
        Bundle bundle = new Bundle();
        tg0 tg0Var = f4810k0[0];
        f50 f50Var = this.f4811f0;
        f50Var.getClass();
        tg0Var.getClass();
        zi1 zi1Var = (zi1) f50Var.f2313k;
        if (zi1Var == null || zi1Var.m5918a() != this.f1112P) {
            View view = this.f1112P;
            if (view == null) {
                C0270h1.m2191g("Should not attempt to get bindings when the Fragment's view is null.");
                return;
            } else {
                zi1Var = (zi1) vi1.f8197q.mo170i(view);
                f50Var.f2313k = zi1Var;
            }
        }
        zi1Var.f9799c.saveState(bundle);
        this.f4815j0 = bundle;
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: w */
    public final void mo881w(Bundle bundle) {
        bundle.putBundle("currentWebViewState", this.f4815j0);
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: z */
    public final void mo884z(View view) {
        view.getClass();
        String string = m856D().getResources().getString(R.string.base_url);
        string.getClass();
        tg0 tg0Var = f4810k0[0];
        f50 f50Var = this.f4811f0;
        f50Var.getClass();
        tg0Var.getClass();
        zi1 zi1Var = (zi1) f50Var.f2313k;
        if (zi1Var == null || zi1Var.m5918a() != this.f1112P) {
            View view2 = this.f1112P;
            if (view2 == null) {
                C0270h1.m2191g("Should not attempt to get bindings when the Fragment's view is null.");
                return;
            } else {
                zi1Var = (zi1) vi1.f8197q.mo170i(view2);
                f50Var.f2313k = zi1Var;
            }
        }
        WebView webView = zi1Var.f9799c;
        this.f4813h0 = webView;
        WebSettings settings = webView.getSettings();
        settings.getClass();
        String userAgentString = settings.getUserAgentString();
        userAgentString.getClass();
        if (!fb1.m1759u(userAgentString, "SRWebView")) {
            String string2 = m856D().getResources().getString(R.string.tenant_name);
            string2.getClass();
            settings.setUserAgentString(settings.getUserAgentString() + " SRWebView/1 (Android; " + string2 + "/1.7.5)");
        }
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        gu0 gu0VarM2118h = m855C().m2118h();
        c60 c60Var = this.f1121Y;
        if (c60Var == null) {
            C0042ay.m526c(this, " when getView() is null i.e., before onCreateView() or after onDestroyView()", "Can't access the Fragment View's LifecycleOwner for ");
            return;
        }
        gu0VarM2118h.m2151a(this.f4814i0, c60Var);
        webView.addJavascriptInterface(new C0005a4(view.getContext()), "AnalyticsWebInterface");
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new yi1(this, zi1Var, string));
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setCacheMode(-1);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setMinimumFontSize(1);
        Bundle bundle = this.f4815j0;
        if (bundle == null || !MainActivity.f4805L.equals(string)) {
            webView.loadUrl(MainActivity.f4805L);
        } else {
            webView.restoreState(bundle);
        }
    }
}
