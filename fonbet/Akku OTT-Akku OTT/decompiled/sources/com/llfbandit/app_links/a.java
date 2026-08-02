package com.llfbandit.app_links;

import android.content.Intent;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes4.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener {
    public MethodChannel a;
    public EventChannel b;
    public EventChannel.EventSink c;
    public ActivityPluginBinding d;
    public String e;
    public boolean f = false;
    public String i;

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        intent.toString();
        if ((intent.getFlags() & 1048576) == 1048576) {
            return false;
        }
        String action = intent.getAction();
        String dataString = ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) ? null : intent.getDataString();
        if (dataString == null) {
            return false;
        }
        if (this.e == null) {
            this.e = dataString;
        }
        this.i = dataString;
        EventChannel.EventSink eventSink = this.c;
        if (eventSink != null) {
            this.f = true;
            eventSink.success(dataString);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
        a(activityPluginBinding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/messages");
        this.a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/events");
        this.b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a.setMethodCallHandler(null);
        this.b.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        String str;
        this.c = eventSink;
        if (this.f || (str = this.e) == null) {
            return;
        }
        this.f = true;
        eventSink.success(str);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        if (methodCall.method.equals("getLatestLink")) {
            result.success(this.i);
        } else if (methodCall.method.equals("getInitialLink")) {
            result.success(this.e);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public final boolean onNewIntent(@NonNull Intent intent) {
        return a(intent);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
