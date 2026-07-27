package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes4.dex */
public class dax {
    private final com.bytedance.sdk.openadsdk.utils.pcc pcc = new com.bytedance.sdk.openadsdk.utils.pcc();
    private boolean sf;

    public static dax pcc() {
        return pcc.pcc;
    }

    private static class pcc {
        private static final dax pcc = new dax();
    }

    public void sf() {
        try {
            Context pcc2 = lu.pcc();
            if (pcc2 instanceof Application) {
                ((Application) pcc2).registerActivityLifecycleCallbacks(this.pcc);
                this.sf = true;
            } else {
                if (pcc2 == null || pcc2.getApplicationContext() == null) {
                    return;
                }
                ((Application) pcc2.getApplicationContext()).registerActivityLifecycleCallbacks(this.pcc);
                this.sf = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean gm() {
        return this.sf;
    }

    public boolean oo() {
        return this.pcc.pcc();
    }

    public boolean pcc(boolean z) {
        return this.pcc.pcc(z);
    }

    public com.bytedance.sdk.openadsdk.utils.pcc vj() {
        return this.pcc;
    }
}
