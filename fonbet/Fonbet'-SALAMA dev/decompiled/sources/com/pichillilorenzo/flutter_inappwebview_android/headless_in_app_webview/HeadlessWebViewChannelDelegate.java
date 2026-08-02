package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import A5.o;
import A5.r;
import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, s sVar) {
        super(sVar);
        this.headlessWebView = headlessInAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "getSize":
                HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
                if (headlessInAppWebView == null) {
                    rVar.success(null);
                    break;
                } else {
                    Size2D size = headlessInAppWebView.getSize();
                    rVar.success(size != null ? size.toMap() : null);
                    break;
                }
            case "dispose":
                HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
                if (headlessInAppWebView2 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    headlessInAppWebView2.dispose();
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case "setSize":
                if (this.headlessWebView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    Size2D fromMap = Size2D.fromMap((Map) oVar.a(RRWebVideoEvent.JsonKeys.SIZE));
                    if (fromMap != null) {
                        this.headlessWebView.setSize(fromMap);
                    }
                    rVar.success(Boolean.TRUE);
                    break;
                }
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void onWebViewCreated() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onWebViewCreated", new HashMap(), null);
    }
}
