package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0454 extends WebViewApp implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f841;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f842;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewApp f843;

    public C0454(C0449 c0449, WebViewApp webViewApp, C0807 c0807) {
        this.f841 = c0449;
        this.f843 = webViewApp;
        this.f842 = c0807;
    }

    public final void addCallback(NativeCallback nativeCallback) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("mmVxBRo5mNC9cD0yFzis8KFscTIQNw==\n", "zQATU3Nc75E=\n"), nativeCallback);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.addCallback(nativeCallback);
        }
    }

    public final NativeCallback getCallback(String str) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("Sqm5HDVipwFtvPUtOXOTIXGguSs/bA==\n", "HczbSlwH0EA=\n"), str);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getCallback(str);
        }
        return null;
    }

    public final Configuration getConfiguration() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("1ap5zTjuL0TyvzX8NP8bauypcvwk+Tlx66B1\n", "gs8bm1GLWAU=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getConfiguration();
        }
        return null;
    }

    public final ErrorState getErrorStateFromWebAppCode() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("CQqoIw3+8oouH+QSAe/AuSwAuCYQ+vGuGB2lGDP+54ouH4kaAP4=\n", "Xm/KdWSbhcs=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getErrorStateFromWebAppCode();
        }
        return null;
    }

    public final int getWebAppFailureCode() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("+A0/NS+EnRffGHMEI5W9M80pLRMAgIM62ho4ICmFjw==\n", "r2hdY0bh6lY=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureCode();
        }
        return 0;
    }

    public final String getWebAppFailureMessage() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("HBDXqrjw3E07BZubtOH8aSk0xYyX9MJgPgfQsbTm2G0sEA==\n", "S3W1/NGVqww=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureMessage();
        }
        return null;
    }

    public final WebView getWebView() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("NXq6rBsPtrISb/adFx6WlgBJsZ8F\n", "Yh/Y+nJqwfM=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.getWebView();
        }
        return null;
    }

    public final boolean invokeCallback(Invocation invocation) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("WsRcu7kBAbR90RCEvhIZnmjiX4G8BheWZg==\n", "DaE+7dBkdvU=\n"), invocation);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.invokeCallback(invocation);
        }
        return false;
    }

    public final boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("cwvYx19NvNNUHpT4WF6k+UEj3+VeR68=\n", "JG66kTYoy5I=\n"), str, str2, method, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }
        return false;
    }

    public final boolean isWebAppInitialized() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("TkngEd0G1SlpXKwuxzTHClhc8g7aCtYBeEDrPdEH\n", "GSyCR7Rjomg=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.isWebAppInitialized();
        }
        return false;
    }

    public final boolean isWebAppLoaded() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("lS86vPjWItqyOnaD4uQw+YM6KKb+0jH+pg==\n", "wkpY6pGzVZs=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.isWebAppLoaded();
        }
        return false;
    }

    public final void removeCallback(NativeCallback nativeCallback) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("swpGqNUbyTGUHwqM2RPRBoEsRZLQHN8Tjw==\n", "5G8k/rx+vnA=\n"), nativeCallback);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.removeCallback(nativeCallback);
        }
    }

    public final void resetWebViewAppInitialization() {
        this.f841.m5529(this, this.f842, StringFog.decrypt("I8Pa6UueRswE1pbNR4hU+SPD2ulLnkbMBNbx0UuPWOwYz8LeVpJe4w==\n", "dKa4vyL7MY0=\n"), new Object[0]);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.resetWebViewAppInitialization();
        }
    }

    public final boolean sendEvent(Enum r5, Enum r6, Object... objArr) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("+6LYNMt8LC3ct5QRx3c/Kdqi1BY=\n", "rMe6YqIZW2w=\n"), r5, r6, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            return webViewApp.sendEvent(r5, r6, objArr);
        }
        return false;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("KPhuKvDHJ1IP7SIP/NYTfBH7ZRvs0DFnFvJi\n", "f50MfJmiUBM=\n"), configuration);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setConfiguration(configuration);
        }
    }

    public final void setWebAppFailureCode(int i) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("PmWfVElvyNUZcNNxRX7o8QtBjXJma9b4HHKYQU9u2g==\n", "aQD9AiAKv5Q=\n"), Integer.valueOf(i));
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureCode(i);
        }
    }

    public final void setWebAppFailureMessage(String str) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("3Q2Y5Cf/Fcj6GNTBK+417OgpisII+wvl/xqf/yvpEejtDQ==\n", "imj6sk6aYok=\n"), str);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureMessage(str);
        }
    }

    public final void setWebAppInitialized(boolean z) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("jfJlIZk91pKq5ykElSz2trjWdwe5Nsins/ZrHoo9xQ==\n", "2pcHd/BYodM=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setWebAppInitialized(z);
        }
    }

    public final void setWebAppLoaded(boolean z) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("MfuG3SJTTV4W7sr4LkJtegTflPsHWVt7A/o=\n", "Zp7ki0s2Oh8=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setWebAppLoaded(z);
        }
    }

    public final void setWebView(WebView webView) {
        this.f841.m5529(this, this.f842, StringFog.decrypt("LMCOmeA7d34L1cK87CpXWhnzhar+\n", "e6Xsz4leAD8=\n"), webView);
        WebViewApp webViewApp = this.f843;
        if (webViewApp != null) {
            webViewApp.setWebView(webView);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f843;
    }
}
