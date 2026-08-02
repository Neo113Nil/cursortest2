package io.flutter.plugins.webviewflutter;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes3.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelProxyApi api;
    final String javaScriptChannelName;

    public JavaScriptChannel(@NonNull String str, @NonNull JavaScriptChannelProxyApi javaScriptChannelProxyApi) {
        this.javaScriptChannelName = str;
        this.api = javaScriptChannelProxyApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$postMessage$0(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.api.postMessage(this, str, new L(0));
    }

    @JavascriptInterface
    public void postMessage(@NonNull String str) {
        this.api.getPigeonRegistrar().runOnMainThread(new io.flutter.plugins.firebase.crashlytics.e(1, this, str));
    }
}
