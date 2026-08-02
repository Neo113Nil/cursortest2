package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceError;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class WebResourceErrorProxyApi extends PigeonApiWebResourceError {
    public WebResourceErrorProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceError
    @NonNull
    public String description(@NonNull WebResourceError webResourceError) {
        return webResourceError.getDescription().toString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceError
    public long errorCode(@NonNull WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
