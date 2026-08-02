package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import A5.o;
import A5.r;
import A5.s;
import R0.b;
import R0.d;
import R0.e;
import S0.C0431b;
import S0.j;
import S0.w;
import S0.y;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static e proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final r rVar) {
        e eVar = proxyController;
        if (eVar != null) {
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    rVar.success(Boolean.TRUE);
                }
            };
            j jVar = (j) eVar;
            if (!w.f6272F.b()) {
                throw w.a();
            }
            if (jVar.f6243a == null) {
                jVar.f6243a = y.f6312a.getProxyController();
            }
            jVar.f6243a.clearProxyOverride(runnable, executor);
        }
    }

    public static void init() {
        if (proxyController == null && d.a("PROXY_OVERRIDE")) {
            if (!d.a("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            proxyController = d.f5856a;
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final r rVar) {
        if (proxyController != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (it2.hasNext()) {
                arrayList.add(new b(it2.next(), "direct://"));
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    arrayList.add(new b(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                } else {
                    arrayList.add(new b("*", proxyRuleExt.getUrl()));
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                arrayList2.add("<local>");
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                arrayList2.add("<-loopback>");
            }
            boolean booleanValue = (proxySettings.reverseBypassEnabled == null || !d.a("PROXY_OVERRIDE_REVERSE_BYPASS")) ? false : proxySettings.reverseBypassEnabled.booleanValue();
            e eVar = proxyController;
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    rVar.success(Boolean.TRUE);
                }
            };
            j jVar = (j) eVar;
            jVar.getClass();
            C0431b c0431b = w.f6272F;
            C0431b c0431b2 = w.f6278L;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, unmodifiableList.size(), 2);
            for (int i7 = 0; i7 < unmodifiableList.size(); i7++) {
                strArr[i7][0] = ((b) unmodifiableList.get(i7)).f5854a;
                strArr[i7][1] = ((b) unmodifiableList.get(i7)).f5855b;
            }
            String[] strArr2 = (String[]) Collections.unmodifiableList(arrayList2).toArray(new String[0]);
            if (c0431b.b() && !booleanValue) {
                if (jVar.f6243a == null) {
                    jVar.f6243a = y.f6312a.getProxyController();
                }
                jVar.f6243a.setProxyOverride(strArr, strArr2, runnable, executor);
            } else {
                if (!c0431b.b() || !c0431b2.b()) {
                    throw w.a();
                }
                if (jVar.f6243a == null) {
                    jVar.f6243a = y.f6312a.getProxyController();
                }
                jVar.f6243a.setProxyOverride(strArr, strArr2, runnable, executor, booleanValue);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        init();
        String str = oVar.f676a;
        str.getClass();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(rVar);
                return;
            } else {
                rVar.success(Boolean.FALSE);
                return;
            }
        }
        if (!str.equals("setProxyOverride")) {
            rVar.notImplemented();
            return;
        }
        if (proxyController == null) {
            rVar.success(Boolean.FALSE);
            return;
        }
        HashMap hashMap = (HashMap) oVar.a("settings");
        ProxySettings proxySettings = new ProxySettings();
        if (hashMap != null) {
            proxySettings.parse2((Map<String, Object>) hashMap);
        }
        setProxyOverride(proxySettings, rVar);
    }
}
