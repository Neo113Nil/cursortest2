package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import androidx.webkit.TracingController;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        TracingController tracingController;
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        tracingController = TracingControllerManager.tracingController;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "isTracing":
                if (tracingController == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    result.success(Boolean.valueOf(tracingController.isTracing()));
                    break;
                }
            case "stop":
                if (tracingController != null && WebViewFeature.isFeatureSupported(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE)) {
                    String str2 = (String) methodCall.argument("filePath");
                    if (str2 != null) {
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                            result.success(Boolean.FALSE);
                            return;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    result.success(Boolean.valueOf(tracingController.stop(fileOutputStream, Executors.newSingleThreadExecutor())));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "start":
                if (tracingController != null && WebViewFeature.isFeatureSupported(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE)) {
                    Map<String, Object> map = (Map) methodCall.argument("settings");
                    TracingSettings tracingSettings = new TracingSettings();
                    tracingSettings.parse2(map);
                    tracingController.start(TracingControllerManager.buildTracingConfig(tracingSettings));
                    result.success(Boolean.TRUE);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
            default:
                result.notImplemented();
                break;
        }
    }
}
