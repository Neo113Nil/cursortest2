package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import A5.s;
import R0.d;
import R0.k;
import R0.l;
import R0.m;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static m tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static k buildTracingConfig(TracingSettings tracingSettings) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : tracingSettings.categories) {
            if (obj instanceof String) {
                arrayList.addAll(Arrays.asList((String) obj));
            }
            if (obj instanceof Integer) {
                i7 |= new int[]{((Integer) obj).intValue()}[0];
            }
        }
        Integer num = tracingSettings.tracingMode;
        return new k(arrayList, i7, num != null ? num.intValue() : 1);
    }

    public static void init() {
        if (tracingController == null && d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = l.f5861a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
