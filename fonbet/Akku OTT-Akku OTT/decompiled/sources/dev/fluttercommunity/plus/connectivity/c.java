package dev.fluttercommunity.plus.connectivity;

import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes4.dex */
public final class c implements MethodChannel.MethodCallHandler {
    public final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        if (!"check".equals(methodCall.method)) {
            result.notImplemented();
        } else {
            ConnectivityManager connectivityManager = this.a.a;
            result.success(a.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
