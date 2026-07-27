package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4315t extends WebChromeClient implements InterfaceC0947 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebChromeClient f284;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f283 = StringFog.decrypt("fCf7WApfad5OAfVyB0Ny904h9mkDWWnB\n", "K0KZG2ItBrM=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f282 = StringFog.decrypt("NPuJj0FPKG42+qq9UW0wbDzzmJtfRz1wJw==\n", "U5792DMuWB4=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f281 = StringFog.decrypt("vlQB8EBUv1GaWQfLT2aZX7BUG9A=\n", "2TF1pCID2jM=\n");

    public C4315t(WebChromeClient webChromeClient) {
        this.f284 = webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        try {
            this.f284.getDefaultVideoPoster();
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("zX5kmhskFDeoYUKXJW0OLe1ic4dJYxgtzGlwlBxoCQ/haHOaOWsOLe1+\n", "iAwW9WkEfVk=\n"), th, false);
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        try {
            this.f284.getVideoLoadingProgressView();
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("aFrEq/uDMp8NReKmxcoohUhG07apxD6Fe0HSoebvNJBJQdij2dE0ll9Nxbffyj6G\n", "LSi2xImjW/E=\n"), th, false);
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback valueCallback) {
        try {
            this.f284.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("K/at62Tl41tO6YvmWqz5QQvquvY2ou9BOO2s7WKg7n0H96vrZLw=\n", "boTfhBbFijU=\n"), th, false);
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        try {
            this.f284.onCloseWindow(webView);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("gbQ57BYRq5Lkqx/hKFixiKGoLvFEXqy/qKk45jNYrJirsQ==\n", "xMZLg2Qxwvw=\n"), th, false);
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        try {
            this.f284.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("FxNRGnfm1DdyDHcXSa/OLTcPRgclqdMaPQ9QGmmj8DwhEkISYA==\n", "UmEjdQXGvVk=\n"), th, false);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        try {
            this.f284.onCreateWindow(webView, z, z2, message);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("/RiZ3/z7vgyYB7/SwrKkFt0EjsKutLkhyg+KxOuMvgzcBZw=\n", "uGrrsI7b12I=\n"), th, false);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        try {
            this.f284.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("+mkcTAK09tWfdjpBPP3sz9p1C1FQ+/H+x3gLRhTx+//ebw9BEef66sp0GkI=\n", "vxtuI3CUn7s=\n"), th, false);
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        try {
            this.f284.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("R23f2I9RrX4icvnVsRi3ZGdxyMXdHqpXZ3DB2J4QsHltcf3SjxytY3F2wtmOOa10Z0/f2JABsA==\n", "Ah+tt/1xxBA=\n"), th, false);
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        try {
            this.f284.onGeolocationPermissionsShowPrompt(str, callback);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("Mw/eksrYJqBWEPif9JE8uhMTyY+YlyGJExLAktuZO6cZE/yYypUmvQUUw5PLqyehAS3ektWIOw==\n", "dn2s/bj4T84=\n"), th, false);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        try {
            this.f284.onHideCustomView();
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("6P6/H56yU4mN4ZkSoPtJk8jiqALM/VSvxOioM5nhTojA2qQVmw==\n", "rYzNcOySOuc=\n"), th, false);
        }
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f284.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("i5O8/Wnp3lnujJrwV6DEQ6uPq+A7ptl9vaCi92m9\n", "zuHOkhvJtzc=\n"), th, false);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f284.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("IBH0U/bFaCRFDtJeyIxyPgAN406kim8AFiHjWuuXZB8LD+ld4A==\n", "ZWOGPITlAUo=\n"), th, false);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f284.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("ZtL7mFIvfr8Dzd2VbGZkpUbO7IUAYHmbUOPmmUZmZbw=\n", "I6CJ9yAPF9E=\n"), th, false);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            this.f284.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("sHDPh+s0guzVb+mK1X2Y9pBs2Jq5e4XIhlLPh/Rknw==\n", "9QK96JkU64I=\n"), th, false);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        try {
            this.f284.onJsTimeout();
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("uhcM477IoOjfCCrugIG68poLG/7sh6fMjDEX4amHvPI=\n", "/2V+jMzoyYY=\n"), th, false);
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        try {
            this.f284.onProgressChanged(webView, i);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("mmQiwpUpv2v/ewTPq2Clcbp4Nd/HZrhVrXk334J6pUa3dz7Kgm0=\n", "3xZQrecJ1gU=\n"), th, false);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        try {
            this.f284.onReceivedIcon(webView, bitmap);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("VCP2NCrJTnIxPNA5FIBUaHQ/4Sl4hklOdDLhMi6MQ1VyPuo=\n", "EVGEW1jpJxw=\n"), th, false);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        try {
            this.f284.onReceivedTitle(webView, str);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("/TB5ln040tKYL1+bQ3HIyN0sbosvd9Xu3SFukHl93+jRNmec\n", "uEIL+Q8Yu7w=\n"), th, false);
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        try {
            this.f284.onReceivedTouchIconUrl(webView, str, z);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("cFsaEoQsOiEVRDwfumUgO1BHDQ/WYz0dUEoNFIBpNxtaXAsVv288IWBbBA==\n", "NSloffYMU08=\n"), th, false);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        try {
            this.f284.onRequestFocus(webView);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("KlJ4ETowfAFPTV4cBHlmGwpObwxof3s9ClF/GztkUwAMVXk=\n", "byAKfkgQFW8=\n"), th, false);
        }
        super.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f284.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("KkBl3JGjcjRPX0PRr+poLgpccsHD7HUJB11g8JbwbzUCZH7WlA==\n", "bzIXs+ODG1o=\n"), th, false);
        }
        super.onShowCustomView(view, customViewCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0947
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5313(C1226 c1226, String str, ArrayList arrayList, C0807 c0807, C1074 c1074) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.m5929(), AbstractC1257.m5940("AQ==\n", "Jj/9JmF2sW8=\n", AbstractC1196.m5920("4+7mzMqjudXP8PGD3fur3tPo/c3fo5nYxN/80dfuq/7K9fHNzMer3snu9dfX8e7Tx+j91d2jo9jS\n9PvHmKQ=\n", "ppyUo7iDzr0=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 1395849045) {
            if (hashCode == 1442029578 && str.equals(f282)) {
                c = 0;
                if (c != 0) {
                    return null;
                }
                if (c == 1) {
                    return this.f284;
                }
                new C0440(c1226, c1074, f283, str).m5536(c1226.m5929());
                return null;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f281)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f284.onPermissionRequest(permissionRequest);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("wimxKIc77TCnNpcluXL3KuI1pjXVdOoO4imuLoZo7THpCaY2gH73Kg==\n", "h1vDR/UbhF4=\n"), th, false);
        }
        try {
            super.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0480.m5464(f283, StringFog.decrypt("/0eGc83Xc8GaVpVw0550yJpahnXYnnSP1Vukec2ac9zJXJty7ZJr2t9GgA==\n", "ujX0HL/3Gq8=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f284.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("RmgkWL7dopUjdwJVgJS4j2Z0M0XskqWrZmg7Xr+OopRtSDNGuZi4j0B7OFSpka6f\n", "AxpWN8z9y/s=\n"), th, false);
        }
        try {
            super.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0480.m5464(f283, StringFog.decrypt("ruvNDGNtvprL+t4PfSS5k8v2zQp2JLnUhPfvBmMgvoeY8NANQyimgY7qyyBwI7SRh/zb\n", "65m/YxFN1/Q=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        try {
            this.f284.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("BfyEflb7H2Jg46JzaLIFeCXgk2MEtBhfKOGBV023E08o4ZliQak=\n", "QI72ESTbdgw=\n"), th, false);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f284.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("rBRrziqr+gbJC03DFOLgHIwIfNN45P0rhghqzjTu3g2aFXjGPQ==\n", "6WYZoViLk2g=\n"), th, false);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f284.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            AbstractC0480.m5464(f283, StringFog.decrypt("xvTLu9cgbxaj6+226Wl1DObo3KaFb2gr6+nOl9Bzchfu0NCx0g==\n", "g4a51KUABng=\n"), th, false);
        }
        super.onShowCustomView(view, i, customViewCallback);
    }
}
