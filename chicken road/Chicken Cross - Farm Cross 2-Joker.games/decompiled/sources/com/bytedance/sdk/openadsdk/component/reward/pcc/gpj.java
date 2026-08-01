package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.kun;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gpj implements com.bytedance.sdk.openadsdk.hc.vy {
    private com.bytedance.sdk.component.vy.qf gm;
    private volatile boolean kj;
    private ImageView oo;
    private int ork;
    private final Activity pcc;
    private final AtomicBoolean qf = new AtomicBoolean(false);
    private final of sf;
    private boolean vj;
    private final sf vy;
    private com.bytedance.sdk.openadsdk.core.gm.qf wh;

    public gpj(sf sfVar) {
        this.vy = sfVar;
        this.sf = sfVar.sf;
        this.pcc = sfVar.rnn;
    }

    public void pcc() {
        DeviceUtils.AudioInfoReceiver.pcc(this);
        this.ork = DeviceUtils.qf();
        if (this.sf.ibs() != null) {
            this.wh = new com.bytedance.sdk.openadsdk.core.gm.qf("VAST_END_CARD", this.sf.ibs()) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gpj.1
            };
            com.bytedance.sdk.openadsdk.core.gbb.gm gm = this.sf.ibs().gm();
            if (gm != null) {
                String oo = gm.oo();
                if (!TextUtils.isEmpty(oo)) {
                    this.vj = true;
                    this.oo = (ImageView) this.vy.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.ork);
                    pcc(gm.pcc(), gm.sf());
                    com.bytedance.sdk.openadsdk.ork.oo.pcc(oo).pcc(gm.pcc()).sf(gm.sf()).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(this.sf, oo, new pcc(this.oo, oo, this, this.qf)));
                    return;
                }
                com.bytedance.sdk.component.vy.qf qfVar = (com.bytedance.sdk.component.vy.qf) this.vy.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.vh);
                this.gm = qfVar;
                if (qfVar == null) {
                    return;
                }
                oo();
                String gm2 = gm.gm();
                if (gm2 != null) {
                    this.vj = true;
                    if (gm2.startsWith(ProxyConfig.MATCH_HTTP)) {
                        this.gm.a_(gm2);
                        return;
                    }
                    String pcc2 = com.bytedance.sdk.openadsdk.core.gbb.vj.pcc(gm2);
                    String str = TextUtils.isEmpty(pcc2) ? gm2 : pcc2;
                    this.gm.setDefaultTextEncodingName("UTF -8");
                    this.gm.pcc(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        pcc(Integer.MAX_VALUE, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final int i, final String str) {
        if (this.kj) {
            return;
        }
        this.kj = true;
        if (i == Integer.MAX_VALUE) {
            of ofVar = this.sf;
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, ofVar.vj(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gpj.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.oo.gm.sf(gpj.this.sf, gpj.this.sf.vj(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void oo() {
        this.gm.vj();
        pcc(this.gm);
        this.gm.setDisplayZoomControls(false);
        this.gm.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gpj.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    gpj.this.gm();
                }
            }
        });
        this.gm.setWebViewClient(new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gpj.4
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (gpj.this.pcc(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    gpj.this.pcc(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                gpj.this.gm();
            }
        });
    }

    private void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        qfVar.setVerticalScrollBarEnabled(false);
        qfVar.setHorizontalScrollBarEnabled(false);
        qfVar.setMixedContentMode(0);
        qfVar.setJavaScriptEnabled(true);
        qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
        qfVar.setDomStorageEnabled(true);
        qfVar.setDatabaseEnabled(true);
        qfVar.setCacheMode(-1);
        qfVar.setAllowFileAccess(false);
        qfVar.setSupportZoom(true);
        qfVar.setBuiltInZoomControls(true);
        qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        qfVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(String str) {
        of ofVar;
        if (str == null || (ofVar = this.sf) == null || ofVar.ibs() == null || this.wh == null) {
            return false;
        }
        this.sf.ibs().wh(str);
        this.wh.onClick(this.gm);
        return true;
    }

    private void pcc(int i, int i2) {
        if (i == 0 || i2 == 0 || this.oo == null) {
            return;
        }
        int gm = rj.gm((Context) this.pcc);
        int vj = rj.vj(this.pcc);
        if (i / i2 <= gm / vj) {
            gm = (int) Math.ceil(r5 * r4);
        } else {
            vj = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.oo.getLayoutParams();
        layoutParams.width = gm;
        layoutParams.height = vj;
        layoutParams.gravity = 17;
        this.oo.setLayoutParams(layoutParams);
        this.oo.setOnClickListener(this.wh);
        this.oo.setOnTouchListener(this.wh);
    }

    public boolean pcc(nac nacVar) {
        com.bytedance.sdk.openadsdk.core.gbb.gm gm;
        if (!this.vj) {
            return false;
        }
        if (this.oo != null && this.qf.get()) {
            this.oo.setVisibility(0);
        } else {
            com.bytedance.sdk.component.vy.qf qfVar = this.gm;
            if (qfVar != null) {
                qfVar.setVisibility(0);
                if (this.gm.getWebView() != null) {
                    this.gm.getWebView().setOnTouchListener(this.wh);
                }
            }
        }
        of ofVar = this.sf;
        if (ofVar == null || ofVar.ibs() == null || (gm = this.sf.ibs().gm()) == null) {
            return true;
        }
        gm.sf(nacVar != null ? nacVar.hc() : -1L);
        return true;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        com.bytedance.sdk.openadsdk.core.gm.qf qfVar = this.wh;
        if (qfVar != null) {
            qfVar.pcc(vjVar);
        }
    }

    public void sf() {
        DeviceUtils.AudioInfoReceiver.sf(this);
        com.bytedance.sdk.component.vy.qf qfVar = this.gm;
        if (qfVar != null) {
            kun.pcc(qfVar.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hc.vy
    public void gm(int i) {
        int i2 = this.ork;
        if (i2 == 0 && i > 0) {
            this.sf.ibs().pcc().vy(this.vy.fum.hc());
        } else if (i2 > 0 && i == 0) {
            this.sf.ibs().pcc().kj(this.vy.fum.hc());
        }
        this.ork = i;
    }

    private static class pcc implements com.bytedance.sdk.component.vj.dax {
        private final WeakReference<gpj> gm;
        private final AtomicBoolean oo;
        private final WeakReference<ImageView> pcc;
        private final String sf;

        public pcc(ImageView imageView, String str, gpj gpjVar, AtomicBoolean atomicBoolean) {
            this.pcc = new WeakReference<>(imageView);
            this.sf = str;
            this.gm = new WeakReference<>(gpjVar);
            this.oo = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            gpj gpjVar;
            ImageView imageView = this.pcc.get();
            if (imageView == null || (gpjVar = this.gm.get()) == null || vhVar == null) {
                return;
            }
            Object sf = vhVar.sf();
            if (sf == null) {
                gpjVar.pcc(-1, this.sf);
                return;
            }
            if (sf instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) sf);
            } else if (sf instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (sf instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) sf).start();
                }
                imageView.setImageDrawable((Drawable) sf);
            }
            this.oo.set(true);
            gpjVar.gm();
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
            gpj gpjVar;
            ImageView imageView = this.pcc.get();
            if (imageView == null || (gpjVar = this.gm.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            gpjVar.pcc(-2, this.sf);
        }
    }
}
