package com.bytedance.sdk.openadsdk.core.hc.gm;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.component.adexpress.vj.vj;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.nac;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.utils.lo;
import com.bytedance.sdk.openadsdk.utils.lrr;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo implements vh, gm<qf> {
    private qf gm;
    private final boolean kj;
    private mu oo;
    private pcc ork;
    private Context pcc;
    private int qf;
    private of sf;
    private String vj;
    private boolean vy = false;
    private com.bytedance.sdk.openadsdk.core.hc.gm.pcc wh;

    public interface pcc {
        void qf();
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(gbb gbbVar) {
    }

    public oo(Context context, of ofVar, boolean z) {
        this.qf = 1;
        this.pcc = context;
        this.sf = ofVar;
        this.qf = ofVar.ial();
        this.kj = z;
        if (z) {
            this.vj = nac.sf(this.sf).pcc(this.qf == 1);
        } else {
            this.vj = nac.gm(this.sf).pcc(this.qf == 1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc() {
        this.gm = new qf(this.pcc, qf.gm.EASY_PLAYABLE);
        qf();
        kj();
        if (this.kj) {
            return;
        }
        lrr.pcc(this.gm, false, this.sf.tqg(), false, new lrr.sf() { // from class: com.bytedance.sdk.openadsdk.core.hc.gm.oo.1
            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(View view, boolean z) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(boolean z) {
                oo.this.pcc(z);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc() {
                oo.this.pcc(true);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void sf() {
                oo.this.pcc(false);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void sf() {
        if (TextUtils.isEmpty(this.vj)) {
            this.gm.setVisibility(8);
        } else {
            this.gm.a_(this.vj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc(com.bytedance.sdk.openadsdk.core.hc.gm.pcc pccVar) {
        this.wh = pccVar;
    }

    public mu vj() {
        return this.oo;
    }

    private void qf() {
        this.gm.setBackgroundColor(0);
        this.gm.setBackgroundResource(R.color.transparent);
        this.gm.setVisibility(8);
        pcc(this.gm);
        if (this.sf != null) {
            this.gm.setWebViewClient(new wh(this.pcc, this.oo, this.sf.esn(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.hc.gm.oo.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (oo.this.ork != null) {
                        oo.this.ork.qf();
                    }
                }
            });
        }
        vj.pcc().pcc(this.gm, this.oo);
        this.gm.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.oo));
    }

    private void pcc(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.pcc).pcc(false).pcc(qfVar.getWebView());
            qfVar.setVerticalScrollBarEnabled(false);
            qfVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(qfVar);
            qfVar.hc();
            qfVar.setUserAgentString(lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
            qfVar.setMixedContentMode(0);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setDatabaseEnabled(true);
            qfVar.setAllowFileAccess(false);
            qfVar.setSupportZoom(true);
            qfVar.setBuiltInZoomControls(true);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            qfVar.setUseWideViewPort(true);
            qfVar.setCacheMode(-1);
        } catch (Exception unused) {
        }
    }

    private void kj() {
        mu muVar = new mu(this.pcc);
        this.oo = muVar;
        muVar.sf(this.gm).pcc(this.sf).gm(this.sf.esn()).oo(this.sf.hl()).vj(this.sf.ray()).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(0.0f, 0.0f, false, this.sf, null, null)).pcc(this).pcc(this.gm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc(dax daxVar) {
        mu muVar = this.oo;
        if (muVar != null) {
            muVar.pcc(daxVar);
        }
    }

    public void pcc(boolean z) {
        if (z == this.vy) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z ? 1 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
        this.oo.pcc("visibleStateChange", jSONObject);
        this.vy = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void gm() {
        mu muVar = this.oo;
        if (muVar != null) {
            muVar.gm();
        }
        this.oo = null;
        try {
            qf qfVar = this.gm;
            if (qfVar != null) {
                ViewGroup viewGroup = (ViewGroup) qfVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.gm);
                }
                this.gm.jr();
            }
        } catch (Throwable unused) {
        }
        if (this.ork != null) {
            this.ork = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    /* renamed from: wh, reason: merged with bridge method [inline-methods] */
    public qf oo() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        com.bytedance.sdk.openadsdk.core.hc.gm.pcc pccVar = this.wh;
        if (pccVar != null) {
            pccVar.pcc(view, i, gmVar);
        }
    }

    public void pcc(pcc pccVar) {
        this.ork = pccVar;
    }
}
