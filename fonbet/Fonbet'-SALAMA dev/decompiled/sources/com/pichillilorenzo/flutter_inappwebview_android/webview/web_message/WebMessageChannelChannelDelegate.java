package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import A5.o;
import A5.r;
import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
    private WebMessageChannel webMessageChannel;

    public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel, s sVar) {
        super(sVar);
        this.webMessageChannel = webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }

    public void onMessage(int i7, WebMessageCompatExt webMessageCompatExt) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i7));
        hashMap.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
        channel.a("onMessage", hashMap, null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "close":
                WebMessageChannel webMessageChannel = this.webMessageChannel;
                if (webMessageChannel != null && (webMessageChannel.webView instanceof InAppWebView)) {
                    this.webMessageChannel.closeForInAppWebView((Integer) oVar.a("index"), rVar);
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setWebMessageCallback":
                WebMessageChannel webMessageChannel2 = this.webMessageChannel;
                if (webMessageChannel2 != null && (webMessageChannel2.webView instanceof InAppWebView)) {
                    this.webMessageChannel.setWebMessageCallbackForInAppWebView(((Integer) oVar.a("index")).intValue(), rVar);
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "postMessage":
                WebMessageChannel webMessageChannel3 = this.webMessageChannel;
                if (webMessageChannel3 != null && (webMessageChannel3.webView instanceof InAppWebView)) {
                    this.webMessageChannel.postMessageForInAppWebView((Integer) oVar.a("index"), WebMessageCompatExt.fromMap((Map) oVar.a("message")), rVar);
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }
}
