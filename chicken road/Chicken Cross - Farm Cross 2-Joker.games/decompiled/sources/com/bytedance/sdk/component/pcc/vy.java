package com.bytedance.sdk.component.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class vy {
    boolean hc;
    vh kj;
    qf oo;
    WebView pcc;
    boolean qf;
    pcc sf;
    Context vj;
    tmg vy;
    boolean wh;
    String gm = "IESJSBridge";
    String ork = "host";
    final Set<String> vh = new LinkedHashSet();
    final Set<String> tmg = new LinkedHashSet();

    vy(WebView webView) {
        this.pcc = webView;
    }

    vy() {
    }

    public vy pcc(pcc pccVar) {
        this.sf = pccVar;
        return this;
    }

    public vy pcc(String str) {
        this.gm = str;
        return this;
    }

    public vy pcc(ork orkVar) {
        this.oo = qf.pcc(orkVar);
        return this;
    }

    public vy pcc(boolean z) {
        this.wh = z;
        return this;
    }

    public vy sf(boolean z) {
        this.qf = z;
        return this;
    }

    public jr pcc() {
        sf();
        return new jr(this);
    }

    private void sf() {
        if ((this.pcc == null && !this.hc && this.sf == null) || ((TextUtils.isEmpty(this.gm) && this.pcc != null) || this.oo == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
