package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long pcc;
    private long sf;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.vj.gm()) {
            this.sf = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.sf > 0) {
            this.pcc += SystemClock.elapsedRealtime() - this.sf;
            this.sf = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j = this.pcc;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.vj.pcc(j);
        }
    }
}
