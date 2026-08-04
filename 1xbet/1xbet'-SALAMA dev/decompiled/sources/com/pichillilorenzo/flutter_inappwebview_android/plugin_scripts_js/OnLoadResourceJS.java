package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class OnLoadResourceJS {
    public static final String ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT";

    public static String FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE() {
        return JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "._useOnLoadResource";
    }

    public static PluginScript ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT(Set<String> set, boolean z4) {
        return new PluginScript(ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT_GROUP_NAME, ON_LOAD_RESOURCE_JS_SOURCE(), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, set, z4);
    }

    public static String ON_LOAD_RESOURCE_JS_SOURCE() {
        return "window." + FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE() + " = true;(function() {   var observer = new PerformanceObserver(function(list) {       list.getEntries().forEach(function(entry) {         if (" + FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE() + " == null || " + FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE() + " == true) {           var resource = {             'url': entry.name,             'initiatorType': entry.initiatorType,             'startTime': entry.startTime,             'duration': entry.duration           };           window." + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + ".callHandler('onLoadResource', resource);         }       });   });   observer.observe({entryTypes: ['resource']});})();";
    }
}
