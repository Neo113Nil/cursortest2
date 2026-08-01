package com.bytedance.sdk.openadsdk.component;

import android.view.View;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;

/* loaded from: classes4.dex */
public class pcc implements gm.pcc, com.bytedance.sdk.openadsdk.component.wh.pcc {
    public void gm() {
    }

    public void oo() {
    }

    public void vj() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
    public void pcc(long j, int i) {
        new Object[]{"open_ad", "onComplete"};
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
    public void sf(long j, int i) {
        new Object[]{"open_ad", "onError"};
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
    public void pcc() {
        new Object[]{"open_ad", "onTimeOut"};
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
    public void pcc(long j, long j2) {
        new Object[]{"open_ad", "onProgressUpdate"};
    }

    public void pcc(View view) {
        new Object[]{"open_ad", "onClickSkip"};
    }

    public void sf(View view) {
        new Object[]{"open_ad", "onClickDislike"};
    }

    public void sf() {
        new Object[]{"open_ad", "onCountDownFinish"};
    }

    public void pcc(int i, boolean z) {
        new Object[]{"open_ad", "onTimeChanged"};
    }
}
