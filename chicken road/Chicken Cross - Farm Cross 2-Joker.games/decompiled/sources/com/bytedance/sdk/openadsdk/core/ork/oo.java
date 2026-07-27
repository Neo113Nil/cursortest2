package com.bytedance.sdk.openadsdk.core.ork;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class oo {
    private static volatile oo gm;
    private static int sf;
    private final List<wh> pcc = new ArrayList();

    public static oo pcc() {
        if (gm == null) {
            synchronized (oo.class) {
                if (gm == null) {
                    gm = new oo();
                }
            }
        }
        return gm;
    }

    public wh sf() {
        wh remove;
        if (gm() > 0 && (remove = this.pcc.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public void pcc(wh whVar) {
        if (whVar != null) {
            sf(whVar);
        }
    }

    public void sf(wh whVar) {
        if (whVar != null) {
            if (this.pcc.size() >= sf) {
                whVar.jr();
            } else {
                if (this.pcc.contains(whVar)) {
                    return;
                }
                gm(whVar);
                this.pcc.add(whVar);
            }
        }
    }

    public int gm() {
        return this.pcc.size();
    }

    public void gm(wh whVar) {
        if (whVar == null || whVar.getWebView() == null) {
            return;
        }
        if (whVar.getParent() != null) {
            ((ViewGroup) whVar.getParent()).removeView(whVar);
        }
        try {
            whVar.removeAllViews();
            whVar.qf();
            whVar.setWebChromeClient(null);
            whVar.setWebViewClient(null);
            whVar.setDownloadListener(null);
            whVar.setDefaultTextEncodingName("UTF-8");
            whVar.setAllowFileAccess(false);
            whVar.setJavaScriptEnabled(true);
            whVar.setCacheMode(-1);
            whVar.setDatabaseEnabled(true);
            whVar.setSupportZoom(false);
            whVar.getWebView().setLayerType(0, null);
            whVar.setBackgroundColor(0);
            whVar.getWebView().setHorizontalScrollBarEnabled(false);
            whVar.getWebView().setHorizontalScrollbarOverlay(false);
            whVar.getWebView().setVerticalScrollBarEnabled(false);
            whVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(whVar);
            whVar.hc();
            whVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }
}
