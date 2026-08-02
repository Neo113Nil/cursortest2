package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import A5.o;
import A5.r;
import A5.s;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProcessGlobalConfigManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProcessGlobalConfigM";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_processglobalconfig";
    public InAppWebViewFlutterPlugin plugin;

    public ProcessGlobalConfigManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings] */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("apply")) {
            rVar.notImplemented();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
            rVar.success(Boolean.FALSE);
            return;
        }
        try {
            ProcessGlobalConfig.a(new ProcessGlobalConfigSettings().parse2((Map<String, Object>) oVar.a("settings")).toProcessGlobalConfig(this.plugin.activity));
            rVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            rVar.error(LOG_TAG, "", e7);
        }
    }
}
