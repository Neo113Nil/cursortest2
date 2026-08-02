package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
public final class c implements FlutterPlugin, ActivityAware {
    public d a;
    public MethodChannel b;

    @Nullable
    public ActivityPluginBinding c;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        d dVar = this.a;
        if (dVar != null) {
            dVar.c = activity;
        }
        this.c = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(dVar);
        this.c.addRequestPermissionsResultListener(this.a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = new d(flutterPluginBinding.getApplicationContext());
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.baseflow.com/permissions/methods");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(new b(applicationContext, new a(), this.a, new j()));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.c = null;
        }
        ActivityPluginBinding activityPluginBinding = this.c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(dVar);
            this.c.removeRequestPermissionsResultListener(this.a);
        }
        this.c = null;
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
    public final void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
