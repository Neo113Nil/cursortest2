package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.gpj;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private mu gm;
    private hc kj;
    private String oo;
    private com.bytedance.sdk.component.vy.qf ork;
    pcc pcc;
    private String qf;
    private of sf;
    private String vj;
    private com.bytedance.sdk.openadsdk.common.vj vy;
    private int wh;

    public interface pcc {
        void pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jr.vj()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.wh = intent.getIntExtra("source", -1);
        of pcc2 = atb.pcc().pcc(atb.pcc(intent));
        this.sf = pcc2;
        if (pcc2 == null) {
            finish();
            return;
        }
        this.qf = pcc2.vh();
        this.oo = this.sf.esn();
        this.vj = this.sf.hl();
        this.wh = this.sf.gqd().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        pcc(this, gmVar);
        setContentView(gmVar);
        pcc();
    }

    private void pcc(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar;
        this.ork = new com.bytedance.sdk.component.vy.qf(context, qf.gm.LANDING_PAGE);
        frameLayout.addView(this.ork, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.oo sf = com.bytedance.sdk.openadsdk.core.widget.wh.sf(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = rj.sf(context, 18.0f);
        layoutParams.rightMargin = rj.sf(context, 18.0f);
        frameLayout.addView(sf, layoutParams);
        final int qf = this.sf.jsj().qf();
        if (qf != 3) {
            ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(rj.sf(context, 28.0f), rj.sf(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = rj.sf(context, 18.0f);
            layoutParams2.leftMargin = rj.sf(context, 18.0f);
            int sf2 = rj.sf(context, 5.0f);
            ooVar.setPadding(sf2, sf2, sf2, sf2);
            ooVar.setScaleType(ImageView.ScaleType.FIT_XY);
            ooVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
            ooVar.setImageDrawable(tz.gm(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(ooVar, layoutParams2);
        } else {
            ooVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.of.pcc(this.ork, this.qf);
        final WebView webView = this.ork.getWebView();
        sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        hc hcVar = new hc(this.sf, webView, true);
        this.kj = hcVar;
        hcVar.pcc("landingpage_split_ceiling");
        final qf.pcc pccVar = this.kj.pcc;
        if (ooVar != null) {
            ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i = qf;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 != null && webView2.canGoBack()) {
                        webView.goBack();
                        qf.pcc pccVar2 = pccVar;
                        if (pccVar2 != null) {
                            pccVar2.pcc();
                            return;
                        }
                        return;
                    }
                    TTCeilingLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.vj pcc2 = kun.pcc(this.sf, this.ork, this, "landingpage_split_ceiling");
        this.vy = pcc2;
        if (pcc2 != null) {
            pcc2.pcc("landingpage_split_ceiling");
            this.vy.pcc();
        }
        kun.pcc(this.sf, this.ork, true);
        this.pcc = new pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.pcc
            public void pcc() {
                if (TTCeilingLandingPageActivity.this.sf.jsj().kj() == gpj.sf) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this, this.gm, this.oo, this.vy, this.kj, true, true, this.pcc) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        whVar.pcc(this.sf);
        com.bytedance.sdk.openadsdk.core.widget.pcc.vj vjVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.gm, this.kj, this.vy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        com.bytedance.sdk.component.vy.qf qfVar = this.ork;
        if (qfVar != null) {
            qfVar.setWebViewClient(whVar);
            this.ork.setWebChromeClient(vjVar);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.kj == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.kj.pcc(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTCeilingLandingPageActivity.this.kj != null) {
                        TTCeilingLandingPageActivity.this.kj.sf(i2);
                    }
                }
            });
        }
    }

    private void pcc() {
        mu muVar = new mu(this);
        this.gm = muVar;
        muVar.sf(this.ork).gm(this.oo).oo(this.vj).pcc(this.sf).sf(this.wh).pcc(this.sf.bxz()).vj(this.sf.ray()).pcc(this.ork).sf("landingpage_split_ceiling");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        hc hcVar = this.kj;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.vy.qf qfVar = this.ork;
        if (qfVar != null) {
            mk.pcc(qfVar);
        }
    }
}
