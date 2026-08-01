package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.c5;
import com.applovin.impl.j8;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f4607a = new AtomicBoolean();
    private String b;
    private WebView c;
    private EventListener d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.d = eventListener;
        this.b = str;
        this.f4607a.set(false);
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            p.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        l a2 = AppLovinSdk.getInstance(getApplicationContext()).a();
        j8.a(findViewById(android.R.id.content), a2);
        a(a2);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.b = stringExtra;
        }
        if (StringUtils.isValidString(this.b)) {
            this.c.loadUrl(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        WebView b = t7.b(this, "WebView Activity");
        this.c = b;
        if (b == null) {
            finish();
            return;
        }
        setContentView(b);
        WebSettings settings = this.c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setHorizontalScrollBarEnabled(true);
        this.c.setScrollBarStyle(33554432);
        this.c.setWebViewClient(new a(lVar));
    }

    class a extends y4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f4608a;

        a(l lVar) {
            this.f4608a = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(l lVar) {
            if (!((Boolean) lVar.a(c5.d6)).booleanValue() || !AppLovinWebViewActivity.this.f4607a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(lVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.b)) {
                AppLovinWebViewActivity.this.c.loadUrl(AppLovinWebViewActivity.this.b);
            }
        }

        @Override // com.applovin.impl.y4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.c == webView) {
                AppLovinWebViewActivity.this.c.destroy();
                AppLovinWebViewActivity.this.c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final l lVar = this.f4608a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinWebViewActivity.a.this.a(lVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.f4608a.Q();
            if (p.a()) {
                this.f4608a.Q().a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f4608a.Q();
                if (!p.a()) {
                    return true;
                }
                this.f4608a.Q().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = parse.getQueryParameter(str2);
            this.f4608a.Q();
            if (p.a()) {
                this.f4608a.Q().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
            }
            AppLovinWebViewActivity.this.d.onReceivedEvent(queryParameter);
            return true;
        }

        @Override // com.applovin.impl.y4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}
