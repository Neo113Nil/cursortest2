package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.Map;

/* loaded from: classes4.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hc() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tsz() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.yt.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> tsx() {
        return this.sf.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void nn() {
        if (of.vj(this.sf.sf)) {
            finish();
            return;
        }
        if (this.sf.yt == null || this.sf.yt.pcc() == null) {
            return;
        }
        this.sf.yt.pcc().setTime("0", 0, 0, false);
        if (this.sf.yt.vy()) {
            this.sf.zti.pcc("0", "X");
            this.sf.zti.vj(true);
            this.sf.zti.gm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(long j, long j2) {
        int i = (int) (j / 1000);
        if (this.sf.yt != null && this.sf.yt.pcc() != null) {
            this.sf.yt.pcc().setTime(String.valueOf(this.vj), i, 0, false);
            this.sf.yt.pcc().pcc(j, j2);
        }
        if ((this.sf.yt == null || !this.sf.yt.vy()) && !this.sf.sf.nmd()) {
            return;
        }
        pcc(i);
        if (this.vj >= 0) {
            this.sf.zti.oo(true);
            this.sf.zti.pcc(String.valueOf(this.vj), null);
        }
    }
}
