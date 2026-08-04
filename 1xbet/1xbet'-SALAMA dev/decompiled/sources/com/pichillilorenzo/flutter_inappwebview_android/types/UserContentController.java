package com.pichillilorenzo.flutter_inappwebview_android.types;

import R0.d;
import R0.g;
import R0.w;
import S0.l;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p136t.e;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public class UserContentController implements Disposable {
    private static final String DOCUMENT_READY_WRAPPER_JS_SOURCE = "if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    protected static final String LOG_TAG = "UserContentController";
    private g contentWorldsCreatorScript;
    public WebView webView;
    private final Set<ContentWorld> contentWorlds = new HashSet<ContentWorld>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.1
        {
            add(ContentWorld.PAGE);
        }
    };
    private final Map<UserScript, g> scriptHandlerMap = new HashMap();
    private final Map<UserScriptInjectionTime, LinkedHashSet<UserScript>> userOnlyScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<UserScript>>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.2
        {
            put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
            put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
        }
    };
    private final Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>> pluginScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<PluginScript>>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.3
        {
            put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
            put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
        }
    };

    public UserContentController(WebView webView) {
        this.webView = webView;
    }

    private static String CONTENT_WORLDS_GENERATOR_JS_SOURCE() {
        return "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = '" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = '" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();";
    }

    private static String CONTENT_WORLD_WRAPPER_JS_SOURCE() {
        return "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = '" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();";
    }

    private static String USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE() {
        return "if (window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentEndLoaded == null || !window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentEndLoaded) {  window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    }

    private static String USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE() {
        return "if (window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentStartLoaded == null || !window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentStartLoaded) {  window._" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
    }

    public static String escapeCode(String str) {
        return JSONObject.quote(str);
    }

    public static String escapeContentWorldName(String str) {
        return str.replaceAll("'", "\\\\'");
    }

    private void updateContentWorldsCreatorScript() {
        WebView webView;
        String strGenerateContentWorldsCreatorCode = generateContentWorldsCreatorCode();
        if (d.a("DOCUMENT_START_SCRIPT")) {
            g gVar = this.contentWorldsCreatorScript;
            if (gVar != null) {
                ((l) gVar).a();
            }
            if (strGenerateContentWorldsCreatorCode.isEmpty() || (webView = this.webView) == null) {
                return;
            }
            this.contentWorldsCreatorScript = w.a(webView, strGenerateContentWorldsCreatorCode, new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.4
                {
                    add("*");
                }
            });
        }
    }

    private static String wrapSourceCodeAddChecks(String str, UserScript userScript) {
        StringBuilder sb = new StringBuilder("if (");
        Set<String> allowedOriginRules = userScript.getAllowedOriginRules();
        boolean zIsForMainFrameOnly = userScript.isForMainFrameOnly();
        if (!d.a("DOCUMENT_START_SCRIPT") && !allowedOriginRules.contains("*")) {
            if (allowedOriginRules.isEmpty()) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder("[");
            for (String str2 : allowedOriginRules) {
                if (sb2.length() > 1) {
                    sb2.append(", ");
                }
                sb2.append("new RegExp(");
                sb2.append(escapeCode(str2));
                sb2.append(")");
            }
            if (sb2.length() > 1) {
                sb2.append("]");
                sb.append((CharSequence) sb2);
                sb.append(".some(function(rx) { return rx.test(window.location.origin); })");
            }
        }
        if (zIsForMainFrameOnly) {
            if (sb.length() > 4) {
                sb.append(" && ");
            }
            sb.append("window === window.top");
        }
        if (sb.length() <= 4) {
            return str;
        }
        sb.append(") {");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public boolean addPluginScript(PluginScript pluginScript) {
        ContentWorld contentWorld = pluginScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add(contentWorld);
        }
        updateContentWorldsCreatorScript();
        if (this.webView != null && d.a("DOCUMENT_START_SCRIPT")) {
            String source = pluginScript.getSource();
            if (pluginScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_END) {
                source = L.j("if (document.readyState === 'complete') { ", source, "} else { window.addEventListener('load', function() { ", source, " }); }");
            }
            this.scriptHandlerMap.put(pluginScript, w.a(this.webView, wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), wrapSourceCodeAddChecks(source, pluginScript)), pluginScript.getAllowedOriginRules()));
        }
        return this.pluginScripts.get(pluginScript.getInjectionTime()).add(pluginScript);
    }

    public void addPluginScripts(List<PluginScript> list) {
        Iterator<PluginScript> it = list.iterator();
        while (it.hasNext()) {
            addPluginScript(it.next());
        }
    }

    public boolean addUserOnlyScript(UserScript userScript) {
        ContentWorld contentWorld = userScript.getContentWorld();
        if (contentWorld != null) {
            this.contentWorlds.add(contentWorld);
        }
        updateContentWorldsCreatorScript();
        if (this.webView != null && d.a("DOCUMENT_START_SCRIPT")) {
            String source = userScript.getSource();
            if (userScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_END) {
                source = L.j("if (document.readyState === 'complete') { ", source, "} else { window.addEventListener('load', function() { ", source, " }); }");
            }
            this.scriptHandlerMap.put(userScript, w.a(this.webView, wrapSourceCodeInContentWorld(userScript.getContentWorld(), wrapSourceCodeAddChecks(source, userScript)), userScript.getAllowedOriginRules()));
        }
        return this.userOnlyScripts.get(userScript.getInjectionTime()).add(userScript);
    }

    public void addUserOnlyScripts(List<UserScript> list) {
        Iterator<UserScript> it = list.iterator();
        while (it.hasNext()) {
            addUserOnlyScript(it.next());
        }
    }

    public boolean containsPluginScript(PluginScript pluginScript) {
        return getPluginScriptAsList().contains(pluginScript);
    }

    public boolean containsPluginScriptByGroupName(String str) {
        Iterator<PluginScript> it = getPluginScriptAsList().iterator();
        while (it.hasNext()) {
            if (Util.objEquals(str, it.next().getGroupName())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUserOnlyScript(UserScript userScript) {
        return getUserOnlyScriptAsList().contains(userScript);
    }

    public boolean containsUserOnlyScriptByGroupName(String str) {
        Iterator<UserScript> it = getUserOnlyScriptAsList().iterator();
        while (it.hasNext()) {
            if (Util.objEquals(str, it.next().getGroupName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        g gVar;
        if (d.a("DOCUMENT_START_SCRIPT") && (gVar = this.contentWorldsCreatorScript) != null) {
            ((l) gVar).a();
        }
        removeAllUserOnlyScripts();
        removeAllPluginScripts();
        this.webView = null;
    }

    public String generateCodeForDocumentStart() {
        UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_START;
        StringBuilder sbC = e.c("" + generatePluginScriptsCodeAt(userScriptInjectionTime));
        sbC.append(generateContentWorldsCreatorCode());
        StringBuilder sbC2 = e.c(sbC.toString());
        sbC2.append(generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
        return USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE().replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, sbC2.toString());
    }

    public String generateCodeForScriptEvaluation(String str, ContentWorld contentWorld) {
        if (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.contentWorlds.contains(contentWorld)) {
            this.contentWorlds.add(contentWorld);
            StringBuilder sb2 = new StringBuilder();
            Iterator<PluginScript> it = getPluginScriptsRequiredInAllContentWorlds().iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getSource());
            }
            sb.append(CONTENT_WORLDS_GENERATOR_JS_SOURCE().replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, "'" + escapeContentWorldName(contentWorld.getName()) + "'").replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb2.toString())));
            sb.append(";");
        }
        sb.append(wrapSourceCodeInContentWorld(contentWorld, str));
        return sb.toString();
    }

    public String generateContentWorldsCreatorCode() {
        if (this.contentWorlds.size() == 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<PluginScript> it = getPluginScriptsRequiredInAllContentWorlds().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getSource());
        }
        ArrayList arrayList = new ArrayList();
        for (ContentWorld contentWorld : this.contentWorlds) {
            if (!contentWorld.equals(ContentWorld.PAGE)) {
                arrayList.add("'" + escapeContentWorldName(contentWorld.getName()) + "'");
            }
        }
        return CONTENT_WORLDS_GENERATOR_JS_SOURCE().replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, TextUtils.join(", ", arrayList)).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb.toString()));
    }

    public String generatePluginScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
        StringBuilder sb = new StringBuilder();
        for (PluginScript pluginScript : getPluginScriptsAt(userScriptInjectionTime)) {
            sb.append(wrapSourceCodeAddChecks(wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), ";" + pluginScript.getSource()), pluginScript));
        }
        return sb.toString();
    }

    public String generateUserOnlyScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
        StringBuilder sb = new StringBuilder();
        for (UserScript userScript : getUserOnlyScriptsAt(userScriptInjectionTime)) {
            sb.append(wrapSourceCodeAddChecks(wrapSourceCodeInContentWorld(userScript.getContentWorld(), ";" + userScript.getSource()), userScript));
        }
        return sb.toString();
    }

    public String generateWrappedCodeForDocumentEnd() {
        UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_END;
        String str = "";
        if (!d.a("DOCUMENT_START_SCRIPT")) {
            str = "" + generateCodeForDocumentStart();
        }
        StringBuilder sbC = e.c(str);
        sbC.append(generatePluginScriptsCodeAt(userScriptInjectionTime));
        StringBuilder sbC2 = e.c(sbC.toString());
        sbC2.append(generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
        return USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE().replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, sbC2.toString());
    }

    public String generateWrappedCodeForDocumentStart() {
        return Util.replaceAll(DOCUMENT_READY_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, generateCodeForDocumentStart());
    }

    public LinkedHashSet<ContentWorld> getContentWorlds() {
        return new LinkedHashSet<>(this.contentWorlds);
    }

    public LinkedHashSet<PluginScript> getPluginScriptAsList() {
        LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
        Iterator<LinkedHashSet<PluginScript>> it = this.pluginScripts.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<PluginScript> getPluginScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
        return new LinkedHashSet<>(this.pluginScripts.get(userScriptInjectionTime));
    }

    public LinkedHashSet<PluginScript> getPluginScriptsRequiredInAllContentWorlds() {
        LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
        for (PluginScript pluginScript : getPluginScriptsAt(UserScriptInjectionTime.AT_DOCUMENT_START)) {
            if (pluginScript.isRequiredInAllContentWorlds()) {
                linkedHashSet.add(pluginScript);
            }
        }
        return linkedHashSet;
    }

    public LinkedHashSet<UserScript> getUserOnlyScriptAsList() {
        LinkedHashSet<UserScript> linkedHashSet = new LinkedHashSet<>();
        Iterator<LinkedHashSet<UserScript>> it = this.userOnlyScripts.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<UserScript> getUserOnlyScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
        return new LinkedHashSet<>(this.userOnlyScripts.get(userScriptInjectionTime));
    }

    public void removeAllPluginScripts() {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            for (PluginScript pluginScript : this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)) {
                g gVar = this.scriptHandlerMap.get(pluginScript);
                if (gVar != null) {
                    ((l) gVar).a();
                    this.scriptHandlerMap.remove(pluginScript);
                }
            }
            for (PluginScript pluginScript2 : this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END)) {
                g gVar2 = this.scriptHandlerMap.get(pluginScript2);
                if (gVar2 != null) {
                    ((l) gVar2).a();
                    this.scriptHandlerMap.remove(pluginScript2);
                }
            }
        }
        this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
        this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
    }

    public void removeAllUserOnlyScripts() {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            for (UserScript userScript : this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)) {
                g gVar = this.scriptHandlerMap.get(userScript);
                if (gVar != null) {
                    ((l) gVar).a();
                    this.scriptHandlerMap.remove(userScript);
                }
            }
            for (UserScript userScript2 : this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END)) {
                g gVar2 = this.scriptHandlerMap.get(userScript2);
                if (gVar2 != null) {
                    ((l) gVar2).a();
                    this.scriptHandlerMap.remove(userScript2);
                }
            }
        }
        this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
        this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
    }

    public boolean removePluginScript(PluginScript pluginScript) {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            g gVar = this.scriptHandlerMap.get(pluginScript);
            if (gVar != null) {
                ((l) gVar).a();
                this.scriptHandlerMap.remove(pluginScript);
            }
            updateContentWorldsCreatorScript();
        }
        return this.pluginScripts.get(pluginScript.getInjectionTime()).remove(pluginScript);
    }

    public void removePluginScriptsByGroupName(String str) {
        for (PluginScript pluginScript : getPluginScriptAsList()) {
            if (Util.objEquals(str, pluginScript.getGroupName())) {
                removePluginScript(pluginScript);
            }
        }
    }

    public boolean removeUserOnlyScript(UserScript userScript) {
        if (d.a("DOCUMENT_START_SCRIPT")) {
            g gVar = this.scriptHandlerMap.get(userScript);
            if (gVar != null) {
                ((l) gVar).a();
                this.scriptHandlerMap.remove(userScript);
            }
            updateContentWorldsCreatorScript();
        }
        return this.userOnlyScripts.get(userScript.getInjectionTime()).remove(userScript);
    }

    public boolean removeUserOnlyScriptAt(int i7, UserScriptInjectionTime userScriptInjectionTime) {
        return removeUserOnlyScript((UserScript) new ArrayList(this.userOnlyScripts.get(userScriptInjectionTime)).get(i7));
    }

    public void removeUserOnlyScriptsByGroupName(String str) {
        for (UserScript userScript : getUserOnlyScriptAsList()) {
            if (Util.objEquals(str, userScript.getGroupName())) {
                removeUserOnlyScript(userScript);
            }
        }
    }

    public void resetContentWorlds() {
        this.contentWorlds.clear();
        this.contentWorlds.add(ContentWorld.PAGE);
        Iterator<PluginScript> it = getPluginScriptAsList().iterator();
        while (it.hasNext()) {
            this.contentWorlds.add(it.next().getContentWorld());
        }
        Iterator<UserScript> it2 = getUserOnlyScriptAsList().iterator();
        while (it2.hasNext()) {
            this.contentWorlds.add(it2.next().getContentWorld());
        }
    }

    public String wrapSourceCodeInContentWorld(ContentWorld contentWorld, String str) {
        return (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? str : CONTENT_WORLD_WRAPPER_JS_SOURCE().replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME, escapeContentWorldName(contentWorld.getName())).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(str));
    }
}
