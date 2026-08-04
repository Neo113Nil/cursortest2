package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class PrintJS {
    public static final String PRINT_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_PRINT_JS_PLUGIN_SCRIPT";

    public static PluginScript PRINT_JS_PLUGIN_SCRIPT(Set<String> set, boolean z4) {
        return new PluginScript(PRINT_JS_PLUGIN_SCRIPT_GROUP_NAME, PRINT_JS_SOURCE(), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, set, z4);
    }

    public static String PRINT_JS_SOURCE() {
        return "window.print = function() {  if (window.top == null || window.top === window) {     window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + ".callHandler('onPrintRequest', window.location.href);  } else {     window.top.print();  }};";
    }
}
