package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class hc {
    private final Activity gm;
    private final sf oo;
    com.bytedance.sdk.openadsdk.component.reward.top.gm pcc;
    com.bytedance.sdk.component.adexpress.dynamic.oo sf;
    private boolean vj = false;
    private boolean wh;

    public hc(sf sfVar) {
        this.gm = sfVar.rnn;
        this.oo = sfVar;
    }

    public void pcc() {
        if (this.vj) {
            return;
        }
        this.vj = true;
        if (this.oo.vgx != null) {
            this.pcc = this.oo.vgx;
            this.wh = true;
        } else {
            this.pcc = (com.bytedance.sdk.openadsdk.component.reward.top.gm) this.oo.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.on);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.pcc(this.oo.sf);
            if (this.oo.sf.on()) {
                pcc(false);
            } else {
                pcc(this.oo.sf.dk());
            }
        }
    }

    public void pcc(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowDislike(z);
    }

    public void sf(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo ooVar = this.sf;
        if (ooVar != null) {
            ooVar.setSoundMute(z);
        }
    }

    public void gm(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowSound(z);
    }

    public void oo(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowSkip(z);
    }

    public void pcc(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setTime(String.valueOf(str), charSequence);
    }

    public void pcc(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipText(charSequence);
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.showCountDownText();
    }

    public void vj(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipEnable(z);
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.showSkipButton();
    }

    public void oo() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.clickSkip();
        }
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.clickSound(str);
        }
    }

    public void vj() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipInvisiable();
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.top.sf sfVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.setListener(sfVar);
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo ooVar) {
        this.sf = ooVar;
    }

    public void pcc(int i) {
        View findViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar == null || gmVar.getITopLayout() == null || i == 0 || (findViewById = this.pcc.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + findViewById.getWidth());
        if (width < rj.sf(this.gm, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += rj.sf(this.gm, 16.0f) - width;
            findViewById.requestLayout();
        }
    }
}
