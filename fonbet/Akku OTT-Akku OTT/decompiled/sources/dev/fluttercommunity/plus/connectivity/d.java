package dev.fluttercommunity.plus.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes4.dex */
public class d implements FlutterPlugin {
    public MethodChannel a;
    public EventChannel b;
    public b c;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.b = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) applicationContext.getSystemService("connectivity"));
        c cVar = new c(aVar);
        this.c = new b(applicationContext, aVar);
        this.a.setMethodCallHandler(cVar);
        this.b.setStreamHandler(this.c);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a.setMethodCallHandler(null);
        this.b.setStreamHandler(null);
        this.c.onCancel(null);
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
