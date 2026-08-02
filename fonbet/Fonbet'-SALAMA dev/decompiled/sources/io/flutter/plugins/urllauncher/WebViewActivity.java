package io.flutter.plugins.urllauncher;

import A1.L0;
import G.h;
import Q5.g;
import Q5.i;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14219e = 0;

    /* renamed from: c, reason: collision with root package name */
    public WebView f14222c;

    /* renamed from: a, reason: collision with root package name */
    public final L0 f14220a = new L0(this, 3);

    /* renamed from: b, reason: collision with root package name */
    public final g f14221b = new g();

    /* renamed from: d, reason: collision with root package name */
    public final IntentFilter f14223d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f14222c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f14222c.loadUrl(stringExtra, map);
        this.f14222c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f14222c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f14222c.setWebViewClient(this.f14221b);
        this.f14222c.getSettings().setSupportMultipleWindows(true);
        this.f14222c.setWebChromeClient(new i(this));
        h.registerReceiver(this, this.f14220a, this.f14223d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f14220a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !this.f14222c.canGoBack()) {
            return super.onKeyDown(i7, keyEvent);
        }
        this.f14222c.goBack();
        return true;
    }
}
