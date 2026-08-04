package com.pichillilorenzo.flutter_inappwebview_android;

import A5.o;
import A5.r;
import A5.s;
import R0.d;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewFeatureManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("isStartupFeatureSupported")) {
            if (str.equals("isFeatureSupported")) {
                rVar.success(Boolean.valueOf(d.a((String) oVar.a("feature"))));
                return;
            } else {
                rVar.notImplemented();
                return;
            }
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
            return;
        }
        rVar.success(Boolean.valueOf(d.b(this.plugin.activity, (String) oVar.a("startupFeature"))));
    }
}
