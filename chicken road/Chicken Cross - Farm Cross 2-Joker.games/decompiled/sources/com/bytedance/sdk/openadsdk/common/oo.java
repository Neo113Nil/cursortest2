package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class oo extends tmg {
    public oo(Context context) {
        super(context);
        this.sf = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.tmg
    public void pcc() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.oo.1
            @Override // java.lang.Runnable
            public void run() {
                if (oo.this.pcc != null) {
                    oo.this.setVisibility(0);
                }
            }
        });
    }

    public void pcc(of ofVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.sf();
        }
    }
}
