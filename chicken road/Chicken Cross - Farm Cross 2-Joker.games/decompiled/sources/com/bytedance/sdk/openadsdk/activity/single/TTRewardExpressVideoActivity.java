package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* loaded from: classes4.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hc() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tsz() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.yt.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> tsx() {
        return this.sf.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(long j, long j2) {
        int quq = this.sf.sf.quq();
        boolean z = this.sf.yt.vy() && quq >= 0;
        int i = (int) (j / 1000);
        gm(j, j2);
        if (this.sf.yt != null && this.sf.yt.pcc() != null) {
            this.sf.yt.pcc().setTime(String.valueOf(this.vj), i, 0, false);
            this.sf.yt.pcc().pcc(j, j2);
        }
        if (this.vj > 0) {
            if (!z) {
                this.sf.zti.pcc(String.valueOf(this.vj), null);
                return;
            }
            if (i < quq) {
                this.sf.zti.pcc(String.valueOf(this.vj), null);
                return;
            }
            if (this.sf.sf.bg() == 5 || this.sf.sf.bg() == 33) {
                this.sf.zti.pcc(String.valueOf(this.vj), null);
                return;
            }
            this.sf.pcc(true);
            this.sf.zti.pcc(String.valueOf(this.vj), TTAdDislikeToast.getSkipText());
            this.sf.zti.vj(true);
        }
    }
}
