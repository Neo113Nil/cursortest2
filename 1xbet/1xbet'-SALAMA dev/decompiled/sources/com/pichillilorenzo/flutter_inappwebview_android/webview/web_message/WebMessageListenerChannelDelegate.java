package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import A5.o;
import A5.r;
import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener, s sVar) {
        super(sVar);
        this.webMessageListener = webMessageListener;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("postMessage")) {
            rVar.notImplemented();
            return;
        }
        WebMessageListener webMessageListener = this.webMessageListener;
        if (webMessageListener == null || !(webMessageListener.webView instanceof InAppWebView)) {
            rVar.success(Boolean.FALSE);
        } else {
            this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) oVar.a("message")), rVar);
        }
    }

    public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z4) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
        map.put("sourceOrigin", str);
        map.put("isMainFrame", Boolean.valueOf(z4));
        channel.a("onPostMessage", map, null);
    }
}
