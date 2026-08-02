package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.JavaScriptHandlerFunctionData;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.e;
import w1.L;

/* loaded from: classes2.dex */
public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    private final String expectedBridgeSecret;
    private InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView, String str) {
        this.inAppWebView = inAppWebView;
        this.expectedBridgeSecret = str;
    }

    @JavascriptInterface
    public void _callHandler(String str) {
        if (this.inAppWebView == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("handlerName") || jSONObject.isNull("handlerName")) {
                Log.d(LOG_TAG, "handlerName is null or undefined");
                return;
            }
            final String optString = jSONObject.optString("handlerName");
            String optString2 = jSONObject.optString("_bridgeSecret");
            final Integer valueOf = Integer.valueOf(jSONObject.optInt("_callHandlerID"));
            final String optString3 = jSONObject.optString("origin");
            final String optString4 = jSONObject.optString("requestUrl");
            boolean optBoolean = jSONObject.optBoolean("isMainFrame");
            final Boolean valueOf2 = Boolean.valueOf(optBoolean);
            final String optString5 = jSONObject.optString("args");
            if (!this.expectedBridgeSecret.equals(optString2)) {
                L.n("Bridge access attempt with wrong secret token, possibly from malicious code from origin: ", optString3, LOG_TAG);
                return;
            }
            Set<Pattern> set = this.inAppWebView.customSettings.javaScriptHandlersOriginAllowList;
            if (set != null) {
                Iterator<Pattern> it = set.iterator();
                while (it.hasNext()) {
                    if (it.next().matcher(optString3).matches()) {
                    }
                }
                L.n("Bridge access attempt from an origin not allowed: ", optString3, LOG_TAG);
                return;
            }
            if (!this.inAppWebView.customSettings.javaScriptHandlersForMainFrameOnly.booleanValue() || optBoolean) {
                new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                            return;
                        }
                        String str2 = optString;
                        str2.getClass();
                        switch (str2) {
                            case "evaluateJavaScriptWithContentWorld":
                                try {
                                    JSONObject jSONObject2 = new JSONArray(optString5).getJSONObject(0);
                                    String string = jSONObject2.getString("resultUuid");
                                    ValueCallback<String> valueCallback = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string);
                                    if (valueCallback != null) {
                                        valueCallback.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string);
                                        break;
                                    }
                                } catch (JSONException e7) {
                                    Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e7);
                                    break;
                                }
                                break;
                            case "onPrintRequest":
                                PrintJobSettings printJobSettings = new PrintJobSettings();
                                printJobSettings.handledByClient = Boolean.TRUE;
                                final String printCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
                                if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                                    JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), printCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.1
                                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
                                        public void error(String str3, String str4, Object obj) {
                                            StringBuilder d7 = e.d(str3, ", ");
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            L.m(d7, str4, JavaScriptBridgeInterface.LOG_TAG);
                                            defaultBehaviour((Boolean) null);
                                        }

                                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                        public void defaultBehaviour(Boolean bool) {
                                            PrintJobController printJobController;
                                            if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.plugin == null || JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager == null || (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(printCurrentPage)) == null) {
                                                return;
                                            }
                                            printJobController.disposeNoCancel();
                                        }

                                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                        public boolean nonNullSuccess(Boolean bool) {
                                            return !bool.booleanValue();
                                        }
                                    });
                                    break;
                                }
                                break;
                            case "callAsyncJavaScript":
                                try {
                                    JSONObject jSONObject3 = new JSONArray(optString5).getJSONObject(0);
                                    String string2 = jSONObject3.getString("resultUuid");
                                    ValueCallback<String> valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string2);
                                    if (valueCallback2 != null) {
                                        valueCallback2.onReceiveValue(jSONObject3.toString());
                                        JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string2);
                                        break;
                                    }
                                } catch (JSONException e8) {
                                    Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e8);
                                    break;
                                }
                                break;
                            default:
                                if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                                    JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(optString, new JavaScriptHandlerFunctionData(optString3, optString4, valueOf2.booleanValue(), optString5), new WebViewChannelDelegate.CallJsHandlerCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.2
                                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                        public void defaultBehaviour(Object obj) {
                                            if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                                return;
                                            }
                                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if (window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "] != null) { window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "].resolve(" + obj + "); delete window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "]; }", null);
                                        }

                                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
                                        public void error(String str3, String str4, Object obj) {
                                            StringBuilder c3 = e.c(str3);
                                            c3.append(str4 != null ? ", ".concat(str4) : "");
                                            String sb = c3.toString();
                                            Log.e(JavaScriptBridgeInterface.LOG_TAG, sb);
                                            if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                                return;
                                            }
                                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if (window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "] != null) { window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "].reject(new Error(" + JSONObject.quote(sb) + ")); delete window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "]; }", null);
                                        }
                                    });
                                    return;
                                }
                                return;
                        }
                        if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if (window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "] != null) { window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "].resolve(); delete window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "[" + valueOf + "]; }", null);
                        }
                    }
                });
            } else {
                L.n("Bridge access attempt from a sub-frame origin: ", optString3, LOG_TAG);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            Log.e(LOG_TAG, "Cannot convert jsonStringifiedData parameter of _callHandler method to a valid JSONObject");
        }
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu == null) {
                    return;
                }
                JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
            }
        });
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
