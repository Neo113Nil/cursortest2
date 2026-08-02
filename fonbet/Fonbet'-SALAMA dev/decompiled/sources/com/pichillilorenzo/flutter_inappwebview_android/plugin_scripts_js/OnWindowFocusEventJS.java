package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import java.util.Set;

/* loaded from: classes2.dex */
public class OnWindowFocusEventJS {
    public static final String ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT";

    public static PluginScript ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT(Set<String> set) {
        return new PluginScript(ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT_GROUP_NAME, ON_WINDOW_FOCUS_EVENT_JS_SOURCE(), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, set, true);
    }

    public static String ON_WINDOW_FOCUS_EVENT_JS_SOURCE() {
        return "(function(){  window.addEventListener('focus', function(e) {    window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + ".callHandler('onWindowFocus');  });})();";
    }
}
