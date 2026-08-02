package com.odehbros.flutter_file_downloader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes4.dex */
public class a implements FlutterPlugin, ActivityAware {
    public final com.odehbros.flutter_file_downloader.permissions.a a = new com.odehbros.flutter_file_downloader.permissions.a();

    @Nullable
    public e b;

    @Nullable
    public ActivityPluginBinding c;

    @Nullable
    public com.odehbros.flutter_file_downloader.downloader.a d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.c = activityPluginBinding;
        com.odehbros.flutter_file_downloader.permissions.a aVar = this.a;
        if (activityPluginBinding != null) {
            activityPluginBinding.addRequestPermissionsResultListener(aVar);
        }
        if (this.b != null) {
            aVar.a = activityPluginBinding.getActivity();
            this.b.b = activityPluginBinding.getActivity();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e eVar = new e(this.a);
        this.b = eVar;
        flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        MethodChannel methodChannel = eVar.e;
        if (methodChannel != null && methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            eVar.e = null;
        }
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, "com.abdallah.libs/file_downloader");
        eVar.e = methodChannel2;
        methodChannel2.setMethodCallHandler(eVar);
        this.d = new com.odehbros.flutter_file_downloader.downloader.a(this.b);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
            applicationContext.registerReceiver(this.d, intentFilter);
        } else {
            applicationContext.registerReceiver(this.d, intentFilter, 2);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(this.a);
        }
        e eVar = this.b;
        if (eVar != null) {
            eVar.b = null;
        }
        if (this.c != null) {
            this.c = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        flutterPluginBinding.getApplicationContext().unregisterReceiver(this.d);
        e eVar = this.b;
        if (eVar != null) {
            MethodChannel methodChannel = eVar.e;
            if (methodChannel != null) {
                methodChannel.setMethodCallHandler(null);
                eVar.e = null;
            }
            this.b.b = null;
            this.b = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
