package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.si;
import java.net.URI;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ConsentActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private WebView f3197a;

    /* renamed from: b, reason: collision with root package name */
    private String f3198b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3199c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f3197a;
        if (webView == null) {
            this.f3199c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f3198b;
        if (str != null && url != null && url.contains(str)) {
            this.f3197a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f3197a.canGoBack()) {
            this.f3197a.goBack();
        } else {
            this.f3199c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f3198b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView c3 = ((rk) com.startapp.sdk.components.a.a(this).f3355b.a()).c();
                this.f3197a = c3;
                c3.setWebViewClient(new a(this));
                this.f3197a.getSettings().setJavaScriptEnabled(true);
                this.f3197a.setHorizontalScrollBarEnabled(false);
                this.f3197a.setVerticalScrollBarEnabled(false);
                this.f3197a.getSettings().setTextZoom(100);
                this.f3197a.loadUrl(dataString);
                this.f3197a.setBackgroundColor(0);
                this.f3197a.setLayerType(1, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f3197a, layoutParams2);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        ConsentConfig r3 = MetaData.E().r();
        if (!this.f3199c && r3 != null && r3.k()) {
            WeakHashMap weakHashMap = si.f4343a;
            if (((f6) com.startapp.sdk.components.a.a(this).f3372t.a()).b() && si.c(this)) {
                d9 d9Var = new d9(e9.f3617d);
                d9Var.f3574d = "ConsentActivityHasBeenCovered";
                d9Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th) {
                    d9.a(th);
                }
            }
        }
        g6 g6Var = (g6) com.startapp.sdk.components.a.a(this).f3362j.a();
        g6Var.f3754e = false;
        if (g6.a(4)) {
            d9 d9Var2 = new d9(e9.f3617d);
            d9Var2.f3574d = "CNS.closed";
            d9Var2.f3575e = String.valueOf(System.currentTimeMillis());
            d9Var2.a();
        }
        Intent intent = g6Var.f3753d;
        if (intent != null) {
            try {
                g6Var.f3750a.startActivity(intent);
            } catch (Throwable th2) {
                if (g6.a(8)) {
                    d9.a(th2);
                }
            }
        }
    }
}
