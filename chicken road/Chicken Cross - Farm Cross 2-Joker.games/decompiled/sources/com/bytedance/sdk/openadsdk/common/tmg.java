package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.atb;

/* loaded from: classes4.dex */
public class tmg extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private int gm;
    private int kj;
    private long oo;
    protected vh pcc;
    private boolean qf;
    protected boolean sf;
    private Runnable vj;
    private Runnable wh;

    public tmg(Context context) {
        super(context);
        this.oo = 10L;
        this.sf = true;
        this.qf = false;
        this.kj = 1;
        gm();
    }

    private void gm() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public void setOnlyLoading(boolean z) {
        this.qf = z;
    }

    public void pcc(of ofVar) {
        com.bytedance.sdk.openadsdk.core.model.fum yt;
        if (ofVar != null && (yt = ofVar.yt()) != null) {
            this.oo = yt.pcc();
        }
        vh vhVar = new vh(getContext());
        this.pcc = vhVar;
        View pcc = vhVar.pcc();
        if (pcc.getParent() instanceof ViewGroup) {
            ((ViewGroup) pcc.getParent()).removeView(pcc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        pcc.setLayoutParams(layoutParams);
        if (ofVar != null) {
            boolean zpi = ofVar.zpi();
            com.bytedance.sdk.openadsdk.core.widget.nac sf = this.pcc.sf();
            if (sf != null) {
                if (this.qf || zpi) {
                    sf.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.lu zk = (ofVar.zk() == null || TextUtils.isEmpty(ofVar.zk().pcc())) ? null : ofVar.zk();
                    if (zk != null && !TextUtils.isEmpty(zk.pcc())) {
                        try {
                            com.bytedance.sdk.openadsdk.ork.oo.pcc(zk).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, zk.pcc(), new atb(sf)));
                        } catch (Throwable unused) {
                        }
                    }
                    sf.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.wh.kj gm = this.pcc.gm();
            if (gm != null) {
                if (this.qf || zpi) {
                    gm.setText("Loading");
                } else if (!TextUtils.isEmpty(ofVar.gmh())) {
                    gm.setText(ofVar.gmh());
                } else {
                    gm.setVisibility(8);
                }
            }
        }
        addView(pcc);
        gm(getResources().getConfiguration().orientation);
    }

    public vh getLoadingStyle() {
        return this.pcc;
    }

    public void pcc() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tmg.1
            @Override // java.lang.Runnable
            public void run() {
                if (tmg.this.pcc != null) {
                    tmg.this.setVisibility(0);
                }
            }
        });
        if (this.vj == null) {
            this.vj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tmg.2
                @Override // java.lang.Runnable
                public void run() {
                    tmg.this.sf();
                }
            };
        }
        postDelayed(this.vj, this.oo * 1000);
    }

    public void pcc(int i) {
        if (i == 100 || Math.abs(i - this.gm) >= 7) {
            this.gm = i;
            if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
                sf(this.gm);
                return;
            }
            if (this.wh == null) {
                this.wh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tmg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        tmg tmgVar = tmg.this;
                        tmgVar.sf(tmgVar.gm);
                    }
                };
            }
            post(this.wh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        vh vhVar = this.pcc;
        if (vhVar != null) {
            vhVar.pcc(i);
        }
        if (i == 100 && this.sf) {
            sf();
        }
    }

    public void sf() {
        this.gm = 0;
        vh vhVar = this.pcc;
        if (vhVar != null) {
            removeView(vhVar.pcc);
            this.pcc.oo();
        }
        setVisibility(8);
        this.pcc = null;
        Runnable runnable = this.vj;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.wh;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.wh = null;
        this.vj = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.vj;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.vj = null;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gm(configuration.orientation);
    }

    private void gm(int i) {
        if (this.kj != i) {
            this.kj = i;
        }
    }
}
