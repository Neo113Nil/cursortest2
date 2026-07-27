package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.kj || !rj.gm((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) rj.pcc(), 0, 0);
    }
}
