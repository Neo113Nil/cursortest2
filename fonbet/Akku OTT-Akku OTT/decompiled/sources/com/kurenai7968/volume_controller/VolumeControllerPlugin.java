package com.kurenai7968.volume_controller;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.engine.q;
import com.google.android.datatransport.runtime.scheduling.persistence.n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/kurenai7968/volume_controller/VolumeControllerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "volumeController", "Lcom/kurenai7968/volume_controller/VolumeController;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onDetachedFromEngine", "binding", "volume_controller_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: com.kurenai7968.volume_controller.b, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class VolumeControllerPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public n a;
    public MethodChannel b;
    public EventChannel c;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object systemService = applicationContext.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        c cVar = new c(applicationContext, audioManager);
        this.a = new n(audioManager);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.kurenai7968.volume_controller.volume_listener_event");
        this.c = eventChannel;
        eventChannel.setStreamHandler(cVar);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.kurenai7968.volume_controller.method");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.b;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        EventChannel eventChannel = this.c;
        if (eventChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            n nVar = null;
            switch (str.hashCode()) {
                case 670514716:
                    if (str.equals("setVolume")) {
                        Object argument = call.argument("volume");
                        Intrinsics.checkNotNull(argument);
                        double doubleValue = ((Number) argument).doubleValue();
                        Object argument2 = call.argument("showSystemUI");
                        Intrinsics.checkNotNull(argument2);
                        boolean booleanValue = ((Boolean) argument2).booleanValue();
                        n nVar2 = this.a;
                        if (nVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("volumeController");
                            nVar2 = null;
                        }
                        nVar2.a(doubleValue, booleanValue);
                        result.success(null);
                        return;
                    }
                    break;
                case 885131792:
                    if (str.equals("getVolume")) {
                        n nVar3 = this.a;
                        if (nVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("volumeController");
                        } else {
                            nVar = nVar3;
                        }
                        result.success(Double.valueOf(q.a((AudioManager) nVar.a)));
                        return;
                    }
                    break;
                case 1984790939:
                    if (str.equals("setMute")) {
                        Object argument3 = call.argument("isMute");
                        Intrinsics.checkNotNull(argument3);
                        boolean booleanValue2 = ((Boolean) argument3).booleanValue();
                        Object argument4 = call.argument("showSystemUI");
                        Intrinsics.checkNotNull(argument4);
                        boolean booleanValue3 = ((Boolean) argument4).booleanValue();
                        n nVar4 = this.a;
                        if (nVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("volumeController");
                            nVar4 = null;
                        }
                        if (booleanValue2) {
                            nVar4.b = Double.valueOf(q.a((AudioManager) nVar4.a));
                            nVar4.a(0.0d, booleanValue3);
                        } else {
                            Double d = (Double) nVar4.b;
                            if (d != null) {
                                nVar4.a(d.doubleValue(), booleanValue3);
                                nVar4.b = null;
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 2065669729:
                    if (str.equals("isMuted")) {
                        n nVar5 = this.a;
                        if (nVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("volumeController");
                        } else {
                            nVar = nVar5;
                        }
                        result.success(Boolean.valueOf(q.a((AudioManager) nVar.a) == 0.0d));
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
