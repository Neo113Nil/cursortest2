package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import A5.s;
import P6.a;
import R0.d;
import R0.n;
import R0.o;
import R0.w;
import S0.B;
import S0.C0433d;
import S0.r;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import e1.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w1.L;

/* loaded from: classes2.dex */
public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<o> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        o[] oVarArr;
        this.id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new s(inAppWebViewInterface.getPlugin().messenger, L.i(METHOD_CHANNEL_NAME_PREFIX, str)));
        if (inAppWebViewInterface instanceof InAppWebView) {
            Uri uri = w.f5874a;
            S0.w.f6307w.getClass();
            android.webkit.WebMessagePort[] createWebMessageChannel = ((InAppWebView) inAppWebViewInterface).createWebMessageChannel();
            if (createWebMessageChannel == null) {
                oVarArr = null;
            } else {
                o[] oVarArr2 = new o[createWebMessageChannel.length];
                for (int i7 = 0; i7 < createWebMessageChannel.length; i7++) {
                    oVarArr2[i7] = new r(createWebMessageChannel[i7]);
                }
                oVarArr = oVarArr2;
            }
            this.compatPorts = new ArrayList(Arrays.asList(oVarArr));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, A5.r rVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_CLOSE")) {
            rVar.success(Boolean.TRUE);
            return;
        }
        try {
            r rVar2 = (r) this.compatPorts.get(num.intValue());
            rVar2.getClass();
            S0.w.f6304t.getClass();
            rVar2.d().close();
            rVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            rVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (d.a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<o> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    r rVar = (r) it.next();
                    rVar.getClass();
                    S0.w.f6304t.getClass();
                    rVar.d().close();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(this);
            return;
        }
        StringBuilder sb = new StringBuilder("(function() {");
        sb.append(JavaScriptBridgeJS.WEB_MESSAGE_CHANNELS_VARIABLE_NAME());
        sb.append("['");
        inAppWebViewInterface.evaluateJavascript(k.i(sb, this.id, "'] = new MessageChannel();})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue(this);
            }
        });
    }

    public void onMessage(int i7, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i7, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, A5.r rVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            rVar.success(Boolean.TRUE);
            return;
        }
        o oVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) {
                oVar.a(new n((byte[]) data, (o[]) arrayList.toArray(new o[0])));
            } else {
                oVar.a(new n(data != null ? data.toString() : null, (o[]) arrayList.toArray(new o[0])));
            }
            rVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            rVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i7, A5.r rVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            rVar.success(Boolean.TRUE);
            return;
        }
        o oVar = this.compatPorts.get(i7);
        try {
            d dVar = new d() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                @Override // R0.d
                public void onMessage(o oVar2, n nVar) {
                    this.onMessage(i7, nVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(nVar) : null);
                }
            };
            r rVar2 = (r) oVar;
            rVar2.getClass();
            if (S0.w.f6306v.b()) {
                rVar2.c().setWebMessageCallback(new a(new B(dVar, 3)));
            } else {
                rVar2.d().setWebMessageCallback(new C0433d(dVar));
            }
            rVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            rVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }
}
