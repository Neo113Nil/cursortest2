package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import A5.f;
import A5.r;
import A5.s;
import R0.a;
import R0.d;
import R0.n;
import R0.v;
import S0.i;
import S0.q;
import S0.w;
import W5.AbstractC0486a1;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public v listener;
    public a replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, f fVar, String str2, Set<String> set) {
        this.id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new s(fVar, METHOD_CHANNEL_NAME_PREFIX + this.id + "_" + this.jsObjectName));
        if (this.webView instanceof InAppWebView) {
            this.listener = new v() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // R0.v
                public void onPostMessage(WebView webView, n nVar, Uri uri, boolean z4, a aVar) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = aVar;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(nVar), uri.toString().equals("null") ? null : uri.toString(), z4);
                    }
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, f fVar, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, fVar, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() throws Exception {
        int i7 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception(AbstractC0486a1.f(i7, "allowedOriginRules[", "] is null"));
            }
            if (str.isEmpty()) {
                throw new Exception(AbstractC0486a1.f(i7, "allowedOriginRules[", "] is empty"));
            }
            if (!"*".equals(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                int port = uri.getPort();
                if (scheme == null) {
                    throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                }
                if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                }
                if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                }
                if (!path.isEmpty()) {
                    throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                }
                if (host != null) {
                    int iIndexOf = host.indexOf("*");
                    if (iIndexOf != 0 || (iIndexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception(AbstractC0486a1.h("allowedOriginRules ", str, " is invalid"));
                        }
                    }
                }
                i7++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        if (this.webView != null) {
            String strReplaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if ("*".equals(str)) {
                    arrayList.add("'*'");
                } else {
                    Uri uri = Uri.parse(str);
                    String str2 = uri.getHost() != null ? "'" + Util.replaceAll(uri.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb = new StringBuilder("{scheme: '");
                    sb.append(uri.getScheme());
                    sb.append("', host: ");
                    sb.append(str2);
                    sb.append(", port: ");
                    sb.append(uri.getPort() != -1 ? Integer.valueOf(uri.getPort()) : "null");
                    sb.append("}");
                    arrayList.add(sb.toString());
                }
            }
            StringBuilder sbK = k.k("(function() {  var allowedOriginRules = [", TextUtils.join(", ", arrayList), "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.");
            sbK.append(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
            sbK.append("._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['");
            sbK.append(strReplaceAll);
            sbK.append("'] = new FlutterInAppWebViewWebMessageListener('");
            sbK.append(strReplaceAll);
            sbK.append("');  }})();");
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, sbK.toString(), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, this.webView.getCustomSettings().pluginScriptsOriginAllowList, this.webView.getCustomSettings().pluginScriptsForMainFrameOnly.booleanValue()));
        }
    }

    public boolean isOriginAllowed(String str, String str2, int i7) {
        int port;
        String strNormalizeIPv6;
        Iterator<String> it = this.allowedOriginRules.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            if ("*".equals(next)) {
                return true;
            }
            if (str != null && !str.isEmpty() && (!str.isEmpty() || ((str2 != null && !str2.isEmpty()) || (i7 != 0 && i7 != -1)))) {
                Uri uri = Uri.parse(next);
                int i8 = 80;
                if (uri.getPort() == -1 || uri.getPort() == 0) {
                    port = "https".equals(uri.getScheme()) ? 443 : 80;
                } else {
                    port = uri.getPort();
                }
                if (i7 != 0 && i7 != -1) {
                    i8 = i7;
                } else if ("https".equals(str)) {
                    i8 = 443;
                }
                String strNormalizeIPv7 = null;
                if (uri.getHost() == null || !uri.getHost().startsWith("[")) {
                    strNormalizeIPv6 = null;
                } else {
                    try {
                        strNormalizeIPv6 = Util.normalizeIPv6(uri.getHost().substring(1, uri.getHost().length() - 1));
                    } catch (Exception unused) {
                        strNormalizeIPv6 = null;
                    }
                }
                try {
                    strNormalizeIPv7 = Util.normalizeIPv6(str2);
                } catch (Exception unused2) {
                }
                boolean zEquals = uri.getScheme().equals(str);
                boolean z4 = uri.getHost() == null || uri.getHost().isEmpty() || uri.getHost().equals(str2) || (uri.getHost().startsWith("*") && str2 != null && str2.contains(uri.getHost().split("\\*")[1])) || !(strNormalizeIPv7 == null || strNormalizeIPv6 == null || !strNormalizeIPv7.equals(strNormalizeIPv6));
                boolean z7 = port == i8;
                if (zEquals && z4 && z7) {
                    return true;
                }
            }
        }
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, r rVar) {
        Object data;
        if (this.replyProxy != null && d.a("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
            if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                byte[] bArr = (byte[]) data;
                i iVar = (i) this.replyProxy;
                iVar.getClass();
                if (!w.f6305u.b()) {
                    throw w.a();
                }
                iVar.f6242a.postMessageWithPayload(new P6.a(new q(bArr)));
            } else {
                a aVar = this.replyProxy;
                String string = data.toString();
                i iVar2 = (i) aVar;
                iVar2.getClass();
                if (!w.f6276J.b()) {
                    throw w.a();
                }
                iVar2.f6242a.postMessage(string);
            }
        }
        rVar.success(Boolean.TRUE);
    }
}
