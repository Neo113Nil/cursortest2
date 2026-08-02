package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import live.football.scorerepublic.MainActivity;
import live.football.scorerepublic.R;
import live.football.scorerepublic.WebViewFragment;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public WebResourceError f9309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebViewFragment f9310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi1 f9311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f9312d;

    public yi1(WebViewFragment webViewFragment, zi1 zi1Var, String str) {
        this.f9310b = webViewFragment;
        this.f9311c = zi1Var;
        this.f9312d = str;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f9310b.f4814i0.m3175e(this.f9311c.f9799c.canGoBack());
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [wi1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [xi1] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(final WebView webView, final String str) {
        super.onPageFinished(webView, str);
        final WebViewFragment webViewFragment = this.f9310b;
        webViewFragment.f4812g0.set(true);
        this.f9311c.f9798b.setVisibility(8);
        if (webView == null) {
            return;
        }
        if (webViewFragment.m865g() != null) {
            AbstractActivityC0790v4 abstractActivityC0790v4M865g = webViewFragment.m865g();
            abstractActivityC0790v4M865g.getClass();
            ((MainActivity) abstractActivityC0790v4M865g).f4806J.set(true);
        }
        WebResourceError webResourceError = this.f9309a;
        CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
        if (description == null) {
            webView.setVisibility(0);
            return;
        }
        Log.e("WebView", "Finished loading in error state");
        String string = webView.getContext().getString(R.string.app_load_error_message, description);
        string.getClass();
        webView.setVisibility(8);
        if (webViewFragment.m865g() != null) {
            AbstractActivityC0790v4 abstractActivityC0790v4M865g2 = webViewFragment.m865g();
            if (abstractActivityC0790v4M865g2 == null || !abstractActivityC0790v4M865g2.isFinishing()) {
                C0678s3 c0678s3 = new C0678s3(webView.getContext());
                C0530o3 c0530o3 = (C0530o3) c0678s3.f7022k;
                ContextThemeWrapper contextThemeWrapper = c0530o3.f5586a;
                ContextThemeWrapper contextThemeWrapper2 = c0530o3.f5586a;
                c0530o3.f5589d = contextThemeWrapper.getText(R.string.app_load_error_title);
                c0530o3.f5591f = string;
                ?? r6 = new DialogInterface.OnClickListener() { // from class: wi1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        String str2 = str;
                        str2.getClass();
                        webView.loadUrl(str2);
                    }
                };
                c0530o3.f5592g = contextThemeWrapper2.getText(R.string.app_load_error_retry);
                c0530o3.f5593h = r6;
                ?? r7 = new DialogInterface.OnClickListener() { // from class: xi1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AbstractActivityC0790v4 abstractActivityC0790v4M865g3 = webViewFragment.m865g();
                        if (abstractActivityC0790v4M865g3 != null) {
                            abstractActivityC0790v4M865g3.finish();
                        }
                    }
                };
                c0530o3.f5594i = contextThemeWrapper2.getText(R.string.app_load_error_exit);
                c0530o3.f5595j = r7;
                c0678s3.m4471a().show();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f9309a = null;
        this.f9311c.f9798b.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.f9309a = webResourceError;
        Log.e("WebView", "Error loading page: " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (fb1.m1759u(str, this.f9312d)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            WebViewFragment webViewFragment = this.f9310b;
            e50 e50Var = webViewFragment.f1100D;
            if (e50Var != null) {
                e50Var.f1952o.startActivity(intent, null);
                return true;
            }
            throw new IllegalStateException("Fragment " + webViewFragment + " not attached to Activity");
        } catch (Exception e) {
            Log.e("WebView", "Error opening URL via intent: ".concat(str), e);
            try {
                C0312i6 c0312i6M5176g = new C0809vn().m5176g();
                Context context = webView.getContext();
                Uri uri = Uri.parse(str);
                Intent intent2 = (Intent) c0312i6M5176g.f3447k;
                intent2.setData(uri);
                context.startActivity(intent2, (Bundle) c0312i6M5176g.f3448l);
                return true;
            } catch (Exception e2) {
                Log.e("WebView", "Error opening URL via CustomTabsIntent: ".concat(str), e2);
                return true;
            }
        }
    }
}
