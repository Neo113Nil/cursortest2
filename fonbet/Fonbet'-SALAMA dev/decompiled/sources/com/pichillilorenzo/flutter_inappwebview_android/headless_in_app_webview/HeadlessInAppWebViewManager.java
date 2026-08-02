package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import A5.o;
import A5.r;
import A5.s;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import io.sentry.protocol.Message;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HeadlessInAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
    public InAppWebViewFlutterPlugin plugin;
    public final Map<String, HeadlessInAppWebView> webViews;

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.webViews = new HashMap();
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        for (HeadlessInAppWebView headlessInAppWebView : this.webViews.values()) {
            if (headlessInAppWebView != null) {
                headlessInAppWebView.dispose();
            }
        }
        this.webViews.clear();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = (String) oVar.a("id");
        String str2 = oVar.f676a;
        str2.getClass();
        if (!str2.equals("run")) {
            rVar.notImplemented();
        } else {
            run(str, (HashMap) oVar.a(Message.JsonKeys.PARAMS));
            rVar.success(Boolean.TRUE);
        }
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            Context context = inAppWebViewFlutterPlugin.activity;
            if (context == null && inAppWebViewFlutterPlugin.applicationContext == null) {
                return;
            }
            if (context == null) {
                context = inAppWebViewFlutterPlugin.applicationContext;
            }
            FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, context, str, hashMap);
            HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
            this.webViews.put(str, headlessInAppWebView);
            headlessInAppWebView.prepare(hashMap);
            headlessInAppWebView.onWebViewCreated();
            flutterWebView.makeInitialLoad(hashMap);
        }
    }
}
