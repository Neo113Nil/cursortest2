package com.bytedance.sdk.component.adexpress.vj;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.vy.qf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class vj {
    private static int kj = 10;
    private static final byte[] vj = new byte[0];
    private static volatile vj vy = null;
    private static int wh = 10;
    private final AtomicBoolean qf = new AtomicBoolean(false);
    private List<qf> pcc = new ArrayList();
    private List<qf> sf = new ArrayList();
    private Map<Integer, gm> gm = new HashMap();
    private Map<Integer, oo> oo = new HashMap();

    private vj() {
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        if (gm != null) {
            wh = gm.ork();
            kj = gm.vh();
        }
    }

    public static vj pcc() {
        if (vy == null) {
            synchronized (vj.class) {
                if (vy == null) {
                    vy = new vj();
                }
            }
        }
        return vy;
    }

    public qf pcc(Context context, String str) {
        if (!mk.sf(qf.gm.ADS_V4)) {
            return null;
        }
        if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(qf.gm.ADS_V4) > 1) {
            return mk.pcc(context, null, 0, qf.gm.ADS_V4);
        }
        return null;
    }

    public void pcc(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
        } catch (Throwable th) {
            new Object[]{"WebView unify pool is not hit，destroy webview ", th.getMessage()};
        }
    }

    public void sf(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.oo(qfVar);
        kj(qfVar);
        if (mk.sf(qfVar.getScene())) {
            mk.sf(qfVar);
            return;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
        } catch (Throwable th) {
            new Object[]{"WebView unify pool is not hit，destroy webview ", th.getMessage()};
        }
    }

    public qf sf(Context context, String str) {
        if (mk.sf(qf.gm.ADS_V3)) {
            if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(qf.gm.ADS_V3) > 1) {
                return mk.pcc(context, null, 0, qf.gm.ADS_V3);
            }
            return null;
        }
        if (oo() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) && oo() <= 1) {
            new Object[]{"get WebView from newengine pool; but ad type is does not meet the requirement ", Integer.valueOf(oo())};
            return null;
        }
        qf remove = this.sf.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                new Object[]{"get WebView from newengine pool; current available count: ", Integer.valueOf(oo())};
            }
            return remove;
        } catch (Throwable unused) {
            new Object[]{"get WebView from newengine pool exception; current available count: ", Integer.valueOf(oo())};
            return null;
        }
    }

    public void gm(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        if (this.sf.size() >= kj) {
            try {
                Context context = qfVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                qfVar.jr();
                return;
            } catch (Throwable th) {
                new Object[]{"WebView newengine pool is full，destroy webview ", th.getMessage()};
                return;
            }
        }
        if (this.sf.contains(qfVar)) {
            return;
        }
        try {
            Context context2 = qfVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                qfVar.setRecycler(true);
                this.sf.add(qfVar);
                new Object[]{"recycle WebView newengine，current available count: ", Integer.valueOf(oo())};
            }
        } catch (Throwable th2) {
            new Object[]{"recycle WebView newengine fail，current available count: ", Integer.valueOf(oo()), "exception is ", th2.getMessage()};
        }
    }

    public void oo(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        gm(qfVar);
    }

    public qf gm(Context context, String str) {
        if (mk.sf(qf.gm.ADS)) {
            if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(qf.gm.ADS) > 1) {
                return mk.pcc(context, null, 0, qf.gm.ADS);
            }
            return null;
        }
        if (gm() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) && gm() <= 1) {
            new Object[]{"get WebView from pool; but ad type is does not meet the requirement ", Integer.valueOf(gm())};
            return null;
        }
        qf remove = this.pcc.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                new Object[]{"get WebView from pool; current available count: ", Integer.valueOf(gm())};
            }
            return remove;
        } catch (Throwable unused) {
            new Object[]{"get WebView from pool exception; current available count: ", Integer.valueOf(gm())};
            return null;
        }
    }

    public void vj(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        vy(qfVar);
    }

    private void vy(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        if (this.pcc.size() >= wh) {
            try {
                Context context = qfVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                qfVar.jr();
                return;
            } catch (Throwable th) {
                new Object[]{"WebView pool is full，destroy webview ", th.getMessage()};
                return;
            }
        }
        if (this.pcc.contains(qfVar)) {
            return;
        }
        try {
            Context context2 = qfVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                qfVar.setRecycler(true);
                this.pcc.add(qfVar);
                new Object[]{"recycle WebView，current available count: ", Integer.valueOf(gm())};
            }
        } catch (Throwable th2) {
            new Object[]{"recycle WebView fail，current available count: ", Integer.valueOf(gm()), "exception is ", th2.getMessage()};
        }
    }

    public boolean wh(qf qfVar) {
        if (qfVar == null) {
            return false;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
            return true;
        } catch (Throwable th) {
            new Object[]{"WebView abandon failed ", th.getMessage()};
            return true;
        }
    }

    public void sf() {
        for (qf qfVar : this.pcc) {
            if (qfVar != null) {
                try {
                    Context context = qfVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    qfVar.jr();
                } catch (Throwable th) {
                    new Object[]{"WebView clear failed ", th.getMessage()};
                }
            }
        }
        this.pcc.clear();
        for (qf qfVar2 : this.sf) {
            if (qfVar2 != null) {
                try {
                    Context context2 = qfVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    qfVar2.jr();
                } catch (Throwable th2) {
                    new Object[]{"WebView newengine clear failed ", th2.getMessage()};
                }
            }
        }
        this.sf.clear();
    }

    public int gm() {
        return this.pcc.size();
    }

    public int oo() {
        return this.sf.size();
    }

    public void pcc(qf qfVar, sf sfVar) {
        WebView webView;
        if (qfVar == null || sfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            gmVar.pcc(sfVar);
        } else {
            gmVar = new gm(sfVar);
            this.gm.put(Integer.valueOf(webView.hashCode()), gmVar);
        }
        lo.pcc("WebViewPool", "registerJavascriptInterface: express jsb recycle webview will register javascript interface every timeSDK_INJECT_GLOBAL");
        qfVar.pcc(gmVar, "SDK_INJECT_GLOBAL");
    }

    public void sf(qf qfVar, sf sfVar) {
        WebView webView;
        if (qfVar == null || sfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will not register javascript interface in reuse webviewSDK_INJECT_GLOBAL");
            gmVar.pcc(sfVar);
        } else {
            gm gmVar2 = new gm(sfVar);
            this.gm.put(Integer.valueOf(webView.hashCode()), gmVar2);
            lo.pcc("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will register once javascript interfaceSDK_INJECT_GLOBAL");
            qfVar.pcc(gmVar2, "SDK_INJECT_GLOBAL");
        }
    }

    public void qf(qf qfVar) {
        WebView webView;
        if (qfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            gmVar.pcc(null);
        }
        lo.pcc("WebViewPool", "unRegisterJavascriptInterface: express jsb recycle webview will remove javascript interfaceSDK_INJECT_GLOBAL");
        qfVar.b_("SDK_INJECT_GLOBAL");
    }

    public void kj(qf qfVar) {
        WebView webView;
        gm gmVar;
        lo.pcc("WebViewPool", "updateTTAndroidObject: express jsb recycle webview will not remove javascript interfaceSDK_INJECT_GLOBAL");
        if (qfVar == null || (webView = qfVar.getWebView()) == null || (gmVar = this.gm.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        gmVar.pcc(null);
    }

    public void pcc(WebView webView, com.bytedance.sdk.component.pcc.lo loVar, String str) {
        if (webView == null || loVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            ooVar.pcc(loVar);
        } else {
            ooVar = new oo(loVar);
            this.oo.put(Integer.valueOf(webView.hashCode()), ooVar);
        }
        lo.pcc("WebViewPool", "registerJavascriptInterfaceForJsB2: jsb 3.0 register javascript interface every time".concat(String.valueOf(str)));
        webView.addJavascriptInterface(ooVar, str);
    }

    public void sf(WebView webView, com.bytedance.sdk.component.pcc.lo loVar, String str) {
        if (webView == null || loVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 will not register javascript interface in reuse webview".concat(String.valueOf(str)));
            ooVar.pcc(loVar);
        } else {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 register once javascript interface in created webview".concat(String.valueOf(str)));
            oo ooVar2 = new oo(loVar);
            this.oo.put(Integer.valueOf(webView.hashCode()), ooVar2);
            webView.addJavascriptInterface(ooVar2, str);
        }
    }

    public void pcc(WebView webView, String str) {
        lo.pcc("WebViewPool", "unRegisterJavascriptInterfaceForJsB2: jsb 3.0 recycle webview will remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            ooVar.pcc(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void sf(WebView webView, String str) {
        oo ooVar;
        lo.pcc("WebViewPool", "updateWebViewBridge: jsb 3.0 recycle webview will not remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str) || (ooVar = this.oo.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        ooVar.pcc(null);
    }

    public void pcc(int i) {
        synchronized (vj) {
            wh = i;
        }
    }

    public void sf(int i) {
        synchronized (vj) {
            kj = i;
        }
    }
}
