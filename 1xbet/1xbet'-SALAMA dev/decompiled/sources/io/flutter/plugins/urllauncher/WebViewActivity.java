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

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14225e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f14228c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f14226a = new L0(this, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14227b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntentFilter f14229d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> mapEmptyMap;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f14228c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            mapEmptyMap = Collections.emptyMap();
        } else {
            HashMap map = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map.put(str, bundleExtra.getString(str));
            }
            mapEmptyMap = map;
        }
        this.f14228c.loadUrl(stringExtra, mapEmptyMap);
        this.f14228c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f14228c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f14228c.setWebViewClient(this.f14227b);
        this.f14228c.getSettings().setSupportMultipleWindows(true);
        this.f14228c.setWebChromeClient(new i(this));
        h.registerReceiver(this, this.f14226a, this.f14229d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f14226a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !this.f14228c.canGoBack()) {
            return super.onKeyDown(i7, keyEvent);
        }
        this.f14228c.goBack();
        return true;
    }
}
