package com.bytedance.sdk.component.pcc;

import android.webkit.WebView;
import com.bytedance.sdk.component.pcc.gm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class jr {
    private final vy gm;
    private final List<tmg> oo;
    private final pcc pcc;
    private final WebView sf;
    private volatile boolean vj;

    public static vy pcc(WebView webView) {
        return new vy(webView);
    }

    public jr pcc(String str, oo<?, ?> ooVar) {
        return pcc(str, (String) null, ooVar);
    }

    public jr pcc(Set<String> set, lu<?, ?> luVar) {
        return pcc(set, (String) null, luVar);
    }

    public jr pcc(String str, String str2, oo<?, ?> ooVar) {
        sf();
        this.pcc.qf.pcc(str, ooVar);
        return this;
    }

    public jr pcc(Set<String> set, String str, lu<?, ?> luVar) {
        sf();
        this.pcc.qf.pcc(set, luVar);
        return this;
    }

    public jr pcc(String str, gm.sf sfVar) {
        return pcc(str, (String) null, sfVar);
    }

    public jr pcc(String str, String str2, gm.sf sfVar) {
        sf();
        this.pcc.qf.pcc(str, sfVar);
        return this;
    }

    public void pcc() {
        if (this.vj) {
            return;
        }
        this.pcc.sf();
        this.vj = true;
        Iterator<tmg> it = this.oo.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    jr(vy vyVar) {
        ArrayList arrayList = new ArrayList();
        this.oo = arrayList;
        this.vj = false;
        this.gm = vyVar;
        if (vyVar.pcc != null) {
            if (vyVar.sf == null) {
                this.pcc = new lo();
            } else {
                this.pcc = vyVar.sf;
            }
        } else {
            this.pcc = vyVar.sf;
        }
        this.pcc.gm(vyVar);
        this.sf = vyVar.pcc;
        arrayList.add(vyVar.vy);
        gpj.pcc(vyVar.qf);
    }

    private void sf() {
        if (this.vj) {
            kj.pcc(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
