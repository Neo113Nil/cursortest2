package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class fum {
    private static int pcc;
    private static final LinkedHashMap<String, SoftReference<pcc>> sf = new LinkedHashMap<String, SoftReference<pcc>>(pcc, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.fum.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<pcc>> entry) {
            pcc pccVar;
            if (size() <= fum.pcc) {
                return false;
            }
            SoftReference<pcc> value = entry.getValue();
            if (value == null || (pccVar = value.get()) == null || pccVar.pcc == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.mk.pcc(pccVar.pcc);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    private static class pcc {
        com.bytedance.sdk.component.vy.qf pcc;
        Bundle sf;

        pcc(com.bytedance.sdk.component.vy.qf qfVar, Bundle bundle) {
            this.pcc = qfVar;
            this.sf = bundle;
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            pcc = 0;
        } else {
            pcc = Math.max(0, ofVar.qf());
        }
        sf();
    }

    private static void sf() {
        pcc pccVar;
        synchronized (sf) {
            while (true) {
                LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
                if (linkedHashMap.size() > pcc) {
                    SoftReference<pcc> remove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (remove != null && (pccVar = remove.get()) != null && pccVar.pcc != null) {
                        try {
                            com.bytedance.sdk.component.utils.mk.pcc(pccVar.pcc);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void pcc(String str, com.bytedance.sdk.component.vy.qf qfVar, Bundle bundle) {
        if (pcc <= 0 || TextUtils.isEmpty(str) || qfVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            pcc(qfVar.getWebView());
            pcc(qfVar, qfVar.getContext());
            synchronized (linkedHashMap) {
                linkedHashMap.put(str, new SoftReference<>(new pcc(qfVar, bundle)));
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.vy.qf pcc(Context context, String str) {
        if (pcc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            SoftReference<pcc> remove = linkedHashMap.remove(str);
            if (remove == null) {
                return null;
            }
            pcc pccVar = remove.get();
            if (pccVar != null && pccVar.pcc != null) {
                pcc(pccVar.pcc, context);
                return pccVar.pcc;
            }
            return null;
        }
    }

    public static Bundle pcc(String str) {
        if (pcc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<pcc>> linkedHashMap = sf;
        synchronized (linkedHashMap) {
            SoftReference<pcc> softReference = linkedHashMap.get(str);
            if (softReference == null) {
                return null;
            }
            pcc pccVar = softReference.get();
            return pccVar != null ? pccVar.sf : null;
        }
    }

    private static void pcc(com.bytedance.sdk.component.vy.qf qfVar, Context context) {
        if (qfVar == null || context == null) {
            return;
        }
        try {
            if (qfVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) qfVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) qfVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(qfVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void pcc(WebView webView) {
        if (webView != null && pcc > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
