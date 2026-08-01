package com.bytedance.sdk.component.pcc;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class lo extends pcc {
    static final /* synthetic */ boolean ork = true;
    protected String kj;
    protected WebView vy;

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected Context pcc(vy vyVar) {
        if (vyVar.vj != null) {
            return vyVar.vj;
        }
        if (vyVar.pcc != null) {
            return vyVar.pcc.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected String pcc() {
        return this.vy.getUrl();
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected void sf(vy vyVar) {
        this.vy = vyVar.pcc;
        this.kj = vyVar.gm;
        if (vyVar.hc) {
            return;
        }
        gm();
    }

    protected void gm() {
        if (!ork && this.vy == null) {
            throw new AssertionError();
        }
        this.vy.addJavascriptInterface(this, this.kj);
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected void sf() {
        super.sf();
        oo();
    }

    protected void oo() {
        this.vy.removeJavascriptInterface(this.kj);
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected void pcc(String str, gbb gbbVar) {
        if (gbbVar != null && !TextUtils.isEmpty(gbbVar.kj)) {
            String str2 = gbbVar.kj;
            pcc(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.pcc(str, gbbVar);
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    protected void pcc(String str) {
        pcc(str, "javascript:" + this.kj + "._handleMessageFromToutiao(" + str + ")");
    }

    private void pcc(String str, final String str2) {
        if (this.wh || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.pcc.lo.1
            @Override // java.lang.Runnable
            public void run() {
                if (lo.this.wh) {
                    return;
                }
                try {
                    lo.this.vy.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.oo.post(runnable);
        } else {
            runnable.run();
        }
    }
}
