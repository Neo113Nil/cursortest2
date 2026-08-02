package net.nfet.flutter.printing;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes5.dex */
public class i implements FlutterPlugin, ActivityAware {
    public Context a;
    public MethodChannel b;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        MethodChannel methodChannel;
        if (this.a != null) {
            this.a = null;
        }
        Activity activity = activityPluginBinding.getActivity();
        this.a = activity;
        if (activity == null || (methodChannel = this.b) == null) {
            return;
        }
        methodChannel.setMethodCallHandler(new b(activity, methodChannel));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "net.nfet.printing");
        this.b = methodChannel;
        Context context = this.a;
        if (context != null) {
            methodChannel.setMethodCallHandler(new b(context, methodChannel));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.b.setMethodCallHandler(null);
        this.a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.b.setMethodCallHandler(null);
        this.b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        MethodChannel methodChannel;
        this.a = null;
        Activity activity = activityPluginBinding.getActivity();
        this.a = activity;
        if (activity == null || (methodChannel = this.b) == null) {
            return;
        }
        methodChannel.setMethodCallHandler(new b(activity, methodChannel));
    }
}
